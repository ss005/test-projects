package com.test.threads;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ProcedureConsumer {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(5);
		PC pc = new PC(list);
		PTask pTask = new PTask(pc);
		CTask cTask = new CTask(pc);

		Thread t1 = new Thread(pTask);
		Thread t2 = new Thread(cTask);

		t1.start();
		t2.start();

	}

}

class PC {
	private List<Integer> list;
	AtomicInteger counter = new AtomicInteger(0);

	public PC(List<Integer> list) {
		this.list = list;
	}

	public void produce() throws InterruptedException {
		while (true) {
			synchronized (this) {
				if (list.size() == 5) {
					System.out.println("List is full...");
					this.wait();
				} else {
					int count = counter.getAndIncrement();
					System.out.println("Adding : " + count);
					list.add(count);
					this.notifyAll();
				TimeUnit.SECONDS.sleep(1);
				}
			}
		}
	}

	public void consume() throws InterruptedException {
		while (true) {
			synchronized (this) {
				if (list.size() == 0) {
					System.out.println("List is empty...");
					this.wait();
				} else {
					int count = counter.getAndDecrement();
					System.out.println("Removing : " + --count);
					list.remove(count);
					this.notifyAll();
					TimeUnit.SECONDS.sleep(1);
				}
			}
		}
	}
}

class PTask implements Runnable {
	PC pc;

	public PTask(PC pc) {
		this.pc = pc;
	}

	@Override
	public void run() {
		try {
			pc.produce();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class CTask implements Runnable {
	PC pc ;
	
	public CTask(PC pc) {
		this.pc = pc;
	}
	@Override
	public void run() {
		try {
			pc.consume();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}



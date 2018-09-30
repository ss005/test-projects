
public class ProducerConsumer {

	public static Pojo pojo = new Pojo();

	public static void main(String[] args) {

		Thread producer = new Thread(new ProducerRunnable(pojo));
		Thread consumer = new Thread(new ConsumerRunnable(pojo));

		producer.start();
		consumer.start();

	}

}

class Pojo {
	volatile int num = 0;

	public void set() {
		while (true) {
			synchronized (this) {
				System.out.println("Set: " + this.num++);
				notify();
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

	public void get() {
		while (true) {
			synchronized (this) {
				System.out.println("Get: " + this.num);
				
				notify();
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				//notify(); if we put notify after wait - deadlock will occur
				//similarly if we put notify at wrong place in set - deadlock will occur.
			}

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}

class ProducerRunnable implements Runnable {

	Pojo pojo;

	public ProducerRunnable(Pojo pojo) {
		this.pojo = pojo;
	}

	@Override
	public void run() {
		pojo.set();
	}

}

class ConsumerRunnable implements Runnable {
	Pojo pojo;

	public ConsumerRunnable(Pojo pojo) {
		this.pojo = pojo;
	}

	@Override
	public void run() {
		pojo.get();
	}

}
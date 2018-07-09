package com.test.threads;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {

	public static void main(String[] args) {
		ProducerConsumer producerConsumer =  new ProducerConsumer();
		new Thread(new Runnable() {			
			@Override
			public void run() {
				producerConsumer.produce();				
			}
		}).start();
		
		new Thread (new Runnable() {
			@Override
			public void run() {
				producerConsumer.consume();				
			}
		}).start();
	}
}

class ProducerConsumer {
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();

	public void produce() {
		
		

	}

	public void consume() {

	}
}
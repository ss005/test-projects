package com.test.threads;

public class CountDownLatchTest {
	
	public static void main(String[] args) {
		Thread thread = new Thread (new Worker()) ;
		thread.start();
	}

}

class Worker implements Runnable {

	@Override
	public void run() {
		System.out.println("just for test ");
		
		
	}
	
	
}

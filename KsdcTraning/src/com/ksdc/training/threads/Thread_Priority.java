package com.ksdc.training.threads;

public class Thread_Priority extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		
	}

	public static void main(String[] args) {
		Thread_Priority obj = new Thread_Priority();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		t1.setName("abc");
		t2.setName("xyz");
		System.out.println("Min :"+Thread.MIN_PRIORITY);
		System.out.println("Max  :"+Thread.MAX_PRIORITY);
		System.out.println("Norm :"+Thread.NORM_PRIORITY);

		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
	}

}

package com.ksdc.training.threads;

public class Thread_A extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		Thread_A objA=new Thread_A();
		
		Thread t1=new Thread(objA);
		Thread t2=new Thread(objA);
		
		t1.setName("abc");
		t2.setName("xyz");
		System.out.println(objA);
		t1.start();
		t2.start();
	}

}

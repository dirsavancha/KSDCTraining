package com.ksdc.training.threads;

public class Thread_Demo extends Thread{
	@Override
	public void run() {
		System.out.println("I am run method");
	}
	
	public static void main(String[] args) {
		Thread_Demo obj=new Thread_Demo();
		obj.start();
		System.out.println(obj.getName());
		System.out.println(obj.getThreadGroup());
		System.out.println(obj.MIN_PRIORITY);
		System.out.println(obj.MAX_PRIORITY);
		System.out.println(obj.NORM_PRIORITY);
		System.out.println(obj.getPriority());
		System.out.println(obj.getId());
		System.out.println(obj.currentThread().getName());
		System.out.println(obj);
		
		
	}

}

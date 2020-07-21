package com.ksdc.training.threads;

public class Thread_Sleep implements Runnable {
	@Override
	public void run() {
		Thread  th=Thread.currentThread();
		for(int i=1;i<=10;i++) {
			System.out.println(i+" "+th.getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
			

	}
	public static void main(String[] args) {
		Thread_Sleep obj=new Thread_Sleep();
		
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		
		t1.setName("abc");
		t2.setName("xyz");
		
		t1.start();
		t2.start();
		
	}

}

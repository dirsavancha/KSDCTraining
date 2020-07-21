package com.ksdc.training.threads;

class ThreadJoining extends Thread{
	@Override
	public void run() {
		for(int i=0;i<2;i++) {
			try {
				Thread.sleep(2000);
				System.out.println("Current Thread is :"+Thread.currentThread().getName()+" "+i);
			} catch (InterruptedException e) {
				System.out.println("Exception cought is "+e);
			}
			
			
		}
	}
}

public class ThreadJoin_Demo  {
	public static void main(String[] args) {
		ThreadJoining t1=new ThreadJoining();
		ThreadJoining t2=new ThreadJoining();
		ThreadJoining t3=new ThreadJoining();
		
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();
		System.out.println("Thread "+t1.isAlive()); 
		System.out.println("Thread "+t2.isAlive()); 
		System.out.println("Thread "+t3.isAlive()); //
	}

}

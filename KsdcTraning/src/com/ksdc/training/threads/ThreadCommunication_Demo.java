package com.ksdc.training.threads;

public class ThreadCommunication_Demo {
	public static void main(String[] args) {
		ThreadCommunication_Demo lock = new ThreadCommunication_Demo();

		Thread a = new Thread(new Runnable() {
			public void run() {

				synchronized (lock) {
					System.out.println("A1");
					try {
						lock.wait(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("A2");
					System.out.println("A3");

				}

			}
		}) {

		};
		
		Thread b=new Thread(new Runnable() {
			public void run() {
				
				synchronized (lock) {
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("B1");
					System.out.println("B2");
					System.out.println("B3");
					lock.notify();
				}
				
			}
		}) {
			
		};
		a.start();
		b.start();
		

	}

}

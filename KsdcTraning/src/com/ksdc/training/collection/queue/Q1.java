package com.ksdc.training.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Q1 {
	public static void main(String[] args) {
		Queue<Integer> q1=new PriorityQueue<>();
		q1.add(100);
		q1.add(200);
		q1.add(100);
		
	//	q1.add(null);
		q1.add(500);
		q1.add("");
		System.out.println(q1);
		System.out.println(q1.element());
		System.out.println(q1.peek());
		System.out.println(q1.add(2000));
		System.out.println(q1.offer(600));
		System.out.println(q);
		
	}

}

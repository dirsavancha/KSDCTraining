package com.ksdc.training.collection.list;

import java.util.Stack;

public class StackClass {
	public static void main(String[] args) {
		Stack<String> st=new Stack<>();
		st.add("One");
		st.add("Two");
		st.add("Three");
		st.add("Four");
		st.add("Five");
		st.add("Six");
		st.add("Seven");
		st.add("Eight");
		st.add("Nine");
		st.add("Ten");
		st.add("eleven");
		System.out.println(st);
		System.out.println(st.capacity());
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.firstElement());
	}

}

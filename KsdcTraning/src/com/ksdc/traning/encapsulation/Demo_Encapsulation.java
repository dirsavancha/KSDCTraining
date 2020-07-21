package com.ksdc.traning.encapsulation;

public class Demo_Encapsulation {
	private String emp_name="Ram";
	private int emp_id;
	
	
	
	public String getName() {
		return emp_name;
	}
	public int getId() {
		return emp_id;
	}
	public void setID(int id) {
		emp_id=id;
	}
	
	@Override
	public String toString() {
		
		return emp_name+"\t"+emp_id;
	}
	

}

 

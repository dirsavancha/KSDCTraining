package com.ksdc.traning.inheritance;

public class Manager extends Employee {

	int age;

	public void managerShow() {
		System.out.println("Manager class:" + "Name :" + name + "\t" + "id :" + id + "\t" + "Salaray :" + sal + "\t"
				+ "Job Type :" + "\t" + jobType + "\t" + "Age :" + age);

	}

	public static void main(String[] args) {

		Person p = new Person();
		p.id = 101;
		p.name = "Ram";
		p.show();

		Employee e = new Employee();
		e.id = 102;
		e.name = "Hari";
		e.sal = 5000.00f;
		e.jobType = "permanent";
		e.showEmployee();

		Manager m = new Manager();
		m.id = 103;
		m.name = "Shyam";
		m.sal = 1000.00f;
		m.jobType = "permanent";
		m.age = 35;

		m.managerShow();
		
		Person p1=new Employee();
		p1.id=500;
		p1.name="Nandhin";
		
		Employee emp=new Manager();
		emp.name="Meghana";
		emp.id=501;
		emp.jobType="Permanent";
		emp.sal=1000.0f;
		
		
		
	}
}

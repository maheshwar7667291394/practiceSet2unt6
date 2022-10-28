package com.masai;

public class Student {
	private int roll;
	private String name;
	private int marks;
	
	


	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		 Student s1=this;
		 Student s2=(Student)obj;
		 if(s1.roll==s2.roll) return true;
		 else return false;
		
	}



	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}


	public void showDetails() {
		
	System.out.println("name is "+name);
	System.out.println("roll is "+roll);
	System.out.println("marks is "+marks);
	}
	

}

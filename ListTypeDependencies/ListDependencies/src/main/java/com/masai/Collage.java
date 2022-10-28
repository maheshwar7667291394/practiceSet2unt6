package com.masai;

import java.util.ArrayList;
import java.util.List;

public class Collage {
	
	private String cname;
	private List<Student> student=new ArrayList<>();
	public void setCname(String cname) {
		this.cname = cname;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	
	public void show() {
		System.out.println(cname);
		 student.forEach(s->{
			 System.out.println(s);
		 });

	}
	

}

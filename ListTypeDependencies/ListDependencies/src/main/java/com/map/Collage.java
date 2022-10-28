package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.masai.Student;

public class Collage {
	private String cname;
	
	private Map<Student,String> map=new HashMap<>();
	
	public void setCname(String cname) {
		this.cname = cname;
	}
	public void setMap(Map<Student, String> map) {
		this.map = map;
	}
	
	
	public void show() {
		Set<Map.Entry<Student, String>> details= map.entrySet();
		for(Map.Entry<Student, String> c:details) {
			System.out.println(c.getKey());
			System.out.println(c.getValue());
			System.out.println("================");
		}
	}

}

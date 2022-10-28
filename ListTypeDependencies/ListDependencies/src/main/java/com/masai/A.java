package com.masai;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class A {
	
	private Set<String> name;
	
	

	public Set<String> getName() {
		return name;
	}

	public void setName(Set<String> name) {
		this.name = name;
	}

	public void show() {
		System.out.println(name);
	}

	@Override
	public String toString() {
		return "A [name=" + name + "]";
	}
	
	

}
 
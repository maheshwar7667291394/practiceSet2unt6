package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		A a1=ctx.getBean("a",A.class);
		A a2=ctx.getBean("a",A.class);
		System.out.println(a1==a2);
		
	}

}

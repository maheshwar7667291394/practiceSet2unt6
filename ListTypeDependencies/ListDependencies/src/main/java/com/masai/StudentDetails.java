package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDetails {
	
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("appplicationContext.xml");
		Collage collage=ctx.getBean("c",Collage.class);
		collage.show();
	}

}

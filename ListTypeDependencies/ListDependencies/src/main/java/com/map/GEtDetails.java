package com.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GEtDetails {
	
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("appplicationContext.xml");
		Collage c=ctx.getBean("c",Collage.class);
		c.show();
	}

}

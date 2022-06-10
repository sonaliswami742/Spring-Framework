package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/ApplicationContext.xml");
		 
		A object = (A) context.getBean("aa");
		System.out.println(object);
	}

}

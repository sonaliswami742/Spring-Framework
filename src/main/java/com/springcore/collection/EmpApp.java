package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collection/ApplicationContext.xml");
			
			Emp emp1 = (Emp) context.getBean("emp1");
			System.out.println(emp1);
			
	}

}

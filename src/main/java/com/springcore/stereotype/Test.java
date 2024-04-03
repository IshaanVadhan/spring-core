package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student student = context.getBean("s1", Student.class);
		System.out.println(student);

		// singleton & prototype scope
		System.out.println();
		System.out.println(student.hashCode());
		Student student2 = context.getBean("s1", Student.class);
		System.out.println(student2.hashCode());
	}

}

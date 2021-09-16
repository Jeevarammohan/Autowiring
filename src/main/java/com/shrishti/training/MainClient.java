package com.shrishti.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClient {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.shrishti.training");
		Student student = context.getBean("student", Student.class);
		System.out.println(student);
		Department department=context.getBean("department",Department.class);
		System.out.println(department);

	}

}

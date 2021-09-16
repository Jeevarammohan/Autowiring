package com.shrishti.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("com.shrishti.autowiring1");
		Performer performer=context.getBean("performer",Performer.class);
		performer.playSong("guitar", "Hey ......!");
	}

}

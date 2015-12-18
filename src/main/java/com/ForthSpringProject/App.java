package com.ForthSpringProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ForthSpringProject/SpringConfig.xml");

		Restaurant restaurant1 = (Restaurant) context.getBean("restaurantBean");
		restaurant1.setWelcomeNote("Object 1");
		restaurant1.greetCustomer();

		Restaurant restaurant2 = (Restaurant) context.getBean("restaurantBean");
		restaurant2.greetCustomer();

	}

}

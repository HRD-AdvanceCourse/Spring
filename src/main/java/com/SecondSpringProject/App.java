package com.SecondSpringProject;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/SecondSpringProject/SpringConfig.xml");
		Restaurant restaurant= (Restaurant)context.getBean("restaurantBean");
		restaurant.displayWaiterNames();
	}

}

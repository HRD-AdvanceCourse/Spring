package com.SeventhSpringProject;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Restaurant {
	
	public void greetCustomer() {
		System.out.println("Welcome, this is a liftcycle demo");
	}
	
	public void init() {
		System.out.println("init");
	}
	
	public void destroy() {
		System.out.println("destroy");
	}
}

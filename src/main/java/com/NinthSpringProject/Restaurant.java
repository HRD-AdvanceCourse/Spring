package com.NinthSpringProject;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Restaurant {
	String welcomeNote;

	public void greetCustomer() {
		System.out.println(welcomeNote);
	}

	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}

	public void init() {
		System.out.println("init");
	}

	public void destroy() {
		System.out.println("destroy");
	}
}

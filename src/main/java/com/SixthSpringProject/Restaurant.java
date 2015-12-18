package com.SixthSpringProject;
import javax.annotation.*;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Restaurant {
	
	public void greetCustomer() {
		System.out.println("Welcome, this is a liftcycle demo");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy");
	}
}

// Style 2: use bean interface, remove @annotation and <bean class="org.springframework.context.annotation.CommonAnnotationBeanPostProcessor"></bean> in xml
class BeanInterface implements InitializingBean, DisposableBean{
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("init");
	}
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy");
	}

	
	
}

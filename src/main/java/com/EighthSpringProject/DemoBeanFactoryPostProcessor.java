package com.EighthSpringProject;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class DemoBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		
		BeanDefinition bDefinition = beanFactory.getBeanDefinition("restaurantBean");
		MutablePropertyValues pValues = bDefinition.getPropertyValues();
		
		pValues.addPropertyValue("welcomeNote","123");

	}

}

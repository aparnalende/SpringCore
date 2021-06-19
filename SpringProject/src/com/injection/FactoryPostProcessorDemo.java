package com.injection;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class FactoryPostProcessorDemo implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("Bean Factory initalized!!!!!!!!!!" + beanFactory);
		for (String beanName : beanFactory.getBeanDefinitionNames()) {

			BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanName);

			// Manipulate the beanDefiniton or whatever you need to do
			System.out.println("Bean Factory :" + beanDefinition);
		}

	}
}
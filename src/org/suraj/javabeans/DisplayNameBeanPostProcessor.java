package org.suraj.javabeans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanname) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("In After Initialisation method, Bean Nmae is" + beanname);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanname) throws BeansException {
		System.out.println("In Before Initialisation method, Bean Nmae is" + beanname);
		return bean;
	}

}

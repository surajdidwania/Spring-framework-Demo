package org.suraj.javabeans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Triangle triangle = new Triangle();
		//triangle.draw();
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml")); 
		//Triangle triangle = (Triangle) factory.getBean("triangle");
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); 
		context.registerShutdownHook();
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
		
    
	   
	}                                        

}

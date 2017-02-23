package org.suraj.javabeans;

import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

public class Circle implements Shape, ApplicationEventPublisherAware{
		private Point centre;
		@Autowired
		private MessageSource messagesource; // Its the interface tht implemented by various different implementation
		private ApplicationEventPublisher publisher;
		public MessageSource getMessagesource() {
			return messagesource;
		}
		public void setMessagesource(MessageSource messagesource) {
			this.messagesource = messagesource;
		}
	public void draw()
	{
		System.out.println(this.messagesource.getMessage("drawingcircle", null, "Default Greeting", Locale.SIMPLIFIED_CHINESE));
		System.out.println(this.messagesource.getMessage("drawingpoint", new Object[] {centre.getX(),centre.getY()}, "Default Greeting", null));
		System.out.println(centre.getX() + " " + centre.getY());
		System.out.println(this.messagesource.getMessage("greeting", null, "Default Greeting", null));
		DrawEvent draw = new DrawEvent(this);
		publisher.publishEvent(draw);
	}
	public Point getCentre() {
		return centre;
	}
	@Resource
	public void setCentre(Point centre) {
		this.centre = centre;
	}
	@PostConstruct
	public void initialiseCircle()
	{
		System.out.println("Init of circle");
	}
	@PreDestroy
	public void destroyCircle()
	{
		System.out.println("destroy of circle");
	}
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) { //this mtd spring uses to give us publisher handle
		// TODO Auto-generated method stub
		this.publisher = publisher;
		
	}
	
}

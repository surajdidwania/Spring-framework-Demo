package org.suraj.javabeans;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener implements ApplicationListener{

	@Override
	public void onApplicationEvent(ApplicationEvent event) { //This event is published whenever any event is called
		// TODO Auto-generated method stub
		System.out.println(event.toString());
		
	}
		
}

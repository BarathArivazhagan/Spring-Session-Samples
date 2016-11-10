package com.barath.demo.app.session;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.session.events.SessionCreatedEvent;
import org.springframework.session.events.SessionDeletedEvent;
import org.springframework.session.events.SessionDestroyedEvent;
import org.springframework.stereotype.Component;


@Component
public class GemfireSessionEvents {
	
	
	@EventListener
	public void handleSessionCreationEvent(SessionCreatedEvent event){
		System.out.println("SESSION CREATED EVENT "+event.getSession().getId());
		
	}
	
	@EventListener
	public void handleSessionDeletionEvent(SessionDeletedEvent event){
		System.out.println("SESSION DELETED EVENT "+event.getSession().getId());
		
	}
	
	@EventListener
	public void handleSessionDestroyedEvent(SessionDestroyedEvent event){
		System.out.println("SESSION Destroyed EVENT "+event.getSession().getId());
		
	}

}

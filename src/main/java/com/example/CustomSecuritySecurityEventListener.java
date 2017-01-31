package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AbstractAuthenticationFailureEvent;
import org.springframework.stereotype.Component;

@Component
public class CustomSecuritySecurityEventListener implements ApplicationListener<AbstractAuthenticationFailureEvent> {

	Logger logger=LoggerFactory.getLogger(CustomSecuritySecurityEventListener.class);

	@Override
	public void onApplicationEvent(AbstractAuthenticationFailureEvent event) {
		logger.error("Authentication error.");
		logger.error(event.getException().getMessage());
	}

}

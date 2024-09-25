package com.dev.taskApp.service;

public class EmailNotificationService implements NotificationService {

	@Override
	public void sendNotification(String message) {
		System.out.println("Enviando email: " + message);
		
	}
	
}

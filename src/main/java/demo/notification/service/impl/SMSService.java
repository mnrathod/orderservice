package demo.notification.service.impl;

import demo.notification.service.NotificationService;

public interface SMSService extends NotificationService{

	public boolean sendSMS(String from, String to, String text);
	
}

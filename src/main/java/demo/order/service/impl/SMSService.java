package demo.order.service.impl;

import demo.order.service.NotificationService;

public interface SMSService extends NotificationService{

	public boolean sendSMS(String from, String to, String text);
	
}

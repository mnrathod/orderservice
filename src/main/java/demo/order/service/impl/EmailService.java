package demo.order.service.impl;

import demo.order.service.NotificationService;

public interface EmailService extends NotificationService {
	public void sendSimpleMessage(String to, String subject, String text);
	public void sendMessageWithAttachment(String to, String subject, String text, String pathToAttachment);
}

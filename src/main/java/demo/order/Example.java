package demo.order;
// Install the Java helper library from twilio.com/docs/java/install

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

public class Example {
    // Find your Account SID and Auth Token at twilio.com/console
    // and set the environment variables. See http://twil.io/secure
    public static final String ACCOUNT_SID = "AC36beb56227ca3ac5ba07d125c8f0ba2f";
    public static final String SERVICE_SID = "MG39be150ecb1f6f009de24aef0d8aec97";
    public static final String AUTH_TOKEN = "b697146176d56e7eb0977fce254689cd";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        /*
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("+91 9723286945"),
                new com.twilio.type.PhoneNumber("+18316042126"),
                "Test msg 123")
            .create();

        System.out.println(message.getSid());
        */
        Message whatsAppMessage = Message.creator(
                new com.twilio.type.PhoneNumber("whatsapp:+919723286945"),
                new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
                "Hello there!")
            .create();

        
        System.out.println(whatsAppMessage.getSid());
    }
}
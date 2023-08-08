package demo.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.order.producer.Producer;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class OrderController {
	
	@Autowired
	Producer producer;
	
	@GetMapping("/sendMessage")
	public void sendMessage() {
		producer.sendMessage("Hello");
		System.out.println("isDebugEnabled:"+ log.isDebugEnabled());
		log.debug("Sending sent..");
		log.info("Sending sent..");
	}

}

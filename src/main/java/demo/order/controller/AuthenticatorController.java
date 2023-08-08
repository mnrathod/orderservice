package demo.order.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import demo.order.domain.Customer;

@Controller
public class AuthenticatorController {

	@PostMapping ("/authenticate")
	public String authenticate (@RequestBody Customer customer) {
		return "addcustomer";
	}

}

package demo.notification.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.notification.domain.Customer;
import demo.notification.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService; 
	
	@PostMapping("/add")
	public String addCustomer (@RequestBody Customer customer) {
		boolean status = customerService.addCustomer(customer);
		return "success";
	}

	@PostMapping("/update")
	@ResponseBody 
	public HttpStatus updateCustomer (@RequestBody Customer customer) {
		return customerService.updateCustomer(customer)? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}

	@GetMapping("/customer/{id}")
	public @ResponseBody Customer getAllUsers(@PathVariable Integer id) {
		return customerService.getById(id);
	}

	@GetMapping("/customerByName/{name}")
	public List<Customer> getCustomereByName(@PathVariable String name) {
		return customerService.findByName(name);
	}

	@GetMapping(value = "/customer")
	public List<Customer> getAll() {
		return customerService.getAllCustomers();
	}

}

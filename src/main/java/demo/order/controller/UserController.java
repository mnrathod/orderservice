package demo.order.controller;

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
import org.springframework.web.bind.annotation.RestController;

import demo.order.domain.User;
import demo.order.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService; 
	
	@PostMapping("/add")
	public String addUser (@RequestBody User user) {
		boolean status = userService.addUser(user);
		return "success";
	}

	@PostMapping("/update")
	@ResponseBody 
	public HttpStatus updateUser (@RequestBody User user) {
		return userService.updateUser(user)? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}

	@GetMapping("/user/{id}")
	public @ResponseBody User getAllUsers(@PathVariable Integer id) {
		return userService.getById(id);
	}

	@GetMapping("/userByName/{name}")
	public List<User> getUsereByName(@PathVariable String name) {
		return userService.findByName(name);
	}

	@GetMapping(value = "/user")
	public List<User> getAll() {
		return userService.getAllUsers();
	}

}

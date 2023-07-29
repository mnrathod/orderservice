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
import org.springframework.web.bind.annotation.RestController;

import demo.notification.domain.Role;
import demo.notification.service.RoleService;

@RestController
@RequestMapping("/role")
public class RoleController {
	
	@Autowired
	RoleService roleService; 
	
	@PostMapping("/add")
	public String addRole (@RequestBody Role role) {
		boolean status = roleService.addRole(role);
		return "success";
	}

	@PostMapping("/update")
	@ResponseBody 
	public HttpStatus updateRole (@RequestBody Role role) {
		return roleService.updateRole(role)? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}

	@GetMapping("/role/{id}")
	public @ResponseBody Role getAllRoles(@PathVariable Integer id) {
		return roleService.getById(id);
	}

	@GetMapping("/roleByName/{name}")
	public List<Role> getRoleeByName(@PathVariable String name) {
		return roleService.findByName(name);
	}

	@GetMapping(value = "/role")
	public List<Role> getAll() {
		return roleService.getAllRoles();
	}

}

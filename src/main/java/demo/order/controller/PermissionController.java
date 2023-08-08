package demo.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import demo.order.domain.Permission;
import demo.order.service.PermissionService;

@RestController
@RequestMapping("/permission")
public class PermissionController {
	
	@Autowired
	PermissionService permissionService; 
	
	@PostMapping("/add")
	public String addPermission (@RequestBody Permission permission) {
		boolean status = permissionService.addPermission(permission);
		return "success";
	}

	@PostMapping("/update")
	@ResponseBody 
	public HttpStatus updatePermission (@RequestBody Permission permission) {
		return permissionService.updatePermission(permission)? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}

	@GetMapping("/permission/{id}")
	public @ResponseBody Permission getAllPermissions(@PathVariable Integer id) {
		return permissionService.getById(id);
	}

	@GetMapping("/permissionByName/{name}")
	public List<Permission> getPermissioneByName(@PathVariable String name) {
		return permissionService.findByName(name);
	}

	@GetMapping(value = "/permission")
	public List<Permission> getAll() {
		return permissionService.getAllPermissions();
	}

}

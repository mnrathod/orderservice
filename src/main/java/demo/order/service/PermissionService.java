package demo.order.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import demo.order.dao.PermissionRepository;
import demo.order.domain.Permission;

@Service
public class PermissionService {
	
	@Autowired
	PermissionRepository permissionRepository;
	
	@Transactional
	public List<Permission> findByName(String name) {
		return permissionRepository.findByName(name);
	}
	
	@Transactional
	public Permission getById(Integer id) {
		Permission permission = null;
		Optional<Permission> value = permissionRepository.findById(id);
		if(value.isPresent())		
				permission =value.get();
		return permission;
	}
	
	@Transactional
	public boolean addPermission(Permission permission) {
		return permissionRepository.save(permission)  != null;
	}

	@Transactional
	public boolean updatePermission(Permission permission) {
		return permissionRepository.save(permission)  != null;
	}

	@Transactional
	public List<Permission> getAllPermissions() {
		return (List<Permission>) permissionRepository.findAll();
	}

}

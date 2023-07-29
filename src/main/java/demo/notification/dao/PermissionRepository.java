package demo.notification.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import demo.notification.domain.Permission;

@Repository
public interface PermissionRepository extends CrudRepository<Permission, Integer>{
    List<Permission> findByName(String name);
}

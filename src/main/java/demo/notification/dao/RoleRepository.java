package demo.notification.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import demo.notification.domain.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer>{
    List<Role> findByName(String name);
}

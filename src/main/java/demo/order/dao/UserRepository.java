package demo.order.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import demo.order.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
    List<User> findByName(String name);
}

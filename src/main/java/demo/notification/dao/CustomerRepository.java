package demo.notification.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import demo.notification.domain.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>{
    List<Customer> findByName(String name);
}

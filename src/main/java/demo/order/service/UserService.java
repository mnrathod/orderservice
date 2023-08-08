package demo.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import demo.order.dao.UserRepository;
import demo.order.domain.User;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Transactional
	public List<User> findByName(String name) {
		return userRepository.findByName(name);
	}
	
	@Transactional
	public User getById(Integer id) {
		return userRepository.findById(id).get();
	}
	
	@Transactional
	public boolean addUser(User user) {
		return userRepository.save(user)  != null;
	}

	@Transactional
	public boolean updateUser(User user) {
		return userRepository.save(user)  != null;
	}

	@Transactional
	public List<User> getAllUsers() {
		return (List<User>) userRepository.findAll();
	}

}

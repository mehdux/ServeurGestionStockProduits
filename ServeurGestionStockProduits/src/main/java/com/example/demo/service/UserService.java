package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
@Primary
public class UserService implements ICrudService<User, Long>{
	
	@Autowired
	private UserRepository userRepository;

	public List<User> getAll() {
		return userRepository.findAll();
	}
	
	public Optional<User> getUser(Long id) {
		return userRepository.findById(id);
	}

	public void add(User user) {
		userRepository.save(user);		
	}

	public void update(User user) {
		userRepository.save(user);
	}

	public void delete(Long id) {
		User user = new User();
		user.setId(id);
		userRepository.delete(user);
	}

}

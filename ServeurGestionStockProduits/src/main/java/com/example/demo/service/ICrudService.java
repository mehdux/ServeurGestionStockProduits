package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.User;

public interface ICrudService<T, ID> {
	
	List<T> getAll();
	
	Optional<User> getUser(ID id);
	
	void add(T entity);
	
	void update(T entity);
	
	void delete(ID id);
}

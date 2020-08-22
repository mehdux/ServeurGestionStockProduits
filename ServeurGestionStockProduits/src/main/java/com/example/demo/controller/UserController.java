package com.example.demo.controller;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.ICrudService;
@RestController
public class UserController {
	
	
	@RequestMapping("/api/user")
	public Principal user(Principal user) {
		return user;
	}
	
    /*@Autowired
	private ICrudService<User, Long> userService;
	
	@GetMapping("/{id}")
	public Optional<User> getUser(@PathVariable Long id){
		return userService.getUser(id);
	}*/

}

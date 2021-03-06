package com.beksay.jukbar.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.beksay.jukbar.model.User;
import com.beksay.jukbar.repository.UserRepository;
import com.beksay.jukbar.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public User saveUser(User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return userRepository.save(user);
	}
	
	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}
	
	@Override
	public void deleteUser(Long userId) {
		userRepository.deleteById(userId);
	}

	@Override
	public User findByUsername(String username) {
		return userRepository.findByUsername(username); 
	}

	@Override
	public List<User> findAllUsers(){
		return userRepository.findAll();
	}
	
	@Override
	public Long numberOfUsers() {
		return userRepository.count();
	}
}

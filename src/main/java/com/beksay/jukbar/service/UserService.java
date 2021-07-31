package com.beksay.jukbar.service;

import java.util.List;

import com.beksay.jukbar.model.User;

public interface UserService {

	User saveUser(User user);

	User updateUser(User user);

	void deleteUser(Long userId);

	List<User> findByUsername(String username);

	List<User> findAllUsers();

	Long numberOfUsers();

}

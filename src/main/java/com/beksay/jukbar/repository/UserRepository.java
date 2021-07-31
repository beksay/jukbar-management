package com.beksay.jukbar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beksay.jukbar.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByUsername(String username);

}

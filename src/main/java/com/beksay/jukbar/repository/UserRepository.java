package com.beksay.jukbar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beksay.jukbar.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	List<User> findByUsername(String username);

}

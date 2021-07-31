package com.beksay.jukbar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beksay.jukbar.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	

}

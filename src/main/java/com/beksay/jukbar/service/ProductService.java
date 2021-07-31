package com.beksay.jukbar.service;

import java.util.List;

import com.beksay.jukbar.model.Product;

public interface ProductService {

	Product saveProduct(Product product);

	Product updateProduct(Product product);

	void deleteProduct(Long productId);

	Long numberOfProducts();

	List<Product> findAllProducts();

}

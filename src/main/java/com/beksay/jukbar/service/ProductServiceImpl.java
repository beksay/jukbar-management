package com.beksay.jukbar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.beksay.jukbar.model.Product;
import com.beksay.jukbar.repository.ProductRepository;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Product saveProduct(final Product product) {
		productRepository.save(product);
		return product;
	}

	@Override
	public Product updateProduct(final Product product) {
		productRepository.save(product);
		return product;
	}

	@Override
	public void deleteProduct(final Long productId) {
		productRepository.deleteById(productId);
	}

	@Override
	public Long numberOfProducts() {
		return productRepository.count();
	}
	
	@Override
	public List<Product> findAllProducts(){
		return productRepository.findAll();
	}
}

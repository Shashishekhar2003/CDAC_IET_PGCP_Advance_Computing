package com.demo.service;

import java.util.List;

import com.demo.model.Product;

public interface ProductService {
	
	List<Product> gelAll();
	
	boolean addProduct(Product p);
	
	Product getById (int pid);

	List<Product> getAll();
	

}

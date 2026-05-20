package com.demo.service;

import java.util.List;

import com.demo.model.Product;

public interface ProductService {

	boolean saveProduct(Product p);

	List<Product> findAll();

}

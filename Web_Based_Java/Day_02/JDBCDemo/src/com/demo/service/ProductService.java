package com.demo.service;

import java.util.List;

import com.demo.model.Product;

public interface ProductService {

	boolean saveProduct(Product p);

	List<Product> findAll();

	boolean addNewProduct();

	boolean deleteById(int pid);

	boolean modifyById(int pid, int qty, double pr);

	List<Product> getAll();

	Product getById(int id);

	List<Product> getAllSortedByName();

}

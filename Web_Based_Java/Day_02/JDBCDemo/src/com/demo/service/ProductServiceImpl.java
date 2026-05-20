package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;
import com.demo.model.Product;

public class ProductServiceImpl implements ProductService{
	private ProductDao pdao;
	
	public ProductServiceImpl() {
		this.pdao = new ProductDaoImpl();
			
		
	}

	@Override
	public boolean saveProduct(Product p) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter pid");
		int pid=sc.nextInt();
		System.out.println("enetr name");
		String nm=sc.next();
		System.out.println("enter qty");
		int qty=sc.nextInt();
		System.out.println("enter price");
		double pr=sc.nextDouble();
		System.out.println("enetr mfg date (dd/mm/yyyy)");
		String dt=sc.next();
		LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Product p1=new Product(pid,nm,qty,pr,ldt);
		return pdao.saveProduct(p1);
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return pdao.findAll();
	}

	@Override
	public boolean addNewProduct() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteById(int pid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifyById(int pid, int qty, double pr) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllSortedByName() {
		// TODO Auto-generated method stub
		return null;
	}
     
}

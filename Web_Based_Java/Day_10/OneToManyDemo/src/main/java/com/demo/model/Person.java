package com.demo.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Person {
	@Id
	private int pid;
	private String pname;
	private String mob;
	@OneToMany(mappedBy="per")
	private Set<Address>addrset;
	

}

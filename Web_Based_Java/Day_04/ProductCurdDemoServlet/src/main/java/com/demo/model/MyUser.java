package com.demo.model;

public class MyUser {
	private String name;
	private String passwd;
	private String role;
	
	public MyUser() {
		super();
	}
	
	
	public MyUser(String name, String passwd, String role) {
		super();
		this.name = name;
		this.passwd = passwd;
		this.role = role;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	@Override
	public String toString() {
		return "MyUser [name=" + name + ", passwd=" + passwd + ", role=" + role + "]";
	}

}

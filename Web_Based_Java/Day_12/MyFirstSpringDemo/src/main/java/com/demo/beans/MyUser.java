package com.demo.beans;

public class MyUser {
	private int uid;
	private String uname;
	private String mob;
	public MyUser() {
		super();
		System.out.println("In MyUser default constructor");
	}
	public MyUser(int uid, String uname, String mob) {
		super();
		System.out.println("In MyUser Parametrized constructor");
		this.uid = uid;
		this.uname = uname;
		this.mob = mob;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		System.out.println("In MyUser uid Setter Method");
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		System.out.println("In MyUser uname Setter Method");
		this.uname = uname;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		System.out.println("In MyUser mobile Setter Method");
		this.mob = mob;
	}
	@Override
	public String toString() {
		return "MyUser [uid=" + uid + ", uname=" + uname + ", mob=" + mob + "]";
	}
	

}

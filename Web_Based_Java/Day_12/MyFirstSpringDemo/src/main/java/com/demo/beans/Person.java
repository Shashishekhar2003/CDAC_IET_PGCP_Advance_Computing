package com.demo.beans;

public class Person {
	private int pid;
	private String pname;
	private String addr;
	public Person() {
		super();
	}
	public Person(int pid, String pname, String addr) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.addr = addr;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", addr=" + addr + "]";
	}
	

}

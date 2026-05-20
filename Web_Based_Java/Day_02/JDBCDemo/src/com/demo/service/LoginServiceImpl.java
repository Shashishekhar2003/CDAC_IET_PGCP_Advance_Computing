package com.demo.service;

import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService {
	private LoginDao ldao; 
	
	public LoginServiceImpl() {
		super();
		this.ldao = new LoginDaoImpl();
	}

	@Override
	public String validateUser(String uname, String passwd) {
		// TODO Auto-generated method stub
		return ldao.authenticateUser(uname,passwd);
	}

	@Override
	public void closeMyConnection() {
		// TODO Auto-generated method stub
		ldao.closeMyConnection();
	}
	
	

	
}

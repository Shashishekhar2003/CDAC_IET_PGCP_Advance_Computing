package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

	public static void main(String[] args) {
		
			  try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				String url="jdbc:mysql://localhost:3306/mydata?useSSL=false&allowPublicKeyRetrival=true";
				Connection conn=DriverManager.getConnection(url,"root","shashi@2003");
				if (conn!=null) {
					System.out.println("Connection Done....!");
				}else {
					System.out.println("Connection Not Done...?");
				}
				conn.close();
			  } catch (SQLException e) {
				// TODO Auto-generated catch block
				  System.out.println("Connection Not Done...?");
				e.printStackTrace();
			  }
		}

	}



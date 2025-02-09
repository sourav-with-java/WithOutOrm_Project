package com.androjavatech4u.conn;

import java.sql.Connection;
import java.sql.DriverManager;

public final  class MyConnectionProvider {
	
	 private MyConnectionProvider()
	{
		
		
	}
	 public static Connection connection=null;
	
	
	public static synchronized Connection getConnection()
	{
		if(connection==null)
		{
			try {
			connection=	DriverManager.getConnection("jdbc:mysql://localhost:3306/learn","root","Sourav@1234");
			return connection;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			
		}
		else
		{
			return connection;	
			
		}
		return connection;
			
		
		
		
	}

}

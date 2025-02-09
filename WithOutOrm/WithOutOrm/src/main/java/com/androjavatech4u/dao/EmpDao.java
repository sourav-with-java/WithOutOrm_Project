package com.androjavatech4u.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.androjavatech4u.bean.Emp;
import com.androjavatech4u.conn.MyConnectionProvider;

public class EmpDao {
	
	public void save(Emp emp) throws SQLException
	{
		
	Connection connection=	MyConnectionProvider.getConnection();
PreparedStatement statement=	connection.prepareStatement("insert into student values(?,?,?)");
		statement.setInt(1, emp.getId());
		statement.setString(2, emp.getName());
		statement.setString(3, emp.getCmp());
	int executeUpdate=	statement.executeUpdate();
	if(executeUpdate>0)
	{
		System.out.println("record saved");
	}else
	{
		
		System.out.println("not saved");
	}
	}

}

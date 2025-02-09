package com.androjavatech4u;

import java.sql.SQLException;

import com.androjavatech4u.bean.Emp;
import com.androjavatech4u.dao.EmpDao;

public class App 
{
    public static void main( String[] args )
    {
        
        Emp emp=new Emp();
        emp.setId(2);
        emp.setName("shyam ");
        emp.setCmp("google");
        
        
        EmpDao dao=new EmpDao();
        try {
			dao.save(emp);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
    }
}

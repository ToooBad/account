package com.xe.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

 

public class JDBCtest {

	public static void main(String[] args) {
		String url = "jdbc:mysql://192.168.99.223:3306/bx?"
                + "user=root&password=root&useUnicode=true&characterEncoding=UTF8";
		 Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			 System.out.println("成功加载MySQL驱动程序");
			 
			 
				conn = DriverManager.getConnection(url);
				
				 Statement stmt = conn.createStatement();
				 
				 String sql = "create table student(NO char(20),name varchar(20),primary key(NO))";
		            int result = stmt.executeUpdate(sql);// executeUpdate语句会返回一个受影响的行数，如果返回-1就没有成功
			 System.out.println(result);
		} catch ( Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// 动态加载mysql驱动
	}
}

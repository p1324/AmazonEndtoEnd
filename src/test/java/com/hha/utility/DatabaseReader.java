package com.hha.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseReader {

	public Integer getPriceData() throws SQLException
		{
		//connect to db
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/pradip", "root", "@**adwtgj12Z");
													
		//create statement to write the query
		Statement smt=con.createStatement();
		
		//create resutset to store the query output
		ResultSet rs=smt.executeQuery("select * from amazon;");
		int priceData = 0;
		while(rs.next())
		{
			//System.out.println(rs.getString(1) +" "+rs.getInt(2));
			 priceData=rs.getInt(2);
		}
	
		return priceData;
		
	}
	
	}


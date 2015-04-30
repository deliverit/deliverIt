package com.restaurant.Database;

import java.sql.*;

public class DBConnection implements DBCredentials 
{
	private Connection conn = null;
	private Statement stmt = null;

	public Statement dbConnect()
	{
		
		
		try
		{
			
		//STEP 1: Register JDBC driver
	      Class.forName(JDBC_DRIVER);
	      
	    //STEP 2: Open a connection
	      System.out.println("Connecting to database...");
	      conn = DriverManager.getConnection(DB_URL,dbUserName,dbUserPassword);
	      System.out.println("Database connection success");
	      //STEP 3: Execute a query
	      System.out.println("Creating statement...");
	      stmt = conn.createStatement();
	      System.out.println("statement created !");
	      return stmt;
	      
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
		
		
 }
	public Connection getConn() 
	{
		return conn;
	}

	
	public Statement getStmt() {
		return stmt;
	}
     
}
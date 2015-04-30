package com.restaurant.delivetit;

import com.restaurant.Database.DBConnection;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;

import java.io.*;
import java.sql.*;

import org.mindrot.jbcrypt.*;


public class RegisterFormServlet extends HttpServlet
{
	/**
	 *  stores the customer details in the database
	 */
 public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
 {
	 String firstName=req.getParameter("firstName");
	 String lastName=req.getParameter("lastName");
	 String email=req.getParameter("email");
	 String password=req.getParameter("pwd");
	 String phone = req.getParameter("phone");
	 // BCrypt used to secure the password
	 String securedPassword = BCrypt.hashpw(password, BCrypt.gensalt(12));
	 DBConnection connection = new DBConnection();
	 Statement statement = connection.dbConnect();
	 String sql = "insert into Customer (CustomerFName,CustomerLName,CustomerEmail,CustomerPassword,CustomerPhone)"+ " values (?, ?, ?, ?, ?)";
	 PrintWriter pw=res.getWriter();
	 pw.println("<h1> Welcome "+firstName+" "+lastName+"</h1> <br/>");
	 try
	 {
		 System.out.println("preparing Statement...");  
		 PreparedStatement preparedStatement = connection.getConn().prepareStatement(sql);
		 preparedStatement.setString(1, firstName);
		 preparedStatement.setString(2, lastName);
		 preparedStatement.setString(3,email);
		 preparedStatement.setString(4, securedPassword);
		 preparedStatement.setString(5,phone);
		 preparedStatement.execute();
		 System.out.println("values inserted in customer table");   
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 finally
		{
		    try
		    {
		         if(statement!=null)
		            statement.close();
		         if(connection.getConn() != null)
		         {
		        	 connection.getConn().close();
		         }
		         
		    }
		    catch(SQLException se2)
		    {
		      se2.printStackTrace();
		    }
		   
		}
 
}
}
package com.restaurant.delivetit;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mindrot.jbcrypt.*;

import com.restaurant.Database.DBConnection;

public class LoginFormServlet  extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	 {
		 String email=req.getParameter("email");
		 String password=req.getParameter("pwd");
		 DBConnection connection = new DBConnection();
		 Statement statement = connection.dbConnect();
		 String sql = "select * from Customer where CustomerEmail = '"+email+"'";
		 PrintWriter pw=res.getWriter();
		 try
		 {
			 statement.executeQuery(sql);
			 ResultSet rs = statement.getResultSet();
			 while(rs.next())
			 {
				 String currentUserFname = rs.getString("CustomerFName");
				 String currentUserLname = rs.getString("CustomerLName");
				 String currentUserEmail = rs.getString("CustomerEmail");
				 String currentUserPassword = rs.getString("CustomerPassword");
				 String currentUserPhone = rs.getString("CustomerPhone");
				 
				 Boolean match = BCrypt.checkpw(password, currentUserPassword);
				 pw.println("<h1> Welcome "+currentUserFname+" "+currentUserLname+"</h1> <br/>");
				 if(match)
				 {
					 pw.println("<h1> your password matches yayy !! </h1> <br/>");
				 }
				 
			 }
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

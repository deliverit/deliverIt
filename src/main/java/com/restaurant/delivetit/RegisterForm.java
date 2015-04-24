package com.restaurant.delivetit;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;


public class RegisterForm extends HttpServlet
{
 public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
 {
	 String email=req.getParameter("email");
	 String password=req.getParameter("pwd");
	 String firstName=req.getParameter("firstName");
	 String lastName=req.getParameter("lastName");
	 
	 PrintWriter pw=res.getWriter();

	 pw.println("<h1> Welcome "+firstName+" "+lastName+"</h1> <br/>");
	 pw.println("<h2> Your Email is "+email+"</h2>");
	 pw.println("<h2> Your Password is "+password+"</h2>");
 }
}
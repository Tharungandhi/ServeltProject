package com.bridgebabz.servletprograms;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginPage extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email=req.getParameter("emailid");
		String pw=req.getParameter("password");
		if((RegistrationPage.userList.size()!=0)){
		for(UserInformation u:RegistrationPage.userList)
		if(email.equalsIgnoreCase(u.getEmailId())&& pw.equalsIgnoreCase(u.getPassword()))
		{
			PrintWriter out=resp.getWriter();
			
			 out.write("<html><body><div id='serlvetResponse' style='text-align: center;'>");
		        out.write("<h2>WELCOME  TO HOME PAGE</h2>");
		        out.write("<p style='color: green; font-size: large;'>Congratulations! <span style='text-transform: capitalize;'>" + u.getEmailId() + "</span>, You are an authorised login!</p>");
		        out.write("<p style='color: green; font-size: large;'>Congratulations! <span style='text-transform: capitalize;'>" + u.getPassword() + "</span>, You are password is!</p>");
		        out.write("</div></body></html>");
		    	out.close();
		}}
		else
		{
			RequestDispatcher dis= req.getRequestDispatcher("/registration.html");
			dis.forward(req, resp);
		}
	}

	public UserInformation display( UserInformation userInform)
	{
		System.out.println("Mobile No  :" + userInform.getEmailId());
		System.out.println("Password   :" + userInform.getPassword());
		return userInform;
	}
}

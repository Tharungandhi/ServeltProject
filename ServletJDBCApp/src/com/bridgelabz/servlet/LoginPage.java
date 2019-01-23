package com.bridgelabz.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.dbutil.UserDataBase;
import com.bridgelabz.model.UserInformation;

public class LoginPage extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserInformation userInform=new UserInformation();
		String email=req.getParameter("emailid");
		String pw=req.getParameter("password");
		PrintWriter out=resp.getWriter();
        out.write("<b> Welcome <b>");
        
//		if((RegistrationPage.userList.size()!=0)){
//		for(UserInformation u:RegistrationPage.userList) 
//		if(email.equalsIgnoreCase(u.getEmailId())&& pw.equalsIgnoreCase(u.getPassword()))
//		{
//			    PrintWriter out=resp.getWriter();
//			    out.write("<html><body><div id='serlvetResponse' style='text-align: center;'>");
//		        out.write("<h2>WELCOME  TO HOME PAGE</h2>");
//		        out.write("<p style='color: green; font-size: large;'>Congratulations! <span style='text-transform: capitalize;'>" + u.getEmailId() + "</span>, You are an authorised login!</p>");
//		        out.write("<p style='color: green; font-size: large;'>Congratulations! <span style='text-transform: capitalize;'>" + u.getPassword() + "</span>, You are password is!</p>");
//		        out.write("</div></body></html>");
//		        RequestDispatcher dis= req.getRequestDispatcher("/welcome.html");
//				dis.forward(req, resp);
//		        out.close();
//		}
//		else {
			userInform.setEmailId(req.getParameter("emailid"));
			userInform.setPassword(req.getParameter("password"));
			display(userInform);
		try {
			UserInformation user=UserDataBase.reteriew(userInform);
			if(user!=null) {
				out.print(" To Login Page");
				RequestDispatcher dis1= req.getRequestDispatcher("/welcome.html");
				req.setAttribute("userInform", user);
				dis1.forward(req, resp);
				}
			else {
				out.print("Password incorrect!!"); 
			 RequestDispatcher dis2= req.getRequestDispatcher("/login.html");
			 dis2.include(req, resp);}
			}
			catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();}
		}
		
//		else
//		{
//			RequestDispatcher dis= req.getRequestDispatcher("/registration.html");
//			dis.forward(req, resp);
//		}

	public UserInformation display( UserInformation userInform)
	{
		System.out.println("Email-id   :" + userInform.getEmailId());
		System.out.println("Password   :" + userInform.getPassword());
		return userInform;
	}
}

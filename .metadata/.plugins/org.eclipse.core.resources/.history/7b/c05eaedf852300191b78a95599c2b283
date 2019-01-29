package com.bridgelabz.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.dbutil.UserDataBase;
import com.bridgelabz.model.UserInformation;


@WebServlet("/LoginPage")
public class LoginPage extends HttpServlet{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserInformation userInform=new UserInformation();
		String email=request.getParameter("emailid");
		String pw=request.getParameter("password");
		PrintWriter out=response.getWriter();
    	userInform.setEmailId(request.getParameter("emailid"));
		userInform.setPassword(request.getParameter("password"));
		display(userInform);
		
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
		
		try {
			UserInformation user=UserDataBase.reteriew(userInform);
			
			if(user!=null) {
				
				 Cookie email1=new Cookie("emailid",request.getParameter("emailid"));
				 email1.setMaxAge(60);
				 response.addCookie(email1);
				 HttpSession session=request.getSession();
				 session.setAttribute("emailid", request.getParameter("emailid"));
				 session.setMaxInactiveInterval(30*60);
				 response.sendRedirect("session.jsp");
//				   out.print("cookies"+ email1);
//				out.print("<p><b> To Login Page<b></p>");
//				RequestDispatcher dis1= request.getRequestDispatcher("/welcome.html");
//				request.setAttribute("userInform", user);
//				dis1.forward(request, response);
				
				}
			else {
				out.print("<p><b>Details not present<b></p>"); 
			 RequestDispatcher dis2= request.getRequestDispatcher("/login.html");
			 dis2.include(request, response);}
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
	
	

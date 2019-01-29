package com.bridgelabz.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.dbutil.UserDataBase;
import com.bridgelabz.model.UserInformation;

public class EditPage extends HttpServlet {
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { 
		 HttpSession session = req.getSession(true);
	        UserInformation userinform = (UserInformation) session.getAttribute("UserInformation");
	        String fname = req.getParameter("firstname");
	        System.out.println(fname);
	        String lname = req.getParameter("lastname");
	        String password = req.getParameter("password");
	        String mobileNumber = req.getParameter("phonenumber");
	        String gender = req.getParameter("gender");
	        if (fname.equals("") || lname.equals("")||password.equals("") || mobileNumber.equals("")|| gender.equals("")) {
	            resp.sendRedirect("edit.jsp");
	        }else {
	        	userinform.setFirstname(fname);
	        	userinform.setLastName(lname);
	        	userinform.setPassword(password);
	        	userinform.setMobileNo(mobileNumber);
	        	userinform.setGender(gender);
	         try {   
	        	 UserDataBase.edit(userinform);
	        	 resp.sendRedirect("Checkout.jsp");
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}	
}
 }}

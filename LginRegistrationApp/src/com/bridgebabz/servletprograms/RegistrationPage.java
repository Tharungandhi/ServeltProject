package com.bridgebabz.servletprograms;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationPage extends HttpServlet{

	static List<UserInformation> userList=new ArrayList<UserInformation>();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserInformation userInform=new UserInformation();
		//		userInform.setFirstname(req.getParameter("firstname"));
		//		userInform.setLastName(req.getParameter("lastname"));
		//		userInform.setEmailId(req.getParameter("emailid"));
		//		userInform.setPassword(req.getParameter("password"));
		//		userInform.setMobileNo(req.getParameter("phonenumber"));
		//		userInform.setGender(req.getParameter("gender"));
		//		userList.add(userInform);
		//		System.out.println(userList);
		//		PrintWriter out=resp.getWriter();
		//		out.println("");
		//		out.close();	
		//		display(userInform);

		String fname=req.getParameter("firstname");
		String lname=req.getParameter("lastname");
		String email=req.getParameter("emailid");
		String password=req.getParameter("password");
		String mobileNumber=req.getParameter("phonenumber");
		String gender=req.getParameter("gender");
		if(fname.equals("")||email.equals("")||password.equals("")||mobileNumber.equals(""))
		{
			RequestDispatcher dis= req.getRequestDispatcher("/registration.html");
			dis.include(req, resp);
		}
		else {
			UserInformation user = new UserInformation();
			user.setFirstname(fname);
			user.setLastName(lname);
			user.setEmailId(email);
			user.setPassword(password);
			user.setMobileNo(mobileNumber);
			user.setGender(gender);
			userList.add(user);
			RequestDispatcher dis= req.getRequestDispatcher("/login.html");
			dis.forward(req, resp);
		}	

	}
	public void display( UserInformation userInform)
	{
		System.out.println("First Name :" +userInform.getFirstname());
		System.out.println("Last Name  :" + userInform.getLastName());
		System.out.println("Email ID   :" + userInform.getEmailId());
		System.out.println("Mobile No  :" + userInform.getMobileNo());
		System.out.println("Password   :" + userInform.getPassword());
		System.out.println("Gender     :" + userInform.getGender());
	}

	//		
	//		String fname=req.getParameter("firstname");
	//		System.out.println(fname);
	//		String lname=req.getParameter("lastname");
	//		System.out.println(lname);
	//		String emailid=req.getParameter("emailid");
	//		System.out.println(emailid);
	//		String pswd=req.getParameter("password");
	//		System.out.println(pswd);
	//		String pno=req.getParameter("phonenumber");
	//		System.out.println(pno);
	//		String gen=req.getParameter("gender");
	//		System.out.println(gen);
}


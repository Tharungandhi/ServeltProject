package com.bridgelabz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomePage extends HttpServlet{

	@SuppressWarnings("unused")
	private void dopst(HttpServletRequest req, HttpServletResponse resp ) throws IOException, ServletException {
		PrintWriter out=resp.getWriter();
		out.print("<b> Succesfully logged out </b>");
		req.getSession().invalidate();
//	    resp.sendRedirect(req.getContextPath() + "/login.html");
		RequestDispatcher dis= req.getRequestDispatcher("/login.html");
		dis.forward(req, resp);

	}
}

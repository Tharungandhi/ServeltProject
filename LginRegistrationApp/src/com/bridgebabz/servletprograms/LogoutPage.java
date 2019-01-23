package com.bridgebabz.servletprograms;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutPage extends HttpServlet{

	private void dopst(HttpServletRequest req, HttpServletResponse resp ) throws IOException, ServletException {
		PrintWriter out=resp.getWriter();
		out.print("<b> Welcome to Home Page </b>");
		 req.getSession().invalidate();
	    resp.sendRedirect(req.getContextPath() + "/LoginPage.html");
		RequestDispatcher dis= req.getRequestDispatcher("/LoginPage.html");
		dis.forward(req, resp);

	}
}

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.37
 * Generated at: 2019-01-29 13:22:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.bridgelabz.model.UserInformation;

public final class session_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.bridgelabz.model.UserInformation");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=US-ASCII");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<style >\n");
      out.write("\n");
      out.write("input { \n");
      out.write("    width: 100%; \n");
      out.write("    margin-bottom: 10px; \n");
      out.write("    background: rgba(0,0,0,0.3);\n");
      out.write("    border: medium;\n");
      out.write("    outline: none;\n");
      out.write("    padding: 10px;\n");
      out.write("    font-size: 13px;\n");
      out.write("    color: #fff;\n");
      out.write("    text-shadow: 1px 1px 1px rgba(0,0,0,0.3);\n");
      out.write("    border: 1px solid rgba(0,0,0,0.3);\n");
      out.write("    border-radius: 4px;\n");
      out.write("    box-shadow: inset 0 -5px 45px rgba(100,100,100,0.2), 0 1px 1px rgba(255,255,255,0.2);\n");
      out.write("    -webkit-transition: box-shadow .5s ease;\n");
      out.write("    -moz-transition: box-shadow .5s ease;\n");
      out.write("    -o-transition: box-shadow .5s ease;\n");
      out.write("    -ms-transition: box-shadow .5s ease;\n");
      out.write("    transition: box-shadow .5s ease;\n");
      out.write("}\n");
      out.write(".login { \n");
      out.write("    position: absolute;\n");
      out.write("    top: 50%;\n");
      out.write("    left: 50%;\n");
      out.write("    margin: -150px 0 0 -150px;\n");
      out.write("    width:300px;\n");
      out.write("    height:300px;\n");
      out.write("}\n");
      out.write(".login h1 { color: #fff; text-shadow: 0 0 10px rgba(0,0,0,0.3); letter-spacing:1px; text-align:center; }\n");
      out.write("\n");
      out.write("body {\n");
      out.write("  background: #2f313d;\n");
      out.write("  color: #fff;\n");
      out.write("  font-family: sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=US-ASCII\">\n");
      out.write("<title>Login Success Page</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t");

		UserInformation user = new UserInformation();
		if (session.getAttribute("UserInformation") == null) {
			response.sendRedirect("login.html");
		} else
			user = (UserInformation) session.getAttribute("UserInformation");
		String email = null;
		String sessionID = null;

		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("UserInformation"))
					email = cookie.getValue();
				if (cookie.getName().equals("JSESSIONID"))
					sessionID = cookie.getValue();
			}
		} else {
			sessionID = session.getId();
		}
	
      out.write("\n");
      out.write("\t<div class=\"login\">\n");
      out.write("\t<div><h3>");
      out.print(user.getEmailId() );
      out.write(" successfully logged in </h3></div>\n");
      out.write("\t<div><h3>Your Session ID=");
      out.print(sessionID);
      out.write("</h3></div>\n");
      out.write("\t");
      out.write("\n");
      out.write("\n");
      out.write(" <form action=\"");
      out.print(response.encodeURL("Checkout.jsp") );
      out.write("\" method=\"post\">\n");
      out.write("<input type=\"submit\"  value=\"Details\" >\n");
      out.write("</form> \n");
      out.write("\n");
      out.write("\t<form action=\"login\" method=\"post\">\n");
      out.write("\t\t<input type=\"submit\" value=\"Logout\">\n");
      out.write("\t</form>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

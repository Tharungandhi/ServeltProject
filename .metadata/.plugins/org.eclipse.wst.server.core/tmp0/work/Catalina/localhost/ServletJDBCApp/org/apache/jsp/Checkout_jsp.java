/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.37
 * Generated at: 2019-01-29 13:29:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.bridgelabz.model.UserInformation;

public final class Checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("    \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<style >\n");
      out.write("\n");
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
      out.write("\n");
      out.write("body { \n");
      out.write("    width: 100%;\n");
      out.write("    height:100%;\n");
      out.write("    font-family: 'Open Sans', sans-serif;\n");
      out.write("    background: #092756;\n");
      out.write("    background: -moz-radial-gradient(0% 100%, ellipse cover, rgba(104,128,138,.4) 10%,rgba(138,114,76,0) 40%),-moz-linear-gradient(top,  rgba(57,173,219,.25) 0%, rgba(42,60,87,.4) 100%), -moz-linear-gradient(-45deg,  #670d10 0%, #092756 100%);\n");
      out.write("    background: -webkit-radial-gradient(0% 100%, ellipse cover, rgba(104,128,138,.4) 10%,rgba(138,114,76,0) 40%), -webkit-linear-gradient(top,  rgba(57,173,219,.25) 0%,rgba(42,60,87,.4) 100%), -webkit-linear-gradient(-45deg,  #670d10 0%,#092756 100%);\n");
      out.write("    background: -o-radial-gradient(0% 100%, ellipse cover, rgba(104,128,138,.4) 10%,rgba(138,114,76,0) 40%), -o-linear-gradient(top,  rgba(57,173,219,.25) 0%,rgba(42,60,87,.4) 100%), -o-linear-gradient(-45deg,  #670d10 0%,#092756 100%);\n");
      out.write("    background: -ms-radial-gradient(0% 100%, ellipse cover, rgba(104,128,138,.4) 10%,rgba(138,114,76,0) 40%), -ms-linear-gradient(top,  rgba(57,173,219,.25) 0%,rgba(42,60,87,.4) 100%), -ms-linear-gradient(-45deg,  #670d10 0%,#092756 100%);\n");
      out.write("    background: -webkit-radial-gradient(0% 100%, ellipse cover, rgba(104,128,138,.4) 10%,rgba(138,114,76,0) 40%), linear-gradient(to bottom,  rgba(57,173,219,.25) 0%,rgba(42,60,87,.4) 100%), linear-gradient(135deg,  #670d10 0%,#092756 100%);\n");
      out.write("    filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#3E1D6D', endColorstr='#092756',GradientType=1 );\n");
      out.write("     image:url(\"/home/admin1/Downloads/215782538a44bc3.jpg\");\n");
      out.write("\n");
      out.write("}\n");
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=US-ASCII\">\n");
      out.write("<title>User Details</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"login\">\n");
 
UserInformation userinform=(UserInformation)session.getAttribute("UserInformation");

      out.write("\n");
      out.write("<h3> User Details </h3>\n");
      out.write("<div>\n");
      out.write("<b>FirstName=</b>");
      out.print(userinform.getFirstname());
      out.write("\n");
      out.write("</div>\n");
      out.write("<div>\n");
      out.write("<br>\n");
      out.write("<b>LastName=</b>");
      out.print(userinform.getLastName() );
      out.write("<br></div>\n");
      out.write("<div>\n");
      out.write("<br>\n");
      out.write("<b>EmailID=</b>");
      out.print(userinform.getEmailId() );
      out.write("<br></div>\n");
      out.write("<div>\n");
      out.write("<br>\n");
      out.write("<b>Password=</b>");
      out.print(userinform.getPassword());
      out.write("<br></div>\n");
      out.write("<div>\n");
      out.write("<br>\n");
      out.write("<b>MobileNo=</b>");
      out.print(userinform.getMobileNo() );
      out.write("<br></div>\n");
      out.write("\n");
      out.write("<div>\n");
      out.write("<br>\n");
      out.write("<b>Gender=</b>");
      out.print(userinform.getGender() );
      out.write("<br></div>\n");
      out.write("\n");
      out.write(" <form action=\"");
      out.print(response.encodeURL("edit.jsp") );
      out.write("\" method=\"post\">\n");
      out.write("<input type=\"submit\"  value=\"edit\" > \n");
      out.write("</form> \n");
      out.write(" <form action=\"");
      out.print(response.encodeURL("session.jsp") );
      out.write("\" method=\"post\">\n");
      out.write("<input type=\"submit\"  value=\"back\" > \n");
      out.write("</form> \n");
      out.write("<!-- <a href=\"edit.jsp\">Edit Details</a> -->\n");
      out.write("</div>\n");
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

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-06-08 12:24:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("<style>\n");
      out.write("body {\n");
      out.write("\tbackground-image:\n");
      out.write("\t\turl(\"https://d1kxiaxkq0bgmn.cloudfront.net/wp-content/uploads/2019/10/airlines.jpg\");\n");
      out.write("\tbackground-size: cover;\n");
      out.write("\tbackground-repeat: no-repeat;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input {\n");
      out.write("\twidth: 150px;\n");
      out.write("\tmargin-bottom: 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form {\n");
      out.write("\tmargin-left: 500px;\n");
      out.write("\tbackground: rgb(236, 236, 222);\n");
      out.write("\twidth: 28%;\n");
      out.write("\tpadding: 1em;\n");
      out.write("\tmargin-top: 13%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("label {\n");
      out.write("\tfloat: left;\n");
      out.write("\twidth: 120px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1 {\n");
      out.write("\tmargin-left: 350px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#login {\n");
      out.write("\tmargin-left: 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#create {\n");
      out.write("\twidth: 200px;\n");
      out.write("\tmargin-left: 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".links {\n");
      out.write("\twidth: 100%;\n");
      out.write("\tbackground-color: black;\n");
      out.write("\toverflow: auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".links a {\n");
      out.write("\tfloat: left;\n");
      out.write("\tpadding: 12px;\n");
      out.write("\tcolor: white;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\tfont-size: 20px;\n");
      out.write("\twidth: 23%;\n");
      out.write("\ttext-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".links a:hover {\n");
      out.write("\tbackground-color: beige;\n");
      out.write("\tcolor: black;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<header>\n");
      out.write("\t\t<div class=\"links\">\n");
      out.write("\t\t\t<a href=\"\">Reservation</a> <a href=\"welcome.html\">Home</a> <a href=\"\">Flight</a>\n");
      out.write("\t\t\t<a href=\"login.html\">Login</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</header>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<form method=\"post\">\n");
      out.write("\t\t<table>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td><label>User Id : </label></td>\n");
      out.write("\n");
      out.write("\t\t\t\t<td><input name=\"username\" type=\"text\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t<tr>\n");
      out.write("\n");
      out.write("\t\t\t\t<td><label>Password : </label></td>\n");
      out.write("\n");
      out.write("\t\t\t\t<td><input name=\"password\" type=\"password\"><br></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t\t<br> <br>\n");
      out.write("\t\t<button type=\"submit\" class=\"btn btn-primary\" id=\"login\">Login</button>\n");
      out.write("\t\tOR\n");
      out.write("\t\t<a href=\"/register\"><button type=\"button\" class=\"btn btn-primary\" id=\"create\">Create\n");
      out.write("\t\t\tNew Account</button></a>\n");
      out.write("\n");
      out.write("\t</form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<br>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

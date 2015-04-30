package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<div class=\"container\">\n");
      out.write("  <h2>Sign Up</h2>\n");
      out.write("\t\t<form action=\"/deliverit/registerForm\" method=\"post\" role=\"form\">\n");
      out.write("\t\t  \t<div class=\"form-group\">\n");
      out.write("\t\t      <label for=\"firstName\">First Name:</label>\n");
      out.write("\t\t      <input type=\"text\" class=\"form-control\" name=\"firstName\" id=\"firstName\" placeholder=\"FirstName\">\n");
      out.write("\t\t    </div>\n");
      out.write("\t\t    <div class=\"form-group\">\n");
      out.write("\t\t      <label for=\"lastName\">Last Name:</label>\n");
      out.write("\t\t      <input type=\"text\" class=\"form-control\" name=\"lastName\" id=\"lastName\" placeholder=\"Lastname\">\n");
      out.write("\t\t    </div>\n");
      out.write("\t\t    <div class=\"form-group\">\n");
      out.write("\t\t      <label for=\"email\">Email:</label>\n");
      out.write("\t\t      <input type=\"email\" class=\"form-control\" name=\"email\" id=\"email\" placeholder=\"Enter email\">\n");
      out.write("\t\t    </div>\n");
      out.write("\t\t    <div class=\"form-group\">\n");
      out.write("\t\t      <label for=\"phone\">Phone:</label>\n");
      out.write("\t\t      <input type=\"phone\" class=\"form-control\" name=\"phone\" id=\"phone\" placeholder=\"Phone No\">\n");
      out.write("\t\t    </div>\n");
      out.write("\t\t    <div class=\"form-group\">\n");
      out.write("\t\t      <label for=\"pwd\">Password:</label>\n");
      out.write("\t\t      <input type=\"password\" class=\"form-control\" name=\"pwd\" id=\"pwd\" placeholder=\"Enter password\">\n");
      out.write("\t\t    </div>\n");
      out.write("\t\t    <div class=\"checkbox\">\n");
      out.write("\t\t      <label><input type=\"checkbox\"> Remember me</label>\n");
      out.write("\t\t    </div>\n");
      out.write("\t\t    \t<button type=\"submit\" class=\"btn btn-info btn-lg\">Submit</button> \n");
      out.write("\t\t    \t<button type=\"reset\" class=\"btn btn-info btn-lg\"> Reset</button>\n");
      out.write("\t\t  \t</form>\n");
      out.write("</div>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

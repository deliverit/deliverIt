package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contactus_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div class=\"jumbotron jumbotron-sm\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-12 col-lg-12\">\n");
      out.write("                <h2>\n");
      out.write("                    Contact us</h2>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-md-8\">\n");
      out.write("            <div class=\"well well-sm\">\n");
      out.write("                <form>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"name\">\n");
      out.write("                                Name</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"name\" placeholder=\"Enter name\" required=\"required\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"email\">\n");
      out.write("                                Email Address</label>\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-envelope\"></span>\n");
      out.write("                                </span>\n");
      out.write("                                <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Enter email\" required=\"required\" /></div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"name\">\n");
      out.write("                                Message</label>\n");
      out.write("                            <textarea name=\"message\" id=\"message\" class=\"form-control\" rows=\"9\" cols=\"25\" required=\"required\"\n");
      out.write("                                placeholder=\"Message\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary pull-right\" id=\"btnContactUs\">\n");
      out.write("                            Send Message</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-4\">\n");
      out.write("            <form>\n");
      out.write("            <legend><span class=\"glyphicon glyphicon-globe\"></span> Our office</legend>\n");
      out.write("            <address>\n");
      out.write("                <strong>SUKANYA MANI AUTO CRAFT</strong><br>\n");
      out.write("                170-A, NGO Colony, RTO Office Main Road,<br>\n");
      out.write("                Tirunelveli TN- 627007,<br>\n");
      out.write("                India<br>\n");
      out.write("                <abbr title=\"Phone\">\n");
      out.write("                    P:</abbr>\n");
      out.write("                +91 98421 44217<br>\n");
      out.write("                +91 98427 30217 - Work Office<br>\n");
      out.write("                +91 98421 13217 - Office<br>\n");
      out.write("            </address>\n");
      out.write("            <address>\n");
      out.write("                <strong>Manivannan</strong><br>\n");
      out.write("                <a href=\"mailto:#\">sukanmanicarcare@gmail.com</a>\n");
      out.write("            </address>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
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

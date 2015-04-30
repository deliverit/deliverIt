package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/main.css\">\n");
      out.write("\t <link href=\"css/full-slider.css\" rel=\"stylesheet\">\n");
      out.write("  \t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\n");
      out.write("  \t<script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"js/main.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.easing-1.3.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.iosslider.min.js\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"HeadBanner navbar navbar-default navbar-fixed-top\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div id=\"header\" class=\"headerClass\"></div>\n");
      out.write("\t\t\t\t<ul class=\"nav nav-pills pull-right\">\n");
      out.write("\t\t\t\t    <li><a data-toggle=\"tab\" href=\"#signinmenu\">Sign In</a></li>\n");
      out.write("\t\t\t\t    <li><a data-toggle=\"tab\" href=\"#signupmenu\">Sign Up</a></li>\n");
      out.write("\t\t\t  \t</ul>\n");
      out.write("\t\t\t\t<div id=\"logoID\" class=\"logoClass\">\n");
      out.write("\t\t\t\t\t<img src=\"images/test2.png\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div id=\"topTabID\" class=\"TopTabClass\">\n");
      out.write("\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "toptabs.jsp", out, false);
      out.write(" \n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t</div>\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("<div class=\"tab-content\">\n");
      out.write("    <div id=\"home\" class=\"tab-pane fade in active\">\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "slider.jsp", out, false);
      out.write("\n");
      out.write("    </div>\n");
      out.write("     <div id=\"signinmenu\" class=\"tab-pane fade\">\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "signin.jsp", out, false);
      out.write("\n");
      out.write("    </div>\n");
      out.write("     <div id=\"signupmenu\" class=\"tab-pane fade\">\n");
      out.write("       ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "signup.jsp", out, false);
      out.write("\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div id=\"menu1\" class=\"tab-pane fade\">\n");
      out.write("      <h3>Menu 1</h3>\n");
      out.write("      <p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div id=\"menu2\" class=\"tab-pane fade\">\n");
      out.write("      <h3>Menu 2</h3>\n");
      out.write("      <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam.</p>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div id=\"menu3\" class=\"tab-pane fade\">\n");
      out.write("      <h3>Menu 3</h3>\n");
      out.write("      <p>Eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.</p>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"menu4\" class=\"tab-pane fade\">\n");
      out.write("      <h3>Menu 3</h3>\n");
      out.write("      <p>Eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.</p>\n");
      out.write("    </div>\n");
      out.write(" </div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t<nav class=\"navbar navbar-inverse navbar-fixed-bottom\">\n");
      out.write("\t\t\t  <div class=\"container-fluid\">\n");
      out.write("\t\t\t    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\t\t\t   </div>\n");
      out.write("\t\t\t</nav>\n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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

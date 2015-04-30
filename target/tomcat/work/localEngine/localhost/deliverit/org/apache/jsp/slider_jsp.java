package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class slider_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<header id=\"myCarousel\" class=\"carousel slide\">\n");
      out.write("        <!-- Indicators -->\n");
      out.write("        <ol class=\"carousel-indicators\">\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("        </ol>\n");
      out.write("\n");
      out.write("        <!-- Wrapper for Slides -->\n");
      out.write("        <div class=\"carousel-inner\">\n");
      out.write("            <div class=\"item active\">\n");
      out.write("                <!-- Set the first background image using inline CSS below. -->\n");
      out.write("                <div class=\"fill\" style=\"background-image:url('images/t_2.jpeg');\"></div>\n");
      out.write("                <div class=\"carousel-caption\">\n");
      out.write("                    <h2>Caption 1</h2>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <!-- Set the second background image using inline CSS below. -->\n");
      out.write("                <div class=\"fill\" style=\"background-image:url('images/t_4.jpg');\"></div>\n");
      out.write("                <div class=\"carousel-caption\">\n");
      out.write("                    <h2>Caption 2</h2>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <!-- Set the third background image using inline CSS below. -->\n");
      out.write("                <div class=\"fill\" style=\"background-image:url('images/t_6.jpg');\"></div>\n");
      out.write("                <div class=\"carousel-caption\">\n");
      out.write("                    <h2>Caption 3</h2>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Controls -->\n");
      out.write("        <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\n");
      out.write("            <span class=\"icon-prev\"></span>\n");
      out.write("        </a>\n");
      out.write("        <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\n");
      out.write("            <span class=\"icon-next\"></span>\n");
      out.write("        </a>\n");
      out.write("\n");
      out.write("    </header>\n");
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

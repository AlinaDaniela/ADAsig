package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class submitNoReload_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<script src=\"resources/js/jquery-1.8.2.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    $(document).ready(function() {\n");
      out.write("     $('#ibutton').click(function(e) {\n");
      out.write("     e.preventDefault();\n");
      out.write("     var ajaxdata = $(\"#country\").val();\n");
      out.write("     var value ='county='+ajaxdata;\n");
      out.write(" \n");
      out.write("     $.ajax({\n");
      out.write("     url: \"saveIt\",\n");
      out.write("     //type: \"post\",\n");
      out.write("     data: value,\n");
      out.write("     cache: false,\n");
      out.write("     success: function(data) {\n");
      out.write("     $(\"#country\").val('');\n");
      out.write("     $(\"#message\").html(data).slideDown('slow');\n");
      out.write("     }\n");
      out.write("     });\n");
      out.write("});\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("<style>\n");
      out.write("#country{\n");
      out.write("border: 1px solid #8707c2;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write(" \n");
      out.write("<body>\n");
      out.write("<center>\n");
      out.write(" \n");
      out.write("<font face=\"verdana\" size=\"4\">\n");
      out.write("Submit Form With Out Page Refresh In Java/Servlets - jQuery<br><br>\n");
      out.write("</font>\n");
      out.write(" \n");
      out.write("   <form name=\"sub\" action=\"SaveData\" id=\"sub\">\n");
      out.write("     <font face=\"verdana\" size=\"2\">Country:</font>\n");
      out.write("     <input type=\"text\" name=\"country\" id=\"country\" size=\"30\" />\n");
      out.write("     <input type=\"button\" id=\"ibutton\" value=\"Save\"/>\n");
      out.write("   </form>\n");
      out.write(" \n");
      out.write("<br><font face=\"verdana\" size=\"2\"><div id=\"message\"></div></font>\n");
      out.write(" \n");
      out.write("<br><br><img src=\"images/java4s.png\">\n");
      out.write(" \n");
      out.write("</center>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

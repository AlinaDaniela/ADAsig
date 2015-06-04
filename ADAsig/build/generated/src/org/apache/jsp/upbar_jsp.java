package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class upbar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <!-- Le styles -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css/bootstrap.css\">\n");
      out.write("        <script  href=\"resources/js/bootstrap.min.js\" />\n");
      out.write("        <script  href=\"resources/js/bootstrap.js\" />\n");
      out.write("        <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/font-awesome.min.css\">s\n");
      out.write("        <!-- documentation styles -->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button class=\"navbar-toggle\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbar-main\">\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">Sitename</a>\n");
      out.write("                </div>\n");
      out.write("                <center>\n");
      out.write("                    <div class=\"navbar-collapse collapse\" id=\"navbar-main\">\n");
      out.write("                        <ul class=\"nav navbar-nav\">\n");
      out.write("                            <li class=\"active\"><a href=\"#\">Link</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"#\">Link</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"#\">Link</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"#\">Link</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"#\">Link</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"dropdown\">\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Dropdown <b class=\"caret\"></b></a>\n");
      out.write("                                <ul class=\"dropdown-menu\">\n");
      out.write("                                    <li><a href=\"#\">Action</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li><a href=\"#\">Another action</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li><a href=\"#\">Something else here</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"divider\"></li>\n");
      out.write("                                    <li><a href=\"#\">Separated link</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"divider\"></li>\n");
      out.write("                                    <li><a href=\"#\">One more separated link</a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                        <form class=\"navbar-form navbar-right\" role=\"search\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"username\" placeholder=\"Username\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"password\" placeholder=\"Password\">\n");
      out.write("                            </div>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-default\">Sign In</button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </center>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

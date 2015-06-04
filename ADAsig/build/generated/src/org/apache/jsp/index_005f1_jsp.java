package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\t    <title>Ajax - Servlets Integration Example</title>\r\n");
      out.write("\t    \r\n");
      out.write("\t    <!-- Load the scripts needed for the application. -->\r\n");
      out.write("\t    <script type=\"text/javascript\" src=\"resources/jquery-2.1.1.min.js\"></script>\r\n");
      out.write("\t    <script type=\"text/javascript\" src=\"resources/buttonEventsInit.js\"></script>\r\n");
      out.write("\t    <script type=\"text/javascript\" src=\"resources/resultsPrinter.js\"></script>\r\n");
      out.write("\t    <script type=\"text/javascript\" src=\"resources/insertBandInfo.js\"></script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t\r\n");
      out.write("\t<body>\r\n");
      out.write("\t    <h1>Ajax - Servlets Integration Example</h1>\r\n");
      out.write("\t    <p>This is an example of how to use Ajax with a servlet backend.</p></br>\r\n");
      out.write("\t    \r\n");
      out.write("\t    <h3>Select a button to get the relevant information.</h3>\r\n");
      out.write("\t    \r\n");
      out.write("\t    <!-- Buttons that will call the servlet to retrieve the information. -->\r\n");
      out.write("\t    <button id=\"bands\" type=\"button\">Show bands!</button>\r\n");
      out.write("\t    <button id=\"bands-albums\" type=\"button\">Show bands and albums!</button>\r\n");
      out.write("\t    \r\n");
      out.write("\t    <!-- We need to have some empty divs in order to add the retrieved information to them. -->\r\n");
      out.write("\t    <div id=\"band-results\"></div></br></br>\r\n");
      out.write("\t    <div id=\"bands-albums-results\"></div></br></br>\r\n");
      out.write("\t    \r\n");
      out.write("\t    \r\n");
      out.write("\t    <h3>Add the band information and press submit!</h3>\r\n");
      out.write("\t    <h4>Band name: </h4><input type=\"text\" id=\"band-name-input\" value=\"\"><br>\r\n");
      out.write("        <h4>Albums: </h4><input type=\"text\" id=\"album-input\" value=\"\">(Separated by commas)<br>\r\n");
      out.write("        <input type=\"submit\" id=\"submit-band-info\" value=\"Submit\">\r\n");
      out.write("\t</body>\r\n");
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

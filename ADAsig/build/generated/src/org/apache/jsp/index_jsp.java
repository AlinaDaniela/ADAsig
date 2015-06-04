package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/myStyle.css\" />\n");
      out.write("        <script src=\"resources/js/modernizr-1.5.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"demo-wrapper\">\n");
      out.write("            <div class=\"s-page custom-page\">\n");
      out.write("                <div class=\"page-content\">\n");
      out.write("                    <h2 class=\"page-title\">Thank You!</h2>\n");
      out.write("                    <div class=\"close-button s-close-button\">x</div>\n");
      out.write("                    <form action=\"LoginController\" method=\"post\" autocomplete=\"false\">\n");
      out.write("\n");
      out.write("                        <!-- fake fields are a workaround for chrome autofill getting the wrong fields -->\n");
      out.write("                        <input style=\"display:none\" type=\"text\" name=\"fakeusernameremembered\"/>\n");
      out.write("                        <input style=\"display:none\" type=\"password\" name=\"fakepasswordremembered\"/>\n");
      out.write("\n");
      out.write("                        Email: <input type=\"text\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${valoriCorecteLogin.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" autocomplete=\"false\" >  <span style=\"color:red\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${eroriLogin.eroareEmail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </span> <br/>\n");
      out.write("                        Password: <input type=\"password\" name=\"parola\"autocomplete=\"false\" >  <span style=\"color:red\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${eroriLogin.eroareParola}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </span> <br/>\n");
      out.write("                        <input type=\"submit\" value=\"Login\"> <br/>\n");
      out.write("\n");
      out.write("                        <span style=\"color:red\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${eroareUtilizatorInexistent}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </span> <br/>\n");
      out.write("                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </form>    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"dashboard clearfix\">\n");
      out.write("                <ul class=\"tiles\">\n");
      out.write("                    <div class=\"col3 clearfix\">      \n");
      out.write("                        <li class=\"tile tile-2xbig tile-9 fig-tile\" data-page-type=\"custom-page\" data-page-name=\"random-r-page\">\n");
      out.write("                            <figure>\n");
      out.write("                                <img src=\"resources/images/summer.jpg\" />\n");
      out.write("                                <figcaption class=\"tile-caption caption-bottom\">Fixed Caption: Some Subtitle or Tile Description Goes Here with some kinda link or anything\n");
      out.write("                            </figure>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"tile tile-big tile-10\" data-page-type=\"s-page\" data-page-name=\"custom-page\">\n");
      out.write("                            <div><p>Open a tile.</p></div>\n");
      out.write("                        </li>\n");
      out.write("                    </div>\n");
      out.write("                </ul>\n");
      out.write("            </div><!--end dashboard-->\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"resources/js/jquery-1.8.2.min.js\"></script>\n");
      out.write("        <script src=\"resources/js/scripts.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty display}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <a href=\"register.jsp\">Register</a>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }
}

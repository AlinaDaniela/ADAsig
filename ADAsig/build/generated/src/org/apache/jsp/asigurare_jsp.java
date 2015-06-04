package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class asigurare_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"resources/css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"resources/js/getLocalitati.js\" />\n");
      out.write("        <script src=\"resources/js/getLocalitati1.js\" />\n");
      out.write("        <script src=\"resources/js/tipPersoana.js\" />\n");
      out.write("        <title>Realizeaza Asigurare</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"container-fluid\" id=\"asigurare\">\n");
      out.write("            <ul class=\"nav nav-tabs\" id=\"myTabs\">\n");
      out.write("                <li class=\"active\"><a class=\"active\" href=\"#dateProprietar\" data-url=\"/embed/62805/view\">Date proprietar</a></li>\n");
      out.write("                <li class=\"disabled\"><a class=\"disabled\" href=\"#profile\" data-url=\"/embed/62806/view\">Profile</a></li>\n");
      out.write("                <li class=\"disabled\"><a class=\"disabled\" href=\"#messages\" data-url=\"/embed/62807/view\">Messages</a></li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <div class=\"tab-content\">\n");
      out.write("                <div class=\"tab-pane active\" id=\"dateProprietar\">\n");
      out.write("                    <div  class=\"mainbox \">\n");
      out.write("                        <div class=\"panel panel-info\">\n");
      out.write("                            <div class=\"panel-body\" >\n");
      out.write("                                <form name=\"dateProprietar\" action=\"Asigurare\" method=\"post\" class=\"form-horizontal\" role=\"form\">\n");
      out.write("\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"tipPersoana\" class=\"col-md-3 control-label\">TipPersoana</label>\n");
      out.write("                                        <div class=\"col-md-9\">\n");
      out.write("                                            <form role=\"form\">\n");
      out.write("                                                <label class=\"radio-inline\"><input type=\"radio\" name=\"tipPersoana\" class=\"tipPersoana\" value=\"persFizica\" onchange=\"hidePersJuridica(this)\" checked>Persoana fizica</label>\n");
      out.write("                                                <label class=\"radio-inline\"><input type=\"radio\" name=\"tipPersoana\" class=\"tipPersoana\" value=\"persJuridica\" onchange=\"hidePersFizica(this)\">Persoana juridica</label>\n");
      out.write("                                            </form>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div id=\"persFizicaForm\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"nume\" class=\"col-md-3 control-label\">Nume</label>\n");
      out.write("                                            <div class=\"col-md-3\">\n");
      out.write("                                                <input  class=\"form-control\" type = \"text\" name=\"nume\" placeholder=\"Nume\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${valoriCorecteClient.nume}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>  \n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"prenume\" class=\"col-md-3 control-label\">Prenume</label>\n");
      out.write("                                            <div class=\"col-md-3\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"prenume\" placeholder=\"Prenume\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${valoriCorecteClient.prenume}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"CNP\" class=\"col-md-3 control-label\">CNP</label>\n");
      out.write("                                            <div class=\"col-md-3\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"CNP\" placeholder=\"CNP\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${valoriCorecteClient.CNP}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/> \n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"anObtinerePermis\" class=\"col-md-3 control-label\">An obtinere permis</label>\n");
      out.write("\n");
      out.write("                                            <div class=\"col-md-3\">\n");
      out.write("                                                <select class=\"form-control\" id=\"aniOP\" name=\"anObtinerePermis\" >\n");
      out.write("                                                    <option value=\"\"></option>\n");
      out.write("                                                    <option value=\"faraPermis\">Fara permis</option>\n");
      out.write("                                                </select>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div id=\"persJuridicaForm\" style=\"visibility:hidden; position: absolute;\">\n");
      out.write("\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"societate\" class=\"col-md-6 control-label\">Denumire Societate</label>\n");
      out.write("                                            <div class=\"col-md-6\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"prenume\" placeholder=\"Denumire Societate\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${valoriCorecteClient.societate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"CIF\" class=\"col-md-6 control-label\">CIF</label>\n");
      out.write("                                            <div class=\"col-md-6\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"CIF\" placeholder=\"CNP\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${valoriCorecteClient.CIF}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/> \n");
      out.write("                                            </div>\n");
      out.write("                                        </div>                                      \n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <hr>\n");
      out.write("\n");
      out.write("                                    <div>\n");
      out.write("                                        <span>Adresa din talon</span>\n");
      out.write("\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"judet\" class=\"col-md-6 control-label\">Judet</label>\n");
      out.write("                                            <div class=\"col-md-6\">\n");
      out.write("                                                <div class=\"col-md-6\">\n");
      out.write("                                                    <select class=\"form-control\"  name=\"judet\" id=\"judet\">\n");
      out.write("                                                        <option value=\"\"></option>\n");
      out.write("                                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                    </select>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>  \n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"localitate\" class=\"col-md-6 control-label\">Localitate</label>\n");
      out.write("                                            <div class=\"col-md-6\">\n");
      out.write("                                                <div class=\"col-md-6\">\n");
      out.write("                                                    <select class=\"form-control\"  name=\"localitate\" id=\"localitate\" >\n");
      out.write("                                                        <option value=\"\"></option>\n");
      out.write("                                                        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                    </select>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>  \n");
      out.write("\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"strada\" class=\"col-md-6 control-label\">Strada</label>\n");
      out.write("                                            <div class=\"col-md-6\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"strada\" placeholder=\"Strada\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${valoriCorecteClient.CIF}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/> \n");
      out.write("                                            </div>\n");
      out.write("                                        </div>   \n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"numar\" class=\"col-md-6 control-label\">Numar</label>\n");
      out.write("                                            <div class=\"col-md-6\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"numar\" placeholder=\"Numar\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${valoriCorecteClient.CIF}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/> \n");
      out.write("                                            </div>\n");
      out.write("                                        </div>   \n");
      out.write("\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"bloc\" class=\"col-md-6 control-label\">Bloc</label>\n");
      out.write("                                            <div class=\"col-md-6\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"bloc\" placeholder=\"Bloc\" id=\"message\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${valoriCorecteClient.CIF}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/> \n");
      out.write("                                            </div>\n");
      out.write("                                        </div>   \n");
      out.write("\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"scara\" class=\"col-md-6 control-label\">Scara</label>\n");
      out.write("                                            <div class=\"col-md-6\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"scara\" placeholder=\"Sc.\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${valoriCorecteClient.CIF}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/> \n");
      out.write("                                            </div>\n");
      out.write("                                        </div>   \n");
      out.write("\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"etaj\" class=\"col-md-6 control-label\">Etaj</label>\n");
      out.write("                                            <div class=\"col-md-6\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"etaj\" placeholder=\"Et.\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${valoriCorecteClient.CIF}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/> \n");
      out.write("                                            </div>\n");
      out.write("                                        </div>  \n");
      out.write("\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"apartament\" class=\"col-md-6 control-label\">Apartament</label>\n");
      out.write("                                            <div class=\"col-md-6\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"apartament\" placeholder=\"Ap.\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${valoriCorecteClient.CIF}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/> \n");
      out.write("                                            </div>\n");
      out.write("                                        </div>  \n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <!-- Button -->                                        \n");
      out.write("                                        <div class=\"col-md-offset-3 col-md-9\">\n");
      out.write("                                            <input  id=\"btn-signup\" type=\"submit\" class=\"btn btn-info\" name=\"autentificare\" value=\"Inregistrare\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("                </div>\n");
      out.write("                <div class=\"tab-pane\" id=\"profile\"></div>\n");
      out.write("                <div class=\"tab-pane\" id=\"messages\"></div>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty eroriClient || not empty emailDuplicat}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\n");
        out.write("                                        <div id=\"signupalert\" class=\"alert alert-danger\" >\n");
        out.write("                                            ");
        if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                            ");
        if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                            ");
        if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                            ");
        if (_jspx_meth_c_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                            ");
        if (_jspx_meth_c_if_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                            ");
        if (_jspx_meth_c_if_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                            ");
        if (_jspx_meth_c_if_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                                        </div>\n");
        out.write("                                    ");
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

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty eroriClient.eroareNume}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <span style=\"color:red\"> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${eroriClient.eroareNume}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" </span> <br/>\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty eroriClient.eroarePrenume}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <span style=\"color:red\"> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${eroriClient.eroarePrenume}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" </span> <br/> \n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty eroriClient.eroareEmail}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <span style=\"color:red\"> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${eroriClient.eroareEmail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" </span> <br/>\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty eroriClient.eroareTelefon}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <span style=\"color:red\"> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${eroriClient.eroareTelefon}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" </span> <br/>\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty eroriClient.eroareParola}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <span style=\"color:red\"> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${eroriClient.eroareParola}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" </span> <br/>\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_c_if_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty eroriClient.eroareReParola}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <span style=\"color:red\"> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${eroriClient.eroareReParola}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" </span> <br/>\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }

  private boolean _jspx_meth_c_if_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty emailDuplicat}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <span style=\"color:red\"> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${emailDuplicat}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" </span> <br/>\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("judet");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${judete}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVarStatus("loop");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                            <option value=\"");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write('"');
          out.write('>');
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</option>\n");
          out.write("                                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${judet}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${judet}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("localitate");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${localitati}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVarStatus("loop");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                            <option value=\"\">");
          if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("</option>\n");
          out.write("                                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${localitate}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }
}

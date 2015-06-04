package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class animation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("        <title> Tile Animations - CSS3 and jQuery</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/myStyle.css\" />\n");
      out.write("        <script src=\"resources/js/modernizr-1.5.min.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"demo-wrapper\">\n");
      out.write("            \n");
      out.write("            <!-- classnames for the pages should include: 1) type of page 2) page name-->\n");
      out.write("            \n");
      out.write("            <div class=\"s-page random-restored-page\">\n");
      out.write("                <h2 class=\"page-title\">Some minimized App</h2>\n");
      out.write("                <div class=\"close-button s-close-button\">x</div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"s-page custom-page\">\n");
      out.write("               <h2 class=\"page-title\">Thank You!</h2>\n");
      out.write("                <div class=\"close-button s-close-button\">x</div>\n");
      out.write("                <form action=\"LoginController\" method=\"post\" autocomplete=\"false\">\n");
      out.write("                    \n");
      out.write("                    <!-- fake fields are a workaround for chrome autofill getting the wrong fields -->\n");
      out.write("                    <input style=\"display:none\" type=\"text\" name=\"fakeusernameremembered\"/>\n");
      out.write("                    <input style=\"display:none\" type=\"password\" name=\"fakepasswordremembered\"/>\n");
      out.write("                    \n");
      out.write("                    Email: <input type=\"text\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${valoriCorecteLogin.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" autocomplete=\"false\" >  <span style=\"color:red\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${eroriLogin.eroareEmail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </span> <br/>\n");
      out.write("                    Password: <input type=\"password\" name=\"parola\"autocomplete=\"false\" >  <span style=\"color:red\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${eroriLogin.eroareParola}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </span> <br/>\n");
      out.write("                    <input type=\"submit\" value=\"Login\"> <br/>\n");
      out.write("\n");
      out.write("                    <span style=\"color:red\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${eroareUtilizatorInexistent}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </span> <br/>\n");
      out.write("                    <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty display}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        <a href=\"register.jsp\">Register</a>\n");
      out.write("                    </c:if>\n");
      out.write("                </form>    \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"r-page random-r-page\">\n");
      out.write("\n");
      out.write("                <div class=\"page-content\">\n");
      out.write("                    <h2 class=\"page-title\">App Screen</h2>\n");
      out.write("                    <p>Chew iPad power cord chew iPad power cord attack feet chase mice leave dead animals as gifts and stick butt in face chew iPad power cord. Chase mice. Run in circles use lap as chair why must they do that. Intrigued by the shower destroy couch leave hair everywhere sleep on keyboard chew iPad power cord. Use lap as chair. Missing until dinner time stand in front of the computer screen, intently sniff hand. Find something else more interesting. Destroy couch play time so inspect anything brought into the house hate dog burrow under covers. Sleep on keyboard destroy couch so hate dog so hide when guests come over. Chase mice destroy couch lick butt throwup on your pillow use lap as chair yet intrigued by the shower but climb leg. Stare at ceiling make muffins or hunt anything that moves claw drapes. Intently sniff hand intrigued by the shower. Why must they do that. Cat snacks leave dead animals as gifts or inspect anything brought into the house sweet beast so stare at ceiling give attitude. Flop over claw drapes but sun bathe lick butt, and chase mice. Rub face on everything lick butt leave hair everywhere lick butt, missing until dinner time for use lap as chair lick butt. Make muffins leave dead animals as gifts play time. Chew foot intrigued by the shower stare at ceiling inspect anything brought into the house yet hopped up on goofballs. \n");
      out.write("\n");
      out.write("                        Hunt anything that moves intently sniff hand for hunt anything that moves play time. Chew foot climb leg throwup on your pillow so lick butt yet make muffins hate dog. Intrigued by the shower. Intently sniff hand shake treat bag. Cat snacks burrow under covers make muffins but all of a sudden go crazy find something else more interesting. Flop over chase mice. Give attitude. Inspect anything brought into the house. Stick butt in face sun bathe so find something else more interesting and intrigued by the shower. Rub face on everything use lap as chair. \n");
      out.write("\n");
      out.write("                        Under the bed claw drapes chase mice but leave hair everywhere yet make muffins yet claw drapes. Use lap as chair. Find something else more interesting stretch for under the bed. Nap all day intrigued by the shower, hate dog sweet beast intently sniff hand so hate dog nap all day. Swat at dog hide when guests come over and mark territory chase mice for cat snacks. Use lap as chair. Lick butt throwup on your pillow need to chase tail. \n");
      out.write("\n");
      out.write("                        Mark territory. Stick butt in face shake treat bag yet hunt anything that moves, yet hopped up on goofballs yet stare at ceiling under the bed. Give attitude chase imaginary bugs stretch so hunt anything that moves so hide when guests come over but intrigued by the shower find something else more interesting. Make muffins behind the couch for chew foot. Sweet beast flop over but throwup on your pillow. Intently sniff hand use lap as chair and missing until dinner time and chase imaginary bugs. \n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"close-button r-close-button\">x</div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <!--each tile should specify what page type it opens (to determine which animation) and the corresponding page name it should open-->\n");
      out.write("            <div class=\"dashboard clearfix\">\n");
      out.write("                <ul class=\"tiles\">\n");
      out.write("                    <div class=\"col1 clearfix\">\n");
      out.write("                        <li class=\"tile tile-big tile-1 slideTextUp\" data-page-type=\"r-page\" data-page-name=\"random-r-page\">\n");
      out.write("                            <div><p>This tile's content slides up</p></div>\n");
      out.write("                            <div><p>View all tasks</p></div>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"tile tile-small tile tile-2 slideTextRight\" data-page-type=\"s-page\" data-page-name =\"random-restored-page\">\n");
      out.write("                            <div><p class=\"icon-arrow-right\"></p></div>\n");
      out.write("                            <div><p>Tile's content slides right. Page opens from left</p></div>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"tile tile-small last tile-3\" data-page-type=\"r-page\" data-page-name=\"random-r-page\">\n");
      out.write("                            <p class=\"icon-calendar-alt-fill\"></p>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"tile tile-big tile-4 fig-tile\" data-page-type=\"r-page\" data-page-name=\"random-r-page\">\n");
      out.write("                            <figure>\n");
      out.write("                                <img src=\"resources/images/blue.jpg\" />\n");
      out.write("                                <figcaption class=\"tile-caption caption-left\">Slide-out Caption from left</figcaption>\n");
      out.write("                            </figure>\n");
      out.write("                        </li>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col2 clearfix\">\n");
      out.write("                        <li class=\"tile tile-big tile-5\" data-page-type=\"r-page\" data-page-name=\"random-r-page\">\n");
      out.write("                            <div><p><span class=\"icon-cloudy\"></span>Weather</p></div>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"tile tile-big tile-6 slideTextLeft\" data-page-type=\"r-page\" data-page-name=\"random-r-page\">\n");
      out.write("                            <div><p><span class=\"icon-skype\"></span>Skype</p></div>\n");
      out.write("                            <div><p>Make a Call</p></div>\n");
      out.write("                        </li>\n");
      out.write("                        <!--Tiles with a 3D effect should have the following structure:\n");
      out.write("                            1) a container inside the tile with class of .faces\n");
      out.write("                            2) 2 figure elements, one with class .front and the other with class .back-->\n");
      out.write("                        <li class=\"tile tile-small tile-7 rotate3d rotate3dX\" data-page-type=\"r-page\" data-page-name=\"random-r-page\">\n");
      out.write("                            <div class=\"faces\">\n");
      out.write("                                <div class=\"front\"><span class=\"icon-picassa\"></span></div>\n");
      out.write("                                <div class=\"back\"><p>Launch Picassa</p></div>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"tile tile-small last tile-8 rotate3d rotate3dY\" data-page-type=\"r-page\" data-page-name=\"random-r-page\">\n");
      out.write("                            <div class=\"faces\">\n");
      out.write("                                <div class=\"front\"><span class=\"icon-instagram\"></span></div>\n");
      out.write("                                <div class=\"back\"><p>Launch Instagram</p></div>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col3 clearfix\">      \n");
      out.write("                        <li class=\"tile tile-2xbig tile-9 fig-tile\" data-page-type=\"custom-page\" data-page-name=\"random-r-page\">\n");
      out.write("                            <figure>\n");
      out.write("                                <img src=\"resources/images/summer.jpg\" />\n");
      out.write("                                <figcaption class=\"tile-caption caption-bottom\">Fixed Caption: Some Subtitle or Tile Description Goes Here with some kinda link or anything\n");
      out.write("                            </figure>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"tile tile-big tile-10\" data-page-type=\"s-page\" data-page-name=\"custom-page\">\n");
      out.write("                            <div><p>Windows-8-like Animations with CSS3 &amp; jQuery &copy; Sara Soueidan. Licensed under MIT.</p></div>\n");
      out.write("                        </li>\n");
      out.write("                    </div>\n");
      out.write("                </ul>\n");
      out.write("            </div><!--end dashboard-->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!--====================================end demo wrapper================================================-->\n");
      out.write("        <script src=\"resources/js/jquery-1.8.2.min.js\"></script>\n");
      out.write("        <script src=\"resources/js/scripts.js\"></script>\n");
      out.write("\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class noReloadPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=utf-8>\n");
      out.write("<meta name=\"viewport\" content=\"width=620\">\n");
      out.write("<title>HTML5 Demo: HTML5 History API</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/html5demos.css\">\n");
      out.write("<script src=\"js/h5utils.js\"></script></head>\n");
      out.write("<body>\n");
      out.write("<section id=\"wrapper\">\n");
      out.write("<div id=\"carbonads-container\"><div class=\"carbonad\"><div id=\"azcarbon\"></div><script type=\"text/javascript\">var z = document.createElement(\"script\"); z.type = \"text/javascript\"; z.async = true; z.src = \"http://engine.carbonads.com/z/14060/azcarbon_2_1_0_VERT\"; var s = document.getElementsByTagName(\"script\")[0]; s.parentNode.insertBefore(z, s);</script></div></div>\n");
      out.write("    <header>\n");
      out.write("      <h1>HTML5 History API</h1>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("#examples {\n");
      out.write("  padding-left: 20px;\n");
      out.write("}\n");
      out.write("#examples li {\n");
      out.write("  list-style: square;\n");
      out.write("  padding: 0;\n");
      out.write("  margin: 0;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<article>\n");
      out.write("  <p id=\"status\">HTML5 History API not supported</p>\n");
      out.write("  <p><em>Last event fired: <span id=\"lastevent\">(none)</span></em></p>\n");
      out.write("  <p>To test the History API, click through the urls below. Note that none of these urls point to <em>real</em> pages. JavaScript will intercept these clicks, load data and the browser address bar will <em>appear</em> to change - but this is the History API in action!</p>\n");
      out.write("  <p>Use the back and forward buttons in your browser to navigate the history.</p>\n");
      out.write("  <ul id=\"examples\">\n");
      out.write("    <li><a href=\"/history/first\">first</a></li>\n");
      out.write("    <li><a href=\"/history/second\">second</a></li>\n");
      out.write("    <li><a href=\"/history/third\">third</a></li>\n");
      out.write("    <li><a href=\"/history/fourth\">fourth</a></li>\n");
      out.write("  </ul>\n");
      out.write("  <p><small>Note: since these urls aren't real, refreshing the page will land on an invalid url.</small></p>\n");
      out.write("  <div id=\"output\"></div>\n");
      out.write("</article>\n");
      out.write("<script>\n");
      out.write("var $ = function (s) { return document.getElementById(s); },\n");
      out.write("    state = $('status'),\n");
      out.write("    lastevent = $('lastevent'),\n");
      out.write("    urlhistory = $('urlhistory'),\n");
      out.write("    examples = $('examples'),\n");
      out.write("    output = $('output'),\n");
      out.write("    template = '<p>URL: <strong>{url}</strong>, name: <strong>{name}</strong>, location: <strong>{location}</strong></p>',\n");
      out.write("    data = { // imagine these are ajax requests :)\n");
      out.write("      first : {\n");
      out.write("        name: \"Remy\",\n");
      out.write("        location: \"Brighton, UK\"\n");
      out.write("      },\n");
      out.write("      second: {\n");
      out.write("        name: \"John\",\n");
      out.write("        location: \"San Francisco, USA\"\n");
      out.write("      },\n");
      out.write("      third: {\n");
      out.write("        name: \"Jeff\",\n");
      out.write("        location: \"Vancover, Canada\"\n");
      out.write("      },\n");
      out.write("      fourth: {\n");
      out.write("        name: \"Simon\",\n");
      out.write("        location: \"London, UK\"\n");
      out.write("      }\n");
      out.write("    };\n");
      out.write("\n");
      out.write("function reportEvent(event) {\n");
      out.write("  lastevent.innerHTML = event.type;\n");
      out.write("}\n");
      out.write("\n");
      out.write("function reportData(data) {\n");
      out.write("  output.innerHTML = template.replace(/(:?\\{(.*?)\\})/g, function (a,b,c) {\n");
      out.write("    return data[c];\n");
      out.write("  });\n");
      out.write("}\n");
      out.write("\n");
      out.write("if (typeof history.pushState === 'undefined') {\n");
      out.write("  state.className = 'fail';\n");
      out.write("} else {\n");
      out.write("  state.className = 'success';\n");
      out.write("  state.innerHTML = 'HTML5 History API available';\n");
      out.write("}\n");
      out.write("\n");
      out.write("addEvent(examples, 'click', function (event) {\n");
      out.write("  var title;\n");
      out.write("  \n");
      out.write("  event.preventDefault();\n");
      out.write("  if (event.target.nodeName == 'A') {\n");
      out.write("    title = event.target.innerHTML;\n");
      out.write("    data[title].url = event.target.getAttribute('href'); // slightly hacky (the setting), using getAttribute to keep it short\n");
      out.write("    history.pushState(data[title], title, event.target.href);\n");
      out.write("    reportData(data[title]);\n");
      out.write("  }\n");
      out.write("});\n");
      out.write("\n");
      out.write("addEvent(window, 'popstate', function (event) {\n");
      out.write("  var data = event.state;\n");
      out.write("  reportEvent(event);\n");
      out.write("  reportData(event.state || { url: \"unknown\", name: \"undefined\", location: \"undefined\" });\n");
      out.write("});\n");
      out.write("\n");
      out.write("addEvent(window, 'hashchange', function (event) {\n");
      out.write("  reportEvent(event);\n");
      out.write("\n");
      out.write("  // we won't do this for now - let's stay focused on states\n");
      out.write("  /*\n");
      out.write("  if (event.newURL) {\n");
      out.write("    urlhistory.innerHTML = event.oldURL;\n");
      out.write("  } else {\n");
      out.write("    urlhistory.innerHTML = \"no support for <code>event.newURL/oldURL</code>\";\n");
      out.write("  }\n");
      out.write("  */\n");
      out.write("});\n");
      out.write("\n");
      out.write("addEvent(window, 'pageshow', function (event) {\n");
      out.write("  reportEvent(event);\n");
      out.write("});\n");
      out.write("\n");
      out.write("addEvent(window, 'pagehide', function (event) {\n");
      out.write("  reportEvent(event);\n");
      out.write("});\n");
      out.write("\n");
      out.write("</script><a id=\"html5badge\" href=\"http://www.w3.org/html/logo/\">\n");
      out.write("<img src=\"http://www.w3.org/html/logo/badge/html5-badge-h-connectivity-device-graphics-multimedia-performance-semantics-storage.png\" width=\"325\" height=\"64\" alt=\"HTML5 Powered with Connectivity / Realtime, Device Access, Graphics, 3D & Effects, Multimedia, Performance & Integration, Semantics, and Offline & Storage\" title=\"HTML5 Powered with Connectivity / Realtime, Device Access, Graphics, 3D & Effects, Multimedia, Performance & Integration, Semantics, and Offline & Storage\">\n");
      out.write("</a>\n");
      out.write("    <footer><a href=\"/\">HTML5 demos</a>/<a id=\"built\" href=\"http://twitter.com/rem\">@rem built this</a>/<a href=\"#view-source\">view source</a></footer> \n");
      out.write("</section>\n");
      out.write("<a href=\"http://github.com/remy/html5demos\"><img style=\"position: absolute; top: 0; left: 0; border: 0;\" src=\"http://s3.amazonaws.com/github/ribbons/forkme_left_darkblue_121621.png\" alt=\"Fork me on GitHub\" /></a>\n");
      out.write("<script src=\"js/prettify.packed.js\"></script>\n");
      out.write("<script>\n");
      out.write("var gaJsHost = ((\"https:\" == document.location.protocol) ? \"https://ssl.\" : \"http://www.\");\n");
      out.write("document.write(unescape(\"%3Cscript src='\" + gaJsHost + \"google-analytics.com/ga.js' type='text/javascript'%3E%3C/script%3E\"));\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("try {\n");
      out.write("var pageTracker = _gat._getTracker(\"UA-1656750-18\");\n");
      out.write("pageTracker._trackPageview();\n");
      out.write("} catch(err) {}</script>\n");
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

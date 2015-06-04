package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class json_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src='resources/js/jquery-1.8.2.min.js'></script>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {                           // When the HTML DOM is ready loading, then execute the following function...\n");
      out.write("                $('#somebutton').click(function () {                  // Locate HTML DOM element with ID \"somebutton\" and assign the following function to its \"click\" event...\n");
      out.write("                    $.get('Asigurare', function (responseJson) {    // Execute Ajax GET request on URL of \"someservlet\" and execute the following function with Ajax response JSON...\n");
      out.write("                        aler(responseJson);\n");
      out.write("                        var $ul = $('<ul>').appendTo($('#somediv')); // Create HTML <ul> element and append it to HTML DOM element with ID \"somediv\".\n");
      out.write("                        $.each(responseJson, function (index, item) { // Iterate over the JSON array.\n");
      out.write("                            $('<li>').text(item).appendTo($ul);      // Create HTML <li> element, set its text content with currently iterated item and append it to the <ul>.\n");
      out.write("                        });\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            $.get('Asigurare', {'allJudete': allJudete}, function (data) {\n");
      out.write("                aler(\"Aici\");\n");
      out.write("                if (!data.usernameAvailable) {\n");
      out.write("                    $('#somemessage').text('Username is not available, please choose another').show();\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            var getAllRequest = $.ajax({\n");
      out.write("                url: \"Asigurare\",\n");
      out.write("                type: \"GET\",\n");
      out.write("                dataType: \"json\"\n");
      out.write("            });\n");
      out.write("            getAllRequest.done(function (response) {\n");
      out.write("                alert(response.length); // THIS IS AN OBJECT ARRAY, i.e., [object Object],[object Object] etc. \n");
      out.write("            });\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            var data = '{\"name\": \"mkyong\",\"age\": 30,\"address\": {\"streetAddress\": \"88 8nd Street\",\"city\": \"New York\"},\"phoneNumber\": [{\"type\": \"home\",\"number\": \"111 111-1111\"},{\"type\": \"fax\",\"number\": \"222 222-2222\"}]}';\n");
      out.write("            var json = JSON.parse(data);\n");
      out.write("            alert(json[\"name\"]); //mkyong\n");
      out.write("            alert(json.name); //mkyong\n");
      out.write("\n");
      out.write("            alert(json.address.streetAddress); //88 8nd Street\n");
      out.write("            alert(json[\"address\"].city); //New York\n");
      out.write("\n");
      out.write("            alert(json.phoneNumber[0].number); //111 111-1111\n");
      out.write("            alert(json.phoneNumber[1].type); //fax\n");
      out.write("\n");
      out.write("            alert(json.phoneNumber.number); //undefined\n");
      out.write("        </script>\n");
      out.write("        <script >\n");
      out.write("            alert(\"lala1\");\n");
      out.write("            $(document).ready(function ()\n");
      out.write("            {\n");
      out.write("                alert(\"Blabla\");\n");
      out.write("                $.ajax\n");
      out.write("                        ({\n");
      out.write("                            type: \"GET\",\n");
      out.write("                            url: \"Asigurare\",\n");
      out.write("                            dataType: \"json\",\n");
      out.write("                            success: function (data)\n");
      out.write("                            {\n");
      out.write("                                alert(\"BlablaAgain\");\n");
      out.write("                                if (data.Messages.length)\n");
      out.write("                                {\n");
      out.write("                                    $.each(data.Messages, function (i, data)\n");
      out.write("                                    {\n");
      out.write("                                        var msg_data = \"<div id='msg\" + data.msg_id + \"'>\" + data.message + \"</div>\";\n");
      out.write("                                        $(msg_data).appendTo(\"#content\");\n");
      out.write("                                    });\n");
      out.write("                                }\n");
      out.write("                                else\n");
      out.write("                                {\n");
      out.write("                                    $(\"#content\").html(\"No Results\");\n");
      out.write("                                }\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("                        });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("        <title>Insert title here</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <textarea id='Message'></textarea><br/>\n");
      out.write("        <input type='button' value=' Update ' id='UpdateButton'/>\n");
      out.write("        <input type=\"button\" id=\"somebutton\" value=\"SomeButton\" />\n");
      out.write("        <div id='content'></div>\n");
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

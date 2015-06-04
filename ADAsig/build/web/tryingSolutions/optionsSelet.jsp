<%-- 
    Document   : optionsSelet
    Created on : Jun 2, 2015, 1:35:53 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <select id = "opts" onchange = "showForm()">
            <option value = "0">Select Option</option>
            <option value = "1">Option 1</option>
            <option value = "2">Option 2</option>
        </select>

        <div id = "f1" style="display:none">
            <form name= "form1">
                Content of Form 1
            </form>
        </div>

        <div id = "f2" style="display:none">
            <form name= "form2">
                Content of Form 2
            </form>
        </div>

        <script type = "text/javascript">
            function showForm() {
                var selopt = document.getElementById("opts").value;
                if (selopt == 1) {
                    document.getElementById("f1").style.display = "block";
                    document.getElementById("f2").style.display = "none";
                }
                if (selopt == 2) {
                    document.getElementById("f2").style.display = "block";
                    document.getElementById("f1").style.display = "none";
                }
            }

        </script>
    </body>
</html>

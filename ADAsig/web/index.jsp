<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="resources/css/myStyle.css" />
        <script src="resources/js/modernizr-1.5.min.js"></script>
    </head>

    <body>
        <jsp:include page="navbar.jsp" />
        <div class="demo-wrapper">
            <div class="s-page custom-page">
                <div class="page-content">
                    <h2 class="page-title">Thank You!</h2>
                    <div class="close-button s-close-button">x</div>
                    <form action="LoginController" method="post" autocomplete="false">

                        <!-- fake fields are a workaround for chrome autofill getting the wrong fields -->
                        <input style="display:none" type="text" name="fakeusernameremembered"/>
                        <input style="display:none" type="password" name="fakepasswordremembered"/>

                        Email: <input type="text" name="email" value="${valoriCorecteLogin.email}" autocomplete="false" >  <span style="color:red"> ${eroriLogin.eroareEmail} </span> <br/>
                        Password: <input type="password" name="parola"autocomplete="false" >  <span style="color:red"> ${eroriLogin.eroareParola} </span> <br/>
                        <input type="submit" value="Login"> <br/>

                        <span style="color:red"> ${eroareUtilizatorInexistent} </span> <br/>
                        <c:if test="${not empty display}">
                            <a href="register.jsp">Register</a>
                        </c:if>
                    </form>    
                </div>
            </div>


            <div class="dashboard clearfix">
                <ul class="tiles">
                    <div class="col3 clearfix">      
                        <li class="tile tile-2xbig tile-9 fig-tile" data-page-type="custom-page" data-page-name="random-r-page">
                            <figure>
                                <img src="resources/images/summer.jpg" />
                                <figcaption class="tile-caption caption-bottom">Fixed Caption: Some Subtitle or Tile Description Goes Here with some kinda link or anything
                            </figure>
                        </li>
                        <li class="tile tile-big tile-10" data-page-type="s-page" data-page-name="custom-page">
                            <div><p>Open a tile.</p></div>
                        </li>
                    </div>
                </ul>
            </div><!--end dashboard-->
        </div>


        <script src="resources/js/jquery-1.8.2.min.js"></script>
        <script src="resources/js/scripts.js"></script>
    </body>
</html>


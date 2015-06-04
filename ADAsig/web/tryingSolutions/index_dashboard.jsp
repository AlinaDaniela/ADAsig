<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
        <title> Tile Animations - CSS3 and jQuery</title>
        <link rel="stylesheet" href="resources/css/myStyle.css" />
        <script src="resources/js/modernizr-1.5.min.js"></script>
        <script src="resources/js/jquery-1.8.2.min.js"></script>
        <script>
            $(document).ready(function () {

                $("#clickme").click(
                        function () {
                            AlertSave();
                        }
                );
            });

            function AlertSave() {
                var url = window.location.href;
                var subUrl = url.substr(0, url.indexOf('#'));
                alert("Alert Message OnClick " + subUrl);
            }

        </script>
        <script type="text/javascript">

            var form = $('#form1');
            form.submit(function () {

                $.ajax({
                    type: form.attr('method'),
                    url: form.attr('action'),
                    data: form.serialize(),
                    success: function (data) {
                        var result = data;
                        $('#result').attr("value", result);
                    }
                });

                return false;
            });
        </script>

    </head>

    <body>
        <jsp:include page="dropdown.jsp" />
        <div class="demo-wrapper">

            <c:if test="${not empty tile}">
                sajkjasdlfkjdsaljf
                <script>
                    alert("Alert Message OnClick " + "Lalallalal");
                    fadeDashBoard();
                    $('.' + page).addClass('slidePageInFromLeft').removeClass('slidePageBackLeft');
                    alert("Alert Message OnClick " + $('.' + page));
                </script>
                <script>

                </script>
            </c:if>
            <div class="s-page custom-page" >
                <h2 class="page-title">Thank You!</h2>
                <div class="close-button s-close-button" id="clickme">x</div>
                <form action="LoginController" method="post" autocomplete="false" id="form1">

                    <!-- fake fields are a workaround for chrome autofill getting the wrong fields -->
                    <input style="display:none" type="text" name="fakeusernameremembered"/>
                    <input style="display:none" type="password" name="fakepasswordremembered"/>

                    <div> <span> Email: </span> <input type="text" name="email" value="${valoriCorecteLogin.email}" autocomplete="false" >  <span style="color:red"> ${eroriLogin.eroareEmail} </span> <br/>
                    </div>
                    <div> <span> Password: </span> <input type="password" name="parola"autocomplete="false" >  <span style="color:red"> ${eroriLogin.eroareParola} </span> <br/>
                    </div>
                    <input type="submit" value="Login"> <br/>
                    <td>Result</td><td><input type="text" value="" id="result"/>
                        <span style="color:red"> ${eroareUtilizatorInexistent} </span> <br/>
                        <c:if test="${not empty display}">
                            <a href="register.jsp">Register</a>
                        </c:if>
                </form>    
            </div>

            <!--each tile should specify what page type it opens (to determine which animation) and the corresponding page name it should open-->
            <div class="dashboard clearfix">
                <ul class="tiles">
                    <div class="col3 clearfix">      
                        <li class="tile tile-big tile-10" data-page-type="s-page" data-page-name="custom-page">
                            <a href="#Tile">  <div>    <p>Windows-8-like Animations with CSS3 &amp; jQuery &copy; Sara Soueidan. Licensed under MIT.</p> </div> </a>
                        </li>
                    </div>
                    <div class="col3 clearfix">      
                        <li class="tile tile-big tile-1" data-page-type="s-page" data-page-name="custom-page">
                            <div><p>Tile1.</p></div>
                        </li>
                    </div>
                </ul>
            </div><!--end dashboard-->

        </div>
        <!--====================================end demo wrapper================================================-->

        <script src="resources/js/scripts.js"></script>

    </body>
</html>

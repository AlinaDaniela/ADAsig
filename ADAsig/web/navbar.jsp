<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <!-- Bootstrap -->
        <link href="resources/css/bootstrap.min.css" rel="stylesheet">
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
        <script src="resources/js/bootstrap.min.js"></script>
        <title>ADAsig</title>
    </head>
    <body>
        <div class="container">
            <nav role="navigation" class="navbar navbar-inverse">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" data-target="#navbarCollapse" data-toggle="collapse" class="navbar-toggle">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a href="#" class="navbar-brand">Brand</a>
                </div>
                <!-- Collection of nav links, forms, and other content for toggling -->
                <div id="navbarCollapse" class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="#">Home</a></li>
                        <li><a href="#">Profile</a></li>
                        <li class="dropdown">
                            <a data-toggle="dropdown" class="dropdown-toggle" href="#">Messages <b class="caret"></b></a>
                            <ul role="menu" class="dropdown-menu">
                                <li><a href="#">Inbox</a></li>
                                <li><a href="#">Drafts</a></li>
                                <li><a href="#">Sent Items</a></li>
                                <li class="divider"></li>
                                <li><a href="#">Trash</a></li>
                            </ul>
                        </li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right" >
                        <c:choose>
                            <c:when test="${not empty sessionScope.utilizator}"> 
                                <li class="dropdown">
                                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                                        <span class="glyphicon glyphicon-user"></span> ${sessionScope.utilizator} 
                                        <b class="caret"></b>
                                    </a>
                                    <ul role="menu" class="dropdown-menu">
                                        <li><a href="#">Profile</a></li>
                                        <li class="divider"></li>
                                        <li><a href="Logout">Logout</a></li>
                                    </ul>
                                </li>
                            </c:when>

                            <c:otherwise>
                                <li><a href="Login">Login</a></li>
                                </c:otherwise>
                            </c:choose>
                    </ul>
                </div>
            </nav>
        </div>
    </body>
</html>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="US-ASCII">
        <link href="resources/css/style.css" rel="stylesheet">
        <title>Login Page</title>
    </head>
    <body>
        <jsp:include page="navbar.jsp" />
        <div class="container">    
            <div id="loginbox"  class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">                    
                <div class="panel panel-info" >
                    <div class="panel-heading">
                        <div class="panel-title">LogIn</div>
                        <div class="rightForm"><a href="#">Ati uitat parola?</a></div>
                    </div>     

                    <div class="panel-body" >

                        <form id="loginform" class="form-horizontal" action="Login" method="post" role="form">

                            <c:if test="${not empty eroriLogin || not empty display || not empty eroareUtilizatorInexistent}">
                                <div  id="login-alert" class="alert alert-danger col-sm-12" >
                                    <c:if test="${not empty eroriLogin.eroareEmail}">
                                        <span style="color:red"> ${eroriLogin.eroareEmail} </span> <br/>
                                    </c:if>
                                        
                                    <c:if test="${not empty eroriLogin.eroareParola}">
                                        Am intrat aici
                                        <span style="color:red"> ${eroriLogin.eroareParola} </span>
                                    </c:if>
                                        
                                    <c:if test="${not empty eroareUtilizatorInexistent}">
                                        <span style="color:red"> ${eroareUtilizatorInexistent} </span> <br/> 
                                    </c:if>
                                       
                                </div>
                            </c:if>


                            <input style="display:none" type="text" name="fakeusernameremembered"/>
                            <input style="display:none" type="password" name="fakepasswordremembered"/>

                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                <input id="login-username" type="text" class="form-control" name="email" value="${valoriCorecteLogin.email}" placeholder="Email" >

                            </div>

                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                <input id="login-password" type="password" class="form-control" name="parola" placeholder="Parola">
                            </div>

                            <div class="input-group">
                                <div class="checkbox">
                                    <label>
                                        <c:choose>
                                            <c:when test="${not empty valoriCorecteLogin.email}"> 
                                                <input  id="login-remember" type="checkbox" name="remember" value="0"> Don't remember me!
                                            </c:when>

                                            <c:otherwise>
                                                <input  id="login-remember" type="checkbox" name="remember" value="1"> Remember me
                                            </c:otherwise>
                                        </c:choose>
                                    </label>
                                </div>
                            </div>

                            <div>

                                <c:if test="${not empty display}">
                                    <a href="register.jsp">Register</a>
                                </c:if>
                            </div>
                            <div class="form-group">
                                <!-- Button -->
                                <div class="col-sm-12 controls">
                                    <input id="btn-login" class="btn btn-success" type="submit" value="Login"> 
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-12 control">
                                    <div id="noAccount" >
                                        Nu aveti cont? Creeati un nou cont! 
                                        <a href="Register" rel="tab">
                                            Inregistrati-va!
                                        </a>
                                    </div>
                                </div>
                            </div>    
                        </form>     
                    </div>                     
                </div>  
            </div>
        </div>

    </body>
</html>
<%-- 
    Document   : register
    Created on : May 19, 2015, 9:55:35 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
        <link href="resources/css/style.css" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="navbar.jsp" />

        <div class="container"> 
            <div id="signupbox"  class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
                <div class="panel panel-info">
                    <div class="panel-heading">
                        <div class="panel-title">Register</div>
                        <div class="rightForm"><a id="signinlink" href="Login" >Sign In</a></div>
                    </div>  
                    <div class="panel-body" >
                        <form name="registerform" action="Register" method="post" id="signupform" class="form-horizontal" role="form">

                            <c:if test="${not empty eroriClient || not empty emailDuplicat}">

                                <div id="signupalert" class="alert alert-danger" >
                                    <c:if test="${not empty eroriClient.eroareNume}">
                                        <span style="color:red"> ${eroriClient.eroareNume} </span> <br/>
                                    </c:if>
                                    <c:if test="${not empty eroriClient.eroarePrenume}">
                                         <span style="color:red"> ${eroriClient.eroarePrenume} </span> <br/> 
                                    </c:if>
                                    <c:if test="${not empty eroriClient.eroareEmail}">
                                        <span style="color:red"> ${eroriClient.eroareEmail} </span> <br/>
                                    </c:if>
                                    <c:if test="${not empty eroriClient.eroareTelefon}">
                                        <span style="color:red"> ${eroriClient.eroareTelefon} </span> <br/>
                                    </c:if>
                                    <c:if test="${not empty eroriClient.eroareParola}">
                                        <span style="color:red"> ${eroriClient.eroareParola} </span> <br/>
                                    </c:if>
                                    <c:if test="${not empty eroriClient.eroareReParola}">
                                        <span style="color:red"> ${eroriClient.eroareReParola} </span> <br/>
                                    </c:if>
                                    <c:if test="${not empty emailDuplicat}">
                                         <span style="color:red"> ${emailDuplicat} </span> <br/>
                                    </c:if>

                                </div>
                            </c:if>

                            <div class="form-group">
                                <label for="nume" class="col-md-3 control-label">Nume</label>
                                <div class="col-md-9">
                                    <input  class="form-control" type = "text" name="nume" placeholder="Nume" value="${valoriCorecteClient.nume}"/>  
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="prenume" class="col-md-3 control-label">Prenume</label>
                                <div class="col-md-9">
                                    <input type="text" class="form-control" name="prenume" placeholder="Prenume" value="${valoriCorecteClient.prenume}"/>
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="email" class="col-md-3 control-label">Email</label>
                                <div class="col-md-9">
                                    <input type="text" class="form-control" name="email" placeholder="Email" value="${valoriCorecteClient.email}"/> 
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="telefon" class="col-md-3 control-label">Telefon</label>
                                <div class="col-md-9">
                                    <input type="text" name="telefon" class="form-control" placeholder="Telefon" value="${valoriCorecteClient.telefon}" /> 
                                </div>
                            </div>


                            <div class="form-group">
                                <label for="parola" class="col-md-3 control-label">Parola</label>
                                <div class="col-md-9">
                                    <input type="password" class="form-control"  name="parola" placeholder="Parola">
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="reparola" class="col-md-3 control-label">Reintroduceti Parola</label>
                                <div class="col-md-9">
                                    <input type="password" class="form-control" name="reParola"  placeholder="Parola">
                                </div>
                            </div>

                            <div class="form-group">
                                <!-- Button -->                                        
                                <div class="col-md-offset-3 col-md-9">
                                    <input  id="btn-signup" type="submit" class="btn btn-info" name="autentificare" value="Inregistrare">
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div> 
        </div>
    </body>
</html>

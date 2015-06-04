<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="resources/css/style.css" rel="stylesheet">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
        <script src="resources/js/getLocalitati.js" />
        <script src="resources/js/getLocalitati1.js" />
        <script src="resources/js/tipPersoana.js" />
        <title>Realizeaza Asigurare</title>
    </head>
    <body>
        <jsp:include page="navbar.jsp" />
        <div class="container-fluid" id="asigurare">
            <ul class="nav nav-tabs" id="myTabs">
                <li class="active"><a class="active" href="#dateProprietar" data-url="/embed/62805/view">Date proprietar</a></li>
                <li class="disabled"><a class="disabled" href="#profile" data-url="/embed/62806/view">Profile</a></li>
                <li class="disabled"><a class="disabled" href="#messages" data-url="/embed/62807/view">Messages</a></li>
            </ul>

            <div class="tab-content">
                <div class="tab-pane active" id="dateProprietar">
                    <div  class="mainbox ">
                        <div class="panel panel-info">
                            <div class="panel-body" >
                                <form name="dateProprietar" action="Asigurare" method="post" class="form-horizontal" role="form">

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
                                        <label for="tipPersoana" class="col-md-3 control-label">TipPersoana</label>
                                        <div class="col-md-9">
                                            <form role="form">
                                                <label class="radio-inline"><input type="radio" name="tipPersoana" class="tipPersoana" value="persFizica" onchange="hidePersJuridica(this)" checked>Persoana fizica</label>
                                                <label class="radio-inline"><input type="radio" name="tipPersoana" class="tipPersoana" value="persJuridica" onchange="hidePersFizica(this)">Persoana juridica</label>
                                            </form>
                                        </div>
                                    </div>

                                    <div id="persFizicaForm">
                                        <div class="form-group">
                                            <label for="nume" class="col-md-3 control-label">Nume</label>
                                            <div class="col-md-3">
                                                <input  class="form-control" type = "text" name="nume" placeholder="Nume" value="${valoriCorecteClient.nume}"/>  
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label for="prenume" class="col-md-3 control-label">Prenume</label>
                                            <div class="col-md-3">
                                                <input type="text" class="form-control" name="prenume" placeholder="Prenume" value="${valoriCorecteClient.prenume}"/>
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label for="CNP" class="col-md-3 control-label">CNP</label>
                                            <div class="col-md-3">
                                                <input type="text" class="form-control" name="CNP" placeholder="CNP" value="${valoriCorecteClient.CNP}"/> 
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label for="anObtinerePermis" class="col-md-3 control-label">An obtinere permis</label>

                                            <div class="col-md-3">
                                                <select class="form-control" id="aniOP" name="anObtinerePermis" >
                                                    <option value=""></option>
                                                    <option value="faraPermis">Fara permis</option>
                                                </select>
                                            </div>
                                        </div>

                                    </div>
                                    <div id="persJuridicaForm" style="visibility:hidden; position: absolute;">

                                        <div class="form-group">
                                            <label for="societate" class="col-md-6 control-label">Denumire Societate</label>
                                            <div class="col-md-6">
                                                <input type="text" class="form-control" name="prenume" placeholder="Denumire Societate" value="${valoriCorecteClient.societate}"/>
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label for="CIF" class="col-md-6 control-label">CIF</label>
                                            <div class="col-md-6">
                                                <input type="text" class="form-control" name="CIF" placeholder="CNP" value="${valoriCorecteClient.CIF}"/> 
                                            </div>
                                        </div>                                      

                                    </div>

                                    <hr>

                                    <div>
                                        <span>Adresa din talon</span>

                                        <div class="form-group">
                                            <label for="judet" class="col-md-6 control-label">Judet</label>
                                            <div class="col-md-6">
                                                <div class="col-md-6">
                                                    <select class="form-control"  name="judet" id="judet">
                                                        <option value=""></option>
                                                        <c:forEach var="judet" items="${judete}" varStatus="loop">
                                                            <option value="<c:out  value="${judet}"/>"><c:out  value="${judet}"/></option>
                                                        </c:forEach>
                                                    </select>
                                                </div>
                                            </div>
                                        </div>  


                                        <div class="form-group">
                                            <label for="localitate" class="col-md-6 control-label">Localitate</label>
                                            <div class="col-md-6">
                                                <div class="col-md-6">
                                                    <select class="form-control"  name="localitate" id="localitate" >
                                                        <option value=""></option>
                                                        <c:forEach var="localitate" items="${localitati}" varStatus="loop">
                                                            <option value=""><c:out  value="${localitate}"/></option>
                                                        </c:forEach>
                                                    </select>
                                                </div>
                                            </div>
                                        </div>  

                                        <div class="form-group">
                                            <label for="strada" class="col-md-6 control-label">Strada</label>
                                            <div class="col-md-6">
                                                <input type="text" class="form-control" name="strada" placeholder="Strada" value="${valoriCorecteClient.CIF}"/> 
                                            </div>
                                        </div>   


                                        <div class="form-group">
                                            <label for="numar" class="col-md-6 control-label">Numar</label>
                                            <div class="col-md-6">
                                                <input type="text" class="form-control" name="numar" placeholder="Numar" value="${valoriCorecteClient.CIF}"/> 
                                            </div>
                                        </div>   

                                        <div class="form-group">
                                            <label for="bloc" class="col-md-6 control-label">Bloc</label>
                                            <div class="col-md-6">
                                                <input type="text" class="form-control" name="bloc" placeholder="Bloc" id="message" value="${valoriCorecteClient.CIF}"/> 
                                            </div>
                                        </div>   

                                        <div class="form-group">
                                            <label for="scara" class="col-md-6 control-label">Scara</label>
                                            <div class="col-md-6">
                                                <input type="text" class="form-control" name="scara" placeholder="Sc." value="${valoriCorecteClient.CIF}"/> 
                                            </div>
                                        </div>   

                                        <div class="form-group">
                                            <label for="etaj" class="col-md-6 control-label">Etaj</label>
                                            <div class="col-md-6">
                                                <input type="text" class="form-control" name="etaj" placeholder="Et." value="${valoriCorecteClient.CIF}"/> 
                                            </div>
                                        </div>  

                                        <div class="form-group">
                                            <label for="apartament" class="col-md-6 control-label">Apartament</label>
                                            <div class="col-md-6">
                                                <input type="text" class="form-control" name="apartament" placeholder="Ap." value="${valoriCorecteClient.CIF}"/> 
                                            </div>
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
                <div class="tab-pane" id="profile"></div>
                <div class="tab-pane" id="messages"></div>
            </div>
        </div>
    </body>
</html>

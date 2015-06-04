<%-- 
    Document   : oldsStuff
    Created on : May 31, 2015, 6:26:49 PM
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

        <div class="center-block middle" >
            <form action="LoginController" method="post" autocomplete="false">
                <!-- fake fields are a workaround for chrome autofill getting the wrong fields -->
                <input style="display:none" type="text" name="fakeusernameremembered"/>
                <input style="display:none" type="password" name="fakepasswordremembered"/>
                Email: <input type="text" name="email" value="${valoriCorecteLogin.email}" autocomplete="false" >  <span style="color:red"> ${eroriLogin.eroareEmail} </span> <br/>
                Password: <input type="password" name="parola" autocomplete="false" >  <span style="color:red"> ${eroriLogin.eroareParola} </span> <br/>
                <input type="submit" value="Login"> <br/>
            </form>
        </div>

        <h1>Register Form</h1>
        <form name="registerform" action="RegisterController" method="post">
            Nume: <input type = "text" name="nume" value="${valoriCorecteClient.nume}"/>  <span style="color:red"> ${eroriClient.eroareNume} </span> <br/>
            Prenume: <input type = "text" name="prenume" value="${valoriCorecteClient.prenume}"/> <span style="color:red"> ${eroriClient.eroarePrenume} </span> <br/>  
            Email: <input type = "text" name="email" value="${valoriCorecteClient.email}"/> <span style="color:red"> ${eroriClient.eroareEmail} </span> <br/>
            Telefon: <input type = "text" name="telefon" value="${valoriCorecteClient.telefon}" /> <span style="color:red"> ${eroriClient.eroareTelefon} </span> <br/>
            Parola: <input type="password" name="parola" /> <span style="color:red"> ${eroriClient.eroareParola} </span> <br/>
            Reintroduceti parola: <input type="password" name="reParola" /> <span style="color:red"> ${eroriClient.eroareReParola} </span> <br/>
            <input name="autentificare" ID="autentificare" type="submit" value="Trimite" />
            <span style="color:red"> ${emailDuplicat} </span> <br/>
        </form>
        
    </body>
</html>

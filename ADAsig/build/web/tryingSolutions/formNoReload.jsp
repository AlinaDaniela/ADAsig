<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ajax with Jquery</title>
        <script src="resources/js/jquery-1.8.2.min.js"></script>
    </head>
    <body>
        <h1>Ajax with Jquery Simple Example</h1>
        <h3>madushankaperera.wordpress.com</h3>
        <br>
        <form name="form1" method="GET" action="Ajaxexample" id="form1">
            <table>
                <tr>
                    <td>Number 1</td><td><input type="text" name="n1"/></td>
                </tr>
                <tr>
                    <td>Number 2</td><td><input type="text" name="n2"/></td>
                </tr>
                <tr>
                    <td></td><td><input type="submit" value="Calculate"/></td>
                </tr>
                <tr>
                    <td>Result</td><td><input type="text" value="" id="result"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
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
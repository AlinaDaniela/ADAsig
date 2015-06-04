<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>

        <script type="text/javascript" src='resources/js/jquery-1.8.2.min.js'></script>
        <script>
            $(document).ready(function () {                           // When the HTML DOM is ready loading, then execute the following function...
                $('#somebutton').click(function () {                  // Locate HTML DOM element with ID "somebutton" and assign the following function to its "click" event...
                    $.get('Asigurare', function (responseJson) {    // Execute Ajax GET request on URL of "someservlet" and execute the following function with Ajax response JSON...
                        aler(responseJson);
                        var $ul = $('<ul>').appendTo($('#somediv')); // Create HTML <ul> element and append it to HTML DOM element with ID "somediv".
                        $.each(responseJson, function (index, item) { // Iterate over the JSON array.
                            $('<li>').text(item).appendTo($ul);      // Create HTML <li> element, set its text content with currently iterated item and append it to the <ul>.
                        });
                    });
                });
            });
        </script>
        <script>
            $.get('Asigurare', {'allJudete': allJudete}, function (data) {
                aler("Aici");
                if (!data.usernameAvailable) {
                    $('#somemessage').text('Username is not available, please choose another').show();
                }
            });
        </script>
        <script>
            var getAllRequest = $.ajax({
                url: "Asigurare",
                type: "GET",
                dataType: "json"
            });
            getAllRequest.done(function (response) {
                alert(response.length); // THIS IS AN OBJECT ARRAY, i.e., [object Object],[object Object] etc. 
            });

        </script>
        <script>
            var data = '{"name": "mkyong","age": 30,"address": {"streetAddress": "88 8nd Street","city": "New York"},"phoneNumber": [{"type": "home","number": "111 111-1111"},{"type": "fax","number": "222 222-2222"}]}';
            var json = JSON.parse(data);
            alert(json["name"]); //mkyong
            alert(json.name); //mkyong

            alert(json.address.streetAddress); //88 8nd Street
            alert(json["address"].city); //New York

            alert(json.phoneNumber[0].number); //111 111-1111
            alert(json.phoneNumber[1].type); //fax

            alert(json.phoneNumber.number); //undefined
        </script>
        <script >
            alert("lala1");
            $(document).ready(function ()
            {
                alert("Blabla");
                $.ajax
                        ({
                            type: "GET",
                            url: "Asigurare",
                            dataType: "json",
                            success: function (data)
                            {
                                alert("BlablaAgain");
                                if (data.Messages.length)
                                {
                                    $.each(data.Messages, function (i, data)
                                    {
                                        var msg_data = "<div id='msg" + data.msg_id + "'>" + data.message + "</div>";
                                        $(msg_data).appendTo("#content");
                                    });
                                }
                                else
                                {
                                    $("#content").html("No Results");
                                }
                            }

                        });
            });
        </script>

        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Insert title here</title>
    </head>
    <body>
        <textarea id='Message'></textarea><br/>
        <input type='button' value=' Update ' id='UpdateButton'/>
        <input type="button" id="somebutton" value="SomeButton" />
        <div id='content'></div>
    </body>
</html>

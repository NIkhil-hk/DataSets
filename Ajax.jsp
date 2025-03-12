<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>AJAX Example</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    
    <script type="text/javascript">
        function sendData() {
            var inputText = $("#inputField").val();
            $.ajax({
                type: "POST",
                url: "AjaxServlet",
                data: { userInput: inputText },
                success: function(response) {
                    $("#output").html(response);
                }
            });
        }
    </script>
</head>
<body>
    <h2>AJAX Input Example</h2>
    <input type="text" id="inputField" onkeyup="sendData()" placeholder="Type something...">
    <p>Server Response: <span id="output"></span></p>
</body>
</html>

<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
    <title>Mobile Details Result</title>
</head>
<body>
        <form>
            <fieldset style="width:20%; background-color: #ccffeb;">
                <legend><b><i> Application</i></b></legend>
                <h3>Current Date and Time is :</h3>
                <% java.util.Date d = new java.util.Date();
                out.println(d.toString()); %>
            </fieldset>
        </form>
    </body>
</html>





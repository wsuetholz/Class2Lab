<%-- 
    Document   : welcome
    Created on : Jan 25, 2015, 7:25:53 PM
    Author     : wsuetholz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Welcome Page</title>
    </head>
    <body>
	<h1 align="center">User Name Input for Welcome Message</h1>
	<form id="form1" name="form1" method="POST" action="<%= request.getContextPath() %>/greeter">
	    <b>User Name:</b> <input type="text" id="name" name="name" value=""/><br/>
	    <input type="submit" name="submit" value="Submit Input"/>
	</form> 
    </body>
</html>

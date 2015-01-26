<%-- 
    Document   : form
    Created on : Jan 21, 2015, 9:06:04 PM
    Author     : wsuetholz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Form Page</title>
    </head>
    <body>
        <h1>Select Color</h1>
	<form id="form1" name="form1" method="POST" action="<%= request.getContextPath() %>/pager">
	    <b>Color:</b> <input type="text" id="color" name="color" value="Green"/><br/>
	    <b>FirstName:</b> <input type="text" id="firstName" name="firstName" value=""/><br/>
	    <b>LastName:</b> <input type="text" id="lastName" name="lastName" value=""/><br/>
	    <input type="submit" name="submit" value="Submit Input"/>
	    <button type="submit" name="submit" value="Submit Button">Submit Button</button>
	</form> 
    </body>
</html>

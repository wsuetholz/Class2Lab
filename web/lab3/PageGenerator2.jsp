<%-- 
    Document   : PageGenerator2
    Created on : Jan 21, 2015, 8:20:42 PM
    Author     : wsuetholz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
	final int ROWS = 3;
	final int COLS = 3;
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
	<h1>Servlet PageGenerator at <%=request.getContextPath()%></h1>

	<h2>Sample Table</h2>
	<table border="1">
	    <thead>
		<tr>
		<%
		    for (int cols = 0; cols < COLS; cols++) {
			out.println("<th>Column " + Integer.toString(cols+1) + "</th>");
		    }		
		%>
		</tr>	    
	    </thead>
	    <tbody>
		<%
		    for (int rows = 0; rows < ROWS; rows++) {
			out.println("<tr>");
			for (int cols = 0; cols < COLS; cols++) {
			    out.println("<td>Value " + Integer.toString(cols+1) + "</td>");
			}
			out.println("</tr>");	    
		    }
		%>
	    </tbody>

	</table>
    </body>
</html>

<%-- 
    Document   : greeting
    Created on : Jan 25, 2015, 7:09:19 PM
    Author     : wsuetholz
--%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Greeting Page</title>
    </head>
    <body>
    <h1 align="center">Greeting Page</h1>
    <p>

    <!--
        These tags are called "JSTL" tags. JSTL stands for Java Standard
        Tag Library (see the taglib declarations above). Taglibs are additional
        libraries of code that can be used to enhance the developer
        experience with new features. There are many JSTL features that you
        will come to know from your studies. Here we are using a JSTL
        loop with EL (Expression Language) statements for recommendations
        and items in that list. Note how we do not have to check for null and
        we do not have to perform a cast. However, we can only use EL via
        HTML and JSTL -- not from Java code. Compare the relative simplicity
        of this code to the result.jsp example.
    -->
    <c:out value="${greetingMessage}" />
        
    <p><a href="<%= request.getContextPath() %>/lab4/welcome.jsp">Back
    
    </body>
</html>

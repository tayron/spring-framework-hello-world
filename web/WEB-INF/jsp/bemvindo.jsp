<%-- 
    Document   : bemvindo
    Created on : 05/11/2017, 13:55:43
    Author     : tayron
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
	<p>Pagina de boas vindas que tal ?</p>
	<br/>
	
	<p><%= request.getAttribute("bemvindo") %></p>
    </body>
</html>

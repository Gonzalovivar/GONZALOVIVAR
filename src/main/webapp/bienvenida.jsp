<%-- 
    Document   : bienvenida
    Created on : 22-sep-2015, 21:16:27
    Author     : alfonsogalvanmadera
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenido a la pagina de administracion!</h1>
        <p>Aqui pondremos mas cosas adelante</p>
        <%
            out.println("Hola "+request.getAttribute("usuario").toString());
            %>
    </body>
</html>

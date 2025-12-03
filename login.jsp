<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login - Papelería</title>
</head>
<body>
<h2>Login</h2>
<form method="post" action="LoginServlet">
    Usuario: <input type="text" name="usuario" required/><br/>
    Contraseña: <input type="password" name="password" required/><br/>
    <input type="submit" value="Ingresar"/>
</form>
<%
    if(request.getParameter("error") != null){
%>
<p style="color:red;">Usuario o contraseña incorrecta</p>
<% } %>
</body>
</html>

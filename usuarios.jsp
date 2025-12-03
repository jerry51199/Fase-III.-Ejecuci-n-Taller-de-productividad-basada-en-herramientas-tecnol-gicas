<%@ page import="com.papeleria.model.Usuario" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Usuarios - Papelería</title>
</head>
<body>
<h1>Administración de Usuarios</h1>
<form method="post" action="UsuarioServlet">
    Nombre: <input type="text" name="nombre" required/><br/>
    Usuario: <input type="text" name="usuario" required/><br/>
    Contraseña: <input type="password" name="password" required/><br/>
    Rol:
    <select name="rol">
        <option value="Admin">Admin</option>
        <option value="Empleado">Empleado</option>
    </select><br/>
    <input type="submit" value="Agregar Usuario"/>
</form>

<h2>Lista de Usuarios</h2>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Nombre</th>
        <th>Usuario</th>
        <th>Rol</th>
    </tr>
    <%
        List<Usuario> usuarios = (List<Usuario>) request.getAttribute("usuarios");
        if(usuarios != null){
            for(Usuario u : usuarios){
    %>
    <tr>
        <td><%= u.getId() %></td>
        <td><%= u.getNombre() %></td>
        <td><%= u.getUsuario() %></td>
        <td><%= u.getRol() %></td>
    </tr>
    <%      }
        }
    %>
</table>
</body>
</html>

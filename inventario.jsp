<%@ page import="com.papeleria.dao.ProductoDAO" %>
<%@ page import="com.papeleria.model.Producto" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Inventario - Papelería</title>
</head>
<body>
<h1>Inventario de Productos</h1>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Nombre</th>
        <th>Cantidad</th>
        <th>Precio</th>
    </tr>
    <%
        ProductoDAO dao = new ProductoDAO();
        for (Producto p : dao.listarProductos()) {
    %>
    <tr>
        <td><%= p.getId() %></td>
        <td><%= p.getNombre() %></td>
        <td><%= p.getCantidad() %></td>
        <td><%= p.getPrecio() %></td>
    </tr>
    <% } %>
</table>
</body>
</html>

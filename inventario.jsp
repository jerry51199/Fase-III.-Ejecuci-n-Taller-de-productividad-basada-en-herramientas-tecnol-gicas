<%@ page import="com.papeleria.model.Producto" %>
<%@ page import="java.util.List" %>
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
        List<Producto> productos = (List<Producto>) request.getAttribute("productos");
        if(productos != null){
            for (Producto p : productos) {
    %>
    <tr>
        <td><%= p.getId() %></td>
        <td><%= p.getNombre() %></td>
        <td><%= p.getCantidad() %></td>
        <td><%= p.getPrecio() %></td>
    </tr>
    <%      }
        }
    %>
</table>
</body>
</html>

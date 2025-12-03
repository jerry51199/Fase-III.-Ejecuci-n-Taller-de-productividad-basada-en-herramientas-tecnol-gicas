<%@ page import="com.papeleria.model.Venta" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ventas - Papelería</title>
</head>
<body>
<h1>Registro de Ventas</h1>
<form method="post" action="VentaServlet">
    Producto ID: <input type="number" name="productoId" required/><br/>
    Cantidad: <input type="number" name="cantidad" required/><br/>
    Total: <input type="text" name="total" required/><br/>
    <input type="submit" value="Registrar Venta"/>
</form>

<h2>Historial de Ventas</h2>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Producto ID</th>
        <th>Cantidad</th>
        <th>Total</th>
        <th>Fecha</th>
    </tr>
    <%
        List<Venta> ventas = (List<Venta>) request.getAttribute("ventas");
        if(ventas != null){
            for(Venta v : ventas){
    %>
    <tr>
        <td><%= v.getId() %></td>
        <td><%= v.getProductoId() %></td>
        <td><%= v.getCantidad() %></td>
        <td><%= v.getTotal() %></td>
        <td><%= v.getFecha() %></td>
    </tr>
    <%      }
        }
    %>
</table>
</body>
</html>

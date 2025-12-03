package com.papeleria.controller;

import com.papeleria.dao.ProductoDAO;
import com.papeleria.model.Producto;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class InventarioServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ProductoDAO dao = new ProductoDAO();
        List<Producto> productos = dao.listarProductos();
        request.setAttribute("productos", productos);
        request.getRequestDispatcher("inventario.jsp").forward(request, response);
    }
}

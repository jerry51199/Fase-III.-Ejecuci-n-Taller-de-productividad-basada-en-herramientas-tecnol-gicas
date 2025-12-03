package com.papeleria.controller;

import com.papeleria.dao.VentaDAO;
import com.papeleria.model.Venta;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Date;

public class VentaServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int productoId = Integer.parseInt(request.getParameter("productoId"));
        int cantidad = Integer.parseInt(request.getParameter("cantidad"));
        double total = Double.parseDouble(request.getParameter("total"));

        Venta v = new Venta(0, productoId, cantidad, total, new Date());
        VentaDAO dao = new VentaDAO();
        dao.registrarVenta(v);

        response.sendRedirect("ventas.jsp");
    }
}

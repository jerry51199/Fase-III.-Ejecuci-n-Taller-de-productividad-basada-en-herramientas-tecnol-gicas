package com.papeleria.controller;

import com.papeleria.dao.UsuarioDAO;
import com.papeleria.model.Usuario;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class UsuarioServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombre = request.getParameter("nombre");
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        String rol = request.getParameter("rol");

        Usuario u = new Usuario(0, nombre, usuario, password, rol);
        UsuarioDAO dao = new UsuarioDAO();
        dao.agregarUsuario(u); // Método agregarUsuario se implementa en DAO

        response.sendRedirect("usuarios.jsp");
    }
}

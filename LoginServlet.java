package com.papeleria.controller;

import com.papeleria.dao.UsuarioDAO;
import com.papeleria.model.Usuario;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");

        UsuarioDAO dao = new UsuarioDAO();
        Usuario u = dao.validarUsuario(usuario, password);

        if (u != null) {
            HttpSession session = request.getSession();
            session.setAttribute("usuario", u);
            response.sendRedirect("inventario.jsp");
        } else {
            response.sendRedirect("login.jsp?error=1");
        }
    }
}


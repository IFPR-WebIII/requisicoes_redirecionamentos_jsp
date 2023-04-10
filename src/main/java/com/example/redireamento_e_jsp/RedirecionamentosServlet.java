package com.example.redireamento_e_jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "RedirecionamentosServlet", value = "/RedirecionamentosServlet")
public class RedirecionamentosServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /*
        REDIRECIOMENTOS são úteis para encaminhar o fluxo da requisição para quem estiver melhor
        preparado para processá-la.
        Existem dois tipos de redirecionamentos:

        i) do lado servidor;
        ii) do lado cliente;
        */

        //i) REDIRECIONAMENTO LADO SERVIDOR:
        //o parâmetro para esse dispatcher pode ser uma página HTML, uma página JSP ou outra servlet.
        RequestDispatcher dispatcher = request.getRequestDispatcher("pagina_alvo.jsp");
        dispatcher.forward(request, response);

        //ii) REDIRECIONAMENTO LADO CLIENTE:
        //Método 1
        response.setStatus(HttpServletResponse.SC_SEE_OTHER);
        response.setHeader("Location", "http://example.org/other");

        //Método 2
        response.sendRedirect("http://example.org/other");

    }
}

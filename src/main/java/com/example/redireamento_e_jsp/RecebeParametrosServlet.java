package com.example.redireamento_e_jsp;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "recebeParametrosServlet", value = "/recebe_parametros")
public class RecebeParametrosServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        /*
        RECEBE OS PARÂMETROS DE UMA REQUISIÇÃO
        - Um parâmetro estará disponível na requisição quando:

          MÉTODO GET
          i) existir uma query string na URL: podem ser de três formas:
             a) o usuário digita essa query string;
             b) o programador cria um link que contem uma query string;
             c) o programador define um formulário com o método de envio GET. Os campos nomeados ficarão disponíveis na URL

          MÉTODO POST
          ii) existir uma submissão de formulário cujo método de envio seja POST. Os campos nomeados ficarão disponíveis no corpo da requisição HTTP
        */


        /*

        EXEMPLO:
        - Receber um parâmetro que está na URL
        - O parâmetro cor_selecionado deve estar disponível na requisição;
        - Um detalhe importante é que TODOS os valores recebidos por uma requisição, sempre são Strings;
          O programador deve converter esses dados para os tipos adequados.

        - Exceções:
          - caso o valor esperado não esteja na URL, será lançada uma exceção;
        */

        String corSelecionada = request.getParameter("cor_selecionada");

    }

    public void destroy() {
    }
}
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%

    List<String> alunos = new ArrayList<>();
    alunos.add("Guilherme");
    alunos.add("Willian");
    alunos.add("Yuri");

%>

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>

    <h1><%= "Hello World!" %> </h1>

    <% for (String aluno: alunos) {%>

        <p><%= aluno %></p>

    <% } %>

</body>
</html>
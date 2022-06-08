<%//seguridad del sistema%>
<%if (session.getAttribute("session_user") == null) {
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <script src="Principal.js" type="text/javascript"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BIENVENIDO</title>
    </head>
    <body onload="Bienvenido();">
        <a href="Listar.jsp?clase=daw&campus=ceutec">
            Listar
        </a>
        <br>
        <a href="Nuevo.jsp">
            Nuevo
        </a>
        <br>
        <a href="Modificar.jsp">
            Modificar
        </a>
        <br>
        <a href="Eliminar.jsp">
            Eliminar
        </a>
        <br>
        <%// explicar los links con parametros%>
        <%//<a href="curso.jsp?g_nombre=programacionI&g_semestre=2"> ir a page </a>%>
    </body>
</html>
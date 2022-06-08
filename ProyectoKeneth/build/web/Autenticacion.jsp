<%@page import="java.sql.*"%> 
<%@page import="PackageDBA.*"%>                           
<%
    if (request.getParameter("btn_Ingresar") != null) {

        try {
            Dba db = new Dba(application.getRealPath("") + "daw.mdb");
            db.conectar();
            db.query.execute("SELECT usuario, password from registros");
            ResultSet rs = db.query.getResultSet();
            String centinela = "n";
            while (rs.next()) {
                if (request.getParameter("tf_usuario").equals(rs.getString(1))
                        && request.getParameter("tf_pass").equals(rs.getString(2))) {
                    centinela = "s";
                }
            }

            if (centinela.equals("s")) {
                out.print("<script>alert('BIENVENIDO');</script>");
                session.setAttribute("session_user", request.getParameter("tf_usuario"));
                session.setAttribute("session_pass", request.getParameter("tf_pass"));
                request.getRequestDispatcher("Principal2.jsp").forward(request, response);
            } else {
                out.print("<script>alert('ERROR. Usuario o Contraseña no válidos');</script>");
            request.getRequestDispatcher("index.jsp").forward(request, response);
            }
            db.desconectar();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
%>
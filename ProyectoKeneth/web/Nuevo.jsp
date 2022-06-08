<%if (session.getAttribute("session_user") == null) {
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
%>
<%@page import="PackageDBA.*"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styleNuevo.css" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">        
        <title>Agregar Usuario</title>
    </head>
    <body>
        <form action="Nuevo.jsp" method="post"  autocomplete="off" class="sign-up-form">
            <div class="logo">
                <img src="./images/logo.png" alt="easyclass" />
                <h4>MiniFacebook</h4>
            </div>

            <div class="heading">
                <h2>Crear cuenta</h2>
            </div>

            <span class="details">Nombre Completo</span>
            <br>
            <div class="actual-form">
                <div class="input-wrap">
                    <input type="text" minlength="4" class="input-field" name="reg_nombreCompleto" autocomplete="off" required />
                </div>
                <span class="details">Usuario</span>
                <br>
                <div class="input-wrap">
                    <input type="text" minlength="4" class="input-field" name="reg_user" autocomplete="off" required />
                    <br>
                </div>
                <span class="details">Contraseña</span>
                <br>
                <div class="input-wrap">
                    <input type="password" minlength="4" class="input-field" name="reg_pass" autocomplete="off" required />
                    <br>
                </div>


                <label id="labelRegion">Seleccione su región:</label>
                <br>
                <select name="ComboboxRegion" size="1" class="ComboboxRegion" style="position:relative;">
                    <option value="NorteAmerica">NorteAmerica</option>
                    <option value="CentroAmerica">CentroAmerica</option>
                    <option value="SurAmerica">SurAmerica</option>
                    <option value="Europa">Europa</option>
                    <option value="Asia">Asia</option>
                </select>
                <br>
                <label id="labelRegion">Fecha de nacimiento:</label>
                <br>
                <div class="input-wrap">
                    <input type="date" class="input-field" name="reg_Fecha" autocomplete="off" required />
                </div>

                <%
                    if (request.getParameter("btn_Registrar") != null) {
                        try {
                            Dba db = new Dba(application.getRealPath("") + "daw.mdb");
                            db.conectar();
                            int registro = db.query.executeUpdate("INSERT INTO registros (nombreCompleto,usuario,password,region,fechaNacimiento)"
                                    + "VALUES('" + request.getParameter("reg_nombreCompleto") + "'"
                                    + ",'" + request.getParameter("reg_user") + "'"
                                    + ",'" + request.getParameter("reg_pass") + "'"
                                    + ",'" + request.getParameter("ComboboxRegion") + "'"
                                    + ",'" + request.getParameter("reg_Fecha") + "')");
                            if (registro == 1) {
                                out.print("<script>alert('El usuario se creo correctamente');</script>");
                                request.getRequestDispatcher("Listar.jsp").forward(request, response);
                            } else {
                                out.print("<script>alert('El usuario no se pudo crear');</script>");
                            }
                            db.commit();
                            db.desconectar();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                %>

                <input style="margin-top: 25px" type="submit" name="btn_Registrar" value="Registrate" class="btn btn-success" />

            </div>
        </form>


    </body>
</html>

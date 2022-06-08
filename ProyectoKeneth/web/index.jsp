<%@page import="java.sql.PreparedStatement"%>
<%@page import="PackageDBA.Dba"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.File"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.File"%>
<%@page import="java.sql.Connection"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>MiniFacebook</title>
    <link rel="stylesheet" href="style.css" />
</head>
<body>
    <main>
        <div class="box">
            <div class="inner-box">
                <div class="forms-wrap">
                    <form name="f1" method="post" action="Autenticacion.jsp" autocomplete="off" class="sign-in-form" id="Form1">
                        <div class="logo">
                            <img src="./images/logo.png" alt="easyclass" />
                            <h4>MiniFacebook</h4>
                        </div>

                        <div class="heading">
                            <h2>BIENVENIDO</h2>
                            <h6>¿No tienes cuenta?</h6>
                            <a href="#" class="toggle">Registrate aquí</a>
                        </div>

                        <div class="actual-form">
                            <div class="input-wrap">
                                <input type="text" minlength="4" name="tf_usuario" class="input-field"
                                    autocomplete="off" required />
                                <label>Usuario</label>
                            </div>

                            <div class="input-wrap">
                                <input type="password" minlength="4" name="tf_pass" class="input-field"
                                    autocomplete="off" required />
                                <label>Contraseña</label>
                            </div>
                            

                            <input type="submit" name="btn_Ingresar" value="Iniciar Sesión" class="sign-btn" />

                            <p class="text">
                                ¿Olvidaste tu contraseña?
                                <a href="#">Click aquí</a>                                                                
                            </p>                            
                        </div>
                    </form>

                    <form action="index.jsp" method="post"  autocomplete="off" class="sign-up-form">
                        <div class="logo">
                            <img src="./images/logo.png" alt="easyclass" />
                            <h4>MiniFacebook</h4>
                        </div>

                        <div class="heading">
                            <h2>Crear cuenta</h2>
                        </div>

                        <div class="actual-form">
                            <div class="input-wrap">
                                <input type="text" minlength="4" class="input-field" name="reg_nombreCompleto" autocomplete="off" required />
                                <label>Nombre Completo</label>
                            </div>

                            <div class="input-wrap">
                                <input type="text" minlength="4" class="input-field" name="reg_user" autocomplete="off" required />
                                <label>Usuario</label>
                            </div>

                            <div class="input-wrap">
                                <input type="password" minlength="4" class="input-field" name="reg_pass" autocomplete="off" required />
                                <label>Contraseña</label>
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
                                        }else{
                                        out.print("<script>alert('El usuario no se pudo crear');</script>");
                                        }
                                        db.commit();
                                        db.desconectar();
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                            %>
                            
                            <input type="submit" name="btn_Registrar" value="Registrate" class="sign-btn" />

                            <div class="heading">
                                <h6>¿Ya tienes una cuenta?</h6>
                                <a href="#" class="toggle">Inicia sesión aquí</a>
                            </div>

                        </div>
                    </form>
                </div>

                <div class="carousel">
                    <div class="images-wrapper">                        
                        <img src="./images/image1.png" class="image img-1 show" alt="" />                    
                        <img src="./images/image2.png" class="image img-2" alt="" />
                        <img src="./images/image3.png" class="image img-3" alt="" />
                    </div>

                    <div class="text-slider">
                        <div class="text-wrap">
                            <div class="text-group">
                                <h2>Chatea con tus amigos</h2>
                                <h2>Postea lo que quieras</h2>
                                <h3>Invita a más gente a formar parte de esta red social</h3>
                            </div>
                        </div>

                        <div class="bullets">
                            <span class="active" data-value="1"></span>
                            <span data-value="2"></span>
                            <span data-value="3"></span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </main>

    <!-- Javascript file -->
    <script src="app.js"></script>
</body>

</html>
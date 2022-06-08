<%@page import="java.sql.ResultSet"%>
<%@page import="clases_package.Dba"%>
<!DOCTYPE html>

<%
  if(request.getParameter("btn_ingresar")!=null){
    Dba db = new Dba(application.getRealPath("")+"bd_usuarios.accdb");
    db.conectar();
    String user = request.getParameter("user");
    String pass = request.getParameter("pass");        
  
  ResultSet rs = db.query.executeQuery("select * from usuarios where usuario = '"+user+"' AND password ='"+pass+"'");
  if(rs.next()){
    response.sendRedirect("control-usuarios.jsp");
  }else{
    out.print("Datos incorrectos");
  }
  db.desconectar();
  }

  if(request.getParameter("btn_registrar")!=null){
    Dba db = new Dba(application.getRealPath("")+"bd_usuarios.accdb");
    db.conectar();
    
    String nombre = request.getParameter("nombre");
    String apellido = request.getParameter("apellido");
    String correo = request.getParameter("correo");
    String telefono = request.getParameter("telefono");
    String username = request.getParameter("username");
    String pass_register = request.getParameter("pass-register");        

    int i = db.query.executeUpdate("INSERT into usuarios ( nombre, apellido, correo, telefono, usuario, password ) VALUES ('"+nombre+"', '"+apellido+"', '"+correo+"', '"+telefono+"', '"+username+"','"+pass_register+"');");

    if(i == 1){
      out.print("<script>alert('Usuario registrado con exito')</script>");
      //response.sendRedirect("index.jsp");
    }        
    
    db.commit();
    db.desconectar();
  }

%>

<html lang="es">
  <head>    
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <script
      src="https://kit.fontawesome.com/64d58efce2.js"
      crossorigin="anonymous"
    ></script>
    <script src="https://kit.fontawesome.com/ef2430d1e3.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="styles.css" />
    <title>Arisu</title>
  </head>
  <div class="container">
      <div class="forms-container">
        <div class="signin-signup">
          <form class="sign-in-form">
            <h2 class="title">Iniciar Sesion</h2>
            <div class="input-field">
              <i class="fas fa-user"></i>
              <input name="user" type="text" placeholder="Nombre de Usuario" />
            </div>
            <div class="input-field">
              <i class="fas fa-lock"></i>
              <input name="pass" type="password" placeholder="Contrasenia" />
            </div>
            <input name="btn_ingresar" type="submit" value="Iniciar Sesion" class="btn solid"/>
            <p class="social-text">Ingresa ya!</p>
            <div class="social-media">
              <%-- <a href="#" class="social-icon">
                <i class="fab fa-facebook-f"></i>
              </a>
              <a href="#" class="social-icon">
                <i class="fab fa-twitter"></i>
              </a>
              <a href="#" class="social-icon">
                <i class="fab fa-google"></i>
              </a>
              <a href="#" class="social-icon">
                <i class="fab fa-linkedin-in"></i>
              </a> --%>
            </div>
          </form>
          <form method="POST" class="sign-up-form">
            <h2 class="title">Registarse</h2>
            <div class="input-field">
              <i class="fa-solid fa-person"></i>
              <input name="nombre" type="text" placeholder="Nombre" />
            </div>
            <div class="input-field">
              <i class="fa-solid fa-people-arrows-left-right"></i>
              <input name="apellido" type="text" placeholder="Apellido" />
            </div>
            <div class="input-field">
              <i class="fa-solid fa-at"></i>
              <input name="correo" type="text" placeholder="Correo" />
            </div>
            <div class="input-field">
              <i class="fa-solid fa-phone"></i>
              <input name="telefono" type="text" placeholder="Celular" />
            </div>
            <div class="input-field">
              <i class="fa-solid fa-user"></i>
              <input name="username" type="text" placeholder="Nombre de Usuario" />
            </div>
            <div class="input-field">
              <i class="fas fa-lock"></i>
              <input name="pass-register" type="password" placeholder="Contrasenia" />
            </div>
            <input name="btn_registrar" type="submit" class="btn" value="Registrate" />
            <p class="social-text">Ingresa ya!</p>
            <div class="social-media">
              <%-- <a href="#" class="social-icon">
                <i class="fab fa-facebook-f"></i>
              </a>
              <a href="#" class="social-icon">
                <i class="fab fa-twitter"></i>
              </a>
              <a href="#" class="social-icon">
                <i class="fab fa-google"></i>
              </a>
              <a href="#" class="social-icon">
                <i class="fab fa-linkedin-in"></i>
              </a> --%>
            </div>
          </form>
        </div>
      </div>

      <div class="panels-container">
        <div class="panel left-panel">
          <div class="content">
            <h3>Eres nuevo?</h3>
            <p>
              Que esperas para ingresar en nuestra red social> Unete
            </p>
            <button class="btn transparent" id="sign-up-btn">
              Registrarse
            </button>
          </div>
          <img src="img/log.svg" class="image" alt="" />
        </div>
        <div class="panel right-panel">
          <div class="content">
            <h3>Ya estas registrado?</h3>
            <p>
              No pierdas mas tiempo, inicia sesion y ve todas las novedades!
            </p>
            <button class="btn transparent" id="sign-in-btn">
              Iniciar Sesion
            </button>
          </div>
          <img src="img/register.svg" class="image" alt="" />
        </div>
      </div>
    </div>

    <script src="app.js"></script>
  </body>
</html>

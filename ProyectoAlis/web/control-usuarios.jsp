<%@page import="java.sql.ResultSet"%>
<%@page import="clases_package.Dba"%>
<!DOCTYPE html>
<%  
  if (request.getParameter("btn_eliminar") != null) {
    try {
      Dba db = new Dba(application.getRealPath("") + "bd_usuarios.accdb");
      db.conectar();

      int cuenta = Integer.valueOf(request.getParameter("delete_cuenta"));      
      String sql = "DELETE FROM usuarios WHERE cuenta = " + cuenta + ";";
      
      int i = db.query.executeUpdate(sql);
      db.commit();
      db.desconectar();

      if (i == 1) {
        %><script>alert("Eliminado");</script><%
        out.print("<script>alert('El usuario fue eliminado correctamente');</script>");
        response.sendRedirect("control-usuarios.jsp");
      }        
      } catch (Exception e) {
        e.printStackTrace();
      }
    } 
%>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Control de usuarios</title>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    <link href='https://fonts.googleapis.com/css?family=Montserrat' rel='stylesheet'>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.3/font/bootstrap-icons.css">
    <link rel="stylesheet" href="control-usuario.css">
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
  </head>
  <body>
    <div class="zonaSuperior">
      <a href="index.jsp"><img src="img/logoBlanco.png" alt="" height="75%" class="logo"></a>
      <span class="titulo">
        Lista de Usuarios
      </span>
    </div>
    <div class="container">
      <table style="text-align:center; margin-top:8rem;" class="table table-primary table-hover">
        <thead>
          <tr>
            <th colspan="6">
            <a href="control-usuarios.jsp">
            <button style="width:100%" type="button" class="btn btn-success">Actualizar</button>
            </a>
            </th>
          </tr>
          <tr>
            <th>Cuenta</th>
            <th>Nombre</th>
            <th>Usuario</th>
            <th>Correo</th>
            <th>Telefono</th>            
            <th>Eliminar</th>
          </tr>
        </thead>
        <tbody>          
            <%
              try {
                Dba db = new Dba (application.getRealPath("/")+"bd_usuarios.accdb");
                db.conectar();
                db.query.execute("SELECT cuenta, nombre, usuario, correo, telefono FROM usuarios ORDER BY cuenta");
                ResultSet result = db.query.getResultSet();
                //String centinela = "n";
                while(result.next()){
                  String v_cuenta = result.getString(1);
            %>
            <tr>
              <th name="id"><%=result.getString(1)%></th>
              <td><%=result.getString(2)%></td>
              <td><%=result.getString(3)%></td>
              <td><%=result.getString(4)%></td>
              <td><%=result.getString(5)%></td>              
              <td>
              <a name="btn_eliminar" href="control-usuarios.jsp?delete_cuenta=<%=v_cuenta%>&btn_eliminar=1"
              <button class="btn btn-danger"><i class="bi bi-trash"></i></button>
              </a>
              </td>              
            </tr>
            <%
              }
              db.desconectar();
            } catch (Exception e) {
              e.printStackTrace();
            }
            %>
        </tbody>
      </table>      
    </div>    
  </body>
</html>
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
        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <title>Lista de Usuarios</title>
    </head>
    <script>
    function mod(pid, pnom, puser, preg, pdate,ppass) {
        var modal2 = document.getElementById("myModal");
        modal.style.display = "block";
        document.getElementById("idh1").value = pid;
        document.getElementById("ids1").value = pnom;
        document.getElementById("ids2").value = puser;
        document.getElementById("ids3").value = preg;
        document.getElementById("ids4").value = pdate;
        document.getElementById("ids5").value = ppass;
    }
</script>
    
    <body>
            <%
        if (request.getParameter("p_editar") != null) {
            //ELIMINAR PRODUCTO 
            try {
                Dba db = new Dba(application.getRealPath("") + "daw.mdb");
                db.conectar();
                int contador = db.query.executeUpdate("DELETE from registros WHERE Id='" + request.getParameter("p_id") + "' ");
                db.commit();
                db.desconectar();
                if (contador >= 1) {
                    out.print("<script>alert('El usuario fue eliminado correctamente');</script>");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    %>
        
            <%
        //MODIFICAR un producto   
        if (request.getParameter("bt_modificar") != null) {
            try {
                Dba db = new Dba(application.getRealPath("") + "daw.mdb");
                db.conectar();
                int contador = db.query.executeUpdate("UPDATE registros "
                        + "SET nombreCompleto='" + request.getParameter("ti_nombre") + "',   "
                        + "usuario='" + request.getParameter("ti_usuario") + "',   "
                        + "password='" + request.getParameter("ti_password") + "',       "
                        + "region='" + request.getParameter("ti_region") + "',       "
                        + "fechaNacimiento='" + request.getParameter("ti_fecha") + "'"
                        + "WHERE Id='" + request.getParameter("ti_id") + "' ");

                if (contador >= 1) {
                    out.print("<script>alert('HECHO! El usuario fue modificado correctamente');</script>");
                }
                db.commit();
                db.desconectar();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    %>
    
    <div id="myModal" class="modal">  
  <div class="modal-content">
    <span class="close">&times;</span>
    <p>
    <form name="fM1" action="Listar.jsp" method="POST">
        <input type="hidden" id="idh1" name="ti_id" value="" />
        <table border="1">
            <tr>
                <td><center><h4>Modificar Usuario</h4></center></td>
            </tr>
            <tr>
                <td>
                    <table border="0">
                                <tbody>
                                    <tr>
                                        <td>Nombre  </td>
                                        <td> <input id="ids1" type="text" name="ti_nombre" value="" /> </td>    
                                        <td>Usuario</td>
                                        <td><input id="ids2" type="text" name="ti_usuario" value="" /></td>
                                    </td>
                                    </tr>
                                    <tr>
                                        <td>Region</td>
                                        <td><input id="ids3" type="text" name="ti_region" value="" /></td>
                                        <td>Fecha</td>
                                        <td><input id="ids4" type="text" name="ti_fecha" value="" />
                                        <br>
                                        </td>
                                                                              
                                    </tr>
                                    <tr>
                                        <td>Password</td>
                                        <td><input id="ids5" type="text" name="ti_password" value="" />
                                        <br>
                                        
                                    </tr>
                                </tbody>
                            </table>                    
                    <input style="margin-top: 15px" type="submit" value="Modificar Usuario" name="bt_modificar" class="btn btn-warning"/>
              <br>                      
              </td>
            </tr>
        </table>
       </form>    
    </p>
  </div>
</div>
        
        <div class="container">
            <h2 style="padding-top: 15px">Usuarios Registrados</h2>
        </div>
        <br>
        <br>
        <table class="table table-dark table-hover">
  <thead>
    <tr>
      <th scope="col">#ID</th>
      <th scope="col">Nombre</th>
      <th scope="col">Usuario</th>
      <th scope="col">Region</th>
      <th scope="col">Fecha Nacimiento</th>
      <th scope="col">Acciones</th>
    </tr>
  </thead>
  <tbody>
      <%
      Dba db = new Dba(application.getRealPath("") + "daw.mdb");
      db.conectar();
      db.query.execute("SELECT * from registros");
      ResultSet rs = db.query.getResultSet();
      String id, nombre, usuario, password, region, fecha;
        while (rs.next()) {
        id = rs.getString(1);
        nombre = rs.getString(2);
        usuario = rs.getString(3);
        password = rs.getString(4);
        region = rs.getString(5);
        fecha = rs.getString(6);
      %>
      <tr>         
      <td><%=id%></td>
      <td><%=nombre%></td>
      <td><%=usuario%></td>
      <td><%=region%></td>
      <td><%=fecha%></td>
      <td lass="text-center">
          <a  class="btn btn-primary" onclick="mod('<%=id%>', '<%=nombre%>', '<%=usuario%>', '<%=region%>', '<%=fecha%>', '<%=password%>')"><i class="fa fa-pencil"></i></a>
          <a  class="btn btn-danger" value="Eliminar" onclick="window.location = 'Listar.jsp?p_id=<%=id%>&p_editar=1'"><i class="fa fa-trash"></i></a>        
      </td>
      <tr>    
      <%
          }
%> 
  </tbody>         
</table>
  <a class="btn btn-success" href="Nuevo.jsp">Insertar nuevo Usuario</a>
        <!-- jquery
                    ============================================ -->
        <script src="js/vendor/jquery-1.11.3.min.js"></script>
        <!-- bootstrap JS
                    ============================================ -->
        <script src="js/bootstrap.min.js"></script>

        <!-- data table JS
                    ============================================ -->
        <script src="js/data-table/bootstrap-table.js"></script>
        <script src="js/modal.js"></script>
        <script src="js/data-table/tableExport.js"></script>
        <script src="js/data-table/data-table-active.js"></script>
        <script src="js/data-table/bootstrap-table-editable.js"></script>
        <script src="js/data-table/bootstrap-editable.js"></script>
        <script src="js/data-table/bootstrap-table-resizable.js"></script>
        <script src="js/data-table/colResizable-1.5.source.js"></script>
        <script src="js/data-table/bootstrap-table-export.js"></script>

        <!-- tab JS
                    ============================================ -->
        <script src="js/tab.js"></script>   
             
    </body>
</html>

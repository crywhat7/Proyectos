package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import PackageDBA.*;
import java.sql.*;

public final class Listar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

if (session.getAttribute("session_user") == null) {
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <!-- CSS only -->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <title>Lista de Usuarios</title>\n");
      out.write("    </head>\n");
      out.write("    <script>\n");
      out.write("    function mod(pid, pnom, puser, preg, pdate,ppass) {\n");
      out.write("        var modal2 = document.getElementById(\"myModal\");\n");
      out.write("        modal.style.display = \"block\";\n");
      out.write("        document.getElementById(\"idh1\").value = pid;\n");
      out.write("        document.getElementById(\"ids1\").value = pnom;\n");
      out.write("        document.getElementById(\"ids2\").value = puser;\n");
      out.write("        document.getElementById(\"ids3\").value = preg;\n");
      out.write("        document.getElementById(\"ids4\").value = pdate;\n");
      out.write("        document.getElementById(\"ids5\").value = ppass;\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("            ");

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
    
      out.write("\n");
      out.write("        \n");
      out.write("            ");

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
    
      out.write("\n");
      out.write("    \n");
      out.write("    <div id=\"myModal\" class=\"modal\">  \n");
      out.write("  <div class=\"modal-content\">\n");
      out.write("    <span class=\"close\">&times;</span>\n");
      out.write("    <p>\n");
      out.write("    <form name=\"fM1\" action=\"Listar.jsp\" method=\"POST\">\n");
      out.write("        <input type=\"hidden\" id=\"idh1\" name=\"ti_id\" value=\"\" />\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <td><center><h4>Modificar Usuario</h4></center></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <table border=\"0\">\n");
      out.write("                                <tbody>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Nombre  </td>\n");
      out.write("                                        <td> <input id=\"ids1\" type=\"text\" name=\"ti_nombre\" value=\"\" /> </td>    \n");
      out.write("                                        <td>Usuario</td>\n");
      out.write("                                        <td><input id=\"ids2\" type=\"text\" name=\"ti_usuario\" value=\"\" /></td>\n");
      out.write("                                    </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Region</td>\n");
      out.write("                                        <td><input id=\"ids3\" type=\"text\" name=\"ti_region\" value=\"\" /></td>\n");
      out.write("                                        <td>Fecha</td>\n");
      out.write("                                        <td><input id=\"ids4\" type=\"text\" name=\"ti_fecha\" value=\"\" />\n");
      out.write("                                        <br>\n");
      out.write("                                        </td>\n");
      out.write("                                                                              \n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Password</td>\n");
      out.write("                                        <td><input id=\"ids5\" type=\"text\" name=\"ti_password\" value=\"\" />\n");
      out.write("                                        <br>\n");
      out.write("                                        \n");
      out.write("                                    </tr>\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>                    \n");
      out.write("                    <input style=\"margin-top: 15px\" type=\"submit\" value=\"Modificar Usuario\" name=\"bt_modificar\" class=\"btn btn-warning\"/>\n");
      out.write("              <br>                      \n");
      out.write("              </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("       </form>    \n");
      out.write("    </p>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h2 style=\"padding-top: 15px\">Usuarios Registrados</h2>\n");
      out.write("        <a class=\"btn btn-success\" href=\"Nuevo.jsp\">Insertar nuevo Usuario</a>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <table class=\"table table-dark table-hover\">\n");
      out.write("  <thead>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"col\">#ID</th>\n");
      out.write("      <th scope=\"col\">Nombre</th>\n");
      out.write("      <th scope=\"col\">Usuario</th>\n");
      out.write("      <th scope=\"col\">Region</th>\n");
      out.write("      <th scope=\"col\">Fecha Nacimiento</th>\n");
      out.write("      <th scope=\"col\">Acciones</th>\n");
      out.write("    </tr>\n");
      out.write("  </thead>\n");
      out.write("  <tbody>\n");
      out.write("      ");

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
      
      out.write("\n");
      out.write("      <tr>         \n");
      out.write("      <td>");
      out.print(id);
      out.write("</td>\n");
      out.write("      <td>");
      out.print(nombre);
      out.write("</td>\n");
      out.write("      <td>");
      out.print(usuario);
      out.write("</td>\n");
      out.write("      <td>");
      out.print(region);
      out.write("</td>\n");
      out.write("      <td>");
      out.print(fecha);
      out.write("</td>\n");
      out.write("      <td lass=\"text-center\">\n");
      out.write("          <a  class=\"btn btn-primary\" onclick=\"mod('");
      out.print(id);
      out.write("', '");
      out.print(nombre);
      out.write("', '");
      out.print(usuario);
      out.write("', '");
      out.print(region);
      out.write("', '");
      out.print(fecha);
      out.write("', '");
      out.print(password);
      out.write("')\"><i class=\"fa fa-pencil\"></i></a>\n");
      out.write("          <a  class=\"btn btn-danger\" value=\"Eliminar\" onclick=\"window.location = 'Listar.jsp?p_id=");
      out.print(id);
      out.write("&p_editar=1'\"><i class=\"fa fa-trash\"></i></a>        \n");
      out.write("      </td>\n");
      out.write("      <tr>    \n");
      out.write("      ");

          }

      out.write("             \n");
      out.write("  </tbody>\n");
      out.write("</table>\n");
      out.write("        <!-- jquery\n");
      out.write("                    ============================================ -->\n");
      out.write("        <script src=\"js/vendor/jquery-1.11.3.min.js\"></script>\n");
      out.write("        <!-- bootstrap JS\n");
      out.write("                    ============================================ -->\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- data table JS\n");
      out.write("                    ============================================ -->\n");
      out.write("        <script src=\"js/data-table/bootstrap-table.js\"></script>\n");
      out.write("        <script src=\"js/modal.js\"></script>\n");
      out.write("        <script src=\"js/data-table/tableExport.js\"></script>\n");
      out.write("        <script src=\"js/data-table/data-table-active.js\"></script>\n");
      out.write("        <script src=\"js/data-table/bootstrap-table-editable.js\"></script>\n");
      out.write("        <script src=\"js/data-table/bootstrap-editable.js\"></script>\n");
      out.write("        <script src=\"js/data-table/bootstrap-table-resizable.js\"></script>\n");
      out.write("        <script src=\"js/data-table/colResizable-1.5.source.js\"></script>\n");
      out.write("        <script src=\"js/data-table/bootstrap-table-export.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- tab JS\n");
      out.write("                    ============================================ -->\n");
      out.write("        <script src=\"js/tab.js\"></script>   \n");
      out.write("             \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

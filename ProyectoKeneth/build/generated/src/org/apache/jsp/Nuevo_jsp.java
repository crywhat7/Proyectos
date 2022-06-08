package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import PackageDBA.*;
import java.sql.*;

public final class Nuevo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"styleNuevo.css\" />\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">        \n");
      out.write("        <title>Agregar Usuario</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("                            <form action=\"Nuevo.jsp\" method=\"post\"  autocomplete=\"off\" class=\"sign-up-form\">\n");
      out.write("                        <div class=\"logo\">\n");
      out.write("                            <img src=\"./images/logo.png\" alt=\"easyclass\" />\n");
      out.write("                            <h4>MiniFacebook</h4>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"heading\">\n");
      out.write("                            <h2>Crear cuenta</h2>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                                                                <span class=\"details\">Nombre Completo</span>\n");
      out.write("                                <br>\n");
      out.write("                        <div class=\"actual-form\">\n");
      out.write("                            <div class=\"input-wrap\">\n");
      out.write("                                <input type=\"text\" minlength=\"4\" class=\"input-field\" name=\"reg_nombreCompleto\" autocomplete=\"off\" required />\n");
      out.write("                            </div>\n");
      out.write("                                <span class=\"details\">Usuario</span>\n");
      out.write("                                <br>\n");
      out.write("                            <div class=\"input-wrap\">\n");
      out.write("                                <input type=\"text\" minlength=\"4\" class=\"input-field\" name=\"reg_user\" autocomplete=\"off\" required />\n");
      out.write("                                <br>\n");
      out.write("                            </div>\n");
      out.write("                                <span class=\"details\">Consetreña</span>\n");
      out.write("                                <br>\n");
      out.write("                            <div class=\"input-wrap\">\n");
      out.write("                                <input type=\"password\" minlength=\"4\" class=\"input-field\" name=\"reg_pass\" autocomplete=\"off\" required />\n");
      out.write("                                <br>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <label id=\"labelRegion\">Seleccione su región:</label>\n");
      out.write("                            <br>\n");
      out.write("                            <select name=\"ComboboxRegion\" size=\"1\" class=\"ComboboxRegion\" style=\"position:relative;\">\n");
      out.write("                                <option value=\"NorteAmerica\">NorteAmerica</option>\n");
      out.write("                                <option value=\"CentroAmerica\">CentroAmerica</option>\n");
      out.write("                                <option value=\"SurAmerica\">SurAmerica</option>\n");
      out.write("                                <option value=\"Europa\">Europa</option>\n");
      out.write("                                <option value=\"Asia\">Asia</option>\n");
      out.write("                            </select>\n");
      out.write("                            <br>\n");
      out.write("                            <label id=\"labelRegion\">Fecha de nacimiento:</label>\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"input-wrap\">\n");
      out.write("                                <input type=\"date\" class=\"input-field\" name=\"reg_Fecha\" autocomplete=\"off\" required />\n");
      out.write("                            </div>\n");
      out.write("                            \n");

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
                                        }else{
                                        out.print("<script>alert('El usuario no se pudo crear');</script>");
                                        }
                                        db.commit();
                                        db.desconectar();
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                            
      out.write("\n");
      out.write("                            \n");
      out.write("                            <input style=\"margin-top: 25px\" type=\"submit\" name=\"btn_Registrar\" value=\"Registrate\" class=\"btn btn-success\" />\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("    \n");
      out.write("    \n");
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

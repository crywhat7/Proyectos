package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import PackageDBA.Dba;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.sql.Statement;
import java.sql.ResultSet;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.sql.Connection;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\" />\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("    <title>MiniFacebook</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <main>\r\n");
      out.write("        <div class=\"box\">\r\n");
      out.write("            <div class=\"inner-box\">\r\n");
      out.write("                <div class=\"forms-wrap\">\r\n");
      out.write("                    <form name=\"f1\" method=\"post\" action=\"Autenticacion.jsp\" autocomplete=\"off\" class=\"sign-in-form\" id=\"Form1\">\r\n");
      out.write("                        <div class=\"logo\">\r\n");
      out.write("                            <img src=\"./images/logo.png\" alt=\"easyclass\" />\r\n");
      out.write("                            <h4>MiniFacebook</h4>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"heading\">\r\n");
      out.write("                            <h2>BIENVENIDO</h2>\r\n");
      out.write("                            <h6>¿No tienes cuenta?</h6>\r\n");
      out.write("                            <a href=\"#\" class=\"toggle\">Registrate aquí</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"actual-form\">\r\n");
      out.write("                            <div class=\"input-wrap\">\r\n");
      out.write("                                <input type=\"text\" minlength=\"4\" name=\"tf_usuario\" class=\"input-field\"\r\n");
      out.write("                                    autocomplete=\"off\" required />\r\n");
      out.write("                                <label>Usuario</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"input-wrap\">\r\n");
      out.write("                                <input type=\"password\" minlength=\"4\" name=\"tf_pass\" class=\"input-field\"\r\n");
      out.write("                                    autocomplete=\"off\" required />\r\n");
      out.write("                                <label>Contraseña</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("\r\n");
      out.write("                            <input type=\"submit\" name=\"btn_Ingresar\" value=\"Iniciar Sesión\" class=\"sign-btn\" />\r\n");
      out.write("\r\n");
      out.write("                            <p class=\"text\">\r\n");
      out.write("                                ¿Olvidaste tu contraseña?\r\n");
      out.write("                                <a href=\"#\">Click aquí</a>                                                                \r\n");
      out.write("                            </p>                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("\r\n");
      out.write("                    <form action=\"index.jsp\" method=\"post\"  autocomplete=\"off\" class=\"sign-up-form\">\r\n");
      out.write("                        <div class=\"logo\">\r\n");
      out.write("                            <img src=\"./images/logo.png\" alt=\"easyclass\" />\r\n");
      out.write("                            <h4>MiniFacebook</h4>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"heading\">\r\n");
      out.write("                            <h2>Crear cuenta</h2>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"actual-form\">\r\n");
      out.write("                            <div class=\"input-wrap\">\r\n");
      out.write("                                <input type=\"text\" minlength=\"4\" class=\"input-field\" name=\"reg_nombreCompleto\" autocomplete=\"off\" required />\r\n");
      out.write("                                <label>Nombre Completo</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"input-wrap\">\r\n");
      out.write("                                <input type=\"text\" minlength=\"4\" class=\"input-field\" name=\"reg_user\" autocomplete=\"off\" required />\r\n");
      out.write("                                <label>Usuario</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"input-wrap\">\r\n");
      out.write("                                <input type=\"password\" minlength=\"4\" class=\"input-field\" name=\"reg_pass\" autocomplete=\"off\" required />\r\n");
      out.write("                                <label>Contraseña</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <label id=\"labelRegion\">Seleccione su región:</label>\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <select name=\"ComboboxRegion\" size=\"1\" class=\"ComboboxRegion\" style=\"position:relative;\">\r\n");
      out.write("                                <option value=\"NorteAmerica\">NorteAmerica</option>\r\n");
      out.write("                                <option value=\"CentroAmerica\">CentroAmerica</option>\r\n");
      out.write("                                <option value=\"SurAmerica\">SurAmerica</option>\r\n");
      out.write("                                <option value=\"Europa\">Europa</option>\r\n");
      out.write("                                <option value=\"Asia\">Asia</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <label id=\"labelRegion\">Fecha de nacimiento:</label>\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <div class=\"input-wrap\">\r\n");
      out.write("                                <input type=\"date\" class=\"input-field\" name=\"reg_Fecha\" autocomplete=\"off\" required />\r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");

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
                            
      out.write("\r\n");
      out.write("                            \r\n");
      out.write("                            <input type=\"submit\" name=\"btn_Registrar\" value=\"Registrate\" class=\"sign-btn\" />\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"heading\">\r\n");
      out.write("                                <h6>¿Ya tienes una cuenta?</h6>\r\n");
      out.write("                                <a href=\"#\" class=\"toggle\">Inicia sesión aquí</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"carousel\">\r\n");
      out.write("                    <div class=\"images-wrapper\">                        \r\n");
      out.write("                        <img src=\"./images/image1.png\" class=\"image img-1 show\" alt=\"\" />                    \r\n");
      out.write("                        <img src=\"./images/image2.png\" class=\"image img-2\" alt=\"\" />\r\n");
      out.write("                        <img src=\"./images/image3.png\" class=\"image img-3\" alt=\"\" />\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"text-slider\">\r\n");
      out.write("                        <div class=\"text-wrap\">\r\n");
      out.write("                            <div class=\"text-group\">\r\n");
      out.write("                                <h2>Chatea con tus amigos</h2>\r\n");
      out.write("                                <h2>Postea lo que quieras</h2>\r\n");
      out.write("                                <h3>Invita a más gente a formar parte de esta red social</h3>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"bullets\">\r\n");
      out.write("                            <span class=\"active\" data-value=\"1\"></span>\r\n");
      out.write("                            <span data-value=\"2\"></span>\r\n");
      out.write("                            <span data-value=\"3\"></span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </main>\r\n");
      out.write("\r\n");
      out.write("    <!-- Javascript file -->\r\n");
      out.write("    <script src=\"app.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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

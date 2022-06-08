package org.apache.jsp.vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("                            <form action=\"index.jsp\" method=\"post\"  autocomplete=\"off\" class=\"sign-up-form\">\n");
      out.write("                        <div class=\"logo\">\n");
      out.write("                            <img src=\"./images/logo.png\" alt=\"easyclass\" />\n");
      out.write("                            <h4>MiniFacebook</h4>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"heading\">\n");
      out.write("                            <h2>Crear cuenta</h2>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"actual-form\">\n");
      out.write("                            <div class=\"input-wrap\">\n");
      out.write("                                <input type=\"text\" minlength=\"4\" class=\"input-field\" name=\"reg_nombreCompleto\" autocomplete=\"off\" required />\n");
      out.write("                                <label>Nombre Completo</label>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"input-wrap\">\n");
      out.write("                                <input type=\"text\" minlength=\"4\" class=\"input-field\" name=\"reg_user\" autocomplete=\"off\" required />\n");
      out.write("                                <label>Usuario</label>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"input-wrap\">\n");
      out.write("                                <input type=\"password\" minlength=\"4\" class=\"input-field\" name=\"reg_pass\" autocomplete=\"off\" required />\n");
      out.write("                                <label>Contraseña</label>\n");
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
      out.write("                                                        \n");
      out.write("                            <input type=\"submit\" name=\"btn_Registrar\" value=\"Registrate\" class=\"sign-btn\" />\n");
      out.write("\n");
      out.write("                            <div class=\"heading\">\n");
      out.write("                                <a href=\"Proyecto/Listar.jsp\" class=\"toggle\"><--- Regresar</a>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
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

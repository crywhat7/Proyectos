package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Principal_jsp extends org.apache.jasper.runtime.HttpJspBase
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

//seguridad del sistema
      out.write('\r');
      out.write('\n');
if (session.getAttribute("session_user") == null) {
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <!-- CSS only -->\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"Principal.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>BIENVENIDO</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body onload=\"Bienvenido();\">\r\n");
      out.write("        <a href=\"Listar.jsp?clase=daw&campus=ceutec\">\r\n");
      out.write("            Listar\r\n");
      out.write("        </a>\r\n");
      out.write("        <br>\r\n");
      out.write("        <a href=\"Nuevo.jsp\">\r\n");
      out.write("            Nuevo\r\n");
      out.write("        </a>\r\n");
      out.write("        <br>\r\n");
      out.write("        <a href=\"Modificar.jsp\">\r\n");
      out.write("            Modificar\r\n");
      out.write("        </a>\r\n");
      out.write("        <br>\r\n");
      out.write("        <a href=\"Eliminar.jsp\">\r\n");
      out.write("            Eliminar\r\n");
      out.write("        </a>\r\n");
      out.write("        <br>\r\n");
      out.write("        ");
// explicar los links con parametros
      out.write("\r\n");
      out.write("        ");
//<a href="curso.jsp?g_nombre=programacionI&g_semestre=2"> ir a page </a>
      out.write("\r\n");
      out.write("    </body>\r\n");
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

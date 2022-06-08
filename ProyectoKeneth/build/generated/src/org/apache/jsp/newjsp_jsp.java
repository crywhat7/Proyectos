package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("<body>\n");
      out.write("<form action = \"second.jsp\" method = \"POST\">\n");
      out.write("Name: <input type = \"text\" name = \"n\">\n");
      out.write("<br/><br/>\n");
      out.write("Password: <input type = \"text\" name = \"pass\" /><br/><br/>\n");
      out.write("<input type = \"submit\" value = \"Submit\" />\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("function sample()\n");
      out.write("{\n");
      out.write("for(var i=0; i < document.f.shirt.length; i++)\n");
      out.write("{\n");
      out.write("if(!document.f.shirt[i].checked)\n");
      out.write("{\n");
      out.write("alert(\"Please Select Your favorite tshirts size\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("else\n");
      out.write("{\n");
      out.write("alert(\"Click OK to display your choice\");\n");
      out.write("return true;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<title>Demo</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<form name=\"f\" onsubmit=\"sample()\">\n");
      out.write("<h3>Select your favorite T-Shirts Size</h3>\n");
      out.write("<p><input type=\"checkbox\" name=\"shirt\" value=\"XXXL\"/>XXXL</p>\n");
      out.write("<p><input type=\"checkbox\" name=\"shirt\" value=\"Cotton\"/>Cotton</p>\n");
      out.write("<p><input type=\"checkbox\" name=\"shirt\" value=\"Fabric\"/>Fabric</p>\n");
      out.write("<p><input type=\"checkbox\" name=\"shirt\" value=\"Milange\"/>Milange</p>\n");
      out.write("<p><input type=\"checkbox\" name=\"shirt\" value=\"Yarn\"/>Yarn</p>\n");
      out.write("<p><input type=\"submit\" value=\"submit\"/>\n");
      out.write("</form>\n");

String s[]= request.getParameterValues("shirt");
if(s != null)
{

      out.write("\n");
      out.write("<h4>My Favorite t-shirt size</h4>\n");
      out.write("<ul>\n");

for(int i=0; i<s.length; i++)
{

      out.write("\n");
      out.write("<li>");
      out.print(s[i]);
      out.write("</li>\n");

}

      out.write("\n");
      out.write("</ul>\n");

}

      out.write("\n");
      out.write("</body>\n");
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

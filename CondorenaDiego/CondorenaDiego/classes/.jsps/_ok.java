  /*@lineinfo:filename=/ok.jsp*/
  /*@lineinfo:generated-code*/

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;


public class _ok extends oracle.jsp.runtime.HttpJsp {

  public final String _globalsClassName = null;

  // ** Begin Declarations


  // ** End Declarations

  public void _jspService(HttpServletRequest request, HttpServletResponse response) throws java.io.IOException, ServletException {

    response.setContentType( "text/html;charset=windows-1252");
    /* set up the intrinsic variables using the pageContext goober:
    ** session = HttpSession
    ** application = ServletContext
    ** out = JspWriter
    ** page = this
    ** config = ServletConfig
    ** all session/app beans declared in globals.jsa
    */
    PageContext pageContext = JspFactory.getDefaultFactory().getPageContext( this, request, response, null, true, JspWriter.DEFAULT_BUFFER, true);
    // Note: this is not emitted if the session directive == false
    HttpSession session = pageContext.getSession();
    if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) {
      pageContext.setAttribute(OracleJspRuntime.JSP_PAGE_DONTNOTIFY, "true", PageContext.PAGE_SCOPE);
      JspFactory.getDefaultFactory().releasePageContext(pageContext);
      return;
}
    int __jsp_tag_starteval;
    ServletContext application = pageContext.getServletContext();
    JspWriter out = pageContext.getOut();
    _ok page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {
      // global beans
      // end global beans


      out.write(__jsp_StaticText.text[0]);
      out.write(__jsp_StaticText.text[1]);
      /*@lineinfo:user-code*//*@lineinfo:84^115*/      out.print( session.getAttribute("usu"));
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[2]);
      /*@lineinfo:translated-code*//*@lineinfo:97^10*/      {
        org.apache.struts.taglib.html.FormTag __jsp_taghandler_1=(org.apache.struts.taglib.html.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.FormTag.class,"org.apache.struts.taglib.html.FormTag action");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setAction("/menu");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[3]);
          /*@lineinfo:translated-code*//*@lineinfo:97^36*/          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[4]);


    }
    catch( Throwable e) {
      try {
        if (out != null) out.clear();
      }
      catch( Exception clearException) {
      }
      pageContext.handlePageException( e);
    }
    finally {
      OracleJspRuntime.extraHandlePCFinally(pageContext,true);
      JspFactory.getDefaultFactory().releasePageContext(pageContext);
    }

  }
  private static class __jsp_StaticText {
    private static final char text[][]=new char[5][];
    static {
      try {
      text[0] = 
      "\n".toCharArray();
      text[1] = 
      "\n<html lang=\"en\">\n  <head>\n  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\n    <meta charset=\"utf-8\">\n    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n\n<!-- Optional theme -->\n<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\" crossorigin=\"anonymous\">\n\n<!-- Latest compiled and minified JavaScript -->\n<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\n\n<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css\" integrity=\"sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb\" crossorigin=\"anonymous\">\n\n<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js\" integrity=\"sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh\" crossorigin=\"anonymous\"></script>\n<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js\" integrity=\"sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ\" crossorigin=\"anonymous\"></script>\n <link rel=\"icon\" href=\"../../favicon.ico\">\n\n    <title>Theme Template for Bootstrap</title>\n\n    <!-- Bootstrap core CSS -->\n    <link href=\"../../dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n    <!-- Bootstrap theme -->\n    <link href=\"../../dist/css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n    <link href=\"../../assets/css/ie10-viewport-bug-workaround.css\" rel=\"stylesheet\">\n\n    <!-- Custom styles for this template -->\n    <link href=\"theme.css\" rel=\"stylesheet\">\n\n    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->\n    <!--[if lt IE 9]><script src=\"../../assets/js/ie8-responsive-file-warning.js\"></script><![endif]-->\n    <script src=\"../../assets/js/ie-emulation-modes-warning.js\"></script>\n\n    <title>Bootstrap 101 Template</title>\n\n    <!-- Bootstrap -->\n    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n\n    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n    <!--[if lt IE 9]>\n      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n    <![endif]-->\n  </head>\n  <body>\n  <nav class=\"navbar navbar-inverse navbar-fixed-top\">\n      <div class=\"container\">\n        <div class=\"navbar-header\">\n          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n            <span class=\"sr-only\">Toggle navigation</span>\n            <span class=\"icon-bar\"></span>\n            <span class=\"icon-bar\"></span>\n            <span class=\"icon-bar\"></span>\n          </button>\n          <a class=\"navbar-brand\" href=\"#\">TRABAJO TALLER DE PROGRAMACION</a>\n        </div>\n        <div id=\"navbar\" class=\"navbar-collapse collapse\">\n          <ul class=\"nav navbar-nav\">\n            <li class=\"active\"><a href=\"#\">MENU DE ACTIVIDADES </a></li>\n          </ul>\n        </div><!--/.nav-collapse -->\n      </div>\n    </nav>\n     <div class=\"container theme-showcase\" role=\"main\">\n <nav class=\"navbar navbar-default\">\n        <div class=\"container\">\n          <div class=\"navbar-header\">\n            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n              <span class=\"icon-bar\">Toggle navigation</span>\n              <span class=\"icon-bar\"></span>\n              <span class=\"icon-bar\"></span>\n              <span class=\"icon-bar\"></span>\n            </button>\n          </div>\n          <div class=\"navbar-collapse collapse\">\n            <ul class=\"nav navbar-nav\">\n              <li class=\"active\"><a href=\"#\"> <button type=\"button\" class=\"btn btn-lg btn-primary\"><h2>Bienvenido ".toCharArray();
      text[2] = 
      "</h2></button></a></li>\n            </ul>\n            <ul>\n               <img  src=\"imagenes\\usuario.jpg\" width=\"300\" height=\"150\" >\n            </ul>\n          </div><!--/.nav-collapse -->\n        </div>\n      </nav>\n      \n      <!-- Main jumbotron for a primary marketing message or call to action -->\n      <div class=\"jumbotron\">\n        <h2>Taller de Programacion</h2>\n        <p>Escoja una Opcion</p>\n         ".toCharArray();
      text[3] = 
      "\n         \n         <input class=\"btn btn-lg btn-primary  btn-block\"  name=\"boton\"  value=\"LISTA DE JUGADORES\" type=\"submit\" >\n         <input class=\"btn btn-lg btn-primary  btn-block\"  name=\"boton\"   value=\"REGISTRO DE JUGADORES\" type=\"submit\" >\n         <input class=\"btn btn-lg btn-primary  btn-block\" name=\"boton\"  value=\"ACTUALIZAR DATOS\" type=\"submit\" >\n         <input class=\"btn btn-lg btn-primary  btn-block\"  name=\"boton\" value=\"SALIR\" type=\"submit\" >\n        ".toCharArray();
      text[4] = 
      "\n      </div>\n    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\n    <!-- Include all compiled plugins (below), or include individual files as needed -->\n    <script src=\"js/bootstrap.min.js\"></script>\n  </body>\n</html>\n\n".toCharArray();
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}

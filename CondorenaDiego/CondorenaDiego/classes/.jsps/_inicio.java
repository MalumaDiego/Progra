  /*@lineinfo:filename=/inicio.jsp*/
  /*@lineinfo:generated-code*/

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;


public class _inicio extends oracle.jsp.runtime.HttpJsp {

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
    _inicio page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {
      // global beans
      // end global beans


      out.write(__jsp_StaticText.text[0]);
      out.write(__jsp_StaticText.text[1]);
      out.write(__jsp_StaticText.text[2]);
      /*@lineinfo:translated-code*//*@lineinfo:103^17*/      {
        org.apache.struts.taglib.html.FormTag __jsp_taghandler_1=(org.apache.struts.taglib.html.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.FormTag.class,"org.apache.struts.taglib.html.FormTag action onsubmit");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setAction("/ini");
        __jsp_taghandler_1.setOnsubmit("return fParams( )");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[3]);
            /*@lineinfo:translated-code*//*@lineinfo:106^56*/            {
              org.apache.struts.taglib.html.TextTag __jsp_taghandler_2=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag property");
              __jsp_taghandler_2.setParent(__jsp_taghandler_1);
              __jsp_taghandler_2.setProperty("usuario");
              __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_2,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[4]);
            /*@lineinfo:translated-code*//*@lineinfo:109^22*/            {
              org.apache.struts.taglib.html.PasswordTag __jsp_taghandler_3=(org.apache.struts.taglib.html.PasswordTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.PasswordTag.class,"org.apache.struts.taglib.html.PasswordTag property");
              __jsp_taghandler_3.setParent(__jsp_taghandler_1);
              __jsp_taghandler_3.setProperty("clave");
              __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_3,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_3.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[5]);
          /*@lineinfo:translated-code*//*@lineinfo:109^55*/          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[6]);


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
    private static final char text[][]=new char[7][];
    static {
      try {
      text[0] = 
      "\n".toCharArray();
      text[1] = 
      "\n".toCharArray();
      text[2] = 
      "\n<html>\n<head>\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\n<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n\n<!-- Optional theme -->\n<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\" crossorigin=\"anonymous\">\n\n<!-- Latest compiled and minified JavaScript -->\n<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\n\n<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css\" integrity=\"sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb\" crossorigin=\"anonymous\">\n\n<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js\" integrity=\"sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh\" crossorigin=\"anonymous\"></script>\n<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js\" integrity=\"sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ\" crossorigin=\"anonymous\"></script>\n\n<title>\nHello World\n</title>\n</head>\n <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n<link rel=\"stylesheet\" href=\"css/estilos.css\" type=\"text/css\"/>\n<script language=\"JavaScript\" src=\"jscript/valida.js\"></script>\n<script language=\"JavaScript\" src=\"jscript/inicio.js\"></script>\n\n<body>\n<nav class=\"navbar navbar-inverse navbar-fixed-top\">\n      <div class=\"container\">\n        <div class=\"navbar-header\">\n          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n            <span class=\"sr-only\">Toggle navigation</span>\n            <span class=\"icon-bar\"></span>\n            <span class=\"icon-bar\"></span>\n            <span class=\"icon-bar\"></span>\n          </button>\n          <a class=\"navbar-brand\" href=\"#\">TRABAJO TALLER DE PROGRAMACION</a>\n        </div>\n        <div id=\"navbar\" class=\"navbar-collapse collapse\">\n          <ul class=\"nav navbar-nav\">\n            <li class=\"active\"><a href=\"#\">MENU DE ACTIVIDADES </a></li>\n          </ul>\n        </div><!--/.nav-collapse -->\n      </div>\n    </nav>\n    <div class=\"container\">\n  <h2>Carousel Example</h2>  \n  <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n    <!-- Indicators -->\n    <ol class=\"carousel-indicators\">\n      <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n      <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n      <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n    </ol>\n\n    <!-- Wrapper for slides -->\n    <div class=\"carousel-inner\">\n      <div class=\"item active\">\n        <img  src=\"imagenes\\tennis.jpg\"  alt=\"Los Angeles\" style=\"width:100%;\">\n      </div>\n\n      <div class=\"item\">\n        <img  src=\"imagenes\\tennis2.jpg\"  alt=\"Chicago\" style=\"width:100%;\">\n      </div>\n    \n      <div class=\"item\">\n        <img  src=\"imagenes\\tennis.jpg\"  alt=\"New york\" style=\"width:100%;\">\n      </div>\n    </div>\n\n    <!-- Left and right controls -->\n    <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\n      <span class=\"glyphicon glyphicon-chevron-left\"></span>\n      <span class=\"sr-only\">Previous</span>\n    </a>\n    <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\n      <span class=\"glyphicon glyphicon-chevron-right\"></span>\n      <span class=\"sr-only\">Next</span>\n    </a>\n  </div>\n</div>\n\n    <div class=\"container theme-showcase\" role=\"main\">\n    \n          <div class=\"jumbotron\">\n        <h2>Taller de Programacion</h2>\n        <center>\n         <img  src=\"imagenes\\tennis.jpg\" width=\"300\" height=\"150\" >\n         </center>\n         <div class=\"container\">\n    <div class=\"row vertical-offset-100\">\n    \t<div class=\"col-md-4 col-md-offset-4\">\n    \t\t<div class=\"panel panel-default\">\n\t\t\t  \t<div class=\"panel-heading\">\n\t\t\t    \t<h3 class=\"panel-title\" >Inicio de Sesion</h3>\n\t\t\t \t  </div>\n\t\t\t  \t<div class=\"panel-body\">\t\n                ".toCharArray();
      text[3] = 
      "\n                  <fieldset>\n                      <div class=\"form-group\">\n                        <td width=\"600\" align=\"center\">".toCharArray();
      text[4] = 
      " </td>\n                      </div>\n                      <div class=\"form-group\">\n                     ".toCharArray();
      text[5] = 
      "\n                      </div>\n                      \n                        <input class=\"btn btn-lg btn-success btn-block\" value=\"Ingresar\" type=\"submit\" >\n                  </fieldset>\n                ".toCharArray();
      text[6] = 
      "\t\t\t  \n\t\t\t    </div>\n\t\t\t</div>\n\t\t</div>\n\t</div>\n</div>\n      </div>\n\n</body>\n\n</html>\n".toCharArray();
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}

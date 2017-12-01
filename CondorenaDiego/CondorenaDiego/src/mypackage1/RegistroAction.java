package mypackage1;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.NamingException;
import oracle.jdbc.*;
import java.util.*;


public class RegistroAction extends Action 
{
  /**
   * This is the main action called from the Struts framework.
   * @param mapping The ActionMapping used to select this instance.
   * @param form The optional ActionForm bean for this request.
   * @param request The HTTP Request we are processing.
   * @param response The HTTP Response we are processing.
   */
  public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
  {
   RegistroForm xxx = (RegistroForm) form;

     String idju = xxx.getIdju();
     String nombre = xxx.getNombre();
     String app = xxx.getApp();
     String apm = xxx.getApm();
     String tj = xxx.getTj();
     String tg = xxx.getTg();
    
   Connection cn = null;
    ConnectDB conn =new ConnectDB();
    ResultSet rsConsulta = null;

       try
       {
          cn = conn.conexion;  //insert into g_obras values (21,'hola','luis',1,1);
          String cadena = "insert into D_JUGADOR values ('"+idju+"','"+nombre+"','"+app+"','"+apm+"','"+tj+"','"+tg+"')";
          System.out.println(cadena);
          int a = conn.InsertaDatos(cadena);
          System.out.println(a);
          if(a!=1){
          return mapping.findForward("mal");
          }
          else{
          return mapping.findForward("bien");
          }
	    }
	    catch(Exception e)
       {
          e.printStackTrace();
          return (mapping.findForward("mal"));
       } 
      finally
      {
      conn.closeConnection();	
      }

    
//    return mapping.findForward("success");
  }
}
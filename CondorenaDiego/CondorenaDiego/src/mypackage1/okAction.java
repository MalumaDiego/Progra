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

import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.NamingException;
import oracle.jdbc.*;
import java.util.*;

public class okAction extends Action 
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
    okForm mf = (okForm) form;
    String boton = mf.getBoton();
    if (boton.equals("LISTA DE PRODUCTOS"))
    {
      System.out.println("Listado de productos ..");
      Connection cn = null;
      ConnectDB conn =new ConnectDB();
      ResultSet rsConsulta = null;
      try
      {
        cn = conn.conexion;
        String cadena = "select * from s_product order by 1";
        rsConsulta = conn.getData(cadena);
        ArrayList items = new ArrayList();
        while (rsConsulta.next())
        {
          ClaseDep item = new ClaseDep();
          item.setCodigo(rsConsulta.getString("id"));
          item.setNombre(rsConsulta.getString("name"));
          item.setDescr(rsConsulta.getString("SHORT_DESC"));
          item.setPrecio(rsConsulta.getString("SUGGESTED_WHLSL_PRICE"));
          items.add(item);
          System.out.println("Paso ..");
      }
      altaForm f = new altaForm ();	   
      f.setTabla(items);
      request.getSession().setAttribute("nn",f);
      return mapping.findForward("alta");
     }catch(Exception e){
        e.printStackTrace();
        return (mapping.findForward("mal"));
      }
      finally
      {
        conn.closeConnection();	
      }
    }
     if (boton.equals("LISTA DE JUGADORES"))
    {
      System.out.println("Listado de Jugadores ..");
      Connection cn = null;
      ConnectDB conn =new ConnectDB();
      ResultSet rsConsulta = null;
      try
      {
        cn = conn.conexion;
        String cadena = "select * from D_JUGADOR";
        rsConsulta = conn.getData(cadena);
        ArrayList items = new ArrayList();
        while (rsConsulta.next())
        {
          ClaseJug item = new ClaseJug();
          item.setIdju(rsConsulta.getString("idju"));
          item.setNombre(rsConsulta.getString("nombre"));
          item.setApp(rsConsulta.getString("apellido_paterno"));
          item.setApm(rsConsulta.getString("apellido_materno"));
          item.setTj(rsConsulta.getString("torneos_jugados"));
          item.setTg(rsConsulta.getString("torneos_ganados"));
          items.add(item);
          System.out.println("Paso ..");
      }
        JugadoresForm f = new JugadoresForm ();	   
        f.setTabla(items);
        request.getSession().setAttribute("nn",f);
      return mapping.findForward("jugadores");
     }catch(Exception e){
        e.printStackTrace();
        return (mapping.findForward("mal"));
      }
      finally
      {
        conn.closeConnection();	
      }
    }
     if (boton.equals("REGISTRO DE JUGADORES"))
    {
              Connection cn = null;
              ConnectDB conn =new ConnectDB();
              ResultSet rsConsulta = null;
              try
              {
                cn = conn.conexion;
                String cadena = "select * from D_JUGADOR order by 1";
                rsConsulta = conn.getData(cadena);
                ArrayList items = new ArrayList();
                while (rsConsulta.next())
                {
                  ClaseJug item = new ClaseJug();
                  item.setIdju(rsConsulta.getString("idju"));
                  item.setNombre(rsConsulta.getString("nombre"));
                  item.setApp(rsConsulta.getString("apellido_paterno"));
                  item.setApm(rsConsulta.getString("apellido_materno"));
                  item.setTj(rsConsulta.getString("torneos_jugados"));
                  item.setTg(rsConsulta.getString("torneos_ganados"));
                  items.add(item);
                  System.out.println("Paso ..");
              }  
              request.getSession().setAttribute("ayuda",items);
              return mapping.findForward("registro");
            }
	
              catch(Exception e)
              {
                e.printStackTrace();
                return (mapping.findForward("mala"));
              }
              finally
              {
                conn.closeConnection();	
              }

       }
  /*  if (boton.equals("SALIR")){
      return mapping.findForward("principal");
    }
    /*if (boton.equals("Lista de ordenes")){
      Connection cn = null;
      ConnectDB conn =new ConnectDB();
      ResultSet rsConsulta = null;
      try
      {
        cn = conn.conexion;
        String cadena = "select * from s_ord order by 1";
        rsConsulta = conn.getData(cadena);
        ArrayList items = new ArrayList();
        while (rsConsulta.next())
        {
          ClaseProducto item = new ClaseProducto();
          item.setCodigo(rsConsulta.getString("id"));
          item.setDescr(rsConsulta.getString("name"));
          items.add(item);
          System.out.println("Paso ..");
      }
      productosForm f = new productosForm ();	   
      f.setTabla(items);
      request.getSession().setAttribute("nn",f);
      return mapping.findForward("productos");
     }catch(Exception e){
        e.printStackTrace();
        return (mapping.findForward("mal"));
      }
      finally
      {
        conn.closeConnection();	
      }
     // 
    }*/
    return mapping.findForward("bien");
  }
}
package mypackage1;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class RegistroForm extends ActionForm 
{ 

  String idju;
  String nombre;
  String app ;
  String apm ;
  String tj ;
  String tg ;

  /**
   * Reset all properties to their default values.
   * @param mapping The ActionMapping used to select this instance.
   * @param request The HTTP Request we are processing.
   */
  public void reset(ActionMapping mapping, HttpServletRequest request)
  {
    super.reset(mapping, request);
  }

  /**
   * Validate all properties to their default values.
   * @param mapping The ActionMapping used to select this instance.
   * @param request The HTTP Request we are processing.
   * @return ActionErrors A list of all errors found.
   */
  public ActionErrors validate(ActionMapping mapping, HttpServletRequest request)
  {
    return super.validate(mapping, request);
  }

   public String getIdju()
  {
    return idju;
  }

  public void setIdju(String newIdju)
  {
    idju = newIdju;
  }

  public String getNombre()
  {
    return nombre;
  }

  public void setNombre(String newNombre)
  {
    nombre = newNombre;
  }

  public String getApp()
  {
    return app;
  }

  public void setApp(String newApp)
  {
    app = newApp;
  }

  
  public String getApm()
  {
    return apm;
  }

  public void setApm(String newApm)
  {
    apm = newApm;
  }


  public String getTj()
  {
    return tj;
  }

  public void setTj(String newTj)
  {
    tj = newTj;
  }
  public String getTg()
  {
    return tg;
  }

  public void setTg(String newTg)
  {
    tg = newTg;
  }

}
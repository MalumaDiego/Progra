function fParams( )
{
  var Mensaje = "";
  f = document.forms[0];
  
  if(EsVacio( f.usuario.value ))
    Mensaje = Mensaje + 'Verifique el Usuario \n';
  if(EsVacio( f.clave.value ))
    Mensaje = Mensaje + 'Verifique la Clave \n';
    
  if( Mensaje == "" )
    return true;
  else
  {
    alert( Mensaje );
    return false;
  }
}

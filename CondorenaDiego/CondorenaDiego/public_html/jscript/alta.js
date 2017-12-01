function fParams( )
{
alert("No registro");
  var Mensaje = "";
  f = document.forms[0];
  
  if(EsVacio( f.codigo.value ))
    Mensaje = Mensaje + 'Verifique el codigo \n';
  if(EsVacio( f.desc.value ))
    Mensaje = Mensaje + 'Verifique la Descripcion \n';
  if(EsVacio( f.region.value ))
    Mensaje = Mensaje + 'Verifique la Region \n';

  if( Mensaje == "" )
    return true;
  else
  {
    alert( Mensaje );
    return false;
  }
}

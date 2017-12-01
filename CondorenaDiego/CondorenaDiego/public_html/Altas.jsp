<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<link rel="stylesheet" href="css/estilos.css" type="text/css"/>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<script language="JavaScript" src="jscript/jquery.js"></script>
<script language="JavaScript" src="jscript/lbajas.js"></script>	
<title>
LISTADO DE PRODUCTOS
</title>
</head>

<body>
<h2>LISTADO DE PRODUCTOS</h2>
<div class="container">
  <table class="table">
    <thead>
     <tr>
          <th>Codigo</th>
          <th>Nombre</th>
          <th>Descripcion corta</th>
          <th>precio</th>
        </tr>
    </thead>
    <tbody>
       <logic:iterate id="tabla" indexId="index" name="nn" property="tabla">
         <tr>
          <td>  
          <html:submit property="cod">
            <bean:write name="tabla" property="codigo" />
          </html:submit>
          </td>
          <td><bean:write name="tabla" property="nombre" /></td>
          <td><bean:write name="tabla" property="descr" /></td>
          <td><bean:write name="tabla" property="precio" /></td>
      </tr>
    </logic:iterate>
    </tbody>
  </table>
</div>

<p><%= new java.util.Date() %></p>
</body>
</html>

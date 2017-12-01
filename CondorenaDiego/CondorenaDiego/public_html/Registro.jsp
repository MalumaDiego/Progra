<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
 <link rel="icon" href="../../favicon.ico">

    <title>Theme Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="../../dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Bootstrap theme -->
    <link href="../../dist/css/bootstrap-theme.min.css" rel="stylesheet">
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="../../assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="theme.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="../../assets/js/ie-emulation-modes-warning.js"></script>

    <title>Bootstrap 101 Template</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
  <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">TRABAJO TALLER DE PROGRAMACION</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="#">MENU DE ACTIVIDADES </a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>
     <div class="container theme-showcase" role="main">
 
      <div class="jumbotron">
       <h2>REGISTRO DE JUGADORES</h2>
      </div>
<!-- start header -->
<html:form action="/reg">
  <div class="form-row">
    <div class="form-group col-md-6">
      <label >Codigo</label>
     <input name="idju" type="text" class="form-control"  placeholder="Codigo">
    </div>
    <div class="form-group col-md-6">
      <label >Nombre</label>
     <input name="nombre" type="text" class="form-control"  placeholder="Nombre">
    </div>
    <div class="form-group col-md-6">
      <label >Apellido Paterno</label>
     <input name="app" type="text" class="form-control"  placeholder="Codigo">
    </div>
    <div class="form-group col-md-6">
      <label >Apellido Materno</label>
     <input name="apm" type="text" class="form-control"  placeholder="Codigo">
    </div>
    <div class="form-group col-md-6">
      <label >Torneos Jugados</label>
     <input name="tj" type="text" class="form-control"  placeholder="Codigo">
    </div>
    <div class="form-group col-md-6">
      <label >Torneos Ganados</label>
     <input name="tg" type="text" class="form-control"  placeholder="Codigo">
    </div>
  <button type="submit" class="btn btn-primary">Registrar</button>
</html:form>

<div id="footer">
	<p>&copy;2017 Todos los derechos reservados Universidad Catolica Boliviana "San Pablo" </p>
</div>
</body>
</html>

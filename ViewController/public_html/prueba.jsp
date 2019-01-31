<!DOCTYPE html>
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ page import="com.prueba.vo.EquipoVO"%>
<%
 HttpSession sesion=request.getSession(false);//Creear objeto
 EquipoVO equipo=new EquipoVO();
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
        <title>prueba</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
              integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
              crossorigin="anonymous"/>
    </head>
    <body>
        <div class="container">
            <h1 align="Center">Prueba de Servlets</h1>
             
            <form action="<%= request.getContextPath()%>/pruebaser" role="form" autocomplete="off" method="POST">
                <label for="Nombre">Nombre</label>
                <input type="text" class="form-control" name="nombre" placeholder="Introduce tu nombre" id="nombre"/>
                <label for="Edad">Edad</label>
                <input type="text" class="form-control" name="edad" id="edad" placeholder="Tu edad"/>
                <label for="Sexo">Sexo</label>
                <input type="text" class="form-control" name="sexo" placeholder="Masculino, Femenino" id="sexo"/>
                <button type="submit" class="btn btn-success mt-2 btn-block">Aceptar</button>
            </form>
        </div>
    </body>
</html>
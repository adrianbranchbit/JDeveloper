<!DOCTYPE html>
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ page import="com.prueba.vo.EquipoVO"%>
<%
 HttpSession sesion=request.getSession(false);//Creear objeto
 EquipoVO equipo=(EquipoVO) sesion.getAttribute("equipo");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
        <title>prueba2</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    </head>
    <body>
        <table style="border: 1px solid red;" class="table table-sm">
            <thead>
                <tr>
                    <th>Nombre</th>
                    <th>Edad</th>
                    <th>Sexo</th>
                </tr>
            </thead>
             
            <tbody>
                <tr>
                    <td><%=equipo.getNombre()%></td>
                    <td><%=equipo.getEdad()%></td>
                    <td><%=equipo.getSexo()%></td>
                </tr>
                <tr>
                    <td>Julio Cesar</td>
                    <td>Jeronimo Elizondo</td>
                    <td>25</td>
                </tr>
                <tr>
                    <td>Edwin Eduardo Javier</td>
                    <td>Toledo Mejia</td>
                    <td>27</td>
                </tr>
                <tr>
                    <td>Usuario prueba</td>
                    <td>para Git</td>
                    <td>3</td>
                </tr>
            </tbody>
        </table>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
    </body>
</html>
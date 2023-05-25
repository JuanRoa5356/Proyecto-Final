<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Torneo de Voleibol</title>
    <link href="index.css" rel="stylesheet" type="text/css"/>
</head>
<body>
        <%
            String nombre = (String) request.getSession().getAttribute("nombreE");
        %>
        <h2>Datos Equipos</h2><br>
        <table>
            <tr>
                <th>Team Name</th>
                <th>Jugadores</th>
                <th>Categoria</th>
                <th>Aficionados</th>
                <th>Patrocinador</th>
                
            </tr>
               <%= nombre%>
            
        </table>
        <table>
      
        </table>
            <form method="POST" action="index.html">
            <button type="submit">Registrar un nuevo equipo</button>
            </form>
            
            <form method="POST" action="jugadores.jsp">
            <button id="btn" type="btn">Agregar jugadores</button>
            </form>           
</body>
</html>

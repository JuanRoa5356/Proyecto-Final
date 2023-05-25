<%-- 
    Document   : Jugadores
    Created on : 23/05/2023, 7:13:23 p. m.
    Author     : juanc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
            <h1>Jugadores</h1>
    <table>
        <tr>
            <th>ID</th>
            <th>Elementos</th>
        </tr>
        <% List<GrupoDatos> datos = (List<GrupoDatos>) session.getAttribute("datos");
           if (datos != null) {
               for (GrupoDatos grupo : datos) { %>
                   <tr>
                       <td><%= grupo.getId() %></td>
                       <td>
                           <ul>
                               <% for (Object elemento : grupo.getElementos()) { %>
                                   <li><%= elemento %></li>
                               <% } %>
                           </ul>
                       </td>
                   </tr>
               <% }
           } %>
    </table>
            
            <label for="nombre">Nombre:</label><br>
            <input type="text" id="nombrej" name="nombrej" placeholder="Ingrese texto aquí" autocomplete="off"><br><br>
            
            <label for="peso">Peso:</label><br>
            <input type="text" id="peso" name="peso" placeholder="Ingrese valor aqui:" autocomplete="off"><br><br>
            
            <label for="estatura">Estatura:</label><br>
            <input type="text" id="estatura" name="estatura" placeholder="Ingrese valor aqui:" autocomplete="off"><br><br>
            
            <label for="CC">Numero de identificacion:</label><br>
            <input type="text" id="CC" name="CC" placeholder="Ingrese valor aqui:" autocomplete="off"><br><br>
            
            <label for="puntos">Numero de puntos:</label><br>
            <input type="text" id="puntos" name="puntos" placeholder="Ingrese valor aqui:" autocomplete="off"><br><br>
            
    </body>
</html>

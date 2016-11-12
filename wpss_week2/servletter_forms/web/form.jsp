<%-- 
    Document   : form
    Created on : 10-11-2016, 22:08:37
    Author     : pefl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name='viewport' content='width=device-width, initial-scale=1.0'>
        <title>JSP form</title>
        <LINK REL='StyleSheet' HREF='css/styles.css' TYPE='text/css'>
    </head>
    <body>
        
            
           <div id="menubar">
            <h2 id="navnmenu"><%= request.getParameter("fornavn")%></h2>
           </div>
            
            <h1>JSP som viser data fra bruger </h1>
            <div>
           <table><tr>
            <th>Fornavn</th>
            <th>Efternavn</th>
            <th>By</th>
            <th>Email</th>
            <th>Mobil</th>
            <th>Fødselsår</th>
            <th>Køn</th>
            <th>Beskrivelse</th>
            </tr>
            <tr>
            <td><%= request.getParameter("fornavn")%></td>
            <td><%= request.getParameter("efternavn")%></td>
            <td><%= request.getParameter("by")%></td>
            <td><%= request.getParameter("email")%></td>
            <td><%= request.getParameter("mobil")%></td>
            <td><%= request.getParameter("fodselsar")%></td>
            <td><%= request.getParameter("kon")%></td>
            <td><%= request.getParameter("beskrivelse")%></td>
            </tr></table>
            <br></div>
        
            
            <div>
                <img src="<%= request.getParameter("link_til_billede")%>" width ="40%" height ="40%" alt = "Billede mangler">
               </div>
              
      
       
       
        
    </body>
</html>

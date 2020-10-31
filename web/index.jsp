<%-- 
    Document   : index
    Created on : 11/10/2020, 01:01:36 PM
    Authors     : OurParentsMistakes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style type="text/css"> 
        <!--
            body{ background: url(Imagenes/login.png) no-repeat ;
              background-size: 1360px 700px
            } 
          ->
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
    </head>
    <body>
        <br><br><br><br><br><br><br><br><br> <br><br> <br><br>      
    <form action ="DefaultServlet" method ="post"><form>
            <label  for ="username">      
                  <h3 align="center"><font color="white"></font>&nbsp
                        <input type="text"name ="username" style="width:200px;height:35px" align = "center" size="25" maxlength="30" value="Usuario" name="textUsuario"></h3></p><br> 
            </label>
            <br>
            <label> 
                <h3 align="center"><font color="white"></font>&nbsp
                    <input  type="password" name ="password"style="width:200px;height:35px" align = "center" size="25"  maxlength="30" value="Contraseña" name="textContraseña"></h3></p>
            </label>
       
                         
            <input type ="hidden" name ="option" value="1">
            <input type="submit" value ="Ingresar">
        
                         <div align="center"><a href="MenuPrincipal.jsp"><img src="Imagenes/Icons&imgs/ingresar.png" style="width: 300px;height: 40px"></a></div>
        </form>
    </body>
</html>

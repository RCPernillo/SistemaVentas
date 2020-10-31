/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.postgresql.Driver;

@WebServlet(urlPatterns = {"/DefaultServlet"})
public class DefaultServlet extends HttpServlet {
    private final String dbUrl= "jdbc:postgresql://172.107.32.135:14642/proyecto3";
    private final String dbUser= "user";
    private final String dbPassword="12345678";
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        int option = Integer.valueOf(request.getParameter("option"));
        Connection con = null;
            Connection conn = null;
  try {
                con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
                System.out.println("La conexion a la BD PostgreSQL fue exitosa");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                response.sendRedirect("index.jsp?error=0&text=" + e.getMessage());
            }
        String username = request.getParameter("username");
        String password = request.getParameter("password");       
        //boolean logeado =(boolean) request.getSession().getAttribute("loggeado");
    /*  if(con!=null){
        switch(option){
                    case 1: //Login
                try{   
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery("Select id from usuario Where username like ' "+username+ " 'and contrasena like ' "+password+" ' ");
                    rs.next();
                    
                    if(rs.getInt(1)>=0){
                          request.getSession().setAttribute("Loggeado:",true);
                          response.sendRedirect("MenuPrincipal.jsp");
                    }else{
                         request.getSession().setAttribute("Loggeado:",true);
                          response.sendRedirect("index.jsp?error=true");
                    }
                    } catch (SQLException e) {
                         request.getSession().setAttribute("Loggeado:",true);
                          response.sendRedirect("index.jsp?error=2&text="+ e.getMessage()+"&username= "
                                  +  username + "&pass= "+password);
                          }
                    break;
                    default:
                    response.sendRedirect("index.jsp"); 
               //     Logger.getLogger(DefaultServlet.class.getName()).log(Level.SEVERE, null, ex);
                
                } 
      }else{
          request.getSession().setAttribute("loggeado",false);
          response.sendRedirect("index.jsp?error=true&text=No database connection");
      }*/
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DefaultServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DefaultServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
       
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
 public Connection conectar(){
            Connection conn = null;
            try{
                conn=DriverManager.getConnection(dbUrl, dbUser, dbPassword);
                System.out.println("La conexion a postgres fue exitosa");
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        return conn;
        }
}

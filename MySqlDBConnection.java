import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/userdb";
    private static final String USER = "root";
    private static final String PASSWORD = "password";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName(DRIVER);
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}


// Welcome jsp

// <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
// <%@ page import="javax.servlet.http.HttpSession" %>
// <!DOCTYPE html>
// <html>
// <head>
//     <meta charset="ISO-8859-1">
//     <title>Welcome</title>
// </head>
// <body>
//     <h2>Welcome, <%= session.getAttribute("username") %>!</h2>
//     <a href="LogoutServlet">Logout</a>
// </body>
// </html>

// logout.java

// import java.io.IOException;
// import javax.servlet.ServletException;
// import javax.servlet.annotation.WebServlet;
// import javax.servlet.http.HttpServlet;
// import javax.servlet.http.HttpSession;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;

// @WebServlet("/LogoutServlet")
// public class LogoutServlet extends HttpServlet {
//     private static final long serialVersionUID = 1L;

//     protected void doGet(HttpServletRequest request, HttpServletResponse response) 
//             throws ServletException, IOException {
//         HttpSession session = request.getSession(false);
//         if (session != null) {
//             session.invalidate();
//         }
//         response.sendRedirect("login.jsp");
//     }
// }


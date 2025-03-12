import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Hardcoded admin credentials
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin123";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (ADMIN_USERNAME.equals(username) && ADMIN_PASSWORD.equals(password)) {
            // Login successful - start a session
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("welcome.jsp");
        } else {
            // Login failed - redirect back to login page with error
            response.sendRedirect("login.jsp?error=Invalid username or password");
        }
    }
}


// welcome.jsp
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
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;
// import javax.servlet.http.HttpSession;

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

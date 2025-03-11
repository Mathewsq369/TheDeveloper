
package com.studentmanager.servlets;

import java.io.IOException;

import com.studentmanager.models.User;
import com.studentmanager.services.LoginService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
/**
 *
 * @author s1gm9
 */
@WebServlet(name = "loginServlet", urlPatterns = {"/loginServlet"})
public class loginServlet extends HttpServlet {
    
    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String instructorID = request.getParameter("instructor-id");
        String password = request.getParameter("password");
        LoginService loginService= new LoginService();
        User user=loginService.validateuser(instructorID, password);
        if(user != null ){
            HttpSession session = request.getSession();
            session.setAttribute("user",user);
            response.sendRedirect("home.jsp");
        }
        else{
            request.setAttribute("errorMessage","Invalid instructor Id or password");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}
package com.ibm.training;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormServlet
 */
@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().println("Name is"+request.getParameter("userName"));
		response.getWriter().println("Gender is"+request.getParameter("gender"));
		response.getWriter().println("Favorite car is"+request.getParameter("car"));
		response.getWriter().println("User is satisfied with the form?"+request.getParameter("choice"));
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}

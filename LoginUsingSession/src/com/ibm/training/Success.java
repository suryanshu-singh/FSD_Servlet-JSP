package com.ibm.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Success
 */
@WebServlet("/Success")
public class Success extends HttpServlet {


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (request.getSession().getAttribute("userName") != null) {
		PrintWriter out = response.getWriter();
		out.println("<html><body background=\"abc.jpg\">");
		out.println("<h4>Welcome :"+ request.getSession().getAttribute("userName")+"</h4>");
		out.println("<form action=\"Logout\" method=\"post\">");
		out.println("<input type = \"submit\"> Logout!!");
		out.println("</form>");
	}
		else {
			response.sendRedirect("index.html");
		}
	}


}

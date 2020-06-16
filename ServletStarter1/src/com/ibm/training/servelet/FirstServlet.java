package com.ibm.training.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/First")
public class FirstServlet extends HttpServlet {
	
	//This method is called automatically by the servelet container or web server when we hit the get request
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		System.out.println("Servlet Called...");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>We are printing on browser now...</h1>");
		out.println("</body></html>");
	}
	// Get a reference to the Writer
	//HttpServletResponse response;
	
}

package com.ibm.training;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();

		String name = request.getParameter("name");
		String pass = request.getParameter("password");
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection dbCon = null;
		try {
			dbCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/system?serverTimezone=IST", "root", "");
			System.out.println("Connected for login");
		} catch (SQLException e) {
			System.out.println("Failed to connect");
			e.printStackTrace();
		}

		String fetchQry = "select * from user";
		Statement stmt1;
		try {
			boolean flag = true;
			stmt1 = dbCon.createStatement();
			ResultSet rs = stmt1.executeQuery(fetchQry);
			while (rs.next()) {
				if (rs.getString("userName").equalsIgnoreCase(name)
						&& rs.getString("password").equalsIgnoreCase(pass)) {
					PrintWriter out = response.getWriter();
					out.println("Into the condition");
					session.setAttribute("userName", name);
					flag = false;
					break;
				}
			}
			if (flag) {
				response.getWriter().print("Invalid username...");
				response.sendRedirect("index.jsp");
			}
			else {
				response.sendRedirect("Success.jsp");
			}
			

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}

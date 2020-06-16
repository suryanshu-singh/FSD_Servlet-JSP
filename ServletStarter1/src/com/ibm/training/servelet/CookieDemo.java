package com.ibm.training.servelet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookieDemo")
public class CookieDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// create a cookie
		Cookie myCookie = new Cookie("user","ibm_user");
		// set the cookie expiry
		myCookie.setMaxAge(3600);
		// add this cookie to the response
		response.addCookie(myCookie);
		
		response.getWriter().println("Value from cookie is:"+ myCookie.getValue());
	}

}

package com.demo.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class CookieDemoServlet
 */
@WebServlet("/cookiedemo")
public class CookieDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cname= request.getParameter("name");
		String val=request.getParameter("cval");
		String btn=request.getParameter("btn");
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		switch(btn) {
		case "add"->{
			//add cookie on client machine
			Cookie c= new Cookie(cname,val);
			response.addCookie(c);
			out.println("<h1>Cookie added Successfully...!!!<h1>");
		}
		
		case "del"-> {
			Cookie[] carr=request.getCookies();
			for(Cookie c:carr) {
				if (c.getName().equals(cname)) {
					//delete the cookie
					c.setMaxAge(0);
					response.addCookie(c);
					break;
				}
			}
			out.println("<h1> Cookie Deleted Successfully...!!!<h1>");
		}
		case "show"->{
			//Display All Cookie 
			Cookie [] carr=request.getCookies();
			for(Cookie c:carr) {
				out.println(c.getName()+"-------"+c.getValue());
			}
		}
		}
		RequestDispatcher rd = request.getRequestDispatcher("Cookies.html");
		rd.include(request, response);
	}

}

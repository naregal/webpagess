package com.prodapt.tom.serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Extend HttpServlet class
@WebServlet("/hello")
public class HelloWorld extends HttpServlet {
	/**
	*
	*/
	private static final long serialVersionUID = 1L;
	private String message;

	@Override
	public void init() throws ServletException {
// Do required initialization
		message = "Hello World!";
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// Set response content type
		response.setContentType("text/html");

		// Actual logic goes here.
		PrintWriter out = response.getWriter();
		out.println("<h1>" + message + "</h1>");
	}

	@Override
	public void destroy() {
// do nothing.
	}
}
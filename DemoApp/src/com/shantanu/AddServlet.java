package com.shantanu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7710445588363592566L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		PrintWriter out = res.getWriter();
		
		res.getWriter().println("result is " + k);
	}
}

package com.phenix;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ComputeSum extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		PrintWriter out = res.getWriter();
		int i, j, sum;
		i = Integer.parseInt(req.getParameter("n1"));
		j = Integer.parseInt(req.getParameter("n2"));
		
		sum = i + j;
		out.println("The sum is ::"+sum);
		
		//calling another servlet
		//two methods are there
		//1. RequestDispacher
		//2. Redirect
		
		//data can be shared b/w two servers by session management
		req.setAttribute("sum", sum);
		
		RequestDispatcher rd = req.getRequestDispatcher("square");
		rd.forward(req, res);
		
	}
}
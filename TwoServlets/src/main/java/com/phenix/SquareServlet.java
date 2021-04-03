package com.phenix;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SquareServlet extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		PrintWriter out = res.getWriter();
		
		int k = (int)req.getAttribute("sum");
		int sq = k * k;
		
		out.println("Square of sum is "+sq);
	}
}

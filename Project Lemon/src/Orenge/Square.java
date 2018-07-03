package Orenge;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Square extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		service (req,res);
		
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		service (req,res);
		
	}
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		PrintWriter out = res.getWriter();
		out.println("Welcome to Square servlet");
	}

}

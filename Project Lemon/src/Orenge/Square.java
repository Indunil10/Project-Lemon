package Orenge;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Square extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		service (req,res);
		
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		service (req,res);
		
	}
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		//int squar = (int)(req.getAttribute("squ"));
		
		HttpSession session = req.getSession();
		
		int squar = (int)session.getAttribute("squ");
		
		PrintWriter out = res.getWriter();
		out.println("Square of sum :" + squar);
	}

}

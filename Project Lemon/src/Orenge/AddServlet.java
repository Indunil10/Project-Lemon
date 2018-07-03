package Orenge;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		service (req,res);
		
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		service (req,res);
		
	}
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int x,y,sq,sum;
		
		x = Integer.parseInt(req.getParameter("num1"));
		y = Integer.parseInt(req.getParameter("num2"));
		
		sum = x + y;
		
		//PrintWriter out = res.getWriter();
		
		//out.println("Sum is : " + sum);
		
		sq = sum * sum;
		//req.setAttribute("squ", sq);
		
		//RequestDispatcher rd = req.getRequestDispatcher("square");
		//rd.forward(req, res);
		
		//res.sendRedirect("square?squ="+sq);
		
		HttpSession session = req.getSession();
		
		session.setAttribute("squ", sq);
		
		res.sendRedirect("square");
	}
}

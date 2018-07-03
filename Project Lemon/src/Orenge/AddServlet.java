package Orenge;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int x,y,sum;
		
		x = Integer.parseInt(req.getParameter("num1"));
		y = Integer.parseInt(req.getParameter("num2"));
		
		sum = x + y;
		
		PrintWriter out = res.getWriter();
		
		out.println("Sum is : " + sum);
	}
}

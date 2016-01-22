package com.example.trophy;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Trophy
 */
@WebServlet("/Trophy")
public class Trophy extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Trophy() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try {
			out.println("<html>");
			out.println("<h2>");
			Enumeration e=request.getParameterNames();
			
				int x=Integer.parseInt(request.getParameter("txt2"));
				int y=Integer.parseInt(request.getParameter("txt3"));
				int s=x+y;
				out.println("<h1>Price:=</h1>"+s);
			
		} catch (Exception e) {
			out.println("PLEASE ENTER VALID AMOUNT...");
		}
		out.println("</h2>");
		out.println("<html>");
	}

}

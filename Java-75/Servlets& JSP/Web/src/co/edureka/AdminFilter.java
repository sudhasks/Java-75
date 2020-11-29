package co.edureka;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/admin")
//@WebFilter("/*")
public class AdminFilter implements Filter 
{
	public void init(FilterConfig fConfig) throws ServletException {}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		
		out.println("<h2 style=text-align:center;margin:100px auto>");
		out.println("Server under maintenance!!!<br><br> We will be back @ 01.00AM</h2>");
		/*
		out.println("<h2>Pre-Processing</h2>");
		String uid = request.getParameter("uid");
		String pwd = request.getParameter("pwd");
		
		if(uid.equals("admin") && pwd.equals("123"))
			chain.doFilter(request, response);
		else {
			RequestDispatcher rd = request.getRequestDispatcher("Login.html");
			rd.include(request, response);		
		}
		out.println("<h2>Post-Processing</h2>");
		*/
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

}

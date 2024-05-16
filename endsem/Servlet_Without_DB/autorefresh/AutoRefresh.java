package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AutoRefresh")
public class AutoRefresh extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Set refresh, autoload time as 1 seconds
        response.setIntHeader("Refresh", 1);

        // Set response content type
        response.setContentType("text/html");
  
        PrintWriter out = response.getWriter();
    
        out.println("<h1 align='center'>Auto Refresh Page</h1><hr>");
        java.util.Date date = new java.util.Date();
        out.println("<h2>"+"Current Date & Time: " +date.toString()+"</h2>");
	}


}

package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/insert")
public class insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String rollno=request.getParameter("rollno");
		int mark1=Integer.parseInt(request.getParameter("mark1"));
		int mark2=Integer.parseInt(request.getParameter("mark2"));
		int total=mark1+mark2;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","root");
			PreparedStatement ps=con.prepareStatement("insert into details values(?,?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, rollno);
			ps.setInt(3, mark1);
			ps.setInt(4,mark2);
			ps.setInt(5, total);
			
			int i=ps.executeUpdate();
			if(i>0) {
				out.println("<h1>successfully updated</h1>");
			}
			else {
				out.println("<h1>failed</h1>");
		
			}
			
		PreparedStatement ps1=con.prepareStatement("select * from details");
		ResultSet rs=ps1.executeQuery();
		
		out.println("<h1> showing all the details</h1>");
		out.println("<table border=2>");
		out.println("<tr>");
		out.println("<th>NAME</th>");
		out.println("<th>ROLLNO</th>");		
		out.println("<th>MARK1</th>");
		out.println("<th>MARK2</th>");
		out.println("<th>TOTAL</th>");
		out.println("</tr>");
		
		while (rs.next()){
			name=rs.getString("name");
			rollno=rs.getString("rollno");
			mark1=rs.getInt("mark1");
			mark2=rs.getInt("mark2");
			total=rs.getInt("total");
			
			out.println("<tr>");
			out.println("<td>"+name+"</td>");
			out.println("<td>"+rollno+"</td>");
			out.println("<td>"+mark1+"</td>");
			out.println("<td>"+mark2+"</td>");
			out.println("<td>"+total+"</td>");
			out.println("</tr>");
			
		
			
			
		}
		
		
			}
		catch(Exception e) {
			e.printStackTrace();
			out.println(e.getMessage());
		}
			}
		
		
	}



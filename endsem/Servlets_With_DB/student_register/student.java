package servlet;

import java.io.*;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/student")
public class student extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("sname");
		String roll = request.getParameter("roll");
		int m1 = Integer.parseInt(request.getParameter("m1"));
		int m2 = Integer.parseInt(request.getParameter("m2"));
		int m3 = Integer.parseInt(request.getParameter("m3"));
		int m4 = Integer.parseInt(request.getParameter("m4"));
		int m5 = Integer.parseInt(request.getParameter("m5"));
		
		int total = m1+m2+m3+m4+m5;
		double gpa = (double) total/50;
		String grade;
		
		if(gpa>9) {
			grade = "O";
		}
		else if(gpa>8) {
			grade = "A";
		}
		else if(gpa>7) {
			grade = "B";
		}
		else if(gpa>6) {
			grade = "C";
		}
		else if(gpa>5) {
			grade = "D";
		}
		else {
			grade = "F";
		}
		
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			 PreparedStatement ps=con.prepareStatement("insert into marks values(?,?,?,?,?,?,?,?,?,?)"); 
			 ps.setString(1, name);
			 ps.setString(2, roll);
			 ps.setInt(3, m1);
			 ps.setInt(4, m2);
			 ps.setInt(5, m3);
			 ps.setInt(6, m4);
			 ps.setInt(7, m5);
			 ps.setInt(8, total);
			 ps.setDouble(9, gpa);
			 ps.setString(10, grade);
			 
			 int i = ps.executeUpdate();
			 if(i>0) {
				 out.println("<h3>Value added Succesfully</h3>");
			 }
			 else {
				 out.println("<h1>Error Occured</h1>");
			 }
			 
			 PreparedStatement ps1 = con.prepareStatement("select * from marks");
			 ResultSet rs = ps1.executeQuery();
			 
			 out.println("<h1>Available Students</h1>");
			 out.println("<table border=1>");
			 out.println("<tr>");
			 out.println("<th>Name</th>");
			 out.println("<th>Roll</th>");
			 out.println("<th>Mark1</th>");
			 out.println("<th>Mark2</th>");
			 out.println("<th>Mark3</th>");
			 out.println("<th>Mark4</th>");
			 out.println("<th>Mark5</th>");
			 out.println("<th>Total</th>");
			 out.println("<th>GPA</th>");
			 out.println("<th>Grade</th>");
			 out.println("</tr>");
			 
			 while(rs.next()) {
				 name = rs.getString("sname");
				 roll = rs.getString("roll");
				 m1 = rs.getInt("mark1");
				 m2 = rs.getInt("mark2");
				 m3 = rs.getInt("mark3");
				 m4 = rs.getInt("mark4");
				 m5 = rs.getInt("mark5");
				 total = rs.getInt("total");
				 gpa = rs.getDouble("gpa");
				 grade = rs.getString("grade");
				 
				 out.println("<tr>");
				 out.println("<td>"+name+"</td>");
				 out.println("<td>"+roll+"</td>");
				 out.println("<td>"+m1+"</td>");
				 out.println("<td>"+m2+"</td>");
				 out.println("<td>"+m3+"</td>");
				 out.println("<td>"+m4+"</td>");
				 out.println("<td>"+m5+"</td>");
				 out.println("<td>"+total+"</td>");
				 out.println("<td>"+gpa+"</td>");
				 out.println("<td>"+grade+"</td>");
				 out.println("</tr>");
			 } 	 
			 
		}
		catch(Exception e) {
			e.printStackTrace();
		}	
		out.println("<br><br><a href=\"index.html\">Go Back</a>"); //here \" is escape sequence.. instead of ", we give \"
	}
}

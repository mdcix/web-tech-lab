package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Session")
public class Session extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // Create a session object if it is already not  created.
        HttpSession session = request.getSession(true);
        // Get session creation time.
        java.util.Date createTime = new java.util.Date(session.getCreationTime());
        // Get last access time of this web page.
        java.util.Date lastAccessTime = new java.util.Date(session.getLastAccessedTime());
  
        String title = "Welcome Back to my website";
        int visitCount = 0;
        String visitCountKey = new String("visitCount");
        String userIDKey = new String("userID");
        String userID = new String("Karthik");

        // Check if this is new comer on your web page.
        if (session.isNew())
       {
            title = "Welcome to my website";
            session.setAttribute(userIDKey, userID);
       }
       else
       {
            visitCount = (Integer)session.getAttribute(visitCountKey);
            visitCount = visitCount + 1;
            userID = (String)session.getAttribute(userIDKey);
       }
       session.setAttribute(visitCountKey,  visitCount);

       // Set response content type
       response.setContentType("text/html");
       PrintWriter out = response.getWriter();
       
        out.println("<h1 align=\"center\">" + title + "</h1>");
        out.println("<h2 align=\"center\">Session Infomation</h2>");
        out.println("<table border=\"1\" align=\"center\">");
        out.println("<tr bgcolor=\"#eadf8c\">");
        out.println("<th>Session info</th><th>value</th></tr>");
        out.println("<tr>");
        out.println("<td>id</td>");
        out.println("<td>" + session.getId() + "</td></tr>");
        out.println("<tr>");
        out.println("<td>Creation Time</td>");
        out.println("<td>" + createTime);
        out.println("</td></tr>");
        out.println("<tr>");
        out.println("<td>Time of Last Access</td>");
        out.println("<td>" + lastAccessTime);
        out.println("</td></tr>");
        out.println("<tr>");
        out.println("<td>User ID</td>" );
        out.println("<td>" + userID);
        out.println("</td></tr>");
        out.println("<tr>");
        out.println("<td>Number of visits</td>");
        out.println("<td>" + visitCount + "</td></tr>");
        out.println("</table>");
        out.println("</body></html>");
	}
}

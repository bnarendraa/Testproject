import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.task8.dao.Hi;

/**
 * Servlet implementation class servlet1
 */
@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 response.setContentType("text/html"); 
		 PrintWriter pw=response.getWriter();	
		 int i = Integer.parseInt(request.getParameter("id"));
		 String userName = request.getParameter("userName");
	     String password = request.getParameter("password1");
	     String email = request.getParameter("email");
	     String ph = request.getParameter("phone");
	     String city = request.getParameter("city"); 
	   
	     Hi a1 = new Hi();
	     if(a1.addUserDetails(i,userName, password, email, ph, city)) {
	         pw.println("saved...");}
	         else
	         {
	        	 pw.println("not inserted...");
	     }
	     pw.close();
	     }
}
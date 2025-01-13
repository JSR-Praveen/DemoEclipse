package jsr;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;


public class LoginServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String uname = request.getParameter("txtId");
		String upass = request.getParameter("txtPass");
		
		if (uname.equals("admin") && upass.equals("12345")) 
		{
			out.println("<body bgcolor=blue >");
			out.println("<h1> Welcome !!! " + uname + "</h1>");
			
		} 
		else
		{
			out.println("<body bgcolor=red >");
			out.println("<h1> Login Fail !!! </h1>");
		}
		out.println("</body></html>");
	}
}

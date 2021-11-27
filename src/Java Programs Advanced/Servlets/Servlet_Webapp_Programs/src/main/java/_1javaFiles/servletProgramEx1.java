package _1javaFiles;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servletProgramEx1
 */
@WebServlet("/servletProgramEx1")
public class servletProgramEx1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletProgramEx1() {
        super();
        // TODO Auto-generated constructor stub
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//System.out.println("\nHello To Servlet"); //line to print the data in 'console'
		response.getWriter().println("Hello Servlet"); // line to print the data in 'browser'	
		response.getWriter().println("Data Displaying To The Browser Using JAVA");
		response.getWriter().println("---------------------------------");
		response.getWriter().println("Name: Nandan");
		response.getWriter().println("USN: 1KI17CS041");
		response.getWriter().println("Email: gnnandan7@gmail.com");
		response.getWriter().println("Phone: 1111111111");
		
		
	}
}

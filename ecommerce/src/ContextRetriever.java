

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ContextRetriever")
public class ContextRetriever implements Servlet 
{


	
	public void init(ServletConfig config) throws ServletException {
		
		ServletContext context=config.getServletContext();
		String dburl=(String) context.getAttribute("dburl");
		System.out.println("dburl   in init is "+dburl);
		
	}

	
	public void destroy() {
		
	}

	
	public ServletConfig getServletConfig() {
		
		return null;
	}

	
	public String getServletInfo() {
		
		return null; 
	}

	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		ServletContext context=request.getServletContext();
		String dburl=(String) context.getAttribute("dburl");
		System.out.println("dburl   in service is "+dburl);
	}

}

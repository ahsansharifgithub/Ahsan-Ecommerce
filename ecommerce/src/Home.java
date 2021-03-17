

import java.io.IOException;
import java.util.Enumeration;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import db.DatabaseManager;

//javax.servlet is a Inbuilt Package = has several classes and interfaces needed to work with servlets 
//The different Interfaces are servlet,  servletRequest, servletResponse, servletConfig, servletContext
//To create servlet we need to implement Servlet Interface.


//life cycleof a servlet
//	1) After Tomcat gets hold of a recent servlet object, it calls init() only once throughout the 
//	lifrecycle of servlet object.
//	2) For every consecuent call the service() is called.
//	3)destroy() is called whenever servlet object will be garbage collected
public class Home implements Servlet
{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("inisde Destroy");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		
		//Initialisation code should be put in init().
		
		System.out.println("inside init");
		String dburl=config.getInitParameter("dburl");
		//System.out.println("dburl is"+dburl);
		
		Enumeration<String> e=config.getInitParameterNames();
		ServletContext context=config.getServletContext();
		while(e.hasMoreElements())
		{
			String name=e.nextElement();
			String value=config.getInitParameter(name);
			System.out.println("name is = "+name+"value is = "+value);
			
			context.setAttribute(name, value); //"ServletContext Object is shared among all the sevlets&JSP's".
			
		}
		//Loading JDBC Driver here:
		
		String dbdriver=(String)context.getAttribute("dbdriver");
		DatabaseManager.loadDriver(dbdriver);
		
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("inside Service");
		 
		RequestDispatcher rd= req.getRequestDispatcher("home.jsp");
				rd.include(req, res);
		
	}
	
}
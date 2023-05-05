package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utilites.JpaUtil;
import model1.Student;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		//Object getAttribute();
		String name= (String) request.getAttribute("user-key");
		String password=(String) request.getAttribute("user-password");*/
		
		String name = request.getParameter("p1");
		System.out.println(name);
		String[] n=name.split("//s");
		String uname="";
		for(String s: n)
		{
			uname=uname+s;
		}
		String password=request.getParameter("p2");
		System.out.println(password);
		PrintWriter pw=response.getWriter();
		 
		EntityManager em=JpaUtil.getEntityManager();
		Query query = em.createQuery("select s from Student s");
		List<Student> list = query.getResultList();
		 
		int flag= 0;
		for(Student s: list)
		{
			String userName=s.getName();
			String userPassword=s.getPassword();
			if(name.equals(userName) && password.equals(userPassword))
			{
				flag=1;
				break;
			}
		}
	
		System.out.println("Thanks for rgistration");
		if(flag==1 && name!=null && password!=null) {
			
			System.out.println("Hi");
			System.out.println((char)32);
			//creating two objects of Cookie 
			Cookie nameCookie = new Cookie("uname", uname.trim());
			Cookie passwordCookie=new Cookie("pass", password.trim());
			
			//I am adding age of cookie in second
			nameCookie.setMaxAge(24*60*60);
			passwordCookie.setMaxAge(24*60*60);
			
			//adding these both cookie object with response hea
			response.addCookie(nameCookie);
			response.addCookie(passwordCookie);
			
			response.sendRedirect("next.jsp");
		}
		else {
			response.sendRedirect("login.jsp");
		}
		//pw.println("your password is"+ " "+ password);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}

package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utilites.JpaUtil;

/**
 * Servlet implementation class DeleteServlet
 */
//@WebServlet(value="/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int rollNo=Integer.parseInt(request.getParameter("p3"));
		System.out.println(" "+rollNo);
		EntityManager em=JpaUtil.getEntityManager();
		Query q=em.createQuery("delete from Student s where s.rollNo=:p1");
		
		q.setParameter("p1", rollNo);
		
		em.getTransaction().begin();
		int status=q.executeUpdate();
		em.getTransaction().commit();
		
		if(status>0)
		{
			response.sendRedirect("view.jsp");
		}
		else {
			PrintWriter out= response.getWriter();
			out.println("<h1>Error in Deleting </h1>");
			
		}
		
		
	}

	

}

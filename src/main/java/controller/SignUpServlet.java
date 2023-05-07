package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model1.Student;
import utilites.JpaUtil;

/**
 * Servlet implementation class SignUpServlet
 */
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
     PrintWriter out=response.getWriter();
     response.setContentType("text/html");
     out.println("Click Here To Login ");
     //getParameter(String parameterName) -- return String as parameter value
     String name=request.getParameter("t1");
     String dob= request.getParameter("t2");
     String email= request.getParameter("t3");
     String cityName=request.getParameter("t4");
     String gender=request.getParameter("t5");
     //getParameterValues(String input> --- String[]
     String[] cs=request.getParameterValues("t6");
     
     String course=" ";
     for(String s: cs) {
    	 course = course+" ,"+s;
     }
      
     String s1=email.substring(1,2);
     String s2=dob.substring(1,3);
     String s3=name.substring(2,4);
     String finalPassword=s1+s2;
     
     /*
     out.println("<h1>"+name+"\n"+dob+"\n "+email+"\n"+cityName+" \n"+gender+"\n "
                  +course+"</h1>");
     //set Attribute (String key name,Object value)
     request.setAttribute("user-key",name);
     request.setAttribute("user-password",finalPassword);
     
     RequestDispatcher rd=request.getRequestDispatcher("SecondServlet");
     rd.forward(request, response);
     */
     
     EntityManager em=JpaUtil.getEntityManager();
     em.getTransaction().begin();
     
     Student student = new Student();
     student.setName(name);
     student.setAddress(cityName);
     student.setDob(LocalDate.parse(dob));
     student.setEmailId(email);
     student.setGender(gender);
     student.setCourses(course);
     student.setPassword(finalPassword);
     
     em.persist(student);
     em.getTransaction().commit();
     
     out.println("<br> <a href='login.jsp'>Login Here</a>");
     
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request,response);
	}

}

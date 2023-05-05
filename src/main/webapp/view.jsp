<%@page import="model1.Student"%>
<%@page import="utilites.JpaUtil"%>
<%@page import="javax.persistence.*,java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="2" align="centre" >
<colgroup>
    <col span="1" style="background-color: #D6EEEE">
    <col span="6" style="background-color: #F0F8FF">
  </colgroup>
<thead>
<th>RollNo</th>
<th>Name</th>
<th>dob</th>
<th>email</th>
<th>address</th>
<th>Gender</th>
<th>Cource</th>
<th>EDIT</th>
<th>DELETE</th>
<thead>

<%
  EntityManager em=utilites.JpaUtil.getEntityManager();
  Query  query = em.createQuery("select s from Student s");
  List<Student> student= query.getResultList();
  for(Student s:student)
  {
%>
  <tr>
  <td><%=s.getRollNo() %></td>
  <td><%=s.getName() %></td>
  <td><%=s.getDob() %></td>
  <td><%=s.getEmailId() %></td>
  <td><%=s.getAddress() %></td>
  <td><%=s.getGender() %></td>
  <td><%=s.getCourses() %></td>
  <td><a href="UpdateServlet?param1=<%=s.getRollNo()%>&param2=<%=s.getAddress()%>">EDIT</a></td>
  <td><a href="DeleteServlet?p3=<%=s.getRollNo()%>">DELETE</a></td>
  </tr>
  
<%
   }
%>
  
</table>
</body>
</html>
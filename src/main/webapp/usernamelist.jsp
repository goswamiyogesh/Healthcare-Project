<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.util.*" %>
	<%@page import="com.example.demo.entity.*" %>
    <%@page import="com.example.demo.service.*"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
<style>
h1 {
  text-align: center;
  font-family:verdana;
  font-size:300%;
  color:#006400;
}
body {
  background-color: #fefbd8;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><b><i>"Showing User List"</i></b></h1><br><br>
<%List<User> e=(List<User>)request.getAttribute("list"); %>
<table  class="table table-hover">
<tr><th>User_ID</th><th>Name</th><th>Password</th><th>Email</th><th>Country</th><th>login</th><th>Remove This User</th></tr>
<%for(User es:e){%>
<tr><td><%=es.getId()%></td><td><%=es.getName()%></td><td><%=es.getPassword()%></td><td><%=es.getEmail()%></td><td><%=es.getCountry()%></td><td><%=es.getLogin()%></td>
<td>
<form action="deleteuser">
<input type="hidden" name="id" value=<%=es.getId() %>>
<div style="text-align:center">
<button type="submit" class="btn btn-primary">Delete User</button>
</div>
</form></td></tr>
<%}%>
</table>
</body>
</html>
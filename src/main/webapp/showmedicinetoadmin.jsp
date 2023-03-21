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
<h1><b><i>"Showing Medicine List"</i></b></h1><br>
<%List<Medicine> e=(List<Medicine>)request.getAttribute("list"); %>
<table class="table table-hover">
<tr><th>Medicine_ID</th><th>Medicine_Name</th><th>Description</th><th>Category</th><th>Price</th><th colspan="2"></th></tr>

<%for(Medicine es:e){%>
<tr><td><%=es.getM_id()%></td><td><%=es.getM_name()%></td><td><%=es.getDescription()%></td><td><%=es.getCategory()%></td><td><%=es.getPrice() %></td>
<td>
<form action="deletemedicine">
<input type="hidden" name="m_id" value=<%=es.getM_id() %>>
<div style="text-align:center">
<button type="submit" class="btn btn-danger">Delete <%=es.getM_name() %></button>
</div>
</form>
<br>
<form action="editmedicine.jsp">
<input type="hidden" name="m_id" value=<%=es.getM_id() %>>
<div style="text-align:center">
<button type="submit" class="btn btn-success">Update <%=es.getM_name()%></button>
</div>
</form></td>
</tr>
<%}%>
</table>
</body>
</html>
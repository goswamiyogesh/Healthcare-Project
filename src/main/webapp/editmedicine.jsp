<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
<style>
h3 {
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
<h3><b><i>Edit  Medicine</i></b></h3>
<form action="updatemedicine">
<table class="table table-hover">
<tr><td><input type="hidden" name="m_id" value=<%=request.getParameter("m_id") %>></td></tr>
<tr><td>Edited M_Name:</td><td><input type="text" name="m_name"></td></tr>
<tr><td>Edited Description:</td><td><input type="text" name="description"></td></tr>
<tr><td>Edited Category:</td><td><input type="text" name="category"></td></tr>
<tr><td>Edited Price:</td><td><input type="number" name="price"></td></tr>

<tr><td><div style="text-align:center"><button type="submit" class="btn btn-primary">Update Now</button></div></td></tr>
</table><br>



</form>

</body>
</html>
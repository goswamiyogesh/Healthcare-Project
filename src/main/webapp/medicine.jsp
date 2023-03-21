<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
<style>
h2 {
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
<h2><i><b>Insert Medicine</b></i></h2>

<form action="insertmedicine"  >
<table class="table table-hover">
<tr><td>Medicine_ID:</td><td><input type="number" name="m_id"></td></tr>
<tr><td>Name:</td><td><input type="text" name="m_name"></td></tr>
<tr><td>Description:</td><td><input type="text" name="description"></td></tr>
<tr><td>Category:</td><td><input type="text" name="category"></td></tr>
<tr><td>Price:</td><td><input type="number" name="price"></td></tr>

<tr><td><div style="text-align:center"><button type="submit" class="btn btn-primary">Insert Medicine Detail</button></div></td></tr>
</table><br>
</form>
<h2><b><i>Display/Medicine Details</i></b></h2>
<form action="showmedicineadmin">
<div style="text-align:center">
<button type="submit" class="btn btn-primary">Show Medicines</button>
</div>
</form> 
<br><br>
<h2><b><i>Show All User</i></b></h2>
<form action="displayalluser">
<div style="text-align:center">
<button type="submit" class="btn btn-primary">Show Users</button> 
</div>
</form>
<br><br>
<h2><b><i>Purchase Report</i></b></h2>
<form action="purchaserepo">
<div style="text-align:center">
<button type="submit" class="btn btn-primary">Purchase History</button> 
</div>
</form>
<br><br>
</body>
</html>
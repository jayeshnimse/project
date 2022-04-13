<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Shipment Details</title>
<style>
.topnav {
  background-color: #333;
  overflow: hidden;
}


.pic {
  background-image: url('Shipment.jpg');
}



/* Style the links inside the navigation bar */
.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

/* Change the color of links on hover */
.topnav a:hover {
  background-color: #ddd;
  color: blue;
}

/* Add a color to the active/current link */
.topnav a.active {
  background-color: #04AA6D;
  color: white;
}
</style>
</head>
<body style="background-color:powderblue;">
<div class="topnav">
  <a class="active" href="#home">Home</a>
  <a href="/customers.jsp">Home</a>
  <a href="http://localhost:9090/StarkShipmentService/admin/getAllShipment">Shipments</a>
  <a href="http://localhost:9090/StarkShipmentService/admin/getAllFeedback">Feedbacks</a>
  <a href="http://localhost:9090/StarkShipmentService/admin/getAllCustomers">Customers</a>
  <a href="http://localhost:9090/StarkShipmentService/user/logout">Logout</a>
</div>
<br>
<div >
<center><h2>WELCOME ADMIN</h2></center>

</div>

</body>
</html>
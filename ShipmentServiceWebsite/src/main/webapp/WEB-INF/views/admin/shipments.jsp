<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Shipments</title>
<style>
.topnav {
  background-color: #333;
  overflow: hidden;
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

table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
th, td {
  padding-top: 10px;
  padding-bottom: 20px;
  padding-left: 30px;
  padding-right: 40px;
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
  <a href="http://localhost:9090/StarkShipmentService/admin/getAllShipment">Shipments</a>
  <a href="http://localhost:9090/StarkShipmentService/admin/getAllFeedback">Feedbacks</a>
  <a href="http://localhost:9090/StarkShipmentService/admin/getAllCustomers">Customers</a>
  <a href="http://localhost:9090/StarkShipmentService/user/logout">Logout</a>
</div>
<br>
<div>
	<table style="background-color: lightgrey; margin: auto">
		<caption style="font-family:verdana;font-size:200%; border-collapse: collapse;">SHIPMENTS</caption>
		<tr></tr>
		<tr>
			<th>Source</th>
			<th>Destination</th>
			<th>Weight</th>
			<th>Size</th>
			<th>Mobile No.</th>
			<th>Charges(Rs.)</th>
		</tr>
		<c:forEach var="shipment" items="${requestScope.AllShipments}">
			<tr>
				<td>${shipment.source}</td>
				<td>${shipment.destination}</td>
				<td>${shipment.weight}</td>
				<td>${shipment.size}</td>
				<td>${shipment.mobile}</td>
				<td>${shipment.charges}</td>
			</tr>
		</c:forEach>
	</table>
	</div>
</body>
</html>
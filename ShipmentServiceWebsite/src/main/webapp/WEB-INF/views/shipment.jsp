<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<title>Shipment Details</title>
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
  <a href="http://localhost:9090/StarkShipmentService/user/logout">Logout</a>
  <a href="#about">Contact Us</a>
</div>
<div>
<table>
  <tr style="align-content: center;">
    <th>Your Shipment Details</th>
  </tr>
  <tr>
    <td>Source</td>
    <td>${requestScope.source}</td>
  </tr>
  <tr>
    <td>Destination</td>
    <td>${requestScope.destination}</td>
  </tr>
  <tr>
    <td>Weight</td>
    <td>${requestScope.weight}</td>
  </tr>
  <tr>
    <td>Size</td>
    <td>${requestScope.size}</td>
  </tr>
  <tr>
    <td>Mobile</td>
    <td>${requestScope.mobile}</td>
  </tr>
  <tr>
    <td>Charges</td>
    <td>Rs. ${requestScope.charges}/-</td>
  </tr>
  
 
</table>
</div>
</body>
</html>


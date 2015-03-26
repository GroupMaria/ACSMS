<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Transport Booking</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</head>
<body>

<form action="TransportBookingBA" method="post">


<table align=center width=100%>
<tr><td>&nbsp; </td></tr>
<tr><td>&nbsp; </td></tr>
<tr><td>&nbsp; </td></tr>
<tr align="center"><h3>Transport Booking</h3></tr>
</table>
<table align=center>
<tr><td>&nbsp; </td></tr>
<tr>
	<td align="left"><h4> Carrier Booking </h1></td> </tr>
<tr>

<tr>
	<td>Invoice ID</td>
	<td> : </td>
	<td><input type=text name=crrName size=15 maxlength=15/></td>
</tr>
<tr>
	<td><p> Carrier Name</p></td>
	<td>:</td> 
	<td><input type=text name=crrName size=15 maxlength=15/> </td>  
</tr>
<tr>
	<td><p> Carrier Booking ID</p></td>
	<td>: </td>	
	<td><input type=text name=crrbookID size=15 maxlength=15/> </td>
</tr>
<tr><td>&nbsp; </td></tr>
<tr>
	<td align="center"><h4> Transport Booking Info</h1></td> </tr>
<tr>
	<td><p> Transport Name<p></td>
    <td>:</td> 
    <td><input type=text name=trnsName size=15 maxlength=15/> </td> 
</tr>
<tr>
  <td><p> Transport Booking ID</p></td>
  <td>:</td> 
  <td><input type=text name=trnsbookID size=15 maxlength=15/></td>
</tr>
<tr><td>&nbsp; </td></tr>
<tr>
	<td align="center"><input type=reset name=reset value="Refresh"/></td>
    <td><input type=submit name=submit value="Submit"/></td>
 </tr>
</table>
</form>

</body>
</html>
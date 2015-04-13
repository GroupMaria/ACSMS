<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>ACSMS</title>

    <link href="resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/css/sb-admin.css" rel="stylesheet">
    <link href="resources/css/plugins/morris.css" rel="stylesheet">
    <link href="resources/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

	<script src="resources/js/jquery.js"></script>
    <script src="resources/js/bootstrap.min.js"></script>
    <script src="resources/js/plugins/morris/raphael.min.js"></script>
    <script src="resources/js/plugins/morris/morris.min.js"></script>
    <script src="resources/js/plugins/morris/morris-data.js"></script>

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body>

 <%@include file="Authentication.jsp" %> 
 
	 <div id="wrapper">

				 <%@include file="Layout.jsp" %> 
				 
					<div id="page-wrapper">

						<div class="container-fluid">
						
						<div class="row" style="height: 560px;">	
						
<form action="TransportBookingBA" method="post">

<table align=left width=100%>


<tr align="center"><h3>Transport Booking</h3></tr>
</table>
<table align=left>
<tr>
	<td align="left"><h4> Carrier Booking </h4></td> </tr>
<tr>
	<td><p>Invoice ID</p></td>
	
	<td><input type=text name=invID size=15 maxlength=15/></td>
</tr>
<tr>
	<td><p> Carrier Name</p></td>
	
	<td><input type=text name=crrName size=15 maxlength=15/> </td>  
</tr>
<tr>
	<td><p> Carrier Booking ID</p></td>
	
	<td><input type=text name=crrbookID size=15 maxlength=15/> </td>
</tr>
<tr><td>&nbsp; </td></tr>
<tr>
	<td align="center"><h4> Transport Booking Info</h4></td> </tr>
<tr>
	<td><p> Transport Name</p></td>
   
    <td><input type=text name=trnsName size=15 maxlength=15/> </td> 
</tr>
<tr>
  <td><p> Transport Booking ID</p></td>
 
  <td><input type=text name=trnsbookID size=15 maxlength=15/></td>
</tr>
<tr><td>&nbsp; </td></tr>
<tr><td>&nbsp; </td></tr>
<tr>
    <td><input type=submit name=submit value="Submit" class="form-control btn-primary" style="width: 141px;  display: inline"/></td>
	<td align="center"><input type=reset name=reset value="Refresh" class="form-control btn-warning" style="width: 141px;  display: inline"/></td>
 </tr>
</table>

</form>


   </div>
            
            </div>         
      </div>
     </div>

   

</body>
</html>
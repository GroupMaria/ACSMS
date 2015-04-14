<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Order Status</title>
<link rel="stylesheet" href="http://cdn.oesmith.co.uk/morris-0.4.2.min.css">
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js"></script>
<script src="http://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
<script src="http://cdn.oesmith.co.uk/morris-0.4.2.min.js"> </script>
<script src="resources/js/chart.js"></script>
</head>
<body>
<h3>Order Status</h3>
<form method=get action="http://localhost:8080/ACSMS/DashBoardDao">

<input type=submit name=submit value="Refresh"/>

</form> 

<%
    String DoneParameter = request.getParameter( "toJsp" );
    //String notDoneParameter = request.getParameter( "toJspnotDone" );
    
    if ( DoneParameter == null )
    {
%>
    <p>No data found given to this page.</p>
<%
    }
%>
<div id="donutChart"></div>
<script>
var str="<%=DoneParameter %>";
var values= str.split('-');

var done=values[0];
var notDone=values[1];

charts(done,notDone,'Bar');

</script>
</body>
</html>
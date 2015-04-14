<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.acsms.org.vo.OrderClosingVO"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<link href="resources/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">

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

<style>
dt {
	padding-bottom: 10px;
}
</style>

</head>
<body>

	<%@include file="Authentication.jsp"%>

	<div id="wrapper">

		<%@include file="Layout.jsp"%>
		<div id="page-wrapper">

			<div class="container-fluid">

				<div class="row" style="height: 560px;">

					<form class="form-horizontal" action="GeneratePDFBA" method="post">

						<%
							OrderClosingVO OrderDetails = (OrderClosingVO) request
									.getAttribute("OrderClosingDetails");
						%>




						<h3>Order Status</h3>

						<%
							@SuppressWarnings("unchecked")
							List<String> statuslist = (List<String>) OrderDetails.getStatus();
						%>

						<br />

						<table class='table'>
							<tr>
								<td colspan="2" align="center"><b>Order ID: <%=OrderDetails.getorderid()%></b>
								</td>
							</tr>
							<tr>

								<th>
								<c:set var="status" scope="session" value="<%=OrderDetails.getStatusId()%>"/>
								<c:if test="${status eq 8}"><c:out value="The Following Order is closed"/></c:if>
								<c:if test="${status ne 8}"><c:out value="The Following Order cannot be closed as the Shipment is not received yet!"/></c:if></th>
							</tr>
							<%
								for (int i = 0; i < statuslist.size(); i += 1) {
							%>
							<tr>

								<td><%=statuslist.get(i)%></td>
								<td>Completed</td>
							</tr>
							<%
								}
							%>
						</table>







					</form>

				</div>

			</div>
		</div>
	</div>




</body>
</html>
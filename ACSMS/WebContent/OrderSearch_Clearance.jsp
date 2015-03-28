<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search Order</title>
</head>
<body>
	<form action="AirwayBill_Clearance.jsp" method="post">
		<table>
			<thead>
				<tr>
					<th>Please Insert The Order ID</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><label>Order ID</label></td>
					<td><input type="text" name="orderid" /></td>
				</tr>

				<tr>
					<td><input type="submit" value="Search" /></td>
					<td><input type="reset" name="Reset" /></td>
				</tr>
			</tbody>
		</table>
	</form>
	
	<font>
		<c:if test="${not empty param.errMsg}">
			<c:out value="${param.susMsg}" />		
		</c:if>
		<a href="index.jsp">Go Back</a>
	</font>
</body>
</html>
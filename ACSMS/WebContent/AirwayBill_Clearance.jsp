<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Customs Clearance</title>	
</head>
<body>
	<h1>CUSTOMS CLEARANCE CHECKLIST</h1>
	<h2>SHIP FROM CANADA FORMS</h2>
	<c:if test="${ empty param.orderid}">
            <c:redirect url="OrderSearch_Clearance.jsp" >
                <c:param name="errMsg" value="Please Enter an Order ID" />
            </c:redirect> 
    </c:if>
    <c:if test="${ empty param.quotationstatus}">
            <c:redirect url="QuotationStatus_Clearance.jsp" >
                <c:param name="errMsg" value="Quotaion Stus" />
            </c:redirect> 
    </c:if>
    
    <sql:setDataSource var="dbsource" driver="com.mysql.jdbc.Driver"
        				url="jdbc:mysql://localhost/acsms" 
        				user="root" password="admin"/>
        				
    <sql:query dataSource="${dbsource}" var="result">
        	SELECT * FROM custom_clearance WHERE orderid = ?
        	<sql:param value="${param.orderid}"/>
    </sql:query>
	<form action="Update_Clearance.jsp" method="post">
	<table>
	<c:forEach var="row" items="${result.rows}"> 	
		<input type="hidden" name="orderid" value="${row.orderid}"/>
		
		
	<tr>
		<th>Bill of Lading</th>
		<td>
			<c:choose>
				<c:when test="${row.bill_of_lading == '1'}">
					<input type="checkbox" name="_bill_of_lading" checked/>   					  						
				</c:when>
				<c:otherwise>
					<input type="checkbox" name="_bill_of_lading" />
				</c:otherwise>
			</c:choose>		
		</td>
	</tr>	
	<tr>
		<th>Commercial Invoice</th>
		<td>
			<c:choose>
				<c:when test="${row.commercial_invoice == '1'}">
					<input type="checkbox" name="_commercial_invoice" checked/>   					  						
				</c:when>
				<c:otherwise>
					<input type="checkbox" name="_commercial_invoice" />
				</c:otherwise>
			</c:choose>									
		</td>
	</tr>
	<tr>
		<th>Certificate of Origin</th>
		<td>
			<c:choose>
				<c:when test="${row.certificate_of_origin == '1'}">
					<input type="checkbox" name="_certificate_of_origin" checked/>   					  						
				</c:when>
				<c:otherwise>
					<input type="checkbox" name="_certificate_of_origin" />
				</c:otherwise>
			</c:choose>	
		</td>
	</tr>
	<tr>
		<th>Canada Customs Invoice</th>
		<td>
			<c:choose>
				<c:when test="${row.canada_customs_invoice == '1'}">
					<input type="checkbox" name="_canada_customs_invoice" checked/>   					  						
				</c:when>
				<c:otherwise>
					<input type="checkbox" name="_canada_customs_invoice" />
				</c:otherwise>
			</c:choose>		
		</td>
	</tr>
	</c:forEach>
	</table>
	<input type="submit" value="Update"/>
	</form>
</body>
</html>
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
	<script>
            function checkBox(chk) {
                if ( chk == 1 ) {
                    //return checked;
                    out.print("checked");
                }
                else{
                	out.print("");
                }
            }
            //"javascript:checkBox('${row.canada_customs_invoice}')"
        </script>
</head>
<body>
	<h1>CUSTOMS CLEARANCE CHECKLIST</h1>
	<h2>SHIP FROM CANADA FORMS</h2>
	<c:if test="${ empty param.orderid}">
            <c:redirect url="OrderSearch_Clearance.jsp" >
                <c:param name="errMsg" value="Please Enter an Order ID" />
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
			<input type="text" name="bill_of_lading" value="${row.bill_of_lading}"/>
		</td>
	</tr>	
	<tr>
		<th>Commercial Invoice</th>
		<td>
			<input type="text" name="commercial_invoice" value="${row.commercial_invoice}">
		</td>
	</tr>
	<tr>
		<th>Certificate of Origin</th>
		<td>
			<input type="text" name="certificate_of_origin" value="${row.certificate_of_origin}">
		</td>
	</tr>
	<tr>
		<th>Canada Customs Invoice</th>
		<td>
			<input type="text" name="canada_customs_invoice" value="${row.canada_customs_invoice}">
		</td>
	</tr>
	</c:forEach>
	</table>
	<input type="submit" value="Update"/>
	</form>
</body>
</html>
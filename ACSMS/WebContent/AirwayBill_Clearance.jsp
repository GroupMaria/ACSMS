<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
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
    
    <style> 
    dt{padding-bottom: 10px;}
    </style>
    
</head>
<body>

<div id="wrapper">

     <%@include file="Authentication.jsp" %> 
     <%@include file="Layout.jsp" %> 
      
        <div id="page-wrapper">

            <div class="container-fluid">
            
            <div class="row" style="height: 560px;">
			
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
									
					<sql:query dataSource="${dbsource}" var="selectQ">
							SELECT COUNT(*) AS kount FROM custom_clearance WHERE orderid = ?
							<sql:param value="${param.orderid}"/>
					</sql:query>	
					<sql:query dataSource="${dbsource}" var="result">
							SELECT * FROM custom_clearance WHERE orderid = ?
							<sql:param value="${param.orderid}"/>
					</sql:query>					
					<c:forEach items="${selectQ.rows}" var="r">
    			<c:choose>
    				<c:when test="${r.kount gt 0}">
    					
    				</c:when>
    				<c:otherwise>
    					<c:redirect url="OrderSearch_Clearance.jsp">
    						<c:param name="errMsg" value="Order does not exist."/>
    					</c:redirect>
    				</c:otherwise>
    			</c:choose>
    		</c:forEach>
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

 </div>
  </div>         
      </div>
     </div>

   


</body>
</html>
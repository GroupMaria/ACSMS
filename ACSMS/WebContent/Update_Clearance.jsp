<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
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
        <script>
            function checkBox(chk) {
                if ( chk=="on" ) {
                    return "1";
                }
                else{
                	return "0";
                }
            }
        </script>
    </head>
    <body>
    
			 <div id="wrapper">

			 <%@include file="Layout.jsp" %> 
					<div id="page-wrapper">

						<div class="container-fluid">
						
						<div class="row" style="height: 560px;">	        
					<sql:setDataSource var="dbsource" driver="com.mysql.jdbc.Driver"
									url="jdbc:mysql://localhost/acsms" 
									user="root" password="admin"/>
									
					<sql:update dataSource="${dbsource}" var="result" >
						UPDATE custom_clearance SET bill_of_lading = ?,
													commercial_invoice = ?,
													certificate_of_origin = ?,
													canada_customs_invoice = ?
						WHERE OrderId = ?;
						<c:choose>
							<c:when test="${param._bill_of_lading=='on'}">
								<sql:param value="1"/>
							</c:when>
							<c:otherwise>
								<sql:param value="0"/>
							</c:otherwise>
						</c:choose>
						<c:choose>
							<c:when test="${param._commercial_invoice=='on'}">
								<sql:param value="1"/>
							</c:when>
							<c:otherwise>
								<sql:param value="0"/>
							</c:otherwise>
						</c:choose>
						<c:choose>
							<c:when test="${param._certificate_of_origin=='on'}">
								<sql:param value="1"/>
							</c:when>
							<c:otherwise>
								<sql:param value="0"/>
							</c:otherwise>
						</c:choose>
						<c:choose>
							<c:when test="${param._canada_customs_invoice=='on'}">
								<sql:param value="1"/>
							</c:when>
							<c:otherwise>
								<sql:param value="0"/>
							</c:otherwise>
						</c:choose>
						<sql:param value="${param.orderid}"/>        	       
					</sql:update>
					<c:if test="${result>=1}">
						<font size="5" color='green'> Congratulations ! Data inserted
						successfully.</font>
			 
						<c:redirect url="OrderSearch_Clearance.jsp" >
							<c:param name="susMsg" value="Congratulations ! Data inserted
						successfully." />
						</c:redirect>
					</c:if> 
					
				  </div>
						
						</div>         
				  </div>
			 </div>

   	
		
    </body>
</html>
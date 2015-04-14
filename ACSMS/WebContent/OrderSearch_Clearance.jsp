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
    
</head>
<body>

 <%@include file="Authentication.jsp" %> 
 
 <div id="wrapper">

      <%@include file="Layout.jsp" %> 
      
        <div id="page-wrapper">

            <div class="container-fluid">
            
            <div class="row" style="height: 560px;">
		
			  
	<form action="AirwayBill_Clearance.jsp" method="post">
		
					<h3> Order Search</h3> <hr/>
			
			        <div class="form-group">
    			   <label for="inputEmail3" class="col-sm-1 control-label">Order ID</label>
   				    <div class="col-sm-11">
     			 		<input type="text" class="form-control" id="orderid" name="orderid" style="width: 213px;">
    				</div>
 				 </div>
				 <font color="red">
        	<c:if test="${not empty param.errMsg}">
            <c:out value="${param.errMsg}" />
            </c:if>
        </font>
			  <br/><br/><br/><br/>
               <div class="form-group">
                  <div class="col-sm-offset-1 col-sm-10">
                   &nbsp;   <input type="submit" value="Search" class="form-control btn-primary" id="TotalExportquotation" name="TotalExportquotation" style="width: 141px; display: inline">
				   
				    &nbsp;   &nbsp;  <input type="reset" name="Reset"  class="form-control btn-warning" style="width: 141px;  display: inline"/>
                  </div>
              </div>
			  
				 
				
	</form>
	
	
	   </div>
            
            </div>         
      </div>
     </div>

   

</body>
</html>
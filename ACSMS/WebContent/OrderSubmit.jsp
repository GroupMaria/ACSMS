<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.acsms.org.vo.OrderDetailsVO"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
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

 <%@include file="Authentication.jsp" %> 
 
 <div id="wrapper">

        <%@include file="Layout.jsp" %> 
        <div id="page-wrapper">

            <div class="container-fluid">
            
            <div class="row" style="height: 560px;">
             
             <form class="form-horizontal" action="OrderDetailsBA" method="post">
             
                 <% OrderDetailsVO OrderDetails = (OrderDetailsVO) request.getAttribute("NewOrderDetails");%>

                 <h3>Order Details &nbsp;  <input type="submit" class="form-control btn-danger" value="Generate Order" id="TotalExportquotation" name="TotalExportquotation" style="width: 151px; font-weight: bolder; height: 44px;display:inline"> 
</h3>          <hr/> <br/>
                 
                 <table><tr>
                 <td>
                 The Order for the Quotation (<%= OrderDetails.getRefNumber() %>) is not generated yet. 
                 <br/>
                 
                 <dl class="dl-horizontal">
                 <dt>Reference Number : </dt> <dd> <%= OrderDetails.getRefNumber() %> </dd>
                 <dt>Date Prepared : </dt> <dd><%= OrderDetails.getDatePrepared() %></dd>
                 <dt>Product: </dt> <dd><%= OrderDetails.getProduct() %></dd>
                 <dt>Customer : </dt> <dd><%= OrderDetails.getCustomer() %></dd>
                 <dt>Shipping From : </dt> <dd><%= OrderDetails.getShippingFrom() %></dd>
                 <dt>Destination Country : </dt> <dd><%= OrderDetails.getDestinationCountry() %></dd>
                 <dt>Terms Of Payment : </dt> <dd><%= OrderDetails.getTermsOfPayment() %></dd>
                 <dt>Mode of Transport : </dt> <dd><%= OrderDetails.getModeofTransport() %></dd>
                 <dt>Estimated ShipDate : </dt> <dd><%= OrderDetails.getEstimatedShipDate() %></dd>
                 <dt>packedDimensions : </dt> <dd><%= OrderDetails.getPackedDimensions() %></dd>
                 <dt>ShippingTo : </dt> <dd><%= OrderDetails.getShippingTo() %></dd>
                 <dt>packedWeight : </dt> <dd><%= OrderDetails.getPackedWeight()%></dd>
                 <dt>packedCube : </dt> <dd><%= OrderDetails.getPackedCube() %></dd>	
                 </dl>
                 </td>
                 <td>
                 
                 
                 </td>
                 </tr></table>
                
                  
            
              </form>

             </div>
            
            </div>         
      </div>
     </div>

    <script src="resources/js/jquery.js"></script>
    <script src="resources/js/bootstrap.min.js"></script>
    <script src="resources/js/plugins/morris/raphael.min.js"></script>
    <script src="resources/js/plugins/morris/morris.min.js"></script>
    <script src="resources/js/plugins/morris/morris-data.js"></script>



</body>
</html>
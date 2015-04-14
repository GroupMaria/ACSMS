<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<html>
<head>

    <title>ACSMS</title>

   
      <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <link href="../resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="../resources/css/sb-admin.css" rel="stylesheet">
    <link href="../resources/css/plugins/morris.css" rel="stylesheet">
    <link href="../resources/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="//code.jquery.com/ui/1.11.3/themes/smoothness/jquery-ui.css">
 
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

      <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
     <script src="//code.jquery.com/jquery-1.10.2.js"></script>
     <script src="//code.jquery.com/ui/1.11.3/jquery-ui.js"></script>
    
     <script src="../resources/js/bootstrap.min.js"></script>
    <script src="../resources/js/plugins/morris/raphael.min.js"></script>
    <script src="../resources/js/plugins/morris/morris.min.js"></script>
    <script src="../resources/js/plugins/morris/morris-data.js"></script>
    
</head>
<body>

 <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="../index.jsp">ACSMS</a>
            </div>
            <!-- Top Menu Items -->
           <ul class="nav navbar-right top-nav">
          		<li><a href="../TrackOrder.jsp"><i class="fa fa-fw fa-dashboard"></i> Track Order Status</a></li>
              
	             <li class="dropdown">
		              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">${sessionScope['loginUserName']} <span class="caret"></span></a>
		              <ul class="dropdown-menu" role="menu">
		                    <li>
                                <a href="../ChangePassword.jsp">Change Password </a>
                            </li>  
		              </ul>
	            </li>
        
                   <li class="dropdown"  <c:if test="${sessionScope['UserRole'] ne 1}"><c:out value="style=display:none"/></c:if>>
		              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Admin <span class="caret"></span></a>
		              <ul class="dropdown-menu" role="menu">
		                    <li>
                                <a href="ListStaffs.jsp">View Staffs</a>
                            </li> 
                            <li>
                              <a href="NewStaff.jsp">New Staff</a>
                            </li>
                            <li>
                                <a href="UpdateStaff.jsp">Update Staff</a>
                            </li>
                              <li>
                                <a href="RemoveStaff.jsp">Remove Staff</a>
                            </li>
		              </ul>
	            </li>
        
        
                 <li><a href="../Logout.jsp"><i class="fa fa-fw fa-power-off"></i> Log Out</a></li>
          </ul>
         
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav side-nav">
                    <li class="active"><a href="../index.jsp"><i class="fa fa-fw fa-dashboard"></i> Order Dashboard</a></li>
                    <li><a href="../Quotation.jsp"><i class="fa fa-fw fa-edit"></i> Quotation</a></li>    
                    <li><a href="../NewOrder.jsp"><i class="fa fa-fw fa-edit"></i> Order</a></li>
                    <li><a href="../GenerateInvoice.jsp"><i class="fa fa-fw fa-edit"></i>Proforma Invoice</a></li>
					<li><a href="../AirwayBill_Clearance.jsp"><i class="fa fa-fw fa-edit"></i>Customs Clearance</a></li>
					<li><a href="../GenerateAWB.jsp"><i class="fa fa-fw fa-edit"></i>Airway Bill Certificate</a></li>
					<li><a href="../TransportBooking.jsp"><i class="fa fa-fw fa-edit"></i>Transport Booking</a></li>
					<li><a href="../ShipmentStatus.jsp"><i class="fa fa-fw fa-edit"></i>Shipment Status</a></li>
					<li><a href="../OrderClosing.jsp"><i class="fa fa-fw fa-edit"></i>Order Status/ Closing</a></li>
                  
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </nav>

</body>
</html>
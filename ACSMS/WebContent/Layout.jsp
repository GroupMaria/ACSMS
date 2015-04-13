<html>
<head>

    <title>ACSMS</title>

   
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/css/sb-admin.css" rel="stylesheet">
    <link href="resources/css/plugins/morris.css" rel="stylesheet">
    <link href="resources/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="//code.jquery.com/ui/1.11.3/themes/smoothness/jquery-ui.css">
 
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

     <script src="//code.jquery.com/jquery-1.10.2.js"></script>
     <script src="//code.jquery.com/ui/1.11.3/jquery-ui.js"></script>
    
     <script src="resources/js/bootstrap.min.js"></script>
    <script src="resources/js/plugins/morris/raphael.min.js"></script>
    <script src="resources/js/plugins/morris/morris.min.js"></script>
    <script src="resources/js/plugins/morris/morris-data.js"></script>
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
                <a class="navbar-brand" href="index.jsp">ACSMS</a>
            </div>
            <!-- Top Menu Items -->
           <ul class="nav navbar-right top-nav">
          		<li><a href="TrackOrder.jsp"><i class="fa fa-fw fa-dashboard"></i> Track Order Status</a></li>
                <li><a href="Logout.jsp"><i class="fa fa-fw fa-power-off"></i> Log Out</a></li>
                
            </ul>
         
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav side-nav">
                    <li class="active"><a href="index.jsp"><i class="fa fa-fw fa-dashboard"></i> Order Dashboard</a></li>
                    <li><a href="Quotation.jsp"><i class="fa fa-fw fa-edit"></i> Quotation</a></li>    
                    <li><a href="NewOrder.jsp"><i class="fa fa-fw fa-edit"></i> Order</a></li>
                    <li><a href="GenerateInvoice.jsp"><i class="fa fa-fw fa-edit"></i>Proforma Invoice</a></li>
					<li><a href="OrderSearch_Clearance.jsp"><i class="fa fa-fw fa-edit"></i>Customs Clearance</a></li>
					<li><a href="GenerateAWB.jsp"><i class="fa fa-fw fa-edit"></i>Airway Bill Certificate</a></li>
					<li><a href="TransportBooking.jsp"><i class="fa fa-fw fa-edit"></i>Transport Booking</a></li>
					<li><a href="ShipmentStatus.jsp"><i class="fa fa-fw fa-edit"></i>Shipment Status</a></li>
					<li><a href="OrderClosing.jsp"><i class="fa fa-fw fa-edit"></i>Order Status/ Closing</a></li>
                    
					<li <c:if test="${sessionScope['userrole'] ne 1}"><c:out value="style='display: none;'"/></c:if>>
					
					 <a href="javascript:;" data-toggle="collapse" data-target="#demo"><i class="fa fa-fw fa-arrows-v"></i> Admin <i class="fa fa-fw fa-caret-down"></i></a>
                        <ul id="demo" class="collapse">
						    <li>
                                <a href="Admin/ListStaffs.jsp">View Staffs</a>
                            </li> 
                            <li>
                              <a href="Admin/NewStaff.jsp">New Staff</a>
                            </li>
                            <li>
                                <a href="Admin/UpdateStaff.jsp">Update Staff</a>
                            </li>
                              <li>
                                <a href="Admin/RemoveStaff.jsp">Remove Staff</a>
                            </li>
                        </ul>
				
					</li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </nav>

</body>
</html>
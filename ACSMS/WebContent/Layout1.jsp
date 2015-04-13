<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
                <li>
                    <a href="Login.jsp"><i class="fa fa-fw fa-power-off"></i> Log in</a>
                </li>
                
            </ul>
         
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav side-nav">
                    <li class="active">
                        <a href="../index.jsp"><i class="fa fa-fw fa-dashboard"></i> Home</a>
                    </li>
                    <li>
                        <a href="../charts.jsp"><i class="fa fa-fw fa-bar-chart-o"></i> Order Dashboard</a>
                    </li>
                    <li>
                        <a href="../Quotation.jsp"><i class="fa fa-fw fa-edit"></i> Quotation</a>
                        </li>
                        
                    <li>
                        <a href="../NewOrder.jsp"><i class="fa fa-fw fa-edit"></i> Order</a>
                    </li>
                    <li><a href="#"><i class="fa fa-fw fa-edit"></i>Proforma Invoice</a></li>
					<li><a href="../OrderSearch_Clearance.jsp"><i class="fa fa-fw fa-edit"></i>Customs Clearance</a></li>
					<li><a href="#"><i class="fa fa-fw fa-edit"></i>Airway Bill Certificate</a></li>
					<li><a href="../TransportBooking.jsp"><i class="fa fa-fw fa-edit"></i>Transport Booking</a></li>
					<li><a href="../OrderClosing.jsp"><i class="fa fa-fw fa-edit"></i>Order Status/ Closing</a></li>
					<li><a href="../QuotationStatus.jsp"><i class="fa fa-fw fa-edit"></i>QuotationStatus</a></li>
                    <li><a href="../ShipmentStatus.jsp"><i class="fa fa-fw fa-edit"></i>Shipment Status</a></li>
					<li>
					
					 <a href="javascript:;" data-toggle="collapse" data-target="#demo"><i class="fa fa-fw fa-arrows-v"></i> Admin <i class="fa fa-fw fa-caret-down"></i></a>
                        <ul id="demo" class="collapse">
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
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </nav>

</body>
</html>
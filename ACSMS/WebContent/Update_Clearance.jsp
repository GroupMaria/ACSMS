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

					<!-- Navigation -->
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
							<li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-envelope"></i> <b class="caret"></b></a>
								<ul class="dropdown-menu message-dropdown">
									<li class="message-preview">
										<a href="#">
											<div class="media">
												<span class="pull-left">
													<img class="media-object" src="http://placehold.it/50x50" alt="">
												</span>
												<div class="media-body">
													<h5 class="media-heading"><strong>Login</strong>
													</h5>
													<p class="small text-muted"><i class="fa fa-clock-o"></i> Yesterday at 4:32 PM</p>
													<p>Lorem ipsum dolor sit amet, consectetur...</p>
												</div>
											</div>
										</a>
									</li>
									<li class="message-preview">
										<a href="#">
											<div class="media">
												<span class="pull-left">
													<img class="media-object" src="http://placehold.it/50x50" alt="">
												</span>
												<div class="media-body">
													<h5 class="media-heading"><strong>Login</strong>
													</h5>
													<p class="small text-muted"><i class="fa fa-clock-o"></i> Yesterday at 4:32 PM</p>
													<p>Lorem ipsum dolor sit amet, consectetur...</p>
												</div>
											</div>
										</a>
									</li>
									<li class="message-preview">
										<a href="#">
											<div class="media">
												<span class="pull-left">
													<img class="media-object" src="http://placehold.it/50x50" alt="">
												</span>
												<div class="media-body">
													<h5 class="media-heading"><strong>John Smith</strong>
													</h5>
													<p class="small text-muted"><i class="fa fa-clock-o"></i> Yesterday at 4:32 PM</p>
													<p>Lorem ipsum dolor sit amet, consectetur...</p>
												</div>
											</div>
										</a>
									</li>
									<li class="message-footer">
										<a href="#">Read All New Messages</a>
									</li>
								</ul>
							</li>
							<li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-bell"></i> <b class="caret"></b></a>
								<ul class="dropdown-menu alert-dropdown">
									<li>
										<a href="#">Alert Name <span class="label label-default">Alert Badge</span></a>
									</li>
									<li>
										<a href="#">Alert Name <span class="label label-primary">Alert Badge</span></a>
									</li>
									<li>
										<a href="#">Alert Name <span class="label label-success">Alert Badge</span></a>
									</li>
									<li>
										<a href="#">Alert Name <span class="label label-info">Alert Badge</span></a>
									</li>
									<li>
										<a href="#">Alert Name <span class="label label-warning">Alert Badge</span></a>
									</li>
									<li>
										<a href="#">Alert Name <span class="label label-danger">Alert Badge</span></a>
									</li>
									<li class="divider"></li>
									<li>
										<a href="#">View All</a>
									</li>
								</ul>
							</li>
							<li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> John Smith <b class="caret"></b></a>
								<ul class="dropdown-menu">
									<li>
										<a href="#"><i class="fa fa-fw fa-user"></i> Profile</a>
									</li>
									<li>
										<a href="#"><i class="fa fa-fw fa-envelope"></i> Inbox</a>
									</li>
									<li>
										<a href="#"><i class="fa fa-fw fa-gear"></i> Settings</a>
									</li>
									<li class="divider"></li>
									<li>
										<a href="#"><i class="fa fa-fw fa-power-off"></i> Log Out</a>
									</li>
								</ul>
							</li>
						</ul>
						<!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
						<div class="collapse navbar-collapse navbar-ex1-collapse">
							<ul class="nav navbar-nav side-nav">
								<li class="active">
									<a href="index.jsp"><i class="fa fa-fw fa-dashboard"></i> Home</a>
								</li>
								<li>
									<a href="charts.jsp"><i class="fa fa-fw fa-bar-chart-o"></i> Order Dashboard</a>
								</li>
								<li>
									<a href="Quotation.jsp"><i class="fa fa-fw fa-edit"></i> Quotation</a>
								</li>
								<li>
									<a href="NewOrder.jsp"><i class="fa fa-fw fa-edit"></i> Order</a>
								</li>
								<li><a href="#"><i class="fa fa-fw fa-edit"></i>Proforma Invoice</a></li>
								<li><a href="#"><i class="fa fa-fw fa-edit"></i>Customs Clearance</a></li>
								<li><a href="#"><i class="fa fa-fw fa-edit"></i>Airway Bill Certificate</a></li>
								<li><a href="#"><i class="fa fa-fw fa-edit"></i>Invoice</a></li>
								<li>
								
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
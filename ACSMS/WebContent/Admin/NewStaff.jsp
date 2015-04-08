<!DOCTYPE html>
<html lang="en">
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    
	<title></title>
	
	<link href="../resources/css/bootstrap.min.css" rel="stylesheet">
	<link href="../resources/css/sb-admin.css" rel="stylesheet">
	<link href="../resources/css/plugins/morris.css" rel="stylesheet">
	<link href="../resources/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

 
    <script src="//code.jquery.com/jquery-1.10.2.js"></script>
    <script src="//code.jquery.com/ui/1.11.3/jquery-ui.js"></script>
    <script src="../resources/js/bootstrap.min.js"></script>
    <script src="../resources/js/plugins/morris/raphael.min.js"></script>

	<script src="../resources/scripts/Validation.js"></script>
	<script src="../resources/scripts/Admin.js"></script>

</head>
<body>

	<div id="wrapper">

		<!-- Navigation -->
		<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-ex1-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="../index.jsp">ACSMS</a>
			</div>
			<!-- Top Menu Items -->
			<ul class="nav navbar-right top-nav">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"><i class="fa fa-envelope"></i> <b
						class="caret"></b></a>
					<ul class="dropdown-menu message-dropdown">
						<li class="message-preview"><a href="#">
								<div class="media">
									<span class="pull-left"> <img class="media-object"
										src="http://placehold.it/50x50" alt="">
									</span>
									<div class="media-body">
										<h5 class="media-heading">
											<strong>Login</strong>
										</h5>
										<p class="small text-muted">
											<i class="fa fa-clock-o"></i> Yesterday at 4:32 PM
										</p>
										<p>Lorem ipsum dolor sit amet, consectetur...</p>
									</div>
								</div>
						</a></li>
						<li class="message-preview"><a href="#">
								<div class="media">
									<span class="pull-left"> <img class="media-object"
										src="http://placehold.it/50x50" alt="">
									</span>
									<div class="media-body">
										<h5 class="media-heading">
											<strong>Login</strong>
										</h5>
										<p class="small text-muted">
											<i class="fa fa-clock-o"></i> Yesterday at 4:32 PM
										</p>
										<p>Lorem ipsum dolor sit amet, consectetur...</p>
									</div>
								</div>
						</a></li>
						<li class="message-preview"><a href="#">
								<div class="media">
									<span class="pull-left"> <img class="media-object"
										src="http://placehold.it/50x50" alt="">
									</span>
									<div class="media-body">
										<h5 class="media-heading">
											<strong>John Smith</strong>
										</h5>
										<p class="small text-muted">
											<i class="fa fa-clock-o"></i> Yesterday at 4:32 PM
										</p>
										<p>Lorem ipsum dolor sit amet, consectetur...</p>
									</div>
								</div>
						</a></li>
						<li class="message-footer"><a href="#">Read All New
								Messages</a></li>
					</ul></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"><i class="fa fa-bell"></i> <b
						class="caret"></b></a>
					<ul class="dropdown-menu alert-dropdown">
						<li><a href="#">Alert Name <span
								class="label label-default">Alert Badge</span></a></li>
						<li><a href="#">Alert Name <span
								class="label label-primary">Alert Badge</span></a></li>
						<li><a href="#">Alert Name <span
								class="label label-success">Alert Badge</span></a></li>
						<li><a href="#">Alert Name <span class="label label-info">Alert
									Badge</span></a></li>
						<li><a href="#">Alert Name <span
								class="label label-warning">Alert Badge</span></a></li>
						<li><a href="#">Alert Name <span
								class="label label-danger">Alert Badge</span></a></li>
						<li class="divider"></li>
						<li><a href="#">View All</a></li>
					</ul></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"><i class="fa fa-user"></i> John Smith <b
						class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="#"><i class="fa fa-fw fa-user"></i> Profile</a>
						</li>
						<li><a href="#"><i class="fa fa-fw fa-envelope"></i>
								Inbox</a></li>
						<li><a href="#"><i class="fa fa-fw fa-gear"></i> Settings</a>
						</li>
						<li class="divider"></li>
						<li><a href="#"><i class="fa fa-fw fa-power-off"></i> Log
								Out</a></li>
					</ul></li>
			</ul>
			<!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
			<div class="collapse navbar-collapse navbar-ex1-collapse">
				<ul class="nav navbar-nav side-nav">
					<li class="active"><a href="../index.jsp"><i
							class="fa fa-fw fa-dashboard"></i> Home</a></li>
					<li><a href="../charts.jsp"><i
							class="fa fa-fw fa-bar-chart-o"></i> Order Dashboard</a></li>
					<li><a href="../Quotation.jsp"><i class="fa fa-fw fa-edit"></i>
							Quotation</a></li>
					<li><a href="../NewOrder.jsp"><i class="fa fa-fw fa-edit"></i>
							Order</a></li>
					<li><a href="#"><i class="fa fa-fw fa-edit"></i>Proforma
							Invoice</a></li>
					<li><a href="#"><i class="fa fa-fw fa-edit"></i>Customs
							Clearance</a></li>
					<li><a href="#"><i class="fa fa-fw fa-edit"></i>Airway
							Bill Certificate</a></li>
					<li><a href="#"><i class="fa fa-fw fa-edit"></i>Invoice</a></li>
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

		<div id="page-wrapper">

			<div class="container-fluid">

				<div class="row" style="height: 560px;">
					<form id="frmcreate" runat="server" action="../StaffBA" method="post">
						<div>

							<h3>NEW STAFF</h3>
							<hr />


							<select id="combTitle" name="combTitle" class="form-control"
								style="width: 75px; display: initial">
								<option selected="selected">Mr.</option>
								<option>Miss</option>
								<option>Mrs.</option>
								<option>Ms.</option>
								<option>Dr.</option>
							</select> <input id="txtFName" name="txtFName" type="text"
								placeholder="First Name" class="form-control"
								style="width: 122px; display: initial" /> <input id="txtLName"
								name="txtLName" type="text" placeholder="Last Name"
								class="form-control" style="width: 122px; display: initial" /> <br />
							<br /> <input id="txtPhone" name="txtPhone" type="text"
								placeholder="Phone" class="form-control"
								style="width: 122px; display: initial" />
							<br /> <br /> <input id="txtEmail"
								name="txtEmail" type="text" placeholder="Email"
								class="form-control" style="width: 122px; display: initial" /> <br />
							<br /> 
							
							<b>ADMIN </b> <input id="isAdmin" name="isAdmin" type="checkbox"
								style="display: initial;margin-left: 6px;" />
							<br /> <br /> 
							
						      <input type="submit" class="btn btn-success btn-danger addStaff" id="addStaff" name="add"  value="ADD" style="width: 122px; display: initial" value="ADD"/>
							 
                              <input id="Reset1" type="reset" name="reset" value="Clear" class="form-control btn-danger" style="width: 122px; display: initial" />
					</form>
				</div>

			</div>
		</div>
	</div>

</body>
</html>
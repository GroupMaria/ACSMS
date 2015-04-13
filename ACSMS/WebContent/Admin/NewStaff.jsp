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

		<%@include file="../Layout1.jsp" %> 
		
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
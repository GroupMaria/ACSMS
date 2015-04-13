<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>

<link href="../resources/css/bootstrap.min.css" rel="stylesheet">
<link href="../resources/css/sb-admin.css" rel="stylesheet">
<link href="../resources/css/plugins/morris.css" rel="stylesheet">
<link href="../resources/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

   
    <script src="//code.jquery.com/jquery-1.10.2.js"></script>
    <script src="../resources/js/bootstrap.min.js"></script>
    <script src="../resources/js/plugins/morris/raphael.min.js"></script>
	<script src="../resources/scripts/Validation.js"></script>
	<script src="../resources/scripts/Admin.js"></script>
</head>
<body>
	<div id="wrapper">

		   <%@include file="Layout.jsp" %> 
		
		<div id="page-wrapper">

			<div class="container-fluid">

				<div class="row" style="height: 560px;">
					<form id="frmremove" runat="server" action="StaffBA"
						type="post">
						<div>
                         <br /> 
                            
                            SEARCH STAFF :  <input id="staffId" name="staffId" type="text"
								placeholder="STAFF ID" class="form-control"
								style="width: 122px; display: initial" /> 
							<input id="submit" type="button" name="searchStaff"
								value="SEARCH" class="form-control btn-info searchStaff"
								style="width: 122px; display: initial" /> <br /> <br /> 
						<HR/>	
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
							
							<input id="submit" type="button" name="submit"
								value="DELETE" class="form-control btn-warning removeStaff"
								style="width: 122px; display: initial" />
					</form>
				</div>

			</div>
		</div>
	</div>
</body>
</html>
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

        <%@include file="Layout.jsp" %> 

		<div id="page-wrapper">

			<div class="container-fluid">

				<div class="row" style="height: 560px;">
					<form id="frmCustCreate" runat="server" action="../StaffBA" method="post">
						<div>
                         <br /> 
                            
                           <h3 class='stafflist'> STAFF LIST :</h3>
						<HR/>	
					    <table class="table staffs">
    <thead>
      <tr>
        <th>STAFF ID</th>
        <th>NAME</th>
        <th>EMAIL</th>
        <th>PHONE</th>
      </tr>
    </thead>
    <tbody>
      
    </tbody>
  </table>
					</form>
				</div>

			</div>
		</div>
	</div>
</body>
</html>
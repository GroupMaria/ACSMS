<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>ORDER STATUS</h3>
							<hr />


							<select id="combTitle" name="combTitle" class="form-control"
								style="width: 300px; display: initial">
								<option selected="selected">Status ID <br><Selected ="selected">Status Description</option>
								<option>1 <br>      Quotation Created</option></br>
								<option>2 <br>      Order Created </option></br>
								<option>3 <br>      Proforma Invoice Created</option></br>
								<option>4 <br>      Custom Clearance Completed</option></br>
								<option>5 <br>      AWB Certificate Generated</option></br>
								<option>6 <br>      Transport Carrier Booked</option></br>
								<option>7 <br> 		Shipment Received</option></br>
								<option>8 <br>      Order Completed </option></br>
								<option>8 <br>      Order Closed </option></br>
								
								
								
								
								
						
							
							<b>ADMIN </b> <input id="isAdmin" name="isAdmin" type="checkbox"
								style="display: initial;margin-left: 10px;" />
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
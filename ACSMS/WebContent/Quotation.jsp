<!DOCTYPE html>
<html lang="en">
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
     <script src="resources/scripts/Quotation.js"></script>
    <script src="resources/js/bootstrap.min.js"></script>

    <!-- Morris Charts JavaScript -->
    <script src="resources/js/plugins/morris/raphael.min.js"></script>
    <script src="resources/js/plugins/morris/morris.min.js"></script>
    <script src="resources/js/plugins/morris/morris-data.js"></script>
    
    <style>
    
    input[type="checkbox"], input[type="radio"] {
    margin-right: 5px;
    }
    </style>
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
                        <a href="Quotation.html"><i class="fa fa-fw fa-edit"></i> Quotation</a>
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
        <div class="row">
 
          <div class="col-md-12" style="margin-left: 9px;">
		 
			  <h3> Quotation Details</h3>
			  <br/>
			  
		  <form class="form-horizontal" action="QuotationAction" method="post">
		   <div class="row">

	    <div class="col-md-6">
	 
		<div class="form-group">
		   <label for="txtDatePrepared" class="col-sm-4 control-label">Date Prepared</label>
		   <div class="col-sm-8">
			 <input type="text" class="form-control" id="txtDatePrepared" name="DatePrepared">
		  </div>
		</div>
		<div class="form-group">
		   <label for="Product" class="col-sm-4 control-label">Product</label>
		   <div class="col-sm-8">
			 <input type="text" class="form-control" id="product" name="product">
		  </div>
		</div>
		<div class="form-group">
		   <label for="customer" class="col-sm-4 control-label">Customer</label>
		   <div class="col-sm-8">
			 <input type="text" class="form-control" id="customer" name="customer" style="width: 229px;display:inline">
			 <button class="btn btn-success btn-number NewCustomer" id="checkCustomer" name="chkCustomer" >
			 <span class="glyphicon glyphicon-plus"></span>
			 </button>
		  </div>
		</div>
		<div class="form-group">
		   <label for="ShippingFrom" class="col-sm-4 control-label">To be shipped <b>from</b></label>
		   <div class="col-sm-8">
			 <input type="text" class="form-control" id="ShippingFrom" name="shippingFrom">
		  </div>
		</div>
		<div class="form-group">
		   <label for="destinationCuontry" class="col-sm-4 control-label">Destination Country</label>
		   <div class="col-sm-8">
		   <select class="form-control" id="destinationCountry" name="destinationCuontry">
		<option value="AF">Afghanistan</option>
		<option value="AX">Åland Islands</option>
		<option value="AL">Albania</option>
		<option value="DZ">Algeria</option>
		<option value="AS">American Samoa</option>
		<option value="AD">Andorra</option>
		<option value="AO">Angola</option>
		<option value="AI">Anguilla</option>
		<option value="AQ">Antarctica</option>
		<option value="AG">Antigua and Barbuda</option>
		<option value="AR">Argentina</option>
		<option value="AM">Armenia</option>
		<option value="AW">Aruba</option>
		<option value="AU">Australia</option>
		<option value="AT">Austria</option>
		<option value="AZ">Azerbaijan</option>
		<option value="BS">Bahamas</option>
		<option value="BH">Bahrain</option>
		<option value="BD">Bangladesh</option>
		<option value="BB">Barbados</option>
		<option value="BY">Belarus</option>
		<option value="BE">Belgium</option>
		<option value="BZ">Belize</option>
		<option value="BJ">Benin</option>
		<option value="BM">Bermuda</option>
		<option value="BT">Bhutan</option>
		<option value="BO">Bolivia, Plurinational State of</option>
		<option value="BQ">Bonaire, Sint Eustatius and Saba</option>
		<option value="BA">Bosnia and Herzegovina</option>
		<option value="BW">Botswana</option>
		<option value="BV">Bouvet Island</option>
		<option value="BR">Brazil</option>
		<option value="IO">British Indian Ocean Territory</option>
		<option value="BN">Brunei Darussalam</option>
		<option value="BG">Bulgaria</option>
		<option value="BF">Burkina Faso</option>
		<option value="BI">Burundi</option>
		<option value="KH">Cambodia</option>
		<option value="CM">Cameroon</option>
		<option value="CA">Canada</option>
		<option value="CV">Cape Verde</option>
		<option value="KY">Cayman Islands</option>
		<option value="CF">Central African Republic</option>
		<option value="TD">Chad</option>
		<option value="CL">Chile</option>
		<option value="CN">China</option>
		<option value="CX">Christmas Island</option>
		<option value="CC">Cocos (Keeling) Islands</option>
		<option value="CO">Colombia</option>
		<option value="KM">Comoros</option>
		<option value="CG">Congo</option>
		<option value="CD">Congo, the Democratic Republic of the</option>
		<option value="CK">Cook Islands</option>
		<option value="CR">Costa Rica</option>
		<option value="CI">Côte d'Ivoire</option>
		<option value="HR">Croatia</option>
		<option value="CU">Cuba</option>
		<option value="CW">Curaçao</option>
		<option value="CY">Cyprus</option>
		<option value="CZ">Czech Republic</option>
		<option value="DK">Denmark</option>
		<option value="DJ">Djibouti</option>
		<option value="DM">Dominica</option>
		<option value="DO">Dominican Republic</option>
		<option value="EC">Ecuador</option>
		<option value="EG">Egypt</option>
		<option value="SV">El Salvador</option>
		<option value="GQ">Equatorial Guinea</option>
		<option value="ER">Eritrea</option>
		<option value="EE">Estonia</option>
		<option value="ET">Ethiopia</option>
		<option value="FK">Falkland Islands (Malvinas)</option>
		<option value="FO">Faroe Islands</option>
		<option value="FJ">Fiji</option>
		<option value="FI">Finland</option>
		<option value="FR">France</option>
		<option value="GF">French Guiana</option>
		<option value="PF">French Polynesia</option>
		<option value="TF">French Southern Territories</option>
		<option value="GA">Gabon</option>
		<option value="GM">Gambia</option>
		<option value="GE">Georgia</option>
		<option value="DE">Germany</option>
		<option value="GH">Ghana</option>
		<option value="GI">Gibraltar</option>
		<option value="GR">Greece</option>
		<option value="GL">Greenland</option>
		<option value="GD">Grenada</option>
		<option value="GP">Guadeloupe</option>
		<option value="GU">Guam</option>
		<option value="GT">Guatemala</option>
		<option value="GG">Guernsey</option>
		<option value="GN">Guinea</option>
		<option value="GW">Guinea-Bissau</option>
		<option value="GY">Guyana</option>
		<option value="HT">Haiti</option>
		<option value="HM">Heard Island and McDonald Islands</option>
		<option value="VA">Holy See (Vatican City State)</option>
		<option value="HN">Honduras</option>
		<option value="HK">Hong Kong</option>
		<option value="HU">Hungary</option>
		<option value="IS">Iceland</option>
		<option value="IN">India</option>
		<option value="ID">Indonesia</option>
		<option value="IR">Iran, Islamic Republic of</option>
		<option value="IQ">Iraq</option>
		<option value="IE">Ireland</option>
		<option value="IM">Isle of Man</option>
		<option value="IL">Israel</option>
		<option value="IT">Italy</option>
		<option value="JM">Jamaica</option>
		<option value="JP">Japan</option>
		<option value="JE">Jersey</option>
		<option value="JO">Jordan</option>
		<option value="KZ">Kazakhstan</option>
		<option value="KE">Kenya</option>
		<option value="KI">Kiribati</option>
		<option value="KP">Korea, Democratic People's Republic of</option>
		<option value="KR">Korea, Republic of</option>
		<option value="KW">Kuwait</option>
		<option value="KG">Kyrgyzstan</option>
		<option value="LA">Lao People's Democratic Republic</option>
		<option value="LV">Latvia</option>
		<option value="LB">Lebanon</option>
		<option value="LS">Lesotho</option>
		<option value="LR">Liberia</option>
		<option value="LY">Libya</option>
		<option value="LI">Liechtenstein</option>
		<option value="LT">Lithuania</option>
		<option value="LU">Luxembourg</option>
		<option value="MO">Macao</option>
		<option value="MK">Macedonia, the former Yugoslav Republic of</option>
		<option value="MG">Madagascar</option>
		<option value="MW">Malawi</option>
		<option value="MY">Malaysia</option>
		<option value="MV">Maldives</option>
		<option value="ML">Mali</option>
		<option value="MT">Malta</option>
		<option value="MH">Marshall Islands</option>
		<option value="MQ">Martinique</option>
		<option value="MR">Mauritania</option>
		<option value="MU">Mauritius</option>
		<option value="YT">Mayotte</option>
		<option value="MX">Mexico</option>
		<option value="FM">Micronesia, Federated States of</option>
		<option value="MD">Moldova, Republic of</option>
		<option value="MC">Monaco</option>
		<option value="MN">Mongolia</option>
		<option value="ME">Montenegro</option>
		<option value="MS">Montserrat</option>
		<option value="MA">Morocco</option>
		<option value="MZ">Mozambique</option>
		<option value="MM">Myanmar</option>
		<option value="NA">Namibia</option>
		<option value="NR">Nauru</option>
		<option value="NP">Nepal</option>
		<option value="NL">Netherlands</option>
		<option value="NC">New Caledonia</option>
		<option value="NZ">New Zealand</option>
		<option value="NI">Nicaragua</option>
		<option value="NE">Niger</option>
		<option value="NG">Nigeria</option>
		<option value="NU">Niue</option>
		<option value="NF">Norfolk Island</option>
		<option value="MP">Northern Mariana Islands</option>
		<option value="NO">Norway</option>
		<option value="OM">Oman</option>
		<option value="PK">Pakistan</option>
		<option value="PW">Palau</option>
		<option value="PS">Palestinian Territory, Occupied</option>
		<option value="PA">Panama</option>
		<option value="PG">Papua New Guinea</option>
		<option value="PY">Paraguay</option>
		<option value="PE">Peru</option>
		<option value="PH">Philippines</option>
		<option value="PN">Pitcairn</option>
		<option value="PL">Poland</option>
		<option value="PT">Portugal</option>
		<option value="PR">Puerto Rico</option>
		<option value="QA">Qatar</option>
		<option value="RE">Réunion</option>
		<option value="RO">Romania</option>
		<option value="RU">Russian Federation</option>
		<option value="RW">Rwanda</option>
		<option value="BL">Saint Barthélemy</option>
		<option value="SH">Saint Helena, Ascension and Tristan da Cunha</option>
		<option value="KN">Saint Kitts and Nevis</option>
		<option value="LC">Saint Lucia</option>
		<option value="MF">Saint Martin (French part)</option>
		<option value="PM">Saint Pierre and Miquelon</option>
		<option value="VC">Saint Vincent and the Grenadines</option>
		<option value="WS">Samoa</option>
		<option value="SM">San Marino</option>
		<option value="ST">Sao Tome and Principe</option>
		<option value="SA">Saudi Arabia</option>
		<option value="SN">Senegal</option>
		<option value="RS">Serbia</option>
		<option value="SC">Seychelles</option>
		<option value="SL">Sierra Leone</option>
		<option value="SG">Singapore</option>
		<option value="SX">Sint Maarten (Dutch part)</option>
		<option value="SK">Slovakia</option>
		<option value="SI">Slovenia</option>
		<option value="SB">Solomon Islands</option>
		<option value="SO">Somalia</option>
		<option value="ZA">South Africa</option>
		<option value="GS">South Georgia and the South Sandwich Islands</option>
		<option value="SS">South Sudan</option>
		<option value="ES">Spain</option>
		<option value="LK">Sri Lanka</option>
		<option value="SD">Sudan</option>
		<option value="SR">Suriname</option>
		<option value="SJ">Svalbard and Jan Mayen</option>
		<option value="SZ">Swaziland</option>
		<option value="SE">Sweden</option>
		<option value="CH">Switzerland</option>
		<option value="SY">Syrian Arab Republic</option>
		<option value="TW">Taiwan, Province of China</option>
		<option value="TJ">Tajikistan</option>
		<option value="TZ">Tanzania, United Republic of</option>
		<option value="TH">Thailand</option>
		<option value="TL">Timor-Leste</option>
		<option value="TG">Togo</option>
		<option value="TK">Tokelau</option>
		<option value="TO">Tonga</option>
		<option value="TT">Trinidad and Tobago</option>
		<option value="TN">Tunisia</option>
		<option value="TR">Turkey</option>
		<option value="TM">Turkmenistan</option>
		<option value="TC">Turks and Caicos Islands</option>
		<option value="TV">Tuvalu</option>
		<option value="UG">Uganda</option>
		<option value="UA">Ukraine</option>
		<option value="AE">United Arab Emirates</option>
		<option value="GB">United Kingdom</option>
		<option value="US">United States</option>
		<option value="UM">United States Minor Outlying Islands</option>
		<option value="UY">Uruguay</option>
		<option value="UZ">Uzbekistan</option>
		<option value="VU">Vanuatu</option>
		<option value="VE">Venezuela, Bolivarian Republic of</option>
		<option value="VN">Viet Nam</option>
		<option value="VG">Virgin Islands, British</option>
		<option value="VI">Virgin Islands, U.S.</option>
		<option value="WF">Wallis and Futuna</option>
		<option value="EH">Western Sahara</option>
		<option value="YE">Yemen</option>
		<option value="ZM">Zambia</option>
		<option value="ZW">Zimbabwe</option>
	  </select>        
		  </div>
		</div>
		<div class="form-group">
		   <label for="termsOfPayment" class="col-sm-4 control-label">Terms of Payment</label>
		   <div class="col-sm-8">
			 <input type="text" class="form-control" id="termsOfPayment" name="termsOfPayment">
		  </div>
		</div>
	    <div class="form-group">
		   <label for="modeofTransport" class="col-sm-4 control-label">Mode of Transport</label>
		   <div class="col-sm-8">
			 <input type="text" class="form-control" id="modeofTransport" name="modeofTransport">
		  </div>
		</div>
	  </div>
	  
	  <div class="col-md-6">
		<div class="form-group">
		   <label for="refNumber" class="col-sm-4 control-label">Ref No</label>
		   <div class="col-sm-8">
			 <input type="text" class="form-control" id="refNumber" name="refNumber">
		  </div>
		</div>
		<div class="form-group">
		   <label for="EstimatedShipDate" class="col-sm-4 control-label">Estimated Ship date</label>
		   <div class="col-sm-8">
			 <input type="text" class="form-control" id="EstimatedShipDate" name="estimatedShipDate">
		  </div>
		</div>
		<div class="form-group">
		   <label for="packedDimensions" class="col-sm-4 control-label">Packed Dimensions</label>
		   <div class="col-sm-8">
			 <input type="text" class="form-control" id="packedDimensions" name="packedDimensions">
		  </div>
		</div>
		  <div class="form-group">
		   <label for="ShippingTo" class="col-sm-4 control-label">To be shipped <b>To</b></label>
		   <div class="col-sm-8">
			 <input type="text" class="form-control" id="ShippingTo" name="ShippingTo">
		  </div>
		</div>
		<div class="form-group">
		   <label for="packedWeight" class="col-sm-4 control-label">Packed Weight</label>
		   <div class="col-sm-8">
			 <input type="text" class="form-control" id="packedWeight" name="packedWeight">
		  </div>
		</div>
		<div class="form-group">
		   <label for="packedCube" class="col-sm-4 control-label">Packed Cube</label>
		   <div class="col-sm-8">
			 <input type="text" class="form-control" id="packedCube" name="packedCube">
		  </div>
		</div>
		
	  </div>
	  
	 </div>
		    <hr/>
		   <p class="bg-primary" style="padding: 16px;font-weight: bold;font-size: 19px;">Pricing Information </p>
		   <div class="row">
		   <table style="width: 95%; margin-left: 37px;">
		   <tr>
		   <td style="width:75%">
		   <b>  Total selling price of the product </b> .................................................................................................................. 
		   
		   </td>
		   <td  style="width:25%">
			   <div class="input-group">
				<div class="input-group-addon">$</div>
				<input type="number" class="form-control" id="productSellingPrice" name="productSellingPrice">    
			  </div>
		   </td>
		   </tr>
		   <tr>
			 <td style="width:75%">
			  <br/>
		     <b> Special Export Packing </b> .................................................................................................................................
		     </td>
		     <td  style="width:25%">
		    <br/>
			   <div class="input-group">
				<div class="input-group-addon">$</div>
				<input type="number" class="form-control" id="exportPackingPrice" name="exportPackingPrice">    
			  </div>
		   </td>
		   </tr>
		   <tr>
		   <td colspan="2">
				  <div style="padding-top: 13px;">
				    <span class="" style="width: 10px;">$</span>
					<input class="" id="productSellingPriceQuote" name="productSellingPriceQuote" style="width:150px" type="text"> 
					Quoted by : <input id="sellingPriceQuotedBy" name="sellingPriceQuotedBy" style="width:150px" type="text"> 		
				  </div>
		   </td>
		   </tr>		   
	       <tr>
			 <td style="width:75%">
			 <br/><br/>
		     <b> Inland Freight </b> ..................................................................................................................................................
		     </td>
		     <td  style="width:25%">
		       <br/><br/>
			   <div class="input-group">
				<div class="input-group-addon">$</div>
				<input type="number" class="form-control" id="inlandFreightPrice" name="inlandFreightPrice">    
			  </div>
		    </td>
		    </tr>		   
		   <tr>
		   <td colspan="2">
				  <div style="padding-top: 13px;">
				    <span class="" style="width: 10px;">$</span>
					<input class="" id="inlandFreightQuote" name="inlandFreightQuote" style="width:150px" type="text"> 
					Quoted by : <input id="inlandFreightQuotedBy" name="inlandFreightQuotedBy" style="width:150px" type="text"> 		
				  </div>
				  <div>

				   <div style="margin-top: 13px;">
				   Inland Freight Includes : 
				
				   <input type="checkbox" name="Unloading" value="Unloading">Unloading &nbsp;&nbsp;
                   <input type="checkbox" name="PierDelivery" value="PierDelivery">Pier Delivery &nbsp;&nbsp;
				   <input type="checkbox" name="TerminalHandling" value="TerminalHandling">Terminal Handling  &nbsp;&nbsp;
				   <input type="checkbox" name="Others" value="Others">Others  <input id="inlandFreightothers" name="inlandFreightothers" style="width:117px" type="text"> 	
				    </div>
				  </div>
		   </td>
		   </tr>		   
		   <tr>
		   <td style="width:75%">
			 <br/><br/>
		     <b> International Freight </b> .......................................................................................................................................
		     </td>
		   <td  style="width:25%">
		       <br/><br/>
			   <div class="input-group">
				<div class="input-group-addon">$</div>
				<input type="number" class="form-control" id="InternationalFreightPrice" name="InternationalFreightPrice">    
			  </div>
		   </td>
		   </tr>	   
		   <tr>
		   <td colspan="2">
				  <div style="padding-top: 13px;">
				    <span class="" style="width: 10px;">$</span>
					<input class="" id="inlandFreightQuote" name="InternationalFreightQuote1" style="width:150px" type="text"> 
					Quoted by : <input id="InternationalFreightQuotedBy" name="InternationalFreightQuotedBy" style="width:150px" type="text"> 		
				  </div>
				 
				 <div>
				   <div style="margin-top: 13px;">
				   Air Freight Includes : 
				   <input type="checkbox" name="FuelAdjustments" value="FuelAdjustments">Fuel Adjustments &nbsp;&nbsp;
                   <input type="checkbox" name="ContainerStuffing" value="ContainerStuffing">Container Stuffing &nbsp;&nbsp;
				   <input type="checkbox" name="OthersAirFreight" value="OthersAirFreight">Others  <input id="inlandFreightothers" name="inlandFreightothers" style="width:117px" type="text"> 	
				    </div>
				  </div>
		       </td>
		   </tr>		   
           <tr>
			 <td style="width:75%">
			 <br/><br/>
		     <b> Insurance </b> ..........................................................................................................................................................
		     </td>
		     <td  style="width:25%">
		       <br/><br/>
			   <div class="input-group">
				<div class="input-group-addon">$</div>
				<input type="number" class="form-control" id="Insurance" name="Insurance">    
			  </div>
		   </td>
		   </tr>	   
		   <tr>
		   <td colspan="2">

				 
				 <div>
				   <div style="margin-top: 13px;">
				    Includes : &nbsp;&nbsp;
				   <input type="checkbox" name="AllRisk" value="AllRisk">All Risk &nbsp;&nbsp;
                   <input type="checkbox" name="SRCC" value="SRCC">SR&CC &nbsp;&nbsp;
				   <input type="checkbox" name="WarRisk" value="WarRisk">War Risk  
				   </div>
				  </div>
		       </td>
		   </tr>		   
		   <tr>
		   <td style="width:75%">
		   <br/><br/>
		   <b>  Forwarding Fees </b> ......................................................................................................................................... 
		   
		   </td>
		   <td  style="width:25%">
		   <br/><br/>
			   <div class="input-group">
				<div class="input-group-addon">$</div>
				<input type="number" class="form-control" id="ForwardingFees" name="ForwardingFees">    
			  </div>
		   </td>
		   </tr>		   
		   <tr>
		   <td style="width:75%">
		   <b>  Consular / Legalization  </b> ...............................................................................................................................
		   
		   </td>
		   <td  style="width:25%">
			   <div class="input-group">
				<div class="input-group-addon">$</div>
				<input type="number" class="form-control" id="ConsularPrice" name="ConsularPrice">    
			  </div>
		   </td>
		   </tr>		   
		   <tr>
		   <td style="width:75%">
		   <b>  Inspection Fees </b> ........................................................................................................................................... 
		   
		   </td>
		   <td  style="width:25%">
			   <div class="input-group">
				<div class="input-group-addon">$</div>
				<input type="number" class="form-control" id="InspectionFees" name="InspectionFees">    
			  </div>
		   </td>
		   </tr>	   
		   <tr>
		   <td style="width:75%">
		   <b>  Banking Charges </b> ........................................................................................................................................
		   
		   </td>
		   <td  style="width:25%">
			   <div class="input-group">
				<div class="input-group-addon">$</div>
				<input type="number" class="form-control" id="BankingCharges" name="BankingCharges">    
			  </div>
		   </td>
		   </tr>		   
		   <tr>
		   <td style="width:75%">
		   <b>  Other Charges </b> ........................................................................................................................................
		   
		   </td>
		   <td  style="width:25%">
			   <div class="input-group">
				<div class="input-group-addon">$</div>
				<input type="number" class="form-control" id="OtherCharges" name="OtherCharges">    
			  </div>
		   </td>
		   </tr>
		   <tr>
		   <td Colspan="2">
					   <table>
					   <tr>
					   <td style="width:15%">
					   <br/>
					   1.<input type="text" id="OtherCharge1Name" class="form-control" name="OtherCharge1Name" placeholder="Other Charge" style="width: 256px; display:inline;margin-left: 24px;"> :
					   
							$<input type="number"  class="form-control" id="OtherCharge1" name="OtherCharge1" style="width: 68px; display:inline">    			 
						</td>
					   </tr>
						<tr>
					   <td style="width:15%">
						<br/>
					   2.<input type="text"  id="OtherCharge2Name" class="form-control" name="OtherCharge2Name" placeholder="Other Charge" style="width: 256px; display:inline;margin-left: 24px;"> :
					  
						   $<input type="number"  id="OtherCharge2" class="form-control" name="OtherCharge2" style="width: 68px; display:inline">    
						 
						</td>
					  </tr>
					   </table>
		   </td>
		   </tr>
		   <tr>
		   <td Colspan="2">
		   <hr/>
		   </td>
		   </tr>
		   <tr>
		   
		   <td style="width:75%;float: right;">
		  
		   <br/>
		   <h4>  Total Export quotation :</h4> 
		   
		   </td>
		   <td  style="width:25%">
		    
		   <br/>
			   <div class="input-group">
				<div class="input-group-addon">$</div>
				<input type="text" class="form-control" id="TotalExportquotation" name="TotalExportquotation">    
			  </div>
		   </td>
		   </tr>
		   <tr>
		   <td colspan="2" align="right">
		   <br/><br/>
		   <input type="submit" class="form-control btn-danger" value="Submit Quotation" id="TotalExportquotation" name="TotalExportquotation" style="width: 243px; font-weight: bolder; height: 51px;">   
		   </td>
		   </tr>
		   
		   </table>
		   </div>
	     
	      </form>	 </div> 
		</div>
     </div>
       
       
       
       
       
       
       
       </div>   
  </div>

<div class="NewCustomerForm">

New customer form

</div>
</body>
</html>

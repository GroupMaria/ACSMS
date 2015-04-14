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

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>


 
    <div>

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
                <li>
                
                    <a href="Login.jsp"><i class="fa fa-fw fa-power-off"></i> Log in</a>
                </li>
                
            </ul>
     </nav>
        <div id="page-wrapper">

            <div class="container-fluid">
            
            <div class="row" style="height: 560px;">
             
             <form class="form-horizontal" action="OrderClosingBA" method="post">
               <input type="hidden" name="user" value="customer">
             <h3>Track Order</h3><hr/> <br/>
              <div class="form-group">
    			<label for="inputEmail3" class="col-sm-2 control-label">ORDER ID :</label>
   				    <div class="col-sm-10">
     			 		<input type="text" class="form-control" id="OrderId" name="OrderId" style="width: 213px;">
    				</div>
 				 </div>
  
               <div class="form-group">
                  <div class="col-sm-offset-2 col-sm-10">

                   &nbsp;   

                   &nbsp;   <input type="submit" value="Search" class="form-control btn-primary" id="OrderIdSearch" name="OrderIdSearch" style="width: 141px;">
                  </div>
              </div>
			 </form>

             </div>
            
            </div>         
      </div>
     </div>

    <script src="resources/js/jquery.js"></script>
    <script src="resources/js/bootstrap.min.js"></script>
    <script src="resources/js/plugins/morris/raphael.min.js"></script>
    <script src="resources/js/plugins/morris/morris.min.js"></script>
    <script src="resources/js/plugins/morris/morris-data.js"></script>

</body>
</html>
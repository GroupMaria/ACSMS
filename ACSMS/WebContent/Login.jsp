<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		 <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>ACSMS</title>

    <!-- Bootstrap Core CSS -->
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="resources/css/sb-admin.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="resources/css/plugins/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
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

	 <style>	
	  body {
		background: #eee !important;	
		}
		.wrapper {	
	     margin-top: 80px;
		  margin-bottom: 80px;
		}
	   .form-signin
	   {
	      max-width: 380px;
	      padding: 15px 35px 45px;
	      margin: 0 auto;
	      background-color: #fff;
	      border: 1px solid rgba(0,0,0,0.1);
	   }
	  .form-signin-heading,.checkbox {
		  margin-bottom: 30px;
		}
		.checkbox {
		  font-weight: normal;
		}
		input[type="text"] {
		  margin-bottom: -1px;
		  border-bottom-left-radius: 0;
		  border-bottom-right-radius: 0;
		}
		input[type="password"] {
		  margin-bottom: 20px;
		  border-top-left-radius: 0;
		  border-top-right-radius: 0;
		}
		.profile-img-card {
	    width: 96px;
	    height: 96px;
	    margin: 0px auto 10px;
	    display: block;
	    border-radius: 50%;
     }
		</style>
	
	</head>
	<body>
	 <div id="wrapper">

     <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html">ACSMS</a>
            </div>
            <!-- Top Menu Items -->
           <ul class="nav navbar-right top-nav">
                <li><a href="TrackOrder.jsp"><i class="fa fa-fw fa-dashboard"></i> Track Order Status</a></li>
                <li>
                
                    <a href="Login.jsp"><i class="fa fa-fw fa-power-off"></i> Log in</a>
                </li>
                
            </ul>
         
          
     </nav>
     
       <div class="wrapper">
		     <form id="loginForm" method="POST" action="LoginAuthenticate.jsp"  style="max-width: 380px;padding: 15px 35px 45px;margin: 0 auto;background-color: #fff;border: 1px solid rgba(0,0,0,0.1);">   
		      <h2 class="form-signin-heading">ACSMS Member login</h2>
		      
		      <b>
		      <img id="profile-img" class="profile-img-card" src="//ssl.gstatic.com/accounts/ui/avatar_2x.png">
		      <font color="red">
		        	<c:if test="${not empty param.errMsg}">
		            <c:out value="${param.errMsg}" />
		            </c:if>
		     </font>
		      </b>
		      
		     <div style="padding-top: 16px; padding-bottom: 11px;">
		      <input type="text" class="form-control" style="position: relative;font-size: 16px;height: auto;padding: 10px;" id="username" name="username" value="" required="" title="Please enter you username" placeholder="example@gmail.com">
		      <input type="password" class="form-control" style="position: relative;font-size: 16px;height: auto;padding: 10px;margin-top: 29px" id="password" name="password" value="" required="" title="Please enter your password" placeholder="password">   
		     </div>
		      <button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>   
		    </form>
		      
       </div>
  
  
     </div>
        
	</body>
</html>
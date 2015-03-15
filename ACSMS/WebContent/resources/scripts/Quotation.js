$(document).ready(function () {
    $(".NewCustomer").click(function () {
      
        $(".NewCustomerForm").dialog({
            open: function(event, ui) {
            	$(this).load('CustCreate.html', function() {
            		//$(".side-nav").css({ left: 0});
    		     });
    		   },
            width: 570,
            height: 472,
            modal: true,
            draggable: true,
            close: function () {
                $("#thedialog").attr('src', "about:blank");
            }
        });
        $(".ui-dialog-titlebar").hide();
       
        return false;
    });
    
    $(".closePopup").click(function () {
      	 $(".NewCustomerForm").dialog("close");
    });
    
    $(document).on('click', '.addCustomer', function(){ 
  
	 $.post('CustomerBA',
			                {combTitle: $("#combTitle").val(),
 								txtFName: $("#txtFName").val(),
 								txtLName:$("#txtLName").val() ,
 								txtCompany: $("#txtCompany").val(),
 								txtStreet: $("#txtStreet").val() ,
 								txtCity: $("#txtCity").val() ,
 								combProvince: $("#combProvince").val() ,
 								txtPosCod: $("#txtPosCod").val(),
 								txtCountry: $("#txtCountry").val(),
 								txtPhone:  $("#txtPhone").val() ,
 								txtEmail: $("#txtEmail").val()
                              },
        function(responseText) {
		   $("#customer").val(responseText); 
		   $(".NewCustomerForm").dialog("close");
    });

	 
    	
   });
    
});
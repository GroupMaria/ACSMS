$(document).ready(function () {
	
	 $("#txtDatePrepared").datepicker();
	 $("#EstimatedShipDate").datepicker();
	 
	 
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
    
    $(document).on('click', '.closePopup', function(){ 
      	 $(".NewCustomerForm").dialog("close");
    });
    
    $(document).on('click', '.addCustomer', function(e){ 
  
    	$.ajax({
		    type: 'POST', 
		    url: 'CustomerBA',
		    dataType: 'JSON',
		    data: {     combTitle: $("#combTitle").val(),
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
		    success: function(data) {
		    	  $("#customer").val(data.Custid); 
				   $(".NewCustomerForm").dialog("close");	
		    },
		    error: function(data) {
		        alert(data.responseText);
		    }
		});
		
		e.preventDefault();

   });
      
    
    $("#productSellingPrice,#exportPackingPrice,#inlandFreightPrice,#InternationalFreightPrice,#Insurance,#ForwardingFees,#ConsularPrice,#InspectionFees,#BankingCharges,#OtherCharges").change(function() {
    		  updateTotalCharge();
      });
    
    $("#OtherCharge1,#OtherCharge2").change(function() {
    	 var total=0;
    	 total+=$("#OtherCharge1").val().trim().length >0 ?  parseFloat($("#OtherCharge1").val().trim()) : 0;
    	 total+=$("#OtherCharge2").val().trim().length >0 ?  parseFloat($("#OtherCharge2").val().trim()) : 0;
    	 $("#OtherCharges").val(total);
});
    function updateTotalCharge(){
    	 var total=0;
    	 total+=$("#productSellingPrice").val().trim().length >0 ?  parseFloat($("#productSellingPrice").val().trim()) : 0;
         total+=$("#exportPackingPrice").val().trim().length >0 ?  parseFloat($("#exportPackingPrice").val().trim()) : 0;
    	 total+=$("#inlandFreightPrice").val().trim().length >0 ?  parseFloat($("#inlandFreightPrice").val().trim()) : 0;
    	 total+=$("#InternationalFreightPrice").val().trim().length >0 ?  parseFloat($("#InternationalFreightPrice").val().trim()) : 0;
    	 
    	 total+=$("#Insurance").val().trim().length >0 ?  parseFloat($("#Insurance").val().trim()) : 0;
    	 total+=$("#ForwardingFees").val().trim().length >0 ?  parseFloat($("#ForwardingFees").val().trim()) : 0;
    	 total+=$("#ConsularPrice").val().trim().length >0 ?  parseFloat($("#ConsularPrice").val().trim()) : 0;
    	 total+=$("#InspectionFees").val().trim().length >0 ?  parseFloat($("#InspectionFees").val().trim()) : 0;
    	 
    	 total+=$("#BankingCharges").val().trim().length >0 ?  parseFloat($("#BankingCharges").val().trim()) : 0;
    	 total+=$("#OtherCharges").val().trim().length >0 ?  parseFloat($("#OtherCharges").val().trim()) : 0;
    	 
    	 $("#TotalExportquotation").val(total);
    }
    
    

});
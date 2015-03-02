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
    
});
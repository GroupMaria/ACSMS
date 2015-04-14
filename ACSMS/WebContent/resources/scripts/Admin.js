$(document).ready(function () {
	
  if($('.stafflist').length)
	{
			$.ajax({
			    type: 'POST', 
			    url: '../StaffBA',
			    data: { 
		    		toaction: "ListStaffs"
		        },
			    success: function(data) {
			    	var staffs=data.staff;
			    	
			    	    $.each(data, function(i, staff) {
			    	        var $tr = $('<tr>').append(
			    	            $('<td>').text(staff.staffId),
			    	            $('<td>').text(staff.txtFName + " " + staff.txtLName), 
			    	            $('<td>').text(staff.txtEmail), 
			    	            $('<td>').text(staff.txtPhone)
			    	        );
			    	        $tr.appendTo('.staffs');
			    	    });
			    },
			    error: function(data) {
			        alert(data.responseText);
			    }
			});
	
	}
  
	$(document).on('click', '#addStaff', function(e){ 
	
	
		$.ajax({
		    type: 'POST', 
		    url: '../StaffBA',
		    dataType: 'JSON',
		    data: { 
		    	    staffId: $("#staffId").val(),
		            combTitle: $("#combTitle").val(),
					txtFName: $("#txtFName").val(),
					txtLName:$("#txtLName").val() ,
					txtPhone:  $("#txtPhone").val() ,
					txtEmail: $("#txtEmail").val(),
					isAdmin: $("#isAdmin").is(':checked'),
					toaction: "Add"
		    },
		    success: function(data) {
		    	
		    },
		    error: function(data) {
		        alert(data.responseText);
		    }
		});
		
		e.preventDefault();
    });
	
	$(document).on('click', '.updateStaff', function(e){ 
		
		$.ajax({
		    type: 'POST', 
		    url: '../StaffBA',
		    dataType: 'JSON',
		    data: { 
		    	    staffId: $("#staffId").val(),
		            combTitle: $("#combTitle").val(),
					txtFName: $("#txtFName").val(),
					txtLName:$("#txtLName").val() ,
					txtPhone:  $("#txtPhone").val() ,
					txtEmail: $("#txtEmail").val(),
					isAdmin: $("#isAdmin").is(':checked'),
					toaction: "Update"
		    },
		    success: function(data) {
		    	  
		    },
		    error: function(data) {
		        alert(data.responseText);
		    }
		});
		
		
//		$.ajax({
//		    type: 'POST', 
//		    url: '../DBGeneration',
//		    dataType: 'JSON',
//		    success: function(data) {
//		    	alert('Database created');
//		    },
//		    error: function(data) {
//		        alert(data.responseText);
//		    }
//		});
		
		e.preventDefault();
	});
	
	$(document).on('click', '.removeStaff', function(e){ 
		
		$.ajax({
		    type: 'POST', 
		    url: '../StaffBA',
		    dataType: 'JSON',
		    data: { 
		    	    staffId: $("#staffId").val(),
		            combTitle: $("#combTitle").val(),
					txtFName: $("#txtFName").val(),
					txtLName:$("#txtLName").val() ,
					txtPhone:  $("#txtPhone").val() ,
					txtEmail: $("#txtEmail").val(),
					isAdmin: $("#isAdmin").is(':checked'),
					toaction: "Delete"
		    },
		    success: function(data) {
		    	
		    },
		    error: function(data) {
		        alert(data.responseText);
		    }
		});
		
		e.preventDefault();
  
	});
	
	$(document).on('click', '.searchStaff', function(e){ 
		
		$.ajax({
		    type: 'POST', 
		    url: '../StaffBA',
		    dataType: 'JSON',
		    data: { 
		    	    staffId: $("#staffId").val(),
					toaction: "Search"
		    },
		    success: function(data) {
		    	
		    	if(data.combTitle != null)
		        {
			    	$("#combTitle option[value='"+data.combTitle+"']").attr('selected', 'selected');
					$("#txtFName").val(data.txtFName);
					$("#txtLName").val(data.txtLName);
				    $("#txtPhone").val(data.txtPhone);
				   	$("#txtEmail").val(data.txtEmail);
				   	$("#isAdmin").prop( "checked", data.isAdmin );
		        }
		    	else
		        {
		    		alert(data.Error);
		        }
		    },
		    error: function(data) {
		    	$("#combTitle").val();
				$("#txtFName").val();
				$("#txtLName").val();
			    $("#txtPhone").val();
			   	$("#txtEmail").val();
				$("#isAdmin").val();    
		    }
		});
		e.preventDefault();
  
	});
	
	
	
	
});
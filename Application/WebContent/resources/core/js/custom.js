/**
 * 
 */

function redriectPage(page) {
		window.location.assign("http://localhost:8080/Application/"+page)
}



function clientValidationMessae(){
	
	var success = "alert alert-success";
	var warning = "alert alert-warning";
	var error = "alert alert-danger";
	var cssStyle = "";
	
	if(1 == status){
		
		cssStyle = success;
		
	}else if (2 == status) {
		
		cssStyle = warning;
		
	}else if (3 == status) {
		
		cssStyle = error;
		
	}
	$("#messageBox").addClass("alert alert-success");
	$('#messageBox').removeClass("disabled");
	$('#message').val(message);
	

	setTimeout(function() {
		$("#messageBox").addClass("disabled");
	}, 1200);
	
}

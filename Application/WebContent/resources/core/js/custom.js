/**
 * 
 */

function redriectPage(page) {
		window.location.assign("http://localhost:8080/Application/"+page)
}



function clientValidationMessae(messages , status){
	
	var success = "alert alert-success";
	var warning = "alert alert-warning";
	var error = "alert alert-danger";
	var cssStyle = "";
	
	$('#message').text(messages);
	
	if(1 == status){
		
		cssStyle = success;
		
	}else if (2 == status) {
		
		cssStyle = warning;
		
	}else if (3 == status) {
		
		cssStyle = error;
		
	}
	$('#message').text(messages);
	$("#messageBox").addClass(cssStyle);
	$('#messageBox').removeClass("disabled");
	
	

	setTimeout(function() {
		$("#messageBox").addClass("disabled");
	}, 2500);
	

	
}

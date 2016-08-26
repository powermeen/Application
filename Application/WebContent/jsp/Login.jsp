<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">




<title>Login Page</title>
<jsp:include page="../CssJSMain.jsp"></jsp:include>


<script type="text/javascript">
	$(document).ready(function() {

		submitForm();
	});

	function submitForm() {
		$("#loginButton").click(function() {
			 		    	alert( "Handler for .submit() called." );

// 			window.location.assign("../jsp/DisplayData.jsp")
			var username = $("#username").val();
			var password = $("#password").val();

			$.post("/Application/LoginServlet", {
				username : username,
				password : password
			}, function(data) {
				$.each(data, function(key, value) {
					console.log(value);
				});
			});

		});
	}
</script>


</head>
<body>

	<div class="pen-title">
		<h1>Login Form</h1>
		<!-- 		<span>Pen <i class='fa fa-paint-brush'></i> + <i -->
		<!-- 			class='fa fa-code'></i> by <a href='http://andytran.me'>Andy Tran</a></span> -->
	</div>
	<!-- Form Module-->
	<div class="module form-module">
		<div class="toggle">
			<i class="fa fa-times fa-pencil"></i>
			<!-- 			<div class="tooltip">Click Me</div> -->
		</div>
		<div class="form">
			<h2>Login to your account</h2>
			<form id="loginForm">
				<input type="text" id="username" placeholder="Username" /> <input
					type="password" id="password" placeholder="Password" />
				<button id="loginButton">Login</button>
			</form>
		</div>
		<!-- 		<div class="form"> -->
		<!-- 			<h2>Create an account</h2> -->
		<!-- 			<form> -->
		<!-- 				<input type="text" placeholder="Username" /> <input type="password" -->
		<!-- 					placeholder="Password" /> <input type="email" -->
		<!-- 					placeholder="Email Address" /> <input type="tel" -->
		<!-- 					placeholder="Phone Number" /> -->
		<!-- 				<button>Register</button> -->
		<!-- 			</form> -->
		<!-- 		</div> -->
		<div class="cta">
			<a href="">Forgot your password?</a>
		</div>
	</div>
	<!-- 	<script -->
	<!-- 		src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script> -->
	<!-- 	<script src='http://codepen.io/andytran/pen/vLmRVp.js'></script> -->

	<!-- 	<script src="js/index.js"></script> -->

</body>
</html>
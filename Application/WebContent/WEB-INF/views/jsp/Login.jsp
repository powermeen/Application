<%@include file="include.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">





<title>Login Page</title>
<jsp:include page="CssJSMain.jsp"></jsp:include>


<script type="text/javascript">
	// 	$(document).ready(function() {

	// 		submitForm();
	// 	});

	// 	function submitForm() {
	// 		$("#loginButton").click(function() {
	// 			 		    	alert( "Handler for .submit() called." );

	// // 			window.location.assign("../jsp/DisplayData.jsp")
	// 			var username = $("#username").val();
	// 			var password = $("#password").val();

	// 			$.post("/Application/LoginServlet", {
	// 				username : username,
	// 				password : password
	// 			}, function(data) {
	// 				$.each(data, function(key, value) {
	// 					console.log(value);
	// 				});
	// 			});

	// 		});
	// 	}
</script>


</head>
<body>

	<div class="pen-title">
		<h1>Login Form</h1>
	</div>
	<!-- Form Module-->
	<div class="module form-module">
		<div class="toggle">
			<i class="fa fa-times fa-pencil"></i>
		</div>
		<div class="form">
			<h2>Login to your account</h2>
			<%-- 			<form:form  method="post" action="login"  modelAttribute="login"> --%>
			<%-- 				<form:input id="username"  path="username"/> --%>
			<%-- 				<form:password id="password"  path="password" /> --%>
			<!-- 				<button id="loginButton" type="submit">Login</button> -->
			<%-- 			</form:form> --%>
			<form:form method="post" action="loginForm" modelAttribute="loginBean">
			
			
			<form:label path="userName">User name</form:label>
			<form:input path="userName" />
			<form:label path="userName">Password</form:label>
			<form:password path="password"/>
			
			<input id="loginButton" type="submit" value="Submit" />
			</form:form>
			
			
			
				
		</div>
		<div class="cta">
			<a href="">Forgot your password?</a>
		</div>
	</div>

</body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Login Page</title>
<jsp:include page="CssJSMain.jsp"></jsp:include>


<script type="text/javascript">
	
</script>


</head>
<body>

	<div class="pen-title">
		<h1 id = "loginForm">Login Form</h1>
	</div>
	<!-- Form Module-->
	<div class="module form-module">
		<div class="toggle">
			<i class="fa fa-times fa-pencil"></i>
		</div>
		<div class="form">
			<h2>Login to your account</h2>
			<form:form method="post" action="loginForm"
				modelAttribute="loginModel">

				<form:input path="userName" />

				<form:password path="password" />

				<input id="loginButton" type="submit" value="Submit" />

			</form:form>

		</div>
		<div class="cta">
			<a href="">Forgot your password?</a>
		</div>
	</div>

</body>
</html>
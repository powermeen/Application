<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>  
<%@include file="include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">





<title>Login Page</title>
<jsp:include page="CssJSMain.jsp"></jsp:include>




</head>
<body>

	<div class="pen-title">
		<h1>Login Form</h1>
	</div>
	<!-- Form Module-->
	
			<%-- 			<form:form  method="post" action="login"  modelAttribute="login"> --%>
			<%-- 				<form:input id="username"  path="username"/> --%>
			<%-- 				<form:password id="password"  path="password" /> --%>
			<!-- 				<button id="loginButton" type="submit">Login</button> -->
			<%-- 			</form:form> --%>
			<form:form method="post" action="testMapping" modelAttribute="loginModel">
			
			
<%-- 			<form:label path="userName">User name</form:label> --%>
<%-- 			<form:input path="userName" /> --%>
<%-- 			<form:label path="userName">Password</form:label> --%>
<%-- 			<form:password path="password"/> --%>
			
			<input id="loginButton" type="submit" value="Submit" />
			</form:form>
			
<!-- 			<form id="loginForm" method="post" action="loginForm"> -->
<!-- 				<input type="text" id="username" name= "username" placeholder="Username" />  -->
<!-- 				<input type="password" id="password"  name="password"placeholder="Password" /> -->
<!-- 				<button id="loginButton" type="submit">Login</button> -->
<!-- 			</form> -->
			
				
	

</body>
</html>
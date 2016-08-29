<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">



<title>Home Page</title>
<jsp:include page="CssJSMain.jsp"></jsp:include>

<style type="text/css">
.container {
	padding-top: 50px;
}
</style>


<script type="text/javascript">
	
</script>
</head>
<body>

	<div class="container jumbotron ">

		<form action="selectDemo" method="get">

			<button class="btn btn-primary" id="demoLoginButton" name="demoPage" value="Login">Demo Login</button>
			<button class="btn btn-primary" id="demoShowDisplayButton" name="demoPage" value="displayData01">Demo Show Display Table</button>


		</form>
	</div>
</body>
</html>
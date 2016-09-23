<%@include file="include.jsp"%>
<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta equiv="Content-Type" content="text/html; charset=TIS-620">

<title>Home Page</title>
<jsp:include page="CssJSMain.jsp"></jsp:include>

<style type="text/css">
.container {
	padding-top: 50px;
}
</style>


<script type="text/javascript">
	

	function redriectPage(page) {
		window.location.assign("http://localhost:8080/Application/"+page)
	}
</script>
</head>
<body>

	<div class="container jumbotron ">

		<button class="btn btn-primary" id="demoLoginButton"  onclick="redriectPage('loginForm')">Demo Login</button>
		<button class="btn btn-primary" id="demoDemoColumn"  onclick="redriectPage('DemoColumn')">Demo Column Table</button>
		<button class="btn btn-primary" id="demoTotalSalesReport"    onclick="redriectPage('TotalSalesReport')" >Total Sales Report</button>
		<button class="btn btn-primary" id="demoSiteSalesReport"   onclick="redriectPage('SiteSalesReport/?site=10')" >Total Sales Report By Office</button>
		<button class="btn btn-primary" id="demoTestMappingData"  onclick="redriectPage('TestMappingData')">Test Mapping Data</button>
	

	</div>
</body>
</html>
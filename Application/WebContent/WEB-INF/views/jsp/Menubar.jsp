<%@include file="include.jsp"%>
<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta equiv="Content-Type" content="text/html; charset=TIS-620">
<title>Menubar</title>
<%-- <jsp:include page="CssJSMain.jsp"></jsp:include> --%>
<style>
.dropdown-submenu {
    position: relative;
}

.dropdown-submenu .dropdown-menu {
    top: 0;
    left: 100%;
    margin-top: -1px;
}
</style>
</head>
<body>
<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">Huk Steak</a>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
		
<!-- 		BUY -->
			<ul class="nav navbar-nav">
								<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-haspopup="true"
					aria-expanded="false">Buy <span class="caret"></span></a>
					<ul class="dropdown-menu multi-level" role="menu" aria-labelledby="dropdownMenu">
						<li  class="dropdown-submenu" ><a href="#">1.Cash</a>
<!-- 							<ul class="dropdown-menu"> -->
<!-- 								<li><a tabindex="0">Pay Goods Inside</a></li> -->
<!-- 								<li><a tabindex="0">Transfer during Stock</a></li> -->
<!-- 								<li><a tabindex="0">Improve product sales</a></li> -->
<!-- 								<li><a tabindex="0">Improvement costs</a></li> -->
								
<!-- 								<li class="dropdown-submenu"> -->
<!--                     			<a href="#">Even More..</a> -->
<!--                     				<ul class="dropdown-menu"> -->
<!--                        					 <li><a href="#">3rd level</a></li> -->
<!--                     					 <li><a href="#">3rd level</a></li> -->
<!--                     				</ul> -->
<!-- 							</ul> -->
						</li>
						<li><a href="#">2.Memo Other Expenses</a></li>
						<li><a href="#">3.Vendor Details</a></li>
						<li><a href="#" onclick="redriectPage('GoodDetails')">4.Goods And Service Details</a></li>
						<li role="separator" class="divider"></li>
						<li><a href="#">5.Expenses With Goods Details</a></li>
					</ul></li>
					
<!-- 		Sell		 -->
				<li><a href="#">Sell</a></li>

<!-- 		Product		 -->		
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-haspopup="true"
					aria-expanded="false">Product <span class="caret"></span></a>
					<ul class="dropdown-menu multi-level" role="menu" aria-labelledby="dropdownMenu">
						<li  class="dropdown-submenu" ><a href="#">1.Report Goods daily</a>
							<ul class="dropdown-menu">
								<li><a tabindex="0">Pay Goods Inside</a></li>
								<li><a tabindex="0">Transfer during Stock</a></li>
								<li><a tabindex="0">Improve product sales</a></li>
								<li><a tabindex="0">Improvement costs</a></li>
								
								<li class="dropdown-submenu">
                    			<a href="#">Even More..</a>
                    				<ul class="dropdown-menu">
                       					 <li><a href="#">3rd level</a></li>
                    					 <li><a href="#">3rd level</a></li>
                    				</ul>
							</ul>
						</li>
						<li><a href="#">2.Goods Details</a></li>
						<li><a href="#">3.Goods Set Details</a></li>
						<li><a href="#">4.Goods And Service Details</a></li>
						<li role="separator" class="divider"></li>
						<li><a href="#">5.Schedule Sell</a></li>
						<li><a href="#">6.Checklist Product</a></li>
					</ul></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li class="active"><a href="./">Default <span
						class="sr-only">(current)</span></a></li>
				<li><a href="../navbar-static-top/">Static top</a></li>
				<li><a href="../navbar-fixed-top/">Fixed top</a></li>
			</ul>
		</div>
		<!--/.nav-collapse -->
	</div>
	
</body>
</html>
<%@include file="include.jsp"%>

<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta equiv="Content-Type" content="text/html; charset=TIS-620">

<title>Display Data Side</title>
<%-- <jsp:include page="CssJSMain.jsp"></jsp:include> --%>


<style type="text/css">
.container {
	background-color: white;
}

.scorebar {
	overflow: scroll;
	height: 500px;
}

.glyphicon {
	padding-right: 5px;
}

.display-flex {
	display: flex;
}
</style>

<script type="text/javascript">
	$(document).ready(function() {

	});
</script>
<title>Display Data</title>
</head>
<body>
	<jsp:include page="Menubar.jsp" />

	<div class="container scorebar">
		<h2>Detail Data By Side</h2>
		<p>This is Sell Amount on side</p>

		<div class="container">
			<div class="col-md-12 display-flex">
				<div class="col-md-4">
					<h4>
						<span class="glyphicon  glyphicon-user " aria-hidden="true">
						</span> UserName : Meen
					</h4>
				</div>

			</div>

			<div class="col-md-12 ">
				<div class="col-md-4">
					<h4>
						<span class="glyphicon  glyphicon-home " aria-hidden="true">
						</span> Side Office: 00
					</h4>
				</div>

				<div class="col-md-4">
					<h4>
						<span class="glyphicon  glyphicon-home " aria-hidden="true">
						</span>Office Name : Testing Station
					</h4>
				</div>

				<form:form method="post" action="/Application/SiteSalesReport" >
<!-- 				<input id="branchValue" name="branch" type="text" value="พรทิพ" style="display: none;"/> -->
				<input id="siteValue" name="site" type="text" value="10" style="display: none;"/>

					<div class="col-md-2">
						<button class="btn btn-default" onclick="refreshPage()">
							<span class="glyphicon glyphicon-refresh" aria-hidden="true"></span>
							Refresh
						</button>
					</div>
					<div class="col-md-2">
						<select class="form-control" id="" name="pastTime">
							<option value="1">Ship</option>
							<option value="2">Day</option>
							<option value="3">Month</option>
							<option value="4">Year</option>
						</select>
					</div>
					
				
				</form:form>

			</div>


		</div>

		<table id="table" class="table table-hover">
			<thead>
				<tr>
					<th>Dispenser No</th>
					<th>Product</th>
					<th>Liter</th>
					<th>Price</th>
				</tr>
			</thead>

			<c:forEach var="reportBeans" items="${reportBeans}">

				<tr>
					<td>${reportBeans.dispenserNo}</td>
					<td>${reportBeans.product}</td>
					<td>${reportBeans.liter}</td>
					<td>${reportBeans.money}</td>
				<tr>
			</c:forEach>

			</tbody>
		</table>
	</div>


</body>
</html>
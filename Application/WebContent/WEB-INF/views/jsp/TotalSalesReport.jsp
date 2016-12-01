<%@include file="include.jsp"%>
<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta equiv="Content-Type" content="text/html; charset=TIS-620">

<title>Total Sales Report</title>
<%-- <jsp:include page="CssJSMain.jsp"></jsp:include> --%>

<!-- hide mode -->
<%-- <spring:url value="/resources/core/js/jquery.1.10.2.min.js" var="jqueryjs" /> --%>
<%-- <script src="${jqueryjs}"></script> --%>

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

.padding-top-2percent {
	padding-top: 2%;
}

.display-flex {
	display: flex;
}
</style>

<script type="text/javascript">

function reset(){
	
	$.ajax({
		type :"POST",
		contentType : "application/json",
		url :"/Application/TotalSalesReportReset",
 		dataType : 'json',
		success : function(data) {
			
			$('#table').html("");
			$('#table').append("<tbody id='displayBodyTable'> </tbody>");
			
			var firstHeader = ("<th>Site<th>");
			var secondHeader = ("<th>Quality<th>");
			var thirdHeader = ("<th>Liter<th>");
			var fourthHeader = ("<th>Money<th>");
			var fifthHeader = ("<th>View<th>");

			var allTd = firstHeader + secondHeader + thirdHeader + fourthHeader +fifthHeader
			var header = ('<thead><tr>' + allTd + '</tr></thead>');

			$('#table').append(header);
			
			    $.each(data, function (key, data) {
			    	var currentLocation = window.location;
			        var firstColumn = ("<td> <div class= 'padding-top-2percent' > " + data['site'] + "</div><td>");
					var secondColumn = ("<td> <div class= 'padding-top-2percent' > " + data['quality'] + "</div><td>");
					var thirdColumn = ("<td> <div class= 'padding-top-2percent' > " + data['liter'] + "</div><td>");
					var fourthColumn = ("<td> <div class= 'padding-top-2percent' > " + data['money'] + "</div><td>");
					var fifthColumn = ("<td><div><button class= 'btn btn-primary' onclick ='redriectSite("+ data['site'] +")'>View</button></div></td>");
					
					var allTd = firstColumn + secondColumn + thirdColumn + fourthColumn +fifthColumn
					var row = ('<tr>' + allTd + '</tr>');

					$('#displayBodyTable').append(row);
			        
			    })
			    
		}
		
	});
}

function redriectSite(site){
	window.location.assign("http://localhost:8080/Application/SiteSalesReport/?site="+site)
}
function refreshPage(){
	   location.reload();
}

</script>
<title>Demo Column</title>
</head>
<body>
	<jsp:include page="Menubar.jsp" />

	<div class="container scorebar">
		<h2>Detail Data</h2>
		<p>This is Sell Amount on side</p>

		<div class="container col-md-12">
			<div class="col-md-12 display-flex">
				<div class="col-md-4">
					<h4>
						<span class="glyphicon  glyphicon-user " aria-hidden="true">
						</span> UserName : Meen
					</h4>
				</div>

			</div>

			<div class="col-md-12 display-flex">
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

			</div>
			<div class="col-md-12 display-flex">


				<div class="col-md-3">
					<h4>
						<span class="glyphicon glyphicon-calendar" aria-hidden="true">
						</span>01 September 2016
					</h4>
				</div>

				<div class="col-md-3">
					<h4>
						<span class="glyphicon glyphicon-time " aria-hidden="true">
						</span>Time End : 12 : 00
					</h4>
				</div>

				<div class="col-md-3">
					<button class="btn btn-default" onclick="refreshPage()">
						<span class="glyphicon glyphicon-refresh" aria-hidden="true"></span>
						Refresh
					</button>
				</div>

			</div>

			<table id="table" class="table table-hover">
				<thead>
					<tr>
						<th>Side</th>
						<th>Quality</th>
						<th>Quantity</th>
						<th>Summary</th>
						<th>View</th>
					</tr>
				</thead>

			<c:forEach var="reportBeans" items="${reportBeans}">
				<tr>
					<td><div class="padding-top-2percent">${reportBeans.site}</div></td>
					<td><div class="padding-top-2percent">${reportBeans.quality}</div></td>
					<td><div class="padding-top-2percent">${reportBeans.liter}</div></td>
					<td><div class="padding-top-2percent">${reportBeans.money}</div></td>
					<td><div><button class="btn btn-primary" onclick="redriectSite(${reportBeans.site})">View</button></div></td>
				<tr>
			</c:forEach>
				</tbody>
			</table>

		</div>
	</div>




</body>
</html>
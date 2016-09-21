<%@page import="java.util.List"%>
<%@ page contentType="text/html;charset=UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Total Sales Report</title>
<jsp:include page="CssJSMain.jsp"></jsp:include>


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
	$(document).ready(function() {

		 	

	});

	function load() {

	}
	
	function reset(){
		$.post("/Application/TotalSalesReport", function(data) {
			console.log(data);
			$.each(data, function(key, value) {
				$('#table').html("");
				$('#table').append("<tbody id='displayBodyTable'> </tbody>");
				
				var firstHeader = ("<th>Order<th>");
				var secondHeader = ("<th>Name<th>");
				var thirdHeader = ("<th>Type<th>");
				var fourthHeader = ("<th>Price<th>");

				var allTd = firstHeader + secondHeader + thirdHeader + fourthHeader
				var header = ('<thead><tr>' + allTd + '</tr></thead>');

				$('#table').append(header);
			});
			
		});
	}

	function resetColumn() {
		$('#table').html("");
		$('#table').append("<tbody id='displayBodyTable'> </tbody>");

		var number = $('#numberColumn').val;
		$.post("/Application/TotalSalesReport", {
			numberColumn : number
		},

		function(data) {
			// 		 			console.log(data);
			var firstHeader = ("<th>Order<th>");
			var secondHeader = ("<th>Name<th>");
			var thirdHeader = ("<th>Type<th>");
			var fourthHeader = ("<th>Price<th>");

			var allTd = firstHeader + secondHeader + thirdHeader + fourthHeader
			var header = ('<thead><tr>' + allTd + '</tr></thead>');

			$('#table').append(header);
			$.each(data, function(key, value) {
				var firstColumn = ("<td>" + value['order'] + "<td>");
				var secondColumn = ("<td>" + value['name'] + "<td>");
				var thirdColumn = ("<td>" + value['type'] + "<td>");
				var fourthColumn = ("<td>" + value['price'] + "<td>");

				var allTd = firstColumn + secondColumn + thirdColumn
						+ fourthColumn
				var row = ('<tr>' + allTd + '</tr>');

				$('#displayBodyTable').append(row);
			});

		});
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
					<button class="btn btn-default" onclick="reset()">
						<span class="glyphicon glyphicon-refresh" aria-hidden="true"></span>
						Refresh
					</button>
				</div>

			</div>




			<table id="table" class="table table-hover">
<!-- 				<thead> -->
<!-- 					<tr> -->
<!-- 						<th>Side</th> -->
<!-- 						<th>Quality</th> -->
<!-- 						<th>Quantity</th> -->
<!-- 						<th>Summary</th> -->
<!-- 						<th>View</th> -->
<!-- 					</tr> -->
<!-- 				</thead> -->

<%-- 			<c:forEach var="reportBeans" items="${reportBeans}"> --%>
<!-- 				<tr> -->
<%-- 					<td><div class="padding-top-2percent">${reportBeans.site}</div></td> --%>
<%-- 					<td><div class="padding-top-2percent">${reportBeans.quality}</div></td> --%>
<%-- 					<td><div class="padding-top-2percent">${reportBeans.liter}</div></td> --%>
<%-- 					<td><div class="padding-top-2percent">${reportBeans.money}</div></td> --%>
<!-- 					<td><div><button class="btn btn-primary">View</button></div></td> -->
<!-- 				<tr> -->
<%-- 			</c:forEach> --%>
				</tbody>
			</table>

		</div>
	</div>




</body>
</html>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Display Data Side</title>
<jsp:include page="../CssJSMain.jsp"></jsp:include>


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
</style>

<script type="text/javascript">
	$(document).ready(function() {

		// 		$.post("/Application/FetchDataUpdate",

		// 		function(data) {
		// 			console.log(data);
		// 			//     		  $.each(data , function (  key , value){
		// 			//     			  console.log(value);
		// 			//     		  });
		// 		});

	});

	function load() {
		
		$('#table').html("");
		$('#table').append("<tbody id='displayBodyTable'> </tbody>");

		$.post("/Application/FetchDataUpdate",

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
<title>Display Data</title>
</head>
<body>
	<jsp:include page="Menubar.jsp" />

	<button onclick="load()">Testing button</button>

	<div class="container scorebar">
		<h2>Detail Data</h2>
		<p>This is Sell Amount on side</p>

		<div class="container">
			<div class="col-md-12">
				<div class="col-md-4">
					<h4>
						<span class="glyphicon  glyphicon-user " aria-hidden="true">
						</span> UserName : Meen
					</h4>
				</div>

			</div>

			<div class="col-md-12">
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


		</div>

		<table id="table"class="table table-hover">
<!-- 			<thead> -->
<!-- 				<tr> -->
<!-- 					<th>Order</th> -->
<!-- 					<th>Name</th> -->
<!-- 					<th>Type</th> -->
<!-- 					<th>Price</th> -->
<!-- 				</tr> -->
<!-- 			</thead> -->
			
<%-- 				<c:forEach var="amountBeans" items="${amountBeans}"> --%>

<!-- 					<tr> -->
<%-- 						<td>${amountBeans.order}</td> --%>
<%-- 						<td>${amountBeans.name}</td> --%>
<%-- 						<td>${amountBeans.type}</td> --%>
<%-- 						<td>${amountBeans.price}</td> --%>
<!-- 					<tr> -->
<%-- 				</c:forEach> --%>

			</tbody>
		</table>
	</div>


</body>
</html>
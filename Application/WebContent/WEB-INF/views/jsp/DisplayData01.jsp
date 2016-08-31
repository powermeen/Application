<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Display Data Side</title>
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
.padding-top-2percent{
	padding-top: 2%;
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

	}

	function resetColumn() {
		$('#table').html("");
		$('#table').append("<tbody id='displayBodyTable'> </tbody>");

		var number = $('#numberColumn').val;
		$.post("/Application/fetchDataUpdate", {
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
				<div class="col-md-4">
				<button class="btn btn-default"><span class="glyphicon glyphicon-refresh" aria-hidden="true"></span> Refresh</button>
				</div>

			</div>




			<table id="table" class="table table-hover">
				<thead>
					<tr>
						<th>Item_0000</th>
						<th>Item_0000</th>
						<th>Item_0000</th>
					</tr>
				</thead>



				<tr>
					<td><div class="padding-top-2percent">Testing Data 000000</div></td>
					<td><div class="padding-top-2percent">Testing Data 000000</div></td>
					<td><div><button class="btn btn-primary">View</button></div></td>
				<tr>
				<tr>
					<td><div class="padding-top-2percent">Testing Data 000000</div></td>
					<td><div class="padding-top-2percent">Testing Data 000000</div></td>
					<td><div><button class="btn btn-primary">View</button></div></td>
				<tr>
				<tr>
					<td><div class="padding-top-2percent">Testing Data 000000</div></td>
					<td><div class="padding-top-2percent">Testing Data 000000</div></td>
					<td><div><button class="btn btn-primary">View</button></div></td>
				<tr>
				<tr>
					<td><div class="padding-top-2percent">Testing Data 000000</div></td>
					<td><div class="padding-top-2percent">Testing Data 000000</div></td>
					<td><div><button class="btn btn-primary">View</button></div></td>
				<tr>
				<tr>
					<td><div class="padding-top-2percent">Testing Data 000000</div></td>
					<td><div class="padding-top-2percent">Testing Data 000000</div></td>
					<td><div><button class="btn btn-primary">View</button></div></td>
				<tr>
				<tr>
					<td><div class="padding-top-2percent">Testing Data 000000</div></td>
					<td><div class="padding-top-2percent">Testing Data 000000</div></td>
					<td><div><button class="btn btn-primary">View</button></div></td>
				<tr>
				
				</tbody>
			</table>

		</div>

	</div>
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




			<table id="table" class="table table-hover">
				<thead>
					<tr>
						<th>Item_0001</th>
						<th>Item_0001</th>
						<th>Item_0001</th>
						<th>Item_0001</th>
					</tr>
				</thead>



				<tr>
					<td><div class="padding-top-2percent">Testing Data 000001</div></td>
					<td><div class="padding-top-2percent">Testing Data 000001</div></td>
					<td><div class="padding-top-2percent">Testing Data 000001</div></td>
					<td><div><button class="btn btn-primary">View</button></div></td>
				<tr>
				<tr>
					<td><div class="padding-top-2percent">Testing Data 000001</div></td>
					<td><div class="padding-top-2percent">Testing Data 000001</div></td>
					<td><div class="padding-top-2percent">Testing Data 000001</div></td>
					<td><div><button class="btn btn-primary">View</button></div></td>
				<tr>
				<tr>
					<td><div class="padding-top-2percent">Testing Data 000001</div></td>
					<td><div class="padding-top-2percent">Testing Data 000001</div></td>
					<td><div class="padding-top-2percent">Testing Data 000001</div></td>
					<td><div><button class="btn btn-primary">View</button></div></td>
				<tr>
				<tr>
					<td><div class="padding-top-2percent">Testing Data 000001</div></td>
					<td><div class="padding-top-2percent">Testing Data 000001</div></td>
					<td><div class="padding-top-2percent">Testing Data 000001</div></td>
					<td><div><button class="btn btn-primary">View</button></div></td>
				<tr>
				<tr>
					<td><div class="padding-top-2percent">Testing Data 000001</div></td>
					<td><div class="padding-top-2percent">Testing Data 000001</div></td>
					<td><div class="padding-top-2percent">Testing Data 000001</div></td>
					<td><div><button class="btn btn-primary">View</button></div></td>
				<tr>
				<tr>
					<td><div class="padding-top-2percent">Testing Data 000001</div></td>
					<td><div class="padding-top-2percent">Testing Data 000001</div></td>
					<td><div class="padding-top-2percent">Testing Data 000001</div></td>
					<td><div><button class="btn btn-primary">View</button></div></td>
				<tr>
				</tbody>
			</table>

		</div>

	</div>
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




			<table id="table" class="table table-hover">
				<thead>
					<tr>
						<th>Item_0002</th>
						<th>Item_0002</th>
						<th>Item_0002</th>
						<th>Item_0002</th>
						<th>Item_0002</th>
					</tr>
				</thead>



				<tr>
					<td><div class="padding-top-2percent">Testing Data 000002</div></td>
					<td><div class="padding-top-2percent">Testing Data 000002</div></td>
					<td><div class="padding-top-2percent">Testing Data 000002</div></td>
					<td><div class="padding-top-2percent">Testing Data 000002</div></td>
					<td><div><button class="btn btn-primary">View</button></div></td>
				<tr>
				
<tr>
					<td><div class="padding-top-2percent">Testing Data 000002</div></td>
					<td><div class="padding-top-2percent">Testing Data 000002</div></td>
					<td><div class="padding-top-2percent">Testing Data 000002</div></td>
					<td><div class="padding-top-2percent">Testing Data 000002</div></td>
					<td><div><button class="btn btn-primary">View</button></div></td>
				<tr>
				<tr>
					<td><div class="padding-top-2percent">Testing Data 000002</div></td>
					<td><div class="padding-top-2percent">Testing Data 000002</div></td>
					<td><div class="padding-top-2percent">Testing Data 000002</div></td>
					<td><div class="padding-top-2percent">Testing Data 000002</div></td>
					<td><div><button class="btn btn-primary">View</button></div></td>
				<tr>
				<tr>
					<td><div class="padding-top-2percent">Testing Data 000002</div></td>
					<td><div class="padding-top-2percent">Testing Data 000002</div></td>
					<td><div class="padding-top-2percent">Testing Data 000002</div></td>
					<td><div class="padding-top-2percent">Testing Data 000002</div></td>
					<td><div><button class="btn btn-primary">View</button></div></td>
				<tr>
				<tr>
					<td><div class="padding-top-2percent">Testing Data 000002</div></td>
					<td><div class="padding-top-2percent">Testing Data 000002</div></td>
					<td><div class="padding-top-2percent">Testing Data 000002</div></td>
					<td><div class="padding-top-2percent">Testing Data 000002</div></td>
					<td><div><button class="btn btn-primary">View</button></div></td>
				<tr>
				<tr>
					<td><div class="padding-top-2percent">Testing Data 000002</div></td>
					<td><div class="padding-top-2percent">Testing Data 000002</div></td>
					<td><div class="padding-top-2percent">Testing Data 000002</div></td>
					<td><div class="padding-top-2percent">Testing Data 000002</div></td>
					<td><div><button class="btn btn-primary">View</button></div></td>
				<tr>
				</tbody>
			</table>

		</div>
	</div>

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




			<table id="table" class="table table-hover">
				<thead>
					<tr>
						<th>Item_0003</th>
						<th>Item_0003</th>
						<th>Item_0003</th>
						<th>Item_0003</th>
						<th>Item_0003</th>
						<th>Item_0003</th>
					</tr>
				</thead>



				<tr>
					<td><div class="padding-top-2percent">Testing Data 000003</div></td>
					<td><div class="padding-top-2percent">Testing Data 000003</div></td>
					<td><div class="padding-top-2percent">Testing Data 000003</div></td>
					<td><div class="padding-top-2percent">Testing Data 000003</div></td>
					<td><div class="padding-top-2percent">Testing Data 000003</div></td>
					<td><div><button class="btn btn-primary">View</button></div></td>
				<tr>
				
				
<tr>
					<td><div class="padding-top-2percent">Testing Data 000003</div></td>
					<td><div class="padding-top-2percent">Testing Data 000003</div></td>
					<td><div class="padding-top-2percent">Testing Data 000003</div></td>
					<td><div class="padding-top-2percent">Testing Data 000003</div></td>
					<td><div class="padding-top-2percent">Testing Data 000003</div></td>
					<td><div><button class="btn btn-primary">View</button></div></td>
				<tr>
				<tr>
					<td><div class="padding-top-2percent">Testing Data 000003</div></td>
					<td><div class="padding-top-2percent">Testing Data 000003</div></td>
					<td><div class="padding-top-2percent">Testing Data 000003</div></td>
					<td><div class="padding-top-2percent">Testing Data 000003</div></td>
					<td><div class="padding-top-2percent">Testing Data 000003</div></td>
					<td><div><button class="btn btn-primary">View</button></div></td>
				<tr>
				<tr>
					<td><div class="padding-top-2percent">Testing Data 000003</div></td>
					<td><div class="padding-top-2percent">Testing Data 000003</div></td>
					<td><div class="padding-top-2percent">Testing Data 000003</div></td>
					<td><div class="padding-top-2percent">Testing Data 000003</div></td>
					<td><div class="padding-top-2percent">Testing Data 000003</div></td>
					<td><div><button class="btn btn-primary">View</button></div></td>
				<tr>
				<tr>
					<td><div class="padding-top-2percent">Testing Data 000003</div></td>
					<td><div class="padding-top-2percent">Testing Data 000003</div></td>
					<td><div class="padding-top-2percent">Testing Data 000003</div></td>
					<td><div class="padding-top-2percent">Testing Data 000003</div></td>
					<td><div class="padding-top-2percent">Testing Data 000003</div></td>
					<td><div><button class="btn btn-primary">View</button></div></td>
				<tr>
				<tr>
					<td><div class="padding-top-2percent">Testing Data 000003</div></td>
					<td><div class="padding-top-2percent">Testing Data 000003</div></td>
					<td><div class="padding-top-2percent">Testing Data 000003</div></td>
					<td><div class="padding-top-2percent">Testing Data 000003</div></td>
					<td><div class="padding-top-2percent">Testing Data 000003</div></td>
					<td><div><button class="btn btn-primary">View</button></div></td>
				<tr>
				
				
				</tbody>
			</table>

		</div>

	</div>



</body>
</html>
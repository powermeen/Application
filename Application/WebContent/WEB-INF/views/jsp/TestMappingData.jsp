<%@include file="include.jsp"%>
<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta equiv="Content-Type" content="text/html; charset=TIS-620">>Test </title>
<%-- <jsp:include page="CssJSMain.jsp"></jsp:include> --%>

<!-- hide mode -->
<spring:url value="/resources/core/js/jquery.1.10.2.min.js" var="jqueryjs" />
<script src="${jqueryjs}"></script>
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
		url :"/Application/TestMappingDataReset",
 		dataType : 'json',
		success : function(data) {
			
			$('#table').html("");
			$('#table').append("<tbody id='displayBodyTable'> </tbody>");
			
			var firstHeader = ("<th>Order<th>");
			var secondHeader = ("<th>Name<th>");
			var thirdHeader = ("<th>Type<th>");
			var fourthHeader = ("<th>Price<th>");

			var allTd = firstHeader + secondHeader + thirdHeader + fourthHeader
			var header = ('<thead><tr>' + allTd + '</tr></thead>');

			$('#table').append(header);
			
			    $.each(data, function (key, data) {
			    	var currentLocation = window.location;
			        var firstColumn = ("<td> <div class= 'padding-top-2percent' > " + data['site'] + "</div><td>");
					var secondColumn = ("<td> <div class= 'padding-top-2percent' > " + data['quality'] + "</div><td>");
					var thirdColumn = ("<td> <div class= 'padding-top-2percent' > " + data['liter'] + "</div><td>");
					var fourthColumn = ("<td> <div class= 'padding-top-2percent' > " + data['money'] + "</div><td>");
					var fifthColumn = ("<td><div><button class= 'btn btn-primary' onclick ='redriectSide("+ data['site'] +")'>View</button></div></td>");
					
					var allTd = firstColumn + secondColumn + thirdColumn + fourthColumn +fifthColumn
					var row = ('<tr>' + allTd + '</tr>');

					$('#displayBodyTable').append(row);
			        
			    })
			    
		}
		
	});
}

function redriectSide(side){
	window.location.assign("http://localhost:8080/Application/SiteSalesReport/?site="+site)
}




</script>



</head>
<body>
	<button class="btn btn-default" onclick="reset()">
		<span class="glyphicon glyphicon-refresh" aria-hidden="true"></span>
		Refresh
	</button>
	
	<table id="table" class="table table-hover">
				<thead>
					<tr>
						<th>Item_0000</th>
						<th>Item_0000</th>
						<th>Item_0000</th>
						<th>Item_0000</th>
						<th>Item_0000</th>
					</tr>
				</thead>

				<tr>
					<td><div class="padding-top-2percent"><spring:url value=""></spring:url></div></td>
					<td><div class="padding-top-2percent">Testing Data 000000</div></td>
					<td><div class="padding-top-2percent">Testing Data 000000</div></td>
					<td><div class="padding-top-2percent">Testing Data 000000</div></td>
					<td><div><button class="btn btn-primary">View</button></div></td>
				<tr>
				</tbody>
			</table>
			<div>Result >>> </div>
			<div id="textTest"></div>


</body>
</html>
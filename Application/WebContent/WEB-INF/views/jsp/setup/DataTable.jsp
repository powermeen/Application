<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="../include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Data Table</title>
<jsp:include page="../CssMain.jsp"></jsp:include>



</head>
<body>

	<div id="wrapper">

		<!-- Navigation -->
		<jsp:include page="../Menubar.jsp"></jsp:include>

		<div id="page-wrapper">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">Tables</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading">DataTables Advanced Tables</div>
						<!-- /.panel-heading -->
						<div class="panel-body">
							<table width="100%"
								class="table table-striped table-bordered table-hover"
								id="dataTables-example">
								<thead>
									<tr>
										<th>Rendering engine</th>
										<th>Browser</th>
										<th>Platform(s)</th>
										<th>Engine version</th>
										<th>CSS grade</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach var="ph" items="${dataBean}">
										<tr>
											<td></td>
											<td>a</td>
											<td>a</td>
											<td>a</td>
											<td>a</td>

										</tr>

									</c:forEach>
								</tbody>
							</table>
						</div>
						<!-- /.table-responsive -->

						 <input type="text" class="form-control" name="query" id="query" placeholder="Start typing something to search...">       
						
						
						
					</div>
					<!-- /.panel-body -->
				</div>
				<!-- /.panel -->
			</div>
			<!-- /.col-lg-6 -->
			<!-- /.col-lg-6 -->
		</div>
		<!-- /.row -->
		<!-- /.row -->
	</div>
	<!-- /#page-wrapper -->

	</div>
	<!-- /#wrapper -->

	<jsp:include page="../JSMain.jsp"></jsp:include>

	<!-- Page-Level Demo Scripts - Tables - Use for reference -->
	<script>
		$(document).ready(
				function() {
					$('#dataTables-example').DataTable({
						responsive : true
					});

					
				});
		
		$('#query').typeahead({        
	        local: ['alpha','allpha2','alpha3','bravo','charlie','delta','epsilon','gamma','zulu']
	});  
	</script>

</body>
</html>
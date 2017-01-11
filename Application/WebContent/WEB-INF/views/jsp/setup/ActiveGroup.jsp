<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="../include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Active Group</title>
<jsp:include page="../CssMain.jsp"></jsp:include>
<style type="text/css">
.container {
	padding-top: 10px;
}

.disabled {
	display: none;
}
</style>
</head>
<body>
	<div id="wrapper">

		<!-- Navigation -->
		<jsp:include page="../Menubar.jsp"></jsp:include>

		<div id="page-wrapper">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">Create Group</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->


			<c:set var="req" value="${pageContext.request}" />
			<c:set var="baseURL"
				value="${req.scheme}://${req.serverName}:${req.serverPort}${req.contextPath}" />
			<input id="baseURL" type="text" class="disabled" value="${baseURL }" />
			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-info">
						<div class="panel-heading">Control To Active Group</div>
						<!-- /.panel-heading -->
						<div class="panel-body">
							<table width="100%"
								class="table table-striped table-bordered table-hover"
								id="dataTables">
								<thead>
									<tr>
										<th>Group_ID</th>
										<th>Group_Name</th>
										<th>Module</th>
										<th>Status</th>

									</tr>
								</thead>
								<tbody>
									<c:forEach var="groupBean" items="${groupBeans}"
										varStatus="loop">

										<c:set var="id" value="${groupBean.id}" />
										<c:set var="name" value="${groupBean.name}" />
										<c:set var="module" value="${groupBean.module}" />
										<c:set var="status" value="${groupBean.status}" />


										<c:choose>
											<c:when test="${loop.index % 2 !=0 }">
												<tr class="info">
													<td>${id}</td>
													<td>${name }</td>
													<td>${module }</td>
													<c:choose>
														<c:when test="${status == 1 }">
															<td><input type="checkbox" checked
																data-toggle="toggle" data-size="mini"
																onchange="changeStatus('${id}','${status}');"></td>
														</c:when>
														<c:otherwise>
															<td><input type="checkbox" data-toggle="toggle"
																data-size="mini"
																onchange="changeStatus('${id}','${status}');"></td>
														</c:otherwise>
													</c:choose>
												</tr>

											</c:when>
											<c:otherwise>
												<tr>
													<td>${id}</td>
													<td>${name }</td>
													<td>${module }</td>

													<c:choose>
														<c:when test="${status == 1 }">
															<td><input type="checkbox" checked
																data-toggle="toggle" data-size="mini"
																onchange="changeStatus('${id}','${status}');"></td>
														</c:when>
														<c:otherwise>
															<td><input type="checkbox" data-toggle="toggle"
																data-size="mini"
																onchange="changeStatus('${id}','${status}');"></td>
														</c:otherwise>
													</c:choose>
												</tr>
											</c:otherwise>
										</c:choose>

									</c:forEach>
								</tbody>
							</table>
						</div>
						<!-- /.table-responsive -->
					</div>
					<!-- /.panel-body -->
				</div>
				<!-- /.panel -->
			</div>
		</div>
		<!-- /#page-wrapper -->



		<!-- Modal -->
		<div class="modal fade" id="deleteConfirm" role="dialog">
			<div class="modal-dialog">

				<!-- Modal content-->
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h4 class="modal-title">Confirm Delete</h4>
					</div>
					<div class="modal-body">
						<p>Are You Sure to Delete This Group. This mean all step under
							this group will be delete togetter</p>
					</div>
					<div class="modal-footer">
						<button id="confirmDeleteStep" type="button"
							class="btn btn-danger" data-dismiss="modal">Yes</button>
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					</div>
				</div>

			</div>
		</div>
	</div>
	<!-- /#wrapper -->
	<jsp:include page="../JSMain.jsp"></jsp:include>
	<script>
		$(document).ready(function() {
			

		});

		function changeStatus(id, status) {

			var url = window.location;
			var baseURL = url.protocol + "//" + url.host + "/"
					+ url.pathname.split('/')[1];
			var path = baseURL + "/ActiveGroup";
			$.get(path, {
				id : id,
				status : status,
				direction : "update"
			});

		}

		
	</script>

</body>
</html>
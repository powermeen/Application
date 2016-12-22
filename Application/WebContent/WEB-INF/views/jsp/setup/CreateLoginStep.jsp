<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="../include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Login Step</title>
<jsp:include page="../CssMain.jsp"></jsp:include>
<style type="text/css">
.container {
	padding-top: 10px;
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
					<h1 class="page-header">Create Loging Step</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading">Basic Form Elements</div>
						<div class="panel-body">
							<div class="row">
								<form:form method="post" action="CreateLoginStep"
									modelAttribute="CreateLoginStepModel" role="form">
									<div class="col-lg-4">

										<h3>Login Step</h3>

										<div class="panel panel-default">
											<div class="panel-heading">Default Panel</div>
											<div class="panel-body">

												<c:set var="pageListHolder" value="${pagedListHolder}"
													scope="session" />
												<c:forEach var="ph" items="${pageListHolder.pageList}">
													<div class="form-group">
														<div>

															<div class="col-md-6">
																<label>${ph.nameWidget}</label>
															</div>

															<div class="col-md-3">
																<label>Sequence</label>
															</div>
															<div class="col-md-3">
																<label>Edit</label>
															</div>
														</div>

														<div>

															<div class="col-md-6">
																<input class="form-control" value="">
															</div>
															<div class="col-md-3">
																<input class="form-control" value="">
															</div>
															<div class="col-md-3">
																<button type="submit" class="btn btn-default">Edit</button>
															</div>
														</div>

													</div>
												</c:forEach>




											</div>
											<div class="panel-footer">Panel Footer</div>
										</div>

									</div>


									<!-- /.col-lg-6 (nested) -->
									<div class="col-lg-8">
										<h3>Operation</h3>


										<div class="panel panel-default">
											<div class="panel-heading">Default Panel</div>
											<div class="panel-body">
												<div>
													<div class="col-md-2">
														<label>Widget_Id</label>
													</div>
													<div class="col-md-2">
														<label>Widget_Name</label>
													</div>
													<div class="col-md-3">
														<label>Data</label>
													</div>
													<div class="col-md-3">
														<label>Action</label>
													</div>
													<div class="col-md-2">
														<label>Reference</label>
													</div>

												</div>

												<div>
													<div class="col-md-2">
														<input class="form-control" value="">
													</div>
													<div class="col-md-2">
														<input class="form-control" value="">
													</div>
													<div class="col-md-3">
														<input class="form-control" value="">
													</div>
													<div class="col-md-3">

														<select class="form-control">
															<option value="TextBox">TextBox</option>
															<option value="Button">Button</option>
															<option value="Selection">Selection</option>
														</select>
													</div>
													<div class="col-md-2">
														<input class="form-control" value="">
													</div>

												</div>


												<div class="col-md-12 container">
													<div class="   btn-group text-right  ">

														<button id="add" type="button" onclick="" class="btn btn-default ">Add</button>
														<button type="submit" class="btn btn-default ">Save</button>
														<button type="submit" class="btn btn-default ">Delete</button>
														<button type="submit" class="btn btn-default ">Find
															Reference</button>
														<form:input path="action" class="form-control" />

													</div>
												</div>
											</div>
											<div class="panel-footer">Panel Footer</div>

										</div>

									</div>


									<div class="col-lg-8">

										<div class="panel panel-default">
											<div class="panel-heading">Paging</div>
											<div class="panel-body">
												<div class="col-md-12">

													<ul class="pagination">

														<c:forEach begin="0" end="${pageListHolder.pageCount-1}"
															varStatus="loop">

															<c:choose>
																<c:when test="${loop.index == pageListHolder.page}">
																	<li class="active paging"><a
																		onclick="setPage(${loop.index+1})">${loop.index+1}</a></li>
																</c:when>
																<c:otherwise>

																	<li class=" paging"><a
																		onclick="setPage(${loop.index+1})">${loop.index+1}</a></li>

																</c:otherwise>
															</c:choose>

														</c:forEach>

													</ul>
													<form:input path="page" class="form-control" />
												</div>
											</div>
											<div class="panel-footer">Panel Footer</div>

										</div>
									</div>


								</form:form>
								<!-- /.col-lg-8 (nested) -->


							</div>
							<!-- /.row (nested) -->
						</div>
						<!-- /.panel-body -->
					</div>
					<!-- /.panel -->
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
		</div>
		<!-- /#page-wrapper -->

	</div>
	<!-- /#wrapper -->
	<jsp:include page="../JSMain.jsp"></jsp:include>
	<script>
		function setPage(pageNumber) {
			$('.paging').click(function(){
			    $('#page').val(pageNumber);
			    $('form').submit();
			    
			});
		}
		function addStep(action){
			$('#add').click(function(){
			    $('#action').val(action);
			    $('form').submit();
			    
			});
		}
</script>

</body>
</html>
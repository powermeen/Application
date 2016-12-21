<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="../include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Login Step</title>
<jsp:include page="../CssMain.jsp"></jsp:include>
</head>
<body>
	<div id="wrapper">

		<!-- Navigation -->
		<jsp:include page="../Menubar.jsp"></jsp:include>

		<div id="page-wrapper">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">Forms</h1>
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
								<div class="col-lg-6">
									<form role="form">
										<h1>Login Step</h1>

										<c:set var="pageListHolder" value="${pagedListHolder}"
											scope="session" />
										<c:forEach var="ph" items="${pageListHolder.pageList}">
											<div class="form-group">
												<div>
													<div class="col-md-2">
														<label>Selected</label>
													</div>
													<div class="col-md-4">
														<label>${ph.nameWidget}</label>
													</div>
													<div class="col-md-4">
														<label>Action</label>
													</div>
													<div class="col-md-2">
														<label>Sequence</label>
													</div>
												</div>

												<div>
													<div class="col-md-2">
														<input type="checkbox" value="">
													</div>
													<div class="col-md-4">
														<input class="form-control" value="">
													</div>
													<div class="col-md-4">
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

											</div>
										</c:forEach>

										<ul class="pagination" id="page" >

											<c:forEach begin="0" end="${pageListHolder.pageCount-1}"
												varStatus="loop">

												<c:choose>
													<c:when test="${loop.index == pageListHolder.page}">
														<li  class="active"><a href="javascript:void(0);" onclick="redriectPage('CreateLoginStep/${loop.index+1}');">${loop.index+1}</a></li>
													</c:when>
													<c:otherwise>
														<li><a   href="#">${loop.index+1}</a></li>
													</c:otherwise>
												</c:choose>

											</c:forEach>

										</ul>

									</form>
								</div>
								<!-- /.col-lg-6 (nested) -->
								<div class="col-lg-6">
									<h1>Operation</h1>

									<button type="submit" class="btn btn-default">New</button>
									<button type="submit" class="btn btn-default">Save</button>
									<button type="submit" class="btn btn-default">Delete</button>




								</div>
								<!-- /.col-lg-6 (nested) -->
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

</body>
</html>
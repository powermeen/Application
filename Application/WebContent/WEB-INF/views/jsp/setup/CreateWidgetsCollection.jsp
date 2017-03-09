<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="../include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Group</title>
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
					<h1 class="page-header">Create Widgets Collection</h1>
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
								<form:form id="CreateWidgetsCollection" method="post"
									action="CreateWidgetsCollection"
									modelAttribute="WidgetsCollectionModel" role="form">


									<!-- /.col-lg-6 (nested) -->
									<div class="col-lg-12 ">
										<h3>Operation</h3>


										<div class="panel panel-default">
											<div class="panel-heading">Default Panel</div>
											<div class="panel-body">

												<jsp:include page="../Notification.jsp"></jsp:include>

												<div class="col-md-12">
													<div class="col-md-2">
														<label>ID</label>
													</div>
													<div class="col-md-3">
														<label>Module</label>
													</div>
													<div class="col-md-3">
														<label>widget_id</label>
													</div>
													<div class="col-md-3">
														<label>description</label>
													</div>

												</div>

												<div class="col-md-12">

													<div class="col-md-2 form-group ">

														<form:input path="id" class="form-control "
															readonly="true" />
													</div>


													<div class="col-md-3 form-group has-error">

														<form:select path="module" items="${modules}"
															class="form-control">
														</form:select>
													</div>

													<div class="col-md-3 form-group has-error">

														<form:input path="widgetId" class="form-control "
															placeholder="Enter text" />
													</div>

													<div class="col-md-3 form-group has-error">

														<form:input path="description" class="form-control "
															placeholder="Enter text" />
													</div>



												</div>


												<div class="col-md-12 container">
													<div class="   btn-group text-right  ">

														<button id="add" type="button" class="btn btn-default ">Add</button>
														<button id="save" type="button" class="btn btn-default ">Save</button>
														<button id="delete" type="button" class="btn btn-danger "
															data-toggle="modal" data-target="#deleteConfirm">Delete</button>
														<button id="clear" type="button" class="btn btn-default ">Clear</button>
														<button id="refresh" type="submit"
															class="btn btn-default " onclick="refreshDataTable();">Search</button>
														<form:input path="direction" class="form-control disabled" />
													</div>
												</div>
											</div>
											<div class="panel-footer">Panel Footer</div>

										</div>

									</div>

								</form:form>



							</div>
						</div>
					</div>
				</div>
			</div>


			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-info">
						<div class="panel-heading">DataTables Advanced Tables</div>
						<!-- /.panel-heading -->
						<div class="panel-body">
							<table width="100%"
								class="table table-striped table-bordered table-hover"
								id="dataTables">
								<thead>
									<tr>
										<th>ID</th>
										<th>Module</th>
										<th>Widget_id</th>
										<th>Description</th>
										<th>Edit</th>

									</tr>
								</thead>
								<tbody>
									<c:forEach var="widgetsCollectionBean"
										items="${widgetsCollectionBeans}" varStatus="loop">

										<c:set var="id" value="${widgetsCollectionBean.id}" />
										<c:set var="module" value="${widgetsCollectionBean.module}" />
										<c:set var="widgetId"
											value="${widgetsCollectionBean.widgetId}" />
										<c:set var="description"
											value="${widgetsCollectionBean.description}" />


										<c:choose>
											<c:when test="${loop.index % 2 !=0 }">
												<tr class="info">
													<td>${id}</td>
													<td>${module }</td>
													<td>${widgetId }</td>
													<td>${description }</td>


													<td><button type="button"
															class="btn btn-default btn-xs center "
															onclick="editData('${id}','${name}','${module}');">Edit</button></td>

												</tr>

											</c:when>
											<c:otherwise>
												<tr>
													<td>${id}</td>
													<td>${module }</td>
													<td>${widgetId }</td>
													<td>${description }</td>

													<td><button type="button"
															class="btn btn-default btn-xs center "
															onclick="editData('${id}','${name}','${module}');">Edit</button></td>

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
			initForm();
			initDataTable();
			initHandler();
			//initCss();

		});
		function initDataTable() {
			$('#dataTables').DataTable({
				responsive : true
			});
		}
		function initHandler() {
			addButtonHandler();
			saveButtonHandler();
			clearButtonHandler();
			deleteButtonHandler();
			refreshDataTable();
		}
		function initCss() {
			$('#operationMessage').addClass("disabled");
		}

		function initForm() {
			$('#direction').val("");

		}

		function selectReference(reference) {
			$('#reference').val(reference);

		}

		function refreshDataTable() {

			$('#refresh').click(function() {
				$('#direction').val("search");
				$('#CreateWidgetsCollection').submit();
			});
		}
		function addButtonHandler() {

			$('#add').click(function() {
				var isChecked = addValidation();
				if (isChecked) {
					$('#direction').val("insert");
					$('#CreateWidgetsCollection').submit();

				}

			});
		}
		function saveButtonHandler() {
			$('#save').click(function() {
				var isChecked = saveValidation();
				if (isChecked) {
					$('#direction').val("update");
					$('#CreateWidgetsCollection').submit();
				}

			});
		}
		function deleteButtonHandler() {
			$('#confirmDeleteStep').click(function() {
				var isChecked = deleteValidation();

				if (isChecked) {

					$('#direction').val("delete");
					$('#CreateWidgetsCollection').submit();

				}
			});
		}
		function editData(id, name, module) {
			$('#id').val(id);
			$('#name').val(name);
			$('#module').val(module);

		}

		function clearButtonHandler() {
			$('#clear').click(function() {
				clearForm();

			});

		}
		function clearForm() {
			$('#id').val('');
			$('#name').val('');
			$('#module').val('');

		}

		function addValidation() {

			var module = $('#module').val();
			var name = $('#widgetId').val();
			var description = $('#description').val();

			if (name == "" || module == "" || description == "") {

				clientValidationMessae('Please Fill All Mandatory ', 3);

				//addClas
				return false;
			} else {
				return true;
			}
		}
		function saveValidation() {

			var id = $('#id').val();
			var name = $('#name').val();
			var module = $('#module').val();

			if (id == "" || name == "" || module == "") {
				$('#operationMessageSave').removeClass("disabled");

				return false;
			} else {
				return true;
			}
		}

		function deleteValidation() {

			var setupId = $('#id').val();

			if (setupId == "") {
				$('#operationMessageDelete').removeClass("disabled");

				//addClass
				return false;
			} else {
				return true;
			}
		}
	</script>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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
								<form:form id="createLoginStepForm" method="post" action="CreateLoginStep" modelAttribute="SetupModel" role="form">


									<!-- /.col-lg-6 (nested) -->
									<div class="col-lg-12 ">
										<h3>Operation</h3>


										<div class="panel panel-default">
											<div class="panel-heading">Default Panel</div>
											<div class="panel-body">
												<div>
													<div id="operationMessage" class="alert alert-warning disabled">
														<strong>Warning!</strong> Please Fill Data Every Field
													</div>
													<div id="operationMessageDelete" class="alert alert-danger  disabled">
														<strong>Warning!</strong> Please Select ID You Need To Delete
													</div>
												</div>


												<div>
													<div class="col-md-1">
														<label>ID</label>
													</div>
													<div class="col-md-1">
														<label>Sequence</label>
													</div>
													<div class="col-md-2">
														<label>Widget_Id</label>
													</div>
													<div class="col-md-2">
														<label>Widget_Name</label>
													</div>
													<div class="col-md-2">
														<label>Data</label>
													</div>
													<div class="col-md-2">
														<label>Action</label>
													</div>
													<div class="col-md-2">
														<label>Reference</label>
													</div>

												</div>

												<div>
													<div class="col-md-1">
														<form:input path="setupId" class="form-control" readonly="true" />
													</div>

													<div class="col-md-1 form-group has-error" id="sequenceGroup ">

														<form:input path="sequence" class="form-control " />
													</div>

													<div class="col-md-2 form-group has-error">
														<form:input path="widgetId" name="query"  type="text" class="form-control" placeholder="Enter text" />
													</div>
													<div class="col-md-2 form-group has-error">
														<form:input path="widgetName" class="form-control" placeholder="Enter text" />
													</div>
													<div class="col-md-2 form-group has-error">
														<form:input path="data" class="form-control" placeholder="Enter text" />
													</div>
													<div class="col-md-2 form-group has-error">
														<form:select path="actionType" items="${actionTypes}" class="form-control">
														</form:select>
													</div>

													<div class="col-md-2 form-group has-error">
														<form:input id="reference" path="reference" class="form-control" placeholder="Enter text" />
													</div>

												</div>


												<div class="col-md-12 container">
													<div class="   btn-group text-right  ">

														<button id="add" type="button" class="btn btn-default ">Add</button>
														<button id="save" type="button" class="btn btn-default ">Save</button>
														<button id="delete" type="button" class="btn btn-danger " data-toggle="modal" data-target="#deleteConfirm">Delete</button>
														<button id="clear" type="button" class="btn btn-default ">Clear</button>
														<button type="button" class="btn btn-info " data-toggle="modal" data-target="#findReference">Find Reference</button>
														<button id="refresh" type="submit" class="btn btn-default " onclick="refreshDataTable();">Search By Reference</button>
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
							<table width="100%" class="table table-striped table-bordered table-hover" id="dataTables">
								<thead>
									<tr>
										<th>Sequence</th>
										<th>Widget_Id</th>
										<th>Widget_name</th>
										<th>Data</th>
										<th>Action</th>
										<th>reference</th>
										<th>Edit</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach var="setupBean" items="${setupBeans}" varStatus="loop">

										<c:set var="Id" value="${setupBean.setupId}" />
										<c:set var="widgetId" value="${setupBean.widgetId}" />
										<c:set var="name" value="${setupBean.widgetName}" />
										<c:set var="data" value="${setupBean.data}" />
										<c:set var="actionType" value="${setupBean.actionType}" />
										<c:set var="sequence" value="${setupBean.sequence}" />
										<c:set var="reference" value="${setupBean.reference}" />

										<c:choose>
											<c:when test="${loop.index % 2 !=0 }">
												<tr class="info">
													<td>${sequence}</td>
													<td>${widgetId }</td>
													<td>${name}</td>
													<td>${data }</td>
													<td>${actionType }</td>
													<td>${reference }</td>
													<td><button type="button" class="btn btn-default btn-xs center " onclick="editData('${Id}','${widgetId}','${name}','${data}','${actionType }','${sequence }','${reference }');">Edit</button></td>

												</tr>

											</c:when>
											<c:otherwise>
												<tr>
													<td>${sequence}</td>
													<td>${widgetId }</td>
													<td>${name}</td>
													<td>${data }</td>
													<td>${actionType }</td>
													<td>${reference }</td>
													<td><button type="button" class="btn btn-default btn-xs center " onclick="editData('${Id}','${widgetId}','${name}','${data}','${actionType }','${sequence }','${reference }');">Edit</button></td>

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
		<div id="findReference" class="modal fade" role="dialog">
			<div class="modal-dialog">

				<!-- Modal content-->
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h4 class="modal-title">Find Group Reference</h4>
					</div>
					<div class="modal-body">
						<p>
						<div class="panel-body">
							<div class="table-responsive">
								<table class="table">
									<thead>
										<tr>
											<th>ID</th>
											<th>Group_Name</th>
											<th>Select</th>

										</tr>
									</thead>
									<tbody>
										<c:forEach var="groupBean" items="${groupBeans}" varStatus="loop">

											<c:set var="name" value="${groupBean.name}" />
											<tr>
												<td>${groupBean.id }</td>
												<td>${groupBean.name }</td>

												<td><button onclick="selectReference('${name}')" type="button" class="btn btn-info" data-dismiss="modal">Selected</button></td>
											</tr>
										</c:forEach>


									</tbody>
								</table>
							</div>
							<!-- /.table-responsive -->
						</div>
						</p>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					</div>
				</div>


			</div>
		</div>

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
						<p>Are You Sure to Delete This Step.</p>
					</div>
					<div class="modal-footer">
						<button id="confirmDeleteStep" type="button" class="btn btn-danger" data-dismiss="modal">Yes</button>
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
			
	
			$('#query').typeahead({        
			        local: ['alpha','allpha2','alpha3','bravo','charlie','delta','epsilon','gamma','zulu']
			});  
			$('#widgetId').typeahead({        
		        local: ['alpha','allpha2','alpha3','bravo','charlie','delta','epsilon','gamma','zulu']
		});
			
			

		});
		function initDataTable() {
			$('#dataTables').DataTable({
				responsive : true
			});
		}
		function initHandler() {
			addButtonHandler();
			saveButtonHandler();
			clearForm();
			clearButtonHandler();
			deleteButtonHandler();
			refreshDataTable();
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
				$('#createLoginStepForm').submit();
			});
		}
		function addButtonHandler() {

			$('#add').click(function() {
				var isChecked = addValidation();
				if (isChecked) {
					$('#direction').val("insert");
					$('#createLoginStepForm').submit();
				}

			});
		}
		function saveButtonHandler() {
			$('#save').click(function() {
				var isChecked = saveValidation();
				if (isChecked) {
					$('#direction').val("update");
					$('#createLoginStepForm').submit();
				}

			});
		}
		function deleteButtonHandler() {

			$('#confirmDeleteStep').click(function() {
				var isChecked = deleteValidation();

				if (isChecked) {

					$('#direction').val("delete");
					$('#createLoginStepForm').submit();
					
				}
			});

		}
		function editData(id, widgetId, name, data, action, sequence, reference) {
			$('#setupId').val(id);
			$('#widgetId').val(widgetId);
			$('#widgetName').val(name);
			$('#data').val(data);
			$('#actionType').val(action);
			$('#sequence').val(sequence);
			$('#reference').val(reference);

		}
		function clearButtonHandler(){
			$('#clear').click(function() {
				clearForm();
			});
		}

		function clearForm() {
				$('#setupId').val('');
				$('#widgetId').val('');
				$('#widgetName').val('');
				$('#data').val('');
				$('#actionType').val('');
				$('#sequence').val('');
				$('#reference').val('');
				// 				var table = $('#dataTables').DataTable();
				// 				table.clear().draw();
				$('#operationMessage').addClass("disabled");
				$('#operationMessageDelete').addClass("disabled");
			

		}

		function addValidation() {

			var widgetId = $('#widgetId').val();
			var widgetName = $('#widgetName').val();
			var data = $('#data').val();
			var actionType = $('#actionType').val();
			var reference = $('#reference').val();
			if (widgetId == "" || widgetName == "" || data == ""
					|| actionType == "" || reference == "") {
				$('#operationMessage').removeClass("disabled");

				return false;
			} else {
				return true;
			}
		}
		function saveValidation() {

			var setupId = $('#setupId').val();
			var widgetId = $('#widgetId').val();
			var widgetName = $('#widgetName').val();
			var data = $('#data').val();
			var actionType = $('#actionType').val();
			var reference = $('#reference').val();
			if (setupId == "" || widgetId == "" || widgetName == ""
					|| data == "" || actionType == "" || reference == "") {
				$('#operationMessage').removeClass("disabled");

				//addClass
				return false;
			} else {
				return true;
			}
		}
		function deleteValidation() {

			var setupId = $('#setupId').val();

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
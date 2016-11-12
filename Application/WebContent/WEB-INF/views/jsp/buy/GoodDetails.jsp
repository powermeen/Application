<%@include file="../include.jsp"%>
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

.display-flex {
	display: flex;
}

.under-line {
	border-bottom: 1px solid #ddd;
}
</style>

<script type="text/javascript">
	
</script>
<title>Goods Details</title>
</head>
<body>
	<div><jsp:include page="../Menubar.jsp" /></div>
	<div>


		<div>
			<div class="panel panel-default">
				<div class="panel-heading">Goods Details</div>
				<div class="panel-body">
					<div>
						<ul class="nav nav-tabs">
							<li role="presentation" class="active"><a href="#">Toolbar</a></li>
							<li role="presentation"><a href="#"><span
									class="glyphicon glyphicon-file" aria-hidden="true"></span>New</a></li>
							<li role="presentation"><a href="#"><span
									class="glyphicon glyphicon-floppy-save" aria-hidden="true"></span>Save</a></li>
							<li role="presentation"><a href="#"><span
									class="glyphicon glyphicon-trash" aria-hidden="true"></span>Delete</a></li>
						</ul>
					</div>
					<form class="form-horizontal">
						<div class="col-md-12">
							<div class="col-md-1">

								<div class="form-group">
									<label>Code</label> <input type="text" class="form-control "
										id="" placeholder="Code">
								</div>

							</div>
							<div class="col-md-1"></div>
							<div class="col-md-2">

								<div class="form-group">
									<label>Barcode</label> <input type="text" class="form-control"
										placeholder="Barcode">
								</div>

							</div>
						</div>
						<div class="col-md-12">
							<div class="col-md-6">
								<div class="form-group">
									<label>Name</label> <input type="text" class="form-control"
										placeholder="Name">
								</div>
							</div>
						</div>


						<div class=" col-md-12 well">
							<div class="col-md-12">
								<div class="col-md-1">
									<div class="form-group">
										<label>Group</label> <input type="text" class="form-control"
											placeholder="Name">
									</div>
								</div>
								<div class="col-md-2"></div>
								<div class="col-md-2">
									<div class="form-group">
										<label>replacement Product</label> <input type="text"
											class="form-control" placeholder="replacement Product">
									</div>
								</div>
							</div>

							<div class="col-md-12">
								<div class="col-md-2">
									<div class="form-group">
										<label>Account Goods Group</label> <input type="text"
											class="form-control" placeholder="Account Group">
									</div>
								</div>
								<div class="col-md-2"></div>
								<div class="col-md-2">
									<div class="form-group">
										<label>Able To minus Goods</label> <input type="text"
											class="form-control" placeholder="[Y,N,A]">
									</div>
								</div>
							</div>

							<div class="col-md-12">
								<div class="col-md-6">
									<div class="panel panel-default">
										<div class="panel-heading">Unit</div>
										<div class="panel-body">
											<div class="col-md-12">
												<div class="col-md-6">
													<label>Unit : Count</label>
												</div>
												<div class="col-md-6">
													<label>multiply By </label>
												</div>

											</div>

											<div class="col-md-12 form-inline">
												<div class="col-md-6">
													<div class="form-group">
														<label>Item</label> <input type="text"
															class="form-control ">
													</div>
												</div>
												<div class="col-md-6">
													<div class="form-group">
														<label>Unit</label>
													</div>
												</div>
											</div>
											<div class="col-md-12 form-inline">
												<div class="col-md-6">
													<div class="form-group">
														<label>Pack</label> <input type="text"
															class="form-control ">
													</div>
												</div>
												<div class="col-md-6">
													<div class="form-group">
														<input type="text" class="form-control ">
													</div>
												</div>

											</div>
											<div class="col-md-12 form-inline">
												<div class="col-md-6">
													<div class="form-group">
														<label>Buy</label> <input type="text"
															class="form-control ">
													</div>
												</div>
												<div class="col-md-6">
													<div class="form-group">
														<input type="text" class="form-control ">
													</div>
												</div>
											</div>
											<div class="col-md-12 form-inline">
												<div class="col-md-6">
													<div class="form-group">
														<label>Sell</label> <input type="text"
															class="form-control ">
													</div>
												</div>
												<div class="col-md-6">
													<div class="form-group">
														<input type="text" class="form-control ">
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
								<div class="col-md-6">
									<div class="panel panel-default">
										<div class="panel-heading">Price</div>
										<div class="panel-body">
											<div class="col-md-12 form-inline">
												<div class="col-md-6">
													<label>Price Per unit</label>
												</div>
												<div class="col-md-6">
													<div class="form-group">
														<input type="text" class="form-control ">
													</div>
												</div>

											</div>
											<div class="col-md-12 form-inline">
												<div class="col-md-6">
													<div>
														<label>2</label>
													</div>
												</div>
												<div class="col-md-6">
													<div class="form-group">
														<input type="text" class="form-control ">
													</div>
												</div>

											</div>
											<div class="col-md-12 form-inline">
												<div class="col-md-6">
													<div>
														<label>3</label>
													</div>
												</div>
												<div class="col-md-6">
													<div class="form-group">
														<input type="text" class="form-control ">
													</div>
												</div>

											</div>
											<div class="col-md-12 form-inline">
												<div class="col-md-6">
													<div>
														<label>4</label>
													</div>
												</div>
												<div class="col-md-6">
													<div class="form-group">
														<input type="text" class="form-control ">
													</div>
												</div>

											</div>
											<div class="col-md-12 form-inline">
												<div class="col-md-6">
													<div>
														<label>5</label>
													</div>
												</div>
												<div class="col-md-6">
													<div class="form-group">
														<input type="text" class="form-control ">
													</div>
												</div>

											</div>
										</div>
									</div>
								</div>
							</div>

							<div class="col-md-12">
								<div class="col-md-12">
									<div class="panel panel-default">
										<div class="panel-heading">Panel heading without title</div>
										<div class="panel-body">
											<div class="col-md-12 form-inline">
												<div class="col-md-6">
													<div>
														<div class="form-group">
															<label>Contain/Pack</label> <input type="text"
																class="form-control ">
														</div>
													</div>
												</div>
												<div class="col-md-6">
													<div class="form-group">
														<label>Type VAT</label> <select class="form-control">
															<option>None</option>
															<option>AAA</option>
															<option>BBB</option>
														</select>

													</div>
												</div>

											</div>

											<div class="col-md-12 form-inline">
												<div class="col-md-6">
													<div>
														<div class="form-group">
															<label>Vendor</label> <input type="text"
																class="form-control ">
														</div>
													</div>
												</div>
												<div class="col-md-6">
													<div class="form-group">
														<label>Cost</label> 
														<input type="text" class="form-control ">

													</div>
												</div>

											</div>
										</div>
									</div>
								</div>
							</div>

						</div>
					</form>

				</div>
			</div>
		</div>







	</div>


</body>
</html>
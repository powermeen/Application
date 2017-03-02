<%@include file="include.jsp"%>
<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta equiv="Content-Type" content="text/html; charset=TIS-620">

<title>Home Page</title>
<jsp:include page="CssMain.jsp"></jsp:include>

<style type="text/css">
</style>


<script type="text/javascript">
	
</script>
</head>
<body>

	<div id="wrapper">

		<!-- Navigation -->
		<jsp:include page="Menubar.jsp"></jsp:include>

		<div id="page-wrapper">

			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">Assist Tool</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>


			<div class="row">
				<div class="panel panel-info">
					<div class="panel-heading">File Generator</div>
					<!-- /.panel-heading -->
					<div class="panel-body">

						<div>
							<div class="col-md-12">


								<div class="col-md-3 form-group ">
									<dt >File Generator</dt>
									<input class="form-control " readonly="true" />
								</div>

							</div>
							<div class="col-md-12">

								<div class="col-md-3 form-group ">
									<button type="button" class="btn btn-primary">Generate</button>
									<button type="button" class="btn btn-default ">Copy</button>
								</div>

							</div>

						</div>




					</div>
				</div>
			</div>
		</div>

	</div>


	<jsp:include page="JSMain.jsp"></jsp:include>
</body>
</html>
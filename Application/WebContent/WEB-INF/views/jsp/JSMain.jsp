<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>JS Main</title>


<!-- JS -->
<spring:url value="/resources/core/vendor/jquery/jquery.min.js" var="jqueryJS" />
<spring:url value="/resources/core/vendor/bootstrap/js/bootstrap.min.js" var="bootstrapJS" />
<spring:url value="/resources/core/vendor/metisMenu/metisMenu.min.js" var="metisMenuJS" />
<spring:url value="/resources/core/vendor/raphael/raphael.min.js" var="raphaelJS" />
<spring:url value="/resources/core/vendor/morrisjs/morris.min.js" var="morrisJS" />
<spring:url value="/resources/core/data/morris-data.js" var="morris_dataJS" />
<!-- DataTables JavaScript -->
<spring:url value="/resources/core/vendor/datatables/js/jquery.dataTables.min.js" var="dataTablesJS" />
<spring:url value="/resources/core/vendor/datatables-plugins/dataTables.bootstrap.min.js" var="dataTablesBootstrapJS" />
<spring:url value="/resources/core/vendor/datatables-responsive/dataTables.responsive.js" var="dataTablesResponsiveJS" />

<spring:url value="/resources/core/vendor/bootstrap/js/bootstrap-toggle.min.js" var="bootstraptoggleJS" />


<spring:url value="/resources/core/dist/js/sb-admin-2.js" var="sb_adminJS" />
<spring:url value="/resources/core/js/angular.min.js" var="angularJS" />

<!-- Suggtion Box  -->
<spring:url value="/resources/core/js/typeahead.bundle.js" var="typeaheadbundleJS" />


<spring:url value="/resources/core/js/custom.js" var="customJS" />



<script   type="text/javascript" src="${jqueryJS}"></script>
<script   type="text/javascript" src="${bootstrapJS}"></script>
<script   type="text/javascript" src="${metisMenuJS}"></script>
<script   type="text/javascript" src="${raphaelJS}"></script>
<script   type="text/javascript" src="${morrisJS}"></script>
<script   type="text/javascript" src="${morris_dataJS}"></script>

<script   type="text/javascript" src="${dataTablesJS}"></script>
<script   type="text/javascript" src="${dataTablesBootstrapJS}"></script>
<script   type="text/javascript" src="${dataTablesResponsiveJS}"></script>

<script   type="text/javascript" src="${sb_adminJS}"></script>
<script   type="text/javascript" src="${angularJS}"></script>
<script   type="text/javascript" src="${bootstraptoggleJS}"></script>
<script   type="text/javascript" src="${typeaheadbundleJS}"></script>

<script   type="text/javascript" src="${customJS}"></script>



</head>
<body>

</body>
</html>
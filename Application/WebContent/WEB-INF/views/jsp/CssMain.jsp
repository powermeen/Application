<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CSS Main</title>



<!-- Css -->
<spring:url value="/resources/core/vendor/bootstrap/css/bootstrap.min.css" var="bootstrapCSS" />
<spring:url value="/resources/core/vendor/metisMenu/metisMenu.min.css" var="metisMenuCSS" />
<spring:url value="/resources/core/dist/css/sb-admin-2.css" var="adminCSS" />
<spring:url value="/resources/core/vendor/morrisjs/morris.css" var="morrisCSS" />
<spring:url value="/resources/core/vendor/font-awesome/css/font-awesome.min.css" var="awesomeCSS" />

<link  type="text/css" rel="stylesheet" href="${bootstrapCSS}"  />
<link  type="text/css" rel="stylesheet" href="${metisMenuCSS}"  />
<link  type="text/css" rel="stylesheet" href="${adminCSS}"  />
<link  type="text/css" rel="stylesheet" href="${morrisCSS}"  />
<link  type="text/css" rel="stylesheet" href="${awesomeCSS}"  />


</head>
<body>

</body>
</html>
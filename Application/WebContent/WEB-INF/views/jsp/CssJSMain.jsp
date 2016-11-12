<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Css JS Main</title>


<!-- Css -->
<%-- <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css" /> --%>
<%-- <link rel="stylesheet" href="${pageContext.request.contextPath}/css/reset.css" /> --%>
<%-- <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" /> --%>


<!-- JS -->
<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script> --%>
<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"></script> --%>

<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> -->

<!-- jQuery library -->
<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script> -->

<!-- Latest compiled JavaScript -->
<!-- <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> -->



<!-- Css -->
<spring:url value="/resources/core/css/bootstrap.min.css" var="bootstrapMinCss" />
<spring:url value="/resources/core/css/bootstrap-theme.min.css" var="bootstrapThemeMinCss" />
<spring:url value="/resources/core/css/CustomStyle.css" var="customStyleCss" />

<link  rel="stylesheet" href="${bootstrapMinCss}"  />
<link  rel="stylesheet" href="${bootstrapThemeMinCss}"  />
<link  rel="stylesheet" href="${customStyleCss}"  />


<!-- JS -->
<spring:url value="/resources/core/js/jquery.min.js" var="jqueryMinJs" />
<spring:url value="/resources/core/js/bootstrap.min.js" var="bootstrapMinJs" />
<spring:url value="/resources/core/js/custom.js" var="customJs" />


<script   type="text/javascript" src="${jqueryMinJs}"></script>
<script   type="text/javascript" src="${bootstrapMinJs}"></script>
<script   type="text/javascript" src="${customJs}"></script>

</head>
<body>

</body>
</html>
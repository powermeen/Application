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


<!-- Css -->
<spring:url value="/resources/core/css/bootstrap.css" var="bootstrapCss" />
<spring:url value="/resources/core/css/bootstrap.min.css" var="bootstrapMinCss" />
<spring:url value="/resources/core/css/bootstrap-theme.css" var="bootstrapThemeCss" />
<spring:url value="/resources/core/css/bootstrap-theme.min.css" var="bootstrapThemeMinCss" />
<spring:url value="/resources/core/css/reset.css" var="resetCss" />
<spring:url value="/resources/core/css/style.css" var="styleCss" />

<%-- <link rel="stylesheet" href="${bootstrapCss}"  /> --%>
<%-- <link rel="stylesheet" href="${bootstrapMinCss}"  /> --%>
<%-- <link rel="stylesheet" href="${bootstrapThemeCss}"  /> --%>
<%-- <link rel="stylesheet" href="${bootstrapThemeMinCss}"  /> --%>
<%-- <link rel="stylesheet" href="${resetCss}"  /> --%>
<%-- <link rel="stylesheet" href="${styleCss}"  /> --%>

<!-- JS -->
<spring:url value="/resources/core/js/bootstrap.js" var="bootstrapJs" />
<spring:url value="/resources/core/js/bootstrap.min.js" var="bootstrapMinJs" />
<spring:url value="/resources/core/js/jquery.min.js" var="jqueryMinJs" />

<script src="${bootstrapJs}"></script>
<script src="${bootstrapMinJs}"></script>
<script src="${jqueryMinJs}"></script>

</head>
<body>

</body>
</html>
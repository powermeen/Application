<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">





<title>Test </title>
<jsp:include page="CssJSMain.jsp"></jsp:include>




</head>
<body>
<form:form >
<%-- 	<form:input path="inputTexts" /> --%>
<%-- 	<form:option value="1" id="option"></form:option> --%>
<%-- 	<form:button >button</form:button> --%>
	
	<select id="country" name="country">
		<option value="US">United Stated</option>
		<option value="CHINA">China</option>
		<option value="SG">Singapore</option>
		<option value="MY">Malaysia</option>
	</select>

</form:form>


</body>
</html>
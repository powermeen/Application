<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="../include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login View Setup</title>
<jsp:include page="../CssMain.jsp"></jsp:include>
</head>
<body>

	<div id="wrapper">

		<!-- Navigation -->
		<jsp:include page="../Menubar.jsp"></jsp:include>

  <div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Please Sign In</h3>
                    </div>
                    <div class="panel-body">
                       <form:form id="login" method="post" action="login" modelAttribute="loginModel" role="form">
                            <fieldset>
                                <div class="form-group">
                                    <form:input path="userName" class="form-control " placeholder="UserName" />
                                </div>
                                <div class="form-group">
                                    <form:input class="form-control" placeholder="Password" path="password" type="password" />
                                </div>
                                <div class="checkbox">
                                    <label>
                                        <input name="remember" type="checkbox" value="Remember Me">Remember Me
                                    </label>
                                </div>
                                <!-- Change this to a button or input when using this as a form -->
                                <button type="submit" class="btn btn-lg btn-success btn-block">Login</button>
                            </fieldset>
                        </form:form>
                    </div>
                </div>
            </div>
        </div>
    </div>


	</div>

	<jsp:include page="../JSMain.jsp"></jsp:include>
	
</body>
</html>
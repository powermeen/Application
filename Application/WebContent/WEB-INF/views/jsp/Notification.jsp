<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Notification</title>
<script type="text/javascript">
	setTimeout(function() {
		$("#message").addClass("disabled");
	}, 1200);
</script>
</head>
<body>

	<div>
		<div id="message" class="${displayResponseBean.css }">
			<strong>${displayResponseBean.status }</strong>
			${displayResponseBean.message }
		</div>
	</div>



</body>
</html>
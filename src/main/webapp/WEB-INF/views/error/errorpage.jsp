<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
	isErrorPage="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>error page</title>
<script type="text/javascript" src="../../../js/jquery-1.11.1.js"></script>
<script type="text/javascript">
	$(function() {
		$("#center-div").center(true);
	});
</script>
</head>
<body style="margin: 0; padding: 0; background-color: #f5f5f5;">
	<div id="center-div">
		<table style="height: 100%; width: 600px; text-align: center;">
			<tr>
				<td>
					<%=exception.getMessage()%>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>
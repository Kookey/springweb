<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isErrorPage="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>error page</title>
<%@ include file="../tagHeader.jsp"%>
<script type="text/javascript">
	$(function() {
		
	});
</script>
</head>
<body style="margin: 0; padding: 0; background-color: #f5f5f5;">
	<div id="center-div">
		<table style="height: 100%; width: 600px; text-align: center;">
			<tr>
				<td>
					${exception.message}
				</td>
				<td><a href="login.do">登录</a></td>
			</tr>
		</table>
	</div>
</body>
</html>
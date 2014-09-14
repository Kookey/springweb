<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="/common/tagHeader.jsp"%>
<script type="text/javascript">
	$(function() {
		$("#ajax").click(function() {
			$.ajax({
				url : "test/ajax.do",
				type:"POST",
				success:function(msg){
					alert(msg);
				}
			});
		});
		$("#json").click(function() {
			$.ajax({
				url : "test/json.do",
				type:"GET",
				success:function(msg){
					console.info(msg);
				}
			});
		});
	});
</script>
<title>Insert title here</title>
</head>
<body>
	<h1></h1>
	<input type="button" value="ajax请求" id="ajax">
	<input type="button" value="ajax-json请求" id="json">
	
</body>
</html>
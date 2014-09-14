<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="/common/tagHeader.jsp"%>
<title>Insert title here</title>
</head>
<body>
	<h1>MINI-UI</h1>
    <input id="helloBtn" class="mini-button" text="Hello" onclick="onHelloClick"/>
    <script type="text/javascript">
        function onHelloClick(e) {
            var button = e.sender;
            mini.alert("Hello MiniUI!");
        }
    </script>
</body>
</html>
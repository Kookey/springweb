<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<base href="<%=basePath %>" />
<script type="text/javascript" src="<%=basePath %>js/jquery-1.11.1.js"></script>
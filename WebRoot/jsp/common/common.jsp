<%@ page language="java"  pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<link rel="stylesheet" type="text/css" href="<%=basePath %>css/common/showmsgbox.css">
<script type="text/javascript" src="<%=basePath %>js/common/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="<%=basePath %>/js/common/showmsgbox.fn.js"></script>
<script type="text/javascript" src="<%=basePath %>/js/common/validate.fn.js"></script>
<script type="text/javascript">
	var basePath = '<%=basePath%>';
</script>


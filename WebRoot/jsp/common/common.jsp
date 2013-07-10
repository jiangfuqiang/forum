<%@ page language="java"  pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<link rel="stylesheet" type="text/css" href="<%=basePath %>js/frame/ext/resources/css/ext-all.css">
<script type="text/javascript" src="<%=basePath %>js/frame/ext/adapter/ext/ext-base.js"></script>
<script type="text/javascript" src="<%=basePath %>js/frame/ext/ext-all.js"></script>
<script type="text/javascript">
	var basePath = '<%=basePath%>';
	Ext.QuickTips.init();
	Ext.form.Field.prototype.msgTarget='qtip';
	Ext.BLANK_IMAGE_URL=basePath + 'js/frame/ext/resources/images/default/s.gif';
	
</script>


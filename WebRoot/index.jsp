<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		body{
			background:url(images/common/bg.png);
			height:97%;
			width:99%;
		}
		#login_img{
			cursor: pointer;
		}
		#loginloading_img {
			display: none;
		}
		.img_div div{
			display:relative;
			float:left;
			width:100%;
			height:100%;
		}
		#loading_div{
			margin-top:-72px;
			margin-left:5x;
		}
	</style>
	<%@include file="/jsp/common/common.jsp" %>
	<script type="text/javascript">
		$(function(){
			$("#login_img").click(function(){
				var src = $(this).attr("src");
				$("#loginloading_img").show();
				var username = $("#username").val();
				if(!username) {
					$.showmsg({'msg':'用户名不能为空'});
					$("#loginloading_img").hide();
					return;
				}
				if($.validate({type:'chinese',value:username})) {
					$.showmsg({'title':'错误提示', 'msg':'用户名不能为汉字'});
					$("#loginloading_img").hide();
					return;
				}
				var password = $("#password").val();
				if(!password) {
					$.showmsg({'msg':'密码不能为空'});
					$("#loginloading_img").hide();
					return;
				}
				$.ajax({
					url: basePath + 'login/login.action',
					dataType: 'json',
					data: {username:username, password:password},
					success: function(json) {
						alert(json.msg);
					},
					error: function(){
						$.showmsg({'msg':'登陆失败，请检查用户名或者密码输入是否正确'});
						$("#loginloading_img").hide();
					}
				});
				//$("#loginloading_img").hide();
			});
		});
	</script>
  </head>
  
  <body>
    <div>
    	<table>
    		
    		<tr>
    			<td>用户名:</td>
    			<td><input type="text" name="username" id="username"/></td>
    			<td rowspan="2">
    				<div class="img_div">
    					<div><img src="<%=basePath %>images/common/login.png" id="login_img"/></div>
    					<div id="loading_div"><img width="73" height="73" src="<%=basePath %>images/common/loginloading.gif" id="loginloading_img"/></div>
    				</div>
    			</td>
    		</tr>
    		<tr>
    			<td>密码:</td>
    			<td><input type="password" name="password" id="password"/></td>
    		</tr>
    	</table>
    </div>
  </body>
</html>

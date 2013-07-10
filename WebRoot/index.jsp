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
		Ext.onReady(function(){
			var username = new Ext.form.TextField({
				allowBlank:false,
				margin:'15 0 15 0',
				height:30,
				fieldLabel:'用户名',
				blankText: '用户名不能为空',
				name: 'username',
				id: 'username'
			});
			var password = new Ext.form.Text({
				inputType: 'password',
				height:30,
				allowBlank: false,
				fieldLabel: '密码',
				maxLength: 10,
				blankText: '密码不能为空',
				name: 'password',
				id: 'password'
			});
			
			var loginButton = new Ext.Button({
				text: '登陆',
				handler: save
			});
			
			var form = new Ext.form.FormPanel({
				id: 'login_form',
				shadow: true,
				border: true,
				frame: true,
				labelAlign: 'right',
				labelWidth: 50,
				height:150,
				labelPad:0,
				buttonAlign: 'center',
				buttons: [loginButton],
				defaults: {
					width:300,
					autoWidth:true
				},
				keys: [
						{key: Ext.EventObject.ENTER,
						fn: save,
						scope:this
						}
					],
					
				items: [
						username, password
					]
			});
			
			var win = new Ext.Window({
				layout:'column',
				title:'用户登陆',
				id:'win',
				align:'center',
				width:325,
				height:182,
				resizable:false,
				draggable:false,
				maximizable: false,
				closeAction:'close',
				closable:false,
				frame: false,
				border: true,
				items:[form]
			});
			win.show();
			
			function save() {
				var uname = username.getValue();
				var pass = password.getValue();
				Ext.Ajax.request({
					url: basePath + 'login/login.action',
					params: {username:uname, password:pass},
					scope: this,
					success: function(response) {
						//var json = Ext.util.JSON.decode(response.responseText);
						alert(response.responseText);
					}
				});	
			}
		});
		
	</script>
  </head>
  
  <body>
    
  </body>
</html>

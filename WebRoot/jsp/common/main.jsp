

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'main.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<%@include file="common.jsp" %>
	<script type="text/javascript">
		Ext.onReady(function() {

			var myBorderPanel = new Ext.Viewport({  
   	 			layout: 'border', 
   	 			items: [
   	 				{
   	 					region:'north',
   	 					html: 'north',
   	 					height:50,
   	 					items: [
   	 							
   	 						]
   	 				},
   	 				{
				        region: 'south',     // position for region        height: 100,
				        html: 'CopyRight 2013',
				     },
				     {
			        region: 'west',
			        collapsible: true,
			        title: 'Navigation',
			        xtype: 'treepanel',
			        width: 200,
			        autoScroll: true,
			        split: true,
			        loader: new Ext.tree.TreeLoader(),
			        root: new Ext.tree.AsyncTreeNode({
			            expanded: true,
			            children: [{
			                text: 'error.jsp',
			                url: 'error.jsp',
			                leaf: true
			            }, {
			                text: 'Menu Option 2',
			                leaf: true
			            }, {
			                text: 'Menu Option 3',
			                leaf: true
			            }]
			        }),
			        rootVisible: false,
			        listeners: {
			            click: function(n) {
			               // Ext.Msg.alert('Navigation Tree Click', 'You clicked: "' + n.attributes.text + '"');
			               document.getElementById('center_iframe').src = n.attributes.url;
			            }
			        }
			    },{ 
				        region: 'center',     // center region is required, no width/height specified
				        html: '<iframe src="welcome.jsp" id="center_iframe" style="border:0px;width:100%;height:100%;"></iframe>',
				        split:true,    
				        margins: '5 2 0 0'
    				}
				   ]
    		});
			
		});
	</script>

  </head>
  
  <body>
    <div id="main_div" style="width:100%;height:100%;"></div>
  </body>
</html>

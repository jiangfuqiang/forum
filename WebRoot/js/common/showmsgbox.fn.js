/**
*@author jiangfuqiang
*@time 2013-06-12
@decription 弹出框插件
*/

(function($){
	var setting = {
		title: '无标题',
		msg: '未知提示',
		isError: true,
		isShowParent: false,
		url: '',
		frameId: '',
		width: 500,
		height: 250,
		icon: 'warn',
		isConfirm: false,  //是否弹出确认框
		confirmListeners: {
			sure: function(){
				
				return true;
			},
			cancel: function() {
				
				return true;
			}
		},
		isMask: true,  //是否显示遮障
		isClear: false   //弹出窗口后，单机确定时询问是否清楚输入框中的错误数据
	};
	var pt = window;
	var de = document.documentElement;
	var methods = {
		init: function(options) {
			$.extend(setting,options);
			//if(setting.isMask) {
				if(parent.parent) {
					pt = parent;
					while(pt.parent != pt) {   //找到最顶层的窗口
						pt = pt.parent;
					}

					if(pt.showmsgZIndex) {
						++pt.showmsgZIndex;
					} else {
						pt.showmsgZIndex = 1000;
					}
				}
			//}
            if(setting.isShowParent) {
                de = pt.document.documentElement;
            } else {
                dt = document.documentElement;
            }
            var sett = setting;
            var isCancel = eval('setting.confirmListeners.cancel').call(this);
            var isSure = eval('setting.confirmListeners.sure').call(this);
			methods['msgbox'].call(this,sett,isCancel, isSure);
		},
		
		msgbox: function(setting,isCancel, isSure) {   //弹出框

			var isIE = window.document.all?true:false;
			var seriId = new Date().getTime();
			var winWidth = de.clientWidth;
			var winHeight = de.clientHeight;
			var width = parseInt(setting.width);
			var height = parseInt(setting.height);
			if(width < 250) {
				width = 250;
			}
			if(height < 250) {
				height = 250;
			}
			var top = winHeight/2 - height/2;
			var left = winWidth/2 - width/2;
			var icon = setting.icon;
			if(!icon) {
				icon = "error";
			}
			var html ="";
			var url = setting.url;
            if(setting.isMask) {
                html += "<div class='showmsg-mask' id='showmsg_mask_"+seriId+"'></div>";
            }
            html += "<div class='showmsg' id='showmsg_"+seriId+"' style='zindex:"+pt.showmsgZIndex+";width:"+
				width+"px;height:"+height+"px;position:absolute;top:"+top+"px;left:"+left+"px;'>";
			html += "<div class='showmsg-title'>" + setting.title + "<div class='showmsg-title-close'>X</div></div>";
			html += "<div class='showmsg-body'";
				if(url) {
					html += " style='width:100%;height:90%;'>";
					html += "<iframe id='"+setting.frameId+"' class='frame_box' src='"+url+"'></iframe>";
				} else {
					html += "><div class='showmsg-body-img'><img src='"+basePath+"images/common/"+icon+".png'/></div>";
					html += "<div class='showmsg-body-msg'>" + setting.msg + "</div>";
				}
			html += "</div>";
			if(!url) {
				html += "<div class='showmsg-body-foot'>";
					html += "<div class='showmsg-body-btn' style='margin-left:"+(winWidth/2 - left-50)+"px;margin-top:"+(winHeight/2 - top - height/2 - 10)+"px;'>";
					if(setting.isConfirm) {   //如果是询问对话框
						html += "<input type='button' value='确定' id='showmsg_btn_confirm_" + seriId + "'/>";
						html += "<input type='button' value='取消' id='showmsg_btn_confirm_cancel_" + seriId + "'/>";
					} else {
						html += "<input type='button' value='确定' id='showmsg_btn_"+seriId+"'/>";
					}
					html += "</div>";
				html += "</div>";
			}
			html += "</div>";
            if(setting.isShowParent) {
				pt.$("body").append(html);
			} else {
				$("body").append(html);
			}

			if(!setting.isConfirm) {
				$("#showmsg_btn_" + seriId).click(function(){
                    $("#showmsg_mask_"+seriId).remove();
					$("#showmsg_"+seriId).remove();
				});
			} else {
				$("#showmsg_btn_confirm_" + seriId).click(function(){

					if(isSure) {
                        $("#showmsg_mask_"+seriId).remove();
						$("#showmsg_"+seriId).remove();
					}
				});	
				$("#showmsg_btn_confirm_cancel_" + seriId).click(function(){
					if(isCancel) {
                        $("#showmsg_mask_"+seriId).remove();
						$("#showmsg_"+seriId).remove();
					}
				});	
			}
			$(".showmsg-title-close").click(function(){
				$("#showmsg_mask_"+seriId).remove();
				$("#showmsg_"+seriId).remove();
			});
		}
		
	};
	
	$.showmsg = function(options){
		methods['init'].call(this,options);
	};
})(jQuery);
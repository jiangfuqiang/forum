/**
 * @author jiangfuqiang
 * @time 2013-06-30
 * @description 验证数据
 * @param {Object} $
 */
(function($){
	
	var setting = {
		type: '',   //验证类型
		value: '',  //验证的值
		msg: '',   //提示信息
		title: '',   //提示标题
		maxValue: '',   //最大值 
		minValue: '',   //最小值
		isDecimal: false,    //保留位数,
		isNegative: false,  //是否允许负数
		exclude: function(value){return true;}   //过滤指定的数据
	};
	var methods = {
		validateData: function(options) {
			
			$.extend(setting, options);
			
			var exclude = setting.exclude(setting.value);
			if(exclude) {
				
			} else {
				return true;
			}
			
			return false;
		},
		
		validateUrl: function(value) {
			
		},
		validateNumber: function(value, maxValue, minValue, isDecimal, isNegative) {
			
		},
		validateChinese: function(value) {
			
		}
	};
	
	$.fn.validate = function(options) {
		return methods['validateData'].call(this, options);
	}
	
})(jQuery);
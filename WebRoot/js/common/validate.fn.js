/**
 * @author jiangfuqiang
 * @time 2013-06-30
 * @description 验证数据
 * @param {Object} $
 */
(function($){
	var expression = {
		chinese: /[\u4E00-\u9FA5]/g,
		url: ''
	};
	var setting = {
		type: '',   //验证类型,url, email,number,chinese
		value: '',  //验证的值
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
				var type = setting.type;
			
				if(type == 'url') {
					return methods['validateUrl'].call(this, setting.value);
				} else if(type == 'email') {
					
				} else if(type == 'number') {
					return methods['validateNumber'].call(this, setting.value, setting.maxValue, setting.minValue, setting.isDecimal, setting.isNegative);
				} else if(type == 'chinese') {
					return methods['validateChinese'].call(this, setting.value);
				}
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
			if(expression.chinese.test(value)) {
				return true;
			}
			return false;
		}
	};
	
	$.validate = function(options) {
		return methods['validateData'].call(this, options);
	}
	
})(jQuery);
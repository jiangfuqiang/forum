package com.forum.common;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.forum.authority.login.action.UserLoginAction;
import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport implements ServletRequestAware, ServletResponseAware, SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected Logger log = Logger.getLogger(BaseAction.class);
	
	private HttpServletRequest request;
	private HttpServletResponse response;
	private Map<String, Object> session;
	protected String msg;
	
	public void setServletRequest(HttpServletRequest arg0) {
		this.request = arg0;
	}

	public void setServletResponse(HttpServletResponse arg0) {
		this.response = arg0;
		
	}

	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.session = arg0;
	}

	/**
	 * 
	 * 功能: 给前台打印消息
	 * 作者: jiangfuqiang
	 * 创建日期:2013-6-22
	 * 修改者: mender
	 * 修改日期: modifydate
	 * @param msg
	 * @param response
	 */
	protected void printMsg(HttpServletResponse response) {
		if(null == response) {
			this.response.setContentType("application/json;charset=UTF-8");
		}
		PrintWriter out = null;
		try {
			out = response.getWriter();
		} catch(IOException io) {
			
		} finally {
			out.print(msg);
			out.flush();
			out.close();
		}
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}

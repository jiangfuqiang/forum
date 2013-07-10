package com.forum.entity.authority;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * FuncDic entity. @author MyEclipse Persistence Tools
 */

public class FuncDic implements java.io.Serializable {

	// Fields

	private String id;
	private String functionName;
	private String funcPic;
	private String deleteFlag;
	private Date createTime;
	private String createUser;
	private Integer version;
	private Set pdcFunctions = new HashSet(0);

	// Constructors

	/** default constructor */
	public FuncDic() {
	}

	/** minimal constructor */
	public FuncDic(String id, String functionName, String funcPic,
			String deleteFlag, Date createTime, String createUser,
			Integer version) {
		this.id = id;
		this.functionName = functionName;
		this.funcPic = funcPic;
		this.deleteFlag = deleteFlag;
		this.createTime = createTime;
		this.createUser = createUser;
		this.version = version;
	}

	/** full constructor */
	public FuncDic(String id, String functionName, String funcPic,
			String deleteFlag, Date createTime, String createUser,
			Integer version, Set pdcFunctions) {
		this.id = id;
		this.functionName = functionName;
		this.funcPic = funcPic;
		this.deleteFlag = deleteFlag;
		this.createTime = createTime;
		this.createUser = createUser;
		this.version = version;
		this.pdcFunctions = pdcFunctions;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFunctionName() {
		return this.functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getFuncPic() {
		return this.funcPic;
	}

	public void setFuncPic(String funcPic) {
		this.funcPic = funcPic;
	}

	public String getDeleteFlag() {
		return this.deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Set getPdcFunctions() {
		return this.pdcFunctions;
	}

	public void setPdcFunctions(Set pdcFunctions) {
		this.pdcFunctions = pdcFunctions;
	}

}
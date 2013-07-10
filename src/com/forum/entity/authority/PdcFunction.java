package com.forum.entity.authority;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * PdcFunction entity. @author MyEclipse Persistence Tools
 */

public class PdcFunction implements java.io.Serializable {

	// Fields

	private String id;
	private PdcMenu pdcMenu;
	private FuncDic funcDic;
	private String functionUrl;
	private String deleteFlag;
	private Date createTime;
	private String createUser;
	private Integer version;
	private Set organizationFunctions = new HashSet(0);
	private Set positionFunctions = new HashSet(0);
	private Set pdcRoleFuncs = new HashSet(0);
	private Set funcUsers = new HashSet(0);

	// Constructors

	/** default constructor */
	public PdcFunction() {
	}

	/** minimal constructor */
	public PdcFunction(String id, PdcMenu pdcMenu, FuncDic funcDic,
			String functionUrl, String deleteFlag, Date createTime,
			String createUser, Integer version) {
		this.id = id;
		this.pdcMenu = pdcMenu;
		this.funcDic = funcDic;
		this.functionUrl = functionUrl;
		this.deleteFlag = deleteFlag;
		this.createTime = createTime;
		this.createUser = createUser;
		this.version = version;
	}

	/** full constructor */
	public PdcFunction(String id, PdcMenu pdcMenu, FuncDic funcDic,
			String functionUrl, String deleteFlag, Date createTime,
			String createUser, Integer version, Set organizationFunctions,
			Set positionFunctions, Set pdcRoleFuncs, Set funcUsers) {
		this.id = id;
		this.pdcMenu = pdcMenu;
		this.funcDic = funcDic;
		this.functionUrl = functionUrl;
		this.deleteFlag = deleteFlag;
		this.createTime = createTime;
		this.createUser = createUser;
		this.version = version;
		this.organizationFunctions = organizationFunctions;
		this.positionFunctions = positionFunctions;
		this.pdcRoleFuncs = pdcRoleFuncs;
		this.funcUsers = funcUsers;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public PdcMenu getPdcMenu() {
		return this.pdcMenu;
	}

	public void setPdcMenu(PdcMenu pdcMenu) {
		this.pdcMenu = pdcMenu;
	}

	public FuncDic getFuncDic() {
		return this.funcDic;
	}

	public void setFuncDic(FuncDic funcDic) {
		this.funcDic = funcDic;
	}

	public String getFunctionUrl() {
		return this.functionUrl;
	}

	public void setFunctionUrl(String functionUrl) {
		this.functionUrl = functionUrl;
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

	public Set getOrganizationFunctions() {
		return this.organizationFunctions;
	}

	public void setOrganizationFunctions(Set organizationFunctions) {
		this.organizationFunctions = organizationFunctions;
	}

	public Set getPositionFunctions() {
		return this.positionFunctions;
	}

	public void setPositionFunctions(Set positionFunctions) {
		this.positionFunctions = positionFunctions;
	}

	public Set getPdcRoleFuncs() {
		return this.pdcRoleFuncs;
	}

	public void setPdcRoleFuncs(Set pdcRoleFuncs) {
		this.pdcRoleFuncs = pdcRoleFuncs;
	}

	public Set getFuncUsers() {
		return this.funcUsers;
	}

	public void setFuncUsers(Set funcUsers) {
		this.funcUsers = funcUsers;
	}

}
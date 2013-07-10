package com.forum.entity.authority;

import java.util.Date;

/**
 * PdcRole entity. @author MyEclipse Persistence Tools
 */

public class PdcRole implements java.io.Serializable {

	// Fields

	private String id;
	private String roleName;
	private String roleDesc;
	private String deleteFlag;
	private Integer proior;
	private Date createTime;
	private String createUser;
	private Integer version;

	// Constructors

	/** default constructor */
	public PdcRole() {
	}

	/** full constructor */
	public PdcRole(String id, String roleName, String roleDesc,
			String deleteFlag, Integer proior, Date createTime,
			String createUser, Integer version) {
		this.id = id;
		this.roleName = roleName;
		this.roleDesc = roleDesc;
		this.deleteFlag = deleteFlag;
		this.proior = proior;
		this.createTime = createTime;
		this.createUser = createUser;
		this.version = version;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDesc() {
		return this.roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	public String getDeleteFlag() {
		return this.deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public Integer getProior() {
		return this.proior;
	}

	public void setProior(Integer proior) {
		this.proior = proior;
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

}
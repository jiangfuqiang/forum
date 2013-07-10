package com.forum.entity.authority;

import java.util.Date;

/**
 * VPdcFunctionId entity. @author MyEclipse Persistence Tools
 */

public class VPdcFunction implements java.io.Serializable {

	// Fields

	private String id;
	private String functionUrl;
	private String deleteFlag;
	private String menuId;
	private String funcDicId;
	private Date createTime;
	private String createUser;
	private Integer version;
	private String roleName;
	private String roleDesc;
	private String roleId;
	private Integer proior;

	// Constructors

	/** default constructor */
	public VPdcFunction() {
	}

	
	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getMenuId() {
		return this.menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	public String getFuncDicId() {
		return this.funcDicId;
	}

	public void setFuncDicId(String funcDicId) {
		this.funcDicId = funcDicId;
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

	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public Integer getProior() {
		return this.proior;
	}

	public void setProior(Integer proior) {
		this.proior = proior;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VPdcFunction))
			return false;
		VPdcFunction castOther = (VPdcFunction) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getFunctionUrl() == castOther.getFunctionUrl()) || (this
						.getFunctionUrl() != null
						&& castOther.getFunctionUrl() != null && this
						.getFunctionUrl().equals(castOther.getFunctionUrl())))
				&& ((this.getDeleteFlag() == castOther.getDeleteFlag()) || (this
						.getDeleteFlag() != null
						&& castOther.getDeleteFlag() != null && this
						.getDeleteFlag().equals(castOther.getDeleteFlag())))
				&& ((this.getMenuId() == castOther.getMenuId()) || (this
						.getMenuId() != null
						&& castOther.getMenuId() != null && this.getMenuId()
						.equals(castOther.getMenuId())))
				&& ((this.getFuncDicId() == castOther.getFuncDicId()) || (this
						.getFuncDicId() != null
						&& castOther.getFuncDicId() != null && this
						.getFuncDicId().equals(castOther.getFuncDicId())))
				&& ((this.getCreateTime() == castOther.getCreateTime()) || (this
						.getCreateTime() != null
						&& castOther.getCreateTime() != null && this
						.getCreateTime().equals(castOther.getCreateTime())))
				&& ((this.getCreateUser() == castOther.getCreateUser()) || (this
						.getCreateUser() != null
						&& castOther.getCreateUser() != null && this
						.getCreateUser().equals(castOther.getCreateUser())))
				&& ((this.getVersion() == castOther.getVersion()) || (this
						.getVersion() != null
						&& castOther.getVersion() != null && this.getVersion()
						.equals(castOther.getVersion())))
				&& ((this.getRoleName() == castOther.getRoleName()) || (this
						.getRoleName() != null
						&& castOther.getRoleName() != null && this
						.getRoleName().equals(castOther.getRoleName())))
				&& ((this.getRoleDesc() == castOther.getRoleDesc()) || (this
						.getRoleDesc() != null
						&& castOther.getRoleDesc() != null && this
						.getRoleDesc().equals(castOther.getRoleDesc())))
				&& ((this.getRoleId() == castOther.getRoleId()) || (this
						.getRoleId() != null
						&& castOther.getRoleId() != null && this.getRoleId()
						.equals(castOther.getRoleId())))
				&& ((this.getProior() == castOther.getProior()) || (this
						.getProior() != null
						&& castOther.getProior() != null && this.getProior()
						.equals(castOther.getProior())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37
				* result
				+ (getFunctionUrl() == null ? 0 : this.getFunctionUrl()
						.hashCode());
		result = 37
				* result
				+ (getDeleteFlag() == null ? 0 : this.getDeleteFlag()
						.hashCode());
		result = 37 * result
				+ (getMenuId() == null ? 0 : this.getMenuId().hashCode());
		result = 37 * result
				+ (getFuncDicId() == null ? 0 : this.getFuncDicId().hashCode());
		result = 37
				* result
				+ (getCreateTime() == null ? 0 : this.getCreateTime()
						.hashCode());
		result = 37
				* result
				+ (getCreateUser() == null ? 0 : this.getCreateUser()
						.hashCode());
		result = 37 * result
				+ (getVersion() == null ? 0 : this.getVersion().hashCode());
		result = 37 * result
				+ (getRoleName() == null ? 0 : this.getRoleName().hashCode());
		result = 37 * result
				+ (getRoleDesc() == null ? 0 : this.getRoleDesc().hashCode());
		result = 37 * result
				+ (getRoleId() == null ? 0 : this.getRoleId().hashCode());
		result = 37 * result
				+ (getProior() == null ? 0 : this.getProior().hashCode());
		return result;
	}

}
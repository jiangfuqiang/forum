package com.forum.entity.authority;

import java.util.Date;

import com.forum.common.entity.Entity;

/**
 * VPdcMenuFunctionId entity. @author MyEclipse Persistence Tools
 */

public class VPdcMenuFunction extends Entity implements java.io.Serializable {

	// Fields

	private String id;
	private String menuName;
	private String parentMenuId;
	private String memo;
	private String inform;
	private String serialNum;
	private String deleteFlag;
	private String menuUrl;
	private String menuPic;
	private Date createTime;
	private String createUser;
	private Integer version;
	private String functionUrl;
	private Integer proior;
	private String funcDicId;
	private String dicName;
	private String functionId;
	private String roleId;
	private String roleName;

	// Constructors

	/** default constructor */
	public VPdcMenuFunction() {
	}

	

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMenuName() {
		return this.menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getParentMenuId() {
		return this.parentMenuId;
	}

	public void setParentMenuId(String parentMenuId) {
		this.parentMenuId = parentMenuId;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getInform() {
		return this.inform;
	}

	public void setInform(String inform) {
		this.inform = inform;
	}

	public String getSerialNum() {
		return this.serialNum;
	}

	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}

	public String getDeleteFlag() {
		return this.deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public String getMenuUrl() {
		return this.menuUrl;
	}

	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}

	public String getMenuPic() {
		return this.menuPic;
	}

	public void setMenuPic(String menuPic) {
		this.menuPic = menuPic;
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

	public String getFunctionUrl() {
		return this.functionUrl;
	}

	public void setFunctionUrl(String functionUrl) {
		this.functionUrl = functionUrl;
	}

	public Integer getProior() {
		return this.proior;
	}

	public void setProior(Integer proior) {
		this.proior = proior;
	}

	public String getFuncDicId() {
		return this.funcDicId;
	}

	public void setFuncDicId(String funcDicId) {
		this.funcDicId = funcDicId;
	}

	public String getDicName() {
		return this.dicName;
	}

	public void setDicName(String dicName) {
		this.dicName = dicName;
	}

	public String getFunctionId() {
		return this.functionId;
	}

	public void setFunctionId(String functionId) {
		this.functionId = functionId;
	}

	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VPdcMenuFunction))
			return false;
		VPdcMenuFunction castOther = (VPdcMenuFunction) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getMenuName() == castOther.getMenuName()) || (this
						.getMenuName() != null
						&& castOther.getMenuName() != null && this
						.getMenuName().equals(castOther.getMenuName())))
				&& ((this.getParentMenuId() == castOther.getParentMenuId()) || (this
						.getParentMenuId() != null
						&& castOther.getParentMenuId() != null && this
						.getParentMenuId().equals(castOther.getParentMenuId())))
				&& ((this.getMemo() == castOther.getMemo()) || (this.getMemo() != null
						&& castOther.getMemo() != null && this.getMemo()
						.equals(castOther.getMemo())))
				&& ((this.getInform() == castOther.getInform()) || (this
						.getInform() != null
						&& castOther.getInform() != null && this.getInform()
						.equals(castOther.getInform())))
				&& ((this.getSerialNum() == castOther.getSerialNum()) || (this
						.getSerialNum() != null
						&& castOther.getSerialNum() != null && this
						.getSerialNum().equals(castOther.getSerialNum())))
				&& ((this.getDeleteFlag() == castOther.getDeleteFlag()) || (this
						.getDeleteFlag() != null
						&& castOther.getDeleteFlag() != null && this
						.getDeleteFlag().equals(castOther.getDeleteFlag())))
				&& ((this.getMenuUrl() == castOther.getMenuUrl()) || (this
						.getMenuUrl() != null
						&& castOther.getMenuUrl() != null && this.getMenuUrl()
						.equals(castOther.getMenuUrl())))
				&& ((this.getMenuPic() == castOther.getMenuPic()) || (this
						.getMenuPic() != null
						&& castOther.getMenuPic() != null && this.getMenuPic()
						.equals(castOther.getMenuPic())))
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
				&& ((this.getFunctionUrl() == castOther.getFunctionUrl()) || (this
						.getFunctionUrl() != null
						&& castOther.getFunctionUrl() != null && this
						.getFunctionUrl().equals(castOther.getFunctionUrl())))
				&& ((this.getProior() == castOther.getProior()) || (this
						.getProior() != null
						&& castOther.getProior() != null && this.getProior()
						.equals(castOther.getProior())))
				&& ((this.getFuncDicId() == castOther.getFuncDicId()) || (this
						.getFuncDicId() != null
						&& castOther.getFuncDicId() != null && this
						.getFuncDicId().equals(castOther.getFuncDicId())))
				&& ((this.getDicName() == castOther.getDicName()) || (this
						.getDicName() != null
						&& castOther.getDicName() != null && this.getDicName()
						.equals(castOther.getDicName())))
				&& ((this.getFunctionId() == castOther.getFunctionId()) || (this
						.getFunctionId() != null
						&& castOther.getFunctionId() != null && this
						.getFunctionId().equals(castOther.getFunctionId())))
				&& ((this.getRoleId() == castOther.getRoleId()) || (this
						.getRoleId() != null
						&& castOther.getRoleId() != null && this.getRoleId()
						.equals(castOther.getRoleId())))
				&& ((this.getRoleName() == castOther.getRoleName()) || (this
						.getRoleName() != null
						&& castOther.getRoleName() != null && this
						.getRoleName().equals(castOther.getRoleName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getMenuName() == null ? 0 : this.getMenuName().hashCode());
		result = 37
				* result
				+ (getParentMenuId() == null ? 0 : this.getParentMenuId()
						.hashCode());
		result = 37 * result
				+ (getMemo() == null ? 0 : this.getMemo().hashCode());
		result = 37 * result
				+ (getInform() == null ? 0 : this.getInform().hashCode());
		result = 37 * result
				+ (getSerialNum() == null ? 0 : this.getSerialNum().hashCode());
		result = 37
				* result
				+ (getDeleteFlag() == null ? 0 : this.getDeleteFlag()
						.hashCode());
		result = 37 * result
				+ (getMenuUrl() == null ? 0 : this.getMenuUrl().hashCode());
		result = 37 * result
				+ (getMenuPic() == null ? 0 : this.getMenuPic().hashCode());
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
		result = 37
				* result
				+ (getFunctionUrl() == null ? 0 : this.getFunctionUrl()
						.hashCode());
		result = 37 * result
				+ (getProior() == null ? 0 : this.getProior().hashCode());
		result = 37 * result
				+ (getFuncDicId() == null ? 0 : this.getFuncDicId().hashCode());
		result = 37 * result
				+ (getDicName() == null ? 0 : this.getDicName().hashCode());
		result = 37
				* result
				+ (getFunctionId() == null ? 0 : this.getFunctionId()
						.hashCode());
		result = 37 * result
				+ (getRoleId() == null ? 0 : this.getRoleId().hashCode());
		result = 37 * result
				+ (getRoleName() == null ? 0 : this.getRoleName().hashCode());
		return result;
	}

}
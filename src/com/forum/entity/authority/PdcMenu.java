package com.forum.entity.authority;

import java.util.Date;

import com.forum.common.entity.Entity;

/**
 * PdcMenu entity. @author MyEclipse Persistence Tools
 */

public class PdcMenu extends Entity implements java.io.Serializable {

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

	// Constructors

	/** default constructor */
	public PdcMenu() {
	}

	/** minimal constructor */
	public PdcMenu(String id, String menuName, String parentMenuId,
			String serialNum, String deleteFlag, String menuUrl,
			Date createTime, String createUser) {
		this.id = id;
		this.menuName = menuName;
		this.parentMenuId = parentMenuId;
		this.serialNum = serialNum;
		this.deleteFlag = deleteFlag;
		this.menuUrl = menuUrl;
		this.createTime = createTime;
		this.createUser = createUser;
	}

	/** full constructor */
	public PdcMenu(String id, String menuName, String parentMenuId,
			String memo, String inform, String serialNum, String deleteFlag,
			String menuUrl, String menuPic, Date createTime, String createUser) {
		this.id = id;
		this.menuName = menuName;
		this.parentMenuId = parentMenuId;
		this.memo = memo;
		this.inform = inform;
		this.serialNum = serialNum;
		this.deleteFlag = deleteFlag;
		this.menuUrl = menuUrl;
		this.menuPic = menuPic;
		this.createTime = createTime;
		this.createUser = createUser;
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

}
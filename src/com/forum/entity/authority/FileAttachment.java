package com.forum.entity.authority;

import java.util.Date;

/**
 * FileAttachment entity. @author MyEclipse Persistence Tools
 */

public class FileAttachment implements java.io.Serializable {

	// Fields

	private String id;
	private SysDictionary sysDictionary;
	private FileSuffix fileSuffix;
	private String saveUrl;
	private String orginalName;
	private Date createTime;
	private String createUser;
	private String deleteFlag;
	private String attachState;
	private Integer version;

	// Constructors

	/** default constructor */
	public FileAttachment() {
	}

	/** full constructor */
	public FileAttachment(String id, SysDictionary sysDictionary,
			FileSuffix fileSuffix, String saveUrl, String orginalName,
			Date createTime, String createUser, String deleteFlag,
			String attachState, Integer version) {
		this.id = id;
		this.sysDictionary = sysDictionary;
		this.fileSuffix = fileSuffix;
		this.saveUrl = saveUrl;
		this.orginalName = orginalName;
		this.createTime = createTime;
		this.createUser = createUser;
		this.deleteFlag = deleteFlag;
		this.attachState = attachState;
		this.version = version;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public SysDictionary getSysDictionary() {
		return this.sysDictionary;
	}

	public void setSysDictionary(SysDictionary sysDictionary) {
		this.sysDictionary = sysDictionary;
	}

	public FileSuffix getFileSuffix() {
		return this.fileSuffix;
	}

	public void setFileSuffix(FileSuffix fileSuffix) {
		this.fileSuffix = fileSuffix;
	}

	public String getSaveUrl() {
		return this.saveUrl;
	}

	public void setSaveUrl(String saveUrl) {
		this.saveUrl = saveUrl;
	}

	public String getOrginalName() {
		return this.orginalName;
	}

	public void setOrginalName(String orginalName) {
		this.orginalName = orginalName;
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

	public String getDeleteFlag() {
		return this.deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public String getAttachState() {
		return this.attachState;
	}

	public void setAttachState(String attachState) {
		this.attachState = attachState;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
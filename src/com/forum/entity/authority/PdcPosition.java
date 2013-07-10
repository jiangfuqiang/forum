package com.forum.entity.authority;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * PdcPosition entity. @author MyEclipse Persistence Tools
 */

public class PdcPosition implements java.io.Serializable {

	// Fields

	private String id;
	private SysDictionary sysDictionary;
	private String positionName;
	private String positionDesc;
	private Date createTime;
	private String createUser;
	private String deleteFlag;
	private Integer version;
	private Set positionFunctions = new HashSet(0);

	// Constructors

	/** default constructor */
	public PdcPosition() {
	}

	/** minimal constructor */
	public PdcPosition(String id, SysDictionary sysDictionary,
			String positionName, Date createTime, String createUser,
			String deleteFlag, Integer version) {
		this.id = id;
		this.sysDictionary = sysDictionary;
		this.positionName = positionName;
		this.createTime = createTime;
		this.createUser = createUser;
		this.deleteFlag = deleteFlag;
		this.version = version;
	}

	/** full constructor */
	public PdcPosition(String id, SysDictionary sysDictionary,
			String positionName, String positionDesc, Date createTime,
			String createUser, String deleteFlag, Integer version,
			Set positionFunctions) {
		this.id = id;
		this.sysDictionary = sysDictionary;
		this.positionName = positionName;
		this.positionDesc = positionDesc;
		this.createTime = createTime;
		this.createUser = createUser;
		this.deleteFlag = deleteFlag;
		this.version = version;
		this.positionFunctions = positionFunctions;
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

	public String getPositionName() {
		return this.positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public String getPositionDesc() {
		return this.positionDesc;
	}

	public void setPositionDesc(String positionDesc) {
		this.positionDesc = positionDesc;
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

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Set getPositionFunctions() {
		return this.positionFunctions;
	}

	public void setPositionFunctions(Set positionFunctions) {
		this.positionFunctions = positionFunctions;
	}

}
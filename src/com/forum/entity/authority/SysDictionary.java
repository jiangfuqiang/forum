package com.forum.entity.authority;

import java.util.Date;
import java.util.Set;

import com.forum.common.entity.Entity;

/**
 * SysDictionary entity. @author MyEclipse Persistence Tools
 */

public class SysDictionary extends Entity implements java.io.Serializable {

	// Fields

	private String id;
	private String dicName;
	private String dicDesc;
	private String dicParentId;
	private String deleteFlag;
	private Integer version;
	private Date createTime;
	private String createUser;

	// Constructors

	/** default constructor */
	public SysDictionary() {
	}

	/** minimal constructor */
	public SysDictionary(String id, String dicName, String dicParentId,
			String deleteFlag, Integer version, Date createTime,
			String createUser) {
		this.id = id;
		this.dicName = dicName;
		this.dicParentId = dicParentId;
		this.deleteFlag = deleteFlag;
		this.version = version;
		this.createTime = createTime;
		this.createUser = createUser;
	}

	/** full constructor */
	public SysDictionary(String id, String dicName, String dicDesc,
			String dicParentId, String deleteFlag, Integer version,
			Date createTime, String createUser) {
		this.id = id;
		this.dicName = dicName;
		this.dicDesc = dicDesc;
		this.dicParentId = dicParentId;
		this.deleteFlag = deleteFlag;
		this.version = version;
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

	public String getDicName() {
		return this.dicName;
	}

	public void setDicName(String dicName) {
		this.dicName = dicName;
	}

	public String getDicDesc() {
		return this.dicDesc;
	}

	public void setDicDesc(String dicDesc) {
		this.dicDesc = dicDesc;
	}

	public String getDicParentId() {
		return this.dicParentId;
	}

	public void setDicParentId(String dicParentId) {
		this.dicParentId = dicParentId;
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
package com.forum.entity.authority;

import com.forum.common.entity.Entity;

/**
 * PosOrgUser entity. @author MyEclipse Persistence Tools
 */

public class PosOrgUser extends Entity implements java.io.Serializable {

	// Fields

	private String id;
	private String userId;
	private String posId;
	private Integer version;

	// Constructors

	/** default constructor */
	public PosOrgUser() {
	}

	/** full constructor */
	public PosOrgUser(String id, String userId, String posId, Integer version) {
		this.id = id;
		this.userId = userId;
		this.posId = posId;
		this.version = version;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPosId() {
		return this.posId;
	}

	public void setPosId(String posId) {
		this.posId = posId;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
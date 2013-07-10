package com.forum.entity.authority;

import com.forum.common.entity.Entity;

/**
 * PositionOrganization entity. @author MyEclipse Persistence Tools
 */

public class PositionOrganization extends Entity implements java.io.Serializable {

	// Fields

	private String id;
	private Organization organization;
	private Integer positionId;
	private Integer version;

	// Constructors

	/** default constructor */
	public PositionOrganization() {
	}

	/** minimal constructor */
	public PositionOrganization(String id, Integer positionId, Integer version) {
		this.id = id;
		this.positionId = positionId;
		this.version = version;
	}

	/** full constructor */
	public PositionOrganization(String id, Organization organization,
			Integer positionId, Integer version) {
		this.id = id;
		this.organization = organization;
		this.positionId = positionId;
		this.version = version;
	}

	// Property accessors

	public Organization getOrganization() {
		return this.organization;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public Integer getPositionId() {
		return this.positionId;
	}

	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
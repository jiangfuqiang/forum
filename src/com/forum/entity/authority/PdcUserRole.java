package com.forum.entity.authority;

import com.forum.common.entity.Entity;

/**
 * PdcUserRole entity. @author MyEclipse Persistence Tools
 */

public class PdcUserRole extends Entity implements java.io.Serializable {

	// Fields

	private String id;
	private PdcUser pdcUser;
	private PdcRole pdcRole;
	private Integer version;

	// Constructors

	/** default constructor */
	public PdcUserRole() {
	}

	/** full constructor */
	public PdcUserRole(String id, PdcUser pdcUser, PdcRole pdcRole,
			Integer version) {
		this.id = id;
		this.pdcUser = pdcUser;
		this.pdcRole = pdcRole;
		this.version = version;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public PdcUser getPdcUser() {
		return this.pdcUser;
	}

	public void setPdcUser(PdcUser pdcUser) {
		this.pdcUser = pdcUser;
	}

	public PdcRole getPdcRole() {
		return this.pdcRole;
	}

	public void setPdcRole(PdcRole pdcRole) {
		this.pdcRole = pdcRole;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
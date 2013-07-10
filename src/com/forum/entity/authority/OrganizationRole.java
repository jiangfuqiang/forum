package com.forum.entity.authority;

/**
 * OrganizationRole entity. @author MyEclipse Persistence Tools
 */

public class OrganizationRole implements java.io.Serializable {

	// Fields

	private String id;
	private PdcRole pdcRole;
	private Organization organization;
	private Integer version;

	// Constructors

	/** default constructor */
	public OrganizationRole() {
	}

	/** minimal constructor */
	public OrganizationRole(String id, PdcRole pdcRole, Integer version) {
		this.id = id;
		this.pdcRole = pdcRole;
		this.version = version;
	}

	/** full constructor */
	public OrganizationRole(String id, PdcRole pdcRole,
			Organization organization, Integer version) {
		this.id = id;
		this.pdcRole = pdcRole;
		this.organization = organization;
		this.version = version;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public PdcRole getPdcRole() {
		return this.pdcRole;
	}

	public void setPdcRole(PdcRole pdcRole) {
		this.pdcRole = pdcRole;
	}

	public Organization getOrganization() {
		return this.organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
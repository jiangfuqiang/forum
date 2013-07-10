package com.forum.entity.authority;

/**
 * OrganizationFunction entity. @author MyEclipse Persistence Tools
 */

public class OrganizationFunction implements java.io.Serializable {

	// Fields

	private String id;
	private PdcFunction pdcFunction;
	private Organization organization;
	private Integer version;

	// Constructors

	/** default constructor */
	public OrganizationFunction() {
	}

	/** full constructor */
	public OrganizationFunction(String id, PdcFunction pdcFunction,
			Organization organization, Integer version) {
		this.id = id;
		this.pdcFunction = pdcFunction;
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

	public PdcFunction getPdcFunction() {
		return this.pdcFunction;
	}

	public void setPdcFunction(PdcFunction pdcFunction) {
		this.pdcFunction = pdcFunction;
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
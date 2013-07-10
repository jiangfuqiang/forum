package com.forum.entity.authority;

/**
 * PdcRoleFunc entity. @author MyEclipse Persistence Tools
 */

public class PdcRoleFunc implements java.io.Serializable {

	// Fields

	private String id;
	private PdcFunction pdcFunction;
	private PdcRole pdcRole;
	private Integer version;

	// Constructors

	/** default constructor */
	public PdcRoleFunc() {
	}

	/** full constructor */
	public PdcRoleFunc(String id, PdcFunction pdcFunction, PdcRole pdcRole,
			Integer version) {
		this.id = id;
		this.pdcFunction = pdcFunction;
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

	public PdcFunction getPdcFunction() {
		return this.pdcFunction;
	}

	public void setPdcFunction(PdcFunction pdcFunction) {
		this.pdcFunction = pdcFunction;
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
package com.forum.entity.authority;

/**
 * FuncUser entity. @author MyEclipse Persistence Tools
 */

public class FuncUser implements java.io.Serializable {

	// Fields

	private String id;
	private PdcUser pdcUser;
	private PdcFunction pdcFunction;
	private Integer version;

	// Constructors

	/** default constructor */
	public FuncUser() {
	}

	/** full constructor */
	public FuncUser(String id, PdcUser pdcUser, PdcFunction pdcFunction,
			Integer version) {
		this.id = id;
		this.pdcUser = pdcUser;
		this.pdcFunction = pdcFunction;
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

	public PdcFunction getPdcFunction() {
		return this.pdcFunction;
	}

	public void setPdcFunction(PdcFunction pdcFunction) {
		this.pdcFunction = pdcFunction;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
package com.forum.entity.authority;

import com.forum.common.entity.Entity;

/**
 * PositionFunction entity. @author MyEclipse Persistence Tools
 */

public class PositionFunction extends Entity implements java.io.Serializable {

	// Fields

	private String id;
	private PdcPosition pdcPosition;
	private PdcFunction pdcFunction;
	private Integer version;

	// Constructors

	/** default constructor */
	public PositionFunction() {
	}

	/** full constructor */
	public PositionFunction(String id, PdcPosition pdcPosition,
			PdcFunction pdcFunction, Integer version) {
		this.id = id;
		this.pdcPosition = pdcPosition;
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

	public PdcPosition getPdcPosition() {
		return this.pdcPosition;
	}

	public void setPdcPosition(PdcPosition pdcPosition) {
		this.pdcPosition = pdcPosition;
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
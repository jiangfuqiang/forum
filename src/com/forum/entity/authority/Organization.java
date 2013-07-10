package com.forum.entity.authority;

import java.util.HashSet;
import java.util.Set;

/**
 * Organization entity. @author MyEclipse Persistence Tools
 */

public class Organization implements java.io.Serializable {

	// Fields

	private String id;
	private String orgcode;
	private String orgName;
	private String memo;
	private String deleteFlag;
	private Integer version;
	private Set positionOrganizations = new HashSet(0);
	private Set organizationFunctions = new HashSet(0);
	private Set organizationRoles = new HashSet(0);

	// Constructors

	/** default constructor */
	public Organization() {
	}

	/** minimal constructor */
	public Organization(String id, String orgcode, String orgName,
			String deleteFlag, Integer version) {
		this.id = id;
		this.orgcode = orgcode;
		this.orgName = orgName;
		this.deleteFlag = deleteFlag;
		this.version = version;
	}

	/** full constructor */
	public Organization(String id, String orgcode, String orgName, String memo,
			String deleteFlag, Integer version, Set positionOrganizations,
			Set organizationFunctions, Set organizationRoles) {
		this.id = id;
		this.orgcode = orgcode;
		this.orgName = orgName;
		this.memo = memo;
		this.deleteFlag = deleteFlag;
		this.version = version;
		this.positionOrganizations = positionOrganizations;
		this.organizationFunctions = organizationFunctions;
		this.organizationRoles = organizationRoles;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrgcode() {
		return this.orgcode;
	}

	public void setOrgcode(String orgcode) {
		this.orgcode = orgcode;
	}

	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
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

	public Set getPositionOrganizations() {
		return this.positionOrganizations;
	}

	public void setPositionOrganizations(Set positionOrganizations) {
		this.positionOrganizations = positionOrganizations;
	}

	public Set getOrganizationFunctions() {
		return this.organizationFunctions;
	}

	public void setOrganizationFunctions(Set organizationFunctions) {
		this.organizationFunctions = organizationFunctions;
	}

	public Set getOrganizationRoles() {
		return this.organizationRoles;
	}

	public void setOrganizationRoles(Set organizationRoles) {
		this.organizationRoles = organizationRoles;
	}

}
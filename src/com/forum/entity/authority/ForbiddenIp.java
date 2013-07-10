package com.forum.entity.authority;

/**
 * ForbiddenIp entity. @author MyEclipse Persistence Tools
 */

public class ForbiddenIp implements java.io.Serializable {

	// Fields

	private String id;
	private String ipAddress;
	private String enabled;
	private String deleteFlag;
	private Integer version;

	// Constructors

	/** default constructor */
	public ForbiddenIp() {
	}

	/** full constructor */
	public ForbiddenIp(String id, String ipAddress, String enabled,
			String deleteFlag, Integer version) {
		this.id = id;
		this.ipAddress = ipAddress;
		this.enabled = enabled;
		this.deleteFlag = deleteFlag;
		this.version = version;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getEnabled() {
		return this.enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
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

}
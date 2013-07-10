package com.forum.entity.authority;

import java.util.HashSet;
import java.util.Set;

/**
 * FileSuffix entity. @author MyEclipse Persistence Tools
 */

public class FileSuffix implements java.io.Serializable {

	// Fields

	private String id;
	private String suffixName;
	private String deleteFlag;
	private Integer version;
	private Set fileAttachments = new HashSet(0);

	// Constructors

	/** default constructor */
	public FileSuffix() {
	}

	/** minimal constructor */
	public FileSuffix(String id, String suffixName, String deleteFlag,
			Integer version) {
		this.id = id;
		this.suffixName = suffixName;
		this.deleteFlag = deleteFlag;
		this.version = version;
	}

	/** full constructor */
	public FileSuffix(String id, String suffixName, String deleteFlag,
			Integer version, Set fileAttachments) {
		this.id = id;
		this.suffixName = suffixName;
		this.deleteFlag = deleteFlag;
		this.version = version;
		this.fileAttachments = fileAttachments;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSuffixName() {
		return this.suffixName;
	}

	public void setSuffixName(String suffixName) {
		this.suffixName = suffixName;
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

	public Set getFileAttachments() {
		return this.fileAttachments;
	}

	public void setFileAttachments(Set fileAttachments) {
		this.fileAttachments = fileAttachments;
	}

}
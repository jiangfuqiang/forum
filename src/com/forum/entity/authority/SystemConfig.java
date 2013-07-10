package com.forum.entity.authority;

/**
 * SystemConfig entity. @author MyEclipse Persistence Tools
 */

public class SystemConfig implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer version;
	private String deleteFlag;
	private String imgServerPath;
	private String staticPageServerPath;
	private String mainPage;

	// Constructors

	/** default constructor */
	public SystemConfig() {
	}

	/** minimal constructor */
	public SystemConfig(Integer id, Integer version, String deleteFlag,
			String mainPage) {
		this.id = id;
		this.version = version;
		this.deleteFlag = deleteFlag;
		this.mainPage = mainPage;
	}

	/** full constructor */
	public SystemConfig(Integer id, Integer version, String deleteFlag,
			String imgServerPath, String staticPageServerPath, String mainPage) {
		this.id = id;
		this.version = version;
		this.deleteFlag = deleteFlag;
		this.imgServerPath = imgServerPath;
		this.staticPageServerPath = staticPageServerPath;
		this.mainPage = mainPage;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getDeleteFlag() {
		return this.deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public String getImgServerPath() {
		return this.imgServerPath;
	}

	public void setImgServerPath(String imgServerPath) {
		this.imgServerPath = imgServerPath;
	}

	public String getStaticPageServerPath() {
		return this.staticPageServerPath;
	}

	public void setStaticPageServerPath(String staticPageServerPath) {
		this.staticPageServerPath = staticPageServerPath;
	}

	public String getMainPage() {
		return this.mainPage;
	}

	public void setMainPage(String mainPage) {
		this.mainPage = mainPage;
	}

}
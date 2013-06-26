package com.forum.entity.authority;

import java.util.Date;

import com.forum.common.entity.Entity;

/**
 * PdcUser entity. @author MyEclipse Persistence Tools
 */

public class PdcUser extends Entity implements java.io.Serializable {

	// Fields

	private String id;
	private String loginId;
	private String password;
	private Date lastLoginDate;
	private String failureState;
	private String userName;
	private String sex;
	private String photo;
	private String mobilePhone;
	private String phone;
	private String isOnline;
	private String deleteFlag;
	private Date registTime;
	private int version;

	// Constructors

	/** default constructor */
	public PdcUser() {
	}

	/** minimal constructor */
	public PdcUser(String id, String loginId, String password,
			Date lastLoginDate, String failureState, String sex,
			String isOnline, String deleteFlag, Date registTime) {
		this.id = id;
		this.loginId = loginId;
		this.password = password;
		this.lastLoginDate = lastLoginDate;
		this.failureState = failureState;
		this.sex = sex;
		this.isOnline = isOnline;
		this.deleteFlag = deleteFlag;
		this.registTime = registTime;
	}

	/** full constructor */
	public PdcUser(String id, String loginId, String password,
			Date lastLoginDate, String failureState, String userName,
			String sex, String photo, String mobilePhone, String phone,
			String isOnline, String deleteFlag, Date registTime) {
		this.id = id;
		this.loginId = loginId;
		this.password = password;
		this.lastLoginDate = lastLoginDate;
		this.failureState = failureState;
		this.userName = userName;
		this.sex = sex;
		this.photo = photo;
		this.mobilePhone = mobilePhone;
		this.phone = phone;
		this.isOnline = isOnline;
		this.deleteFlag = deleteFlag;
		this.registTime = registTime;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLoginId() {
		return this.loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String getFailureState() {
		return this.failureState;
	}

	public void setFailureState(String failureState) {
		this.failureState = failureState;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getMobilePhone() {
		return this.mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getIsOnline() {
		return this.isOnline;
	}

	public void setIsOnline(String isOnline) {
		this.isOnline = isOnline;
	}

	public String getDeleteFlag() {
		return this.deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public Date getRegistTime() {
		return registTime;
	}

	public void setRegistTime(Date registTime) {
		this.registTime = registTime;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	
}
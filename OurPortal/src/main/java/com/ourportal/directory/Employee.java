package com.ourportal.directory;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	@Column
	private String eNumber;
	@Column
	private String eName;
	@Column
	private String ePersonalPhone;
	@Column
	private String eOfficePhone;
	@Column
	private String eAssertIds;
	@Column
	private String eOfficeEmailId;
	@Column
	private String ePersonalEmailId;
	@Column
	private String eDob;
	@Column
	private String eDoj;
	@Column
	private String ePreviousExperience;
	@Column
	private String ePersonalAnniversary;
	@Column
	private Blob eIdentityPhoto;
	public String geteNumber() {
		return eNumber;
	}
	public void seteNumber(String eNumber) {
		this.eNumber = eNumber;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getePersonalPhone() {
		return ePersonalPhone;
	}
	public void setePersonalPhone(String ePersonalPhone) {
		this.ePersonalPhone = ePersonalPhone;
	}
	public String geteOfficePhone() {
		return eOfficePhone;
	}
	public void seteOfficePhone(String eOfficePhone) {
		this.eOfficePhone = eOfficePhone;
	}
	public String geteAssertIds() {
		return eAssertIds;
	}
	public void seteAssertIds(String eAssertIds) {
		this.eAssertIds = eAssertIds;
	}
	public String geteOfficeEmailId() {
		return eOfficeEmailId;
	}
	public void seteOfficeEmailId(String eOfficeEmailId) {
		this.eOfficeEmailId = eOfficeEmailId;
	}
	public String getePersonalEmailId() {
		return ePersonalEmailId;
	}
	public void setePersonalEmailId(String ePersonalEmailId) {
		this.ePersonalEmailId = ePersonalEmailId;
	}
	public String geteDob() {
		return eDob;
	}
	public void seteDob(String eDob) {
		this.eDob = eDob;
	}
	public String geteDoj() {
		return eDoj;
	}
	public void seteDoj(String eDoj) {
		this.eDoj = eDoj;
	}
	public String getePreviousExperience() {
		return ePreviousExperience;
	}
	public void setePreviousExperience(String ePreviousExperience) {
		this.ePreviousExperience = ePreviousExperience;
	}
	public String getePersonalAnniversary() {
		return ePersonalAnniversary;
	}
	public void setePersonalAnniversary(String ePersonalAnniversary) {
		this.ePersonalAnniversary = ePersonalAnniversary;
	}
	public Blob geteIdentityPhoto() {
		return eIdentityPhoto;
	}
	public void seteIdentityPhoto(Blob eIdentityPhoto) {
		this.eIdentityPhoto = eIdentityPhoto;
	}
}

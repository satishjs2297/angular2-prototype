/**
 * 
 */
package com.westat.navigator.user.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author yandagudita_s
 *
 */
@Entity
@Table(name = "user_profiles")
public class UserProfiles implements Serializable {
	
	private static final long serialVersionUID = -91607781565084950L;

	private Integer userId;
	
	private String userName;
	
	private String firstName;
	
	private String middleName;
	
	private String emailId;
	
	private String createdBy;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "USR_ID")
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "USER_NAME")
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "FIRST_NAME")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "MIDDLE_NAME")
	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	@Column(name = "EMAIL_ADDRESS")
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Column(name = "CREATED_USER")
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public String toString() {
		return "UserProfiles [userId=" + userId + ", userName=" + userName + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", emailId=" + emailId + ", createdBy=" + createdBy + "]";
	}

}

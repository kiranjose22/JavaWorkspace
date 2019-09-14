package com.cognizant;

//import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
	@Id
	private String userMail;
	private String userName;
	private String password;
	private String status;
	private String role;

	public Users(String userMail, String userName, String password, String status, String role) {
		super();
		this.userMail = userMail;
		this.userName = userName;
		this.password = password;
		this.status = status;
		this.role = role;
	}

	
	
	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

//	@Embedded
////	private Address address;

//	
//	public Address getAddress() {
//		return address;
//	}
//
//
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}

	// ,Address address
//	

}

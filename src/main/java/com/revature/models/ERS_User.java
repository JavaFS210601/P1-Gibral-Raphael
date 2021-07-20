package com.revature.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ers_users")
public class ERS_User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ers_user_id")
	private int id;
	
	@Column(name = "ers_username", nullable = false, unique = true)
	private String username;
	
	@Column(name = "ers_password", nullable = false)
	private String password;
	
	@Column(name = "user_first_name")
	private String first_name;
	
	@Column(name = "user_last_name")
	private String last_name;
	
	@Column(name = "user_email")
	private String email;
	
	@ManyToOne( fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "ers_user_role_id")
	private ERS_User_Role role;
	
//	@OneToMany(mappedBy="author", fetch=FetchType.EAGER)
//	private Set<ERS_Reimbursement> author;
//	
//	@OneToMany(mappedBy="resolver", fetch=FetchType.EAGER)
//	private Set<ERS_Reimbursement> resolver;

	public ERS_User() {
		super();
		// TODO Auto-generated constructor stub
	}

public ERS_User(int id, String username, String password, String first_name, String last_name, String email,
		ERS_User_Role role) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
	this.first_name = first_name;
	this.last_name = last_name;
	this.email = email;
	this.role = role;
}

public ERS_User(String username, String password, String first_name, String last_name, String email,
		ERS_User_Role role) {
	super();
	this.username = username;
	this.password = password;
	this.first_name = first_name;
	this.last_name = last_name;
	this.email = email;
	this.role = role;
}

@Override
public String toString() {
	return "ERS_User [id=" + id + ", username=" + username + ", password=" + password + ", first_name=" + first_name
			+ ", last_name=" + last_name + ", email=" + email + ", role=" + role + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((email == null) ? 0 : email.hashCode());
	result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());
	result = prime * result + id;
	result = prime * result + ((last_name == null) ? 0 : last_name.hashCode());
	result = prime * result + ((password == null) ? 0 : password.hashCode());
	result = prime * result + ((role == null) ? 0 : role.hashCode());
	result = prime * result + ((username == null) ? 0 : username.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	ERS_User other = (ERS_User) obj;
	if (email == null) {
		if (other.email != null)
			return false;
	} else if (!email.equals(other.email))
		return false;
	if (first_name == null) {
		if (other.first_name != null)
			return false;
	} else if (!first_name.equals(other.first_name))
		return false;
	if (id != other.id)
		return false;
	if (last_name == null) {
		if (other.last_name != null)
			return false;
	} else if (!last_name.equals(other.last_name))
		return false;
	if (password == null) {
		if (other.password != null)
			return false;
	} else if (!password.equals(other.password))
		return false;
	if (role == null) {
		if (other.role != null)
			return false;
	} else if (!role.equals(other.role))
		return false;
	if (username == null) {
		if (other.username != null)
			return false;
	} else if (!username.equals(other.username))
		return false;
	return true;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getFirst_name() {
	return first_name;
}

public void setFirst_name(String first_name) {
	this.first_name = first_name;
}

public String getLast_name() {
	return last_name;
}

public void setLast_name(String last_name) {
	this.last_name = last_name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public ERS_User_Role getRole() {
	return role;
}

public void setRole(ERS_User_Role role) {
	this.role = role;
}

	
	
	
	
}

package net.slipp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class User extends AbstractEntity {
	@Column(nullable = false, length = 20, unique=true)
	@JsonProperty
	private String userId;

	@JsonIgnore
	private String password;
	
	@JsonProperty
	private String name;
	
	@JsonProperty
	private String email;

	public boolean matchId(Long id) {
		if(id == null) {
			return false;
		}
		return id.equals(getId());
	}
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean matchPassword(String password) {
		if (password == null) {
			return false;
		}
		return password.equals(this.password);
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [" + super.toString() + "userId=" + userId + ", password=" + password + ", name=" + name + ", email=" + email + "]";
	}

	public void update(User newUser) {
		this.userId = newUser.userId;
		this.password = newUser.password;
		this.name = newUser.name;
		this.email = newUser.email;
	}

}

package com.company.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="phone")
public class Phone {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "fk_id")
	private Integer id;
	private Long phoneNumber;
	
	@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL,mappedBy = "phone")
	@JsonIgnore
	private User user;

	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Phone(Integer id, Long phoneNumber, User user) {
		super();
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.user = user;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	/*
	 * @Override public String toString() { return "Phone [id=" + id +
	 * ", phoneNumber=" + phoneNumber + ", user=" + user + "]"; }
	 * 
	 */
	
	
}

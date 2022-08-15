package com.webkit.customerrelations.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="company")
	private String company;
	@Column(name="phone")
	private String phoneNumber;
	@Column(name="username")
	private String username;
	@Column(name="email")
	private String email;
	@Column(name="title")
	private String title;
	@Column(name="created")
	private Date created;
	
	
	public Customer() {}


	public Customer(String name, String company, String phoneNumber, String username, String email, String title,
			Date created) {
		this.name = name;
		this.company = company;
		this.phoneNumber = phoneNumber;
		this.username = username;
		this.email = email;
		this.title = title;
		this.created = created;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Date getCreated() {
		return created;
	}


	public void setCreated(Date created) {
		this.created = created;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", company=" + company + ", phoneNumber=" + phoneNumber
				+ ", username=" + username + ", email=" + email + ", title=" + title + ", created=" + created + "]";
	}


	
	
}


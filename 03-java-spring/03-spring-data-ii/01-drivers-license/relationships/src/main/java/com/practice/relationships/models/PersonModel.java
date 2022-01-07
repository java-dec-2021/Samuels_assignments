package com.practice.relationships.models;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.validation.constraints.Size;


@Entity
@Table(name="persons")
public class PersonModel {

	public LicenseModel getLicenseModel() {
		return licenseModel;
	}
	public void setLicenseModel(LicenseModel licenseModel) {
		this.licenseModel = licenseModel;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Size(min = 2, max = 255)
	private String firstName;
	@Size(min = 2, max = 255)
	private String lastName;
	@Column(updatable = false)
	private Date createdAt;
	private Date updatedAt;
	@OneToOne(mappedBy = "personModel", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private LicenseModel licenseModel;
	
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	@PostPersist
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
	
	
	public PersonModel() {
		
	}

	public PersonModel(String firstName, String lastName, LicenseModel licenseModel) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.licenseModel = licenseModel;
	}

	// Getters And Setters
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Date getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	public Date getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}


	public LicenseModel getLicense() {
		return licenseModel;
	}


	public void setLicense(LicenseModel licenseModel) {
		this.licenseModel = licenseModel;
	}
}
package com.practice.relationships.models;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="licenses")
public class LicenseModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer number;
	// Allows for HTML date input
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date expiration_date;
	private String state;
	@Column(updatable = false)
	private Date createdAt;
	private Date updatedAt;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="personModel_id")
	private PersonModel personModel;
	
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	@PostPersist
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
	
	public LicenseModel() {
		
	}


//	public LicenseModel(String number, Date expiration_date, String state, PersonModel personModel) {
//		this.number = number;
//		this.expiration_date = expiration_date;
//		this.state = state;
//		this.personModel = personModel;
//	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Integer getNumber() {
		return number;
	}


	public void setNumber(Integer number) {
		this.number = number;
	}


	public PersonModel getPersonModel() {
		return personModel;
	}
	public void setPersonModel(PersonModel personModel) {
		this.personModel = personModel;
	}
	public Date getExpiration_date() {
		return expiration_date;
	}


	public void setExpiration_date(Date expiration_date) {
		this.expiration_date = expiration_date;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
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


	public PersonModel getPerson() {
		return personModel;
	}


	public void setPerson(PersonModel personModel) {
		this.personModel = personModel;
	}
	
	public String returnLicenseNumbers() {
		int numberOfZeros = 7 - Integer.toString(this.number).length();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < numberOfZeros; i++) {
			sb.append(0);
		}
		return String.format("%s%d", sb, this.number);
	}
}
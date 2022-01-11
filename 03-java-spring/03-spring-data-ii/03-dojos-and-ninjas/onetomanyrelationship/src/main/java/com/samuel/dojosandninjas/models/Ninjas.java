package com.samuel.dojosandninjas.models;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "ninjas")
public class Ninjas {

	// Fields/Attributes/Member Variables
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Size(min = 2, max = 255)
	private String firstName;
	@Size(min = 2, max = 255)
	private String lastName;
	@NotNull
	private int age;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(updatable = false)
	private Date createdAt;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dojo_id")
	private Dojos dojo;
	
	// To make sure there is a createdAt for each made ninja
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}

	// To make sure Each ninja gets updated on every edit
	@PostPersist
	protected void onUpdate() {
		this.updatedAt = new Date();
	}

	// POJOs and Java Beans
	public Ninjas() {
	}

//	public Ninjas(String firstName, String lastName, int age, Dojos dojo) {
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.age = age;
//		this.dojo = dojo;
//	}

	// Getters and Setters
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	public Dojos getDojo() {
		return dojo;
	}

	public void setDojo(Dojos dojo) {
		this.dojo = dojo;
	}
}
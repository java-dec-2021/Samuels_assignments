// This Structures How Tables Will Look/Be Saved In My Database

// Name Of My User-Created Package To Relate All Class
package com.samuel.languages.models;

//Always import Dependencies
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.Column;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

// Means This class Will Be Related To A Database
@Entity
// Tells Spring The Table Name
// Table Names Must Be Plural In MySQL
@Table(name="Languages")

public class Language {
	
	// Fields/Columns For My Table
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Size(min = 2, max = 20, message = "Name Must Be Between 2 And 20 Charracters Long")
	private String name;
	@Size(min = 2, max = 20, message = "Creator Must Be Between 2 And 20 Charracters Long")
	private String creator;
	// @NotNull Only For Numbers
	@NotNull(message = "This Field Can Not Be Null")
	private Double currentVersion;
	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedAt;
	
	// Methods To Save The Date Of When My Objects Were createdAt And updatedAt
	
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}

	// Add My Constructor(s)
	
	// POJO
	public Language() {
		
	}
	
	// For updating My POJO/JAVA BEAN
	// ID Is Auto-Generated Don't Need To Include It Here
	// Don't Need createdAt And updatedAt Here Already HAve Methods For Those
	public Language(
			String name,
			String creator,
			Double currentVersion)
	{
		this.name = name;
		this.creator = creator;
		this.currentVersion = currentVersion;
	}

	// Getters And Setters
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCreator() {
		return creator;
	}
	
	public void setCreator(String creator) {
		this.creator = creator;
	}
	
	public Double getCurrentVersion() {
		return currentVersion;
	}
	
	public void setCurrentVersion(Double currentVersion) {
		this.currentVersion = currentVersion;
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

}
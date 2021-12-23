package com.practice.mvc.models;

// Always importing The Dependences I Need
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Min;
import javax.persistence.Column;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

// Annotations For This class For Models
@Entity
@Table(name="books")
public class Book {
	// Fields/Attributes/Member Variables
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	@Size(min = 5, max = 200)
	private String title;
	@NotNull
	@Size(min = 5, max = 200)
	private String description;
	@NotNull
	@Size(min = 3, max = 40)
	private String language;
	@NotNull
	@Min(100)
	private Integer numberOfPages;
	// This Will Not Allow The createdAt column To Be Updated After Creation/ On Every Save
	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedAt;
	
	// A Constructor/Init
	public Book() {
	}
	
	// A Constructor That My Controller Can Call To Create A New Book
	public Book(String title, String description, String language, Integer numberOfPages) {
		this.title = title;
		this.description = description;
		this.language = language;
		this.numberOfPages = numberOfPages;
	}
	
	// Getters And Setters
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getLanguage() {
		return language;
	}



	public void setLanguage(String language) {
		this.language = language;
	}



	public Integer getNumberOfPages() {
		return numberOfPages;
	}



	public void setNumberOfPages(Integer numberOfPages) {
		this.numberOfPages = numberOfPages;
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

	// Right Before The Object Is Created, Save The "Date()" When The Object Is Created At 
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	
	// On Every Update Save The "Date()" When The Object Is Being Updated At
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}

}
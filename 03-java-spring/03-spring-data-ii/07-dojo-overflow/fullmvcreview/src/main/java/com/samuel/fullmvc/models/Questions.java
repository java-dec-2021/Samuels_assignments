package com.samuel.fullmvc.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name="questions")
public class Questions {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String qText;
	// This Annotation makes this apart of The Object but doesn't Save it to the database
	@Transient
	private String tagFromFrontEnd;
	@Column(updatable = false)
	private Date createdAt;
	private Date updatedAt;
	@OneToMany(mappedBy = "quest", fetch = FetchType.LAZY)
	private List<Answers> answers;
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="tags_questions", joinColumns = @JoinColumn(name="question_id"), inverseJoinColumns = @JoinColumn(name="tag_id"))
	private List<Tags> qTags;
	
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	
	@PostPersist
	protected void onUpdate() {
		this.updatedAt = new Date();
	}

	public Questions() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getqText() {
		return qText;
	}

	public void setqText(String qText) {
		this.qText = qText;
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

	public List<Answers> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answers> answers) {
		this.answers = answers;
	}

	public List<Tags> getqTags() {
		return qTags;
	}

	public void setqTags(List<Tags> qTags) {
		this.qTags = qTags;
	}

	public String getTagFromFrontEnd() {
		return tagFromFrontEnd;
	}

	public void setTagFromFrontEnd(String tagFromFrontEnd) {
		this.tagFromFrontEnd = tagFromFrontEnd;
	}
}
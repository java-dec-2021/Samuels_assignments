package com.samuel.fullmvc.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samuel.fullmvc.models.Answers;
import com.samuel.fullmvc.models.Questions;
import com.samuel.fullmvc.models.Tags;
import com.samuel.fullmvc.repositories.AnswerRepo;
import com.samuel.fullmvc.repositories.QuestionRepo;
import com.samuel.fullmvc.repositories.TagRepo;

@Service
public class AppService {

	@Autowired
	private QuestionRepo qRepo;
	
	@Autowired
	private AnswerRepo aRepo;
	
	@Autowired
	private TagRepo tRepo;
	
	// Helper method to grab one Tag from the database, to assist my splitTags method
	public Tags getOneTag(String subject) {
		return this.tRepo.findBySubject(subject);
	}
	
	// Splitting the Tags method and creating a new Tag if one doesn't exist
	// this is also making my new Tag objects as well
	public ArrayList<Tags> splitTags(String tags) {
		ArrayList<Tags> tagsForQuestions = new ArrayList<Tags>();
		String[] tagsToProcess = tags.split(", ");
		for(String s : tagsToProcess) {
			if(this.tRepo.existsBySubject(s)) {
				Tags tagToAdd = this.getOneTag(s);
				tagsForQuestions.add(tagToAdd);
			}
			else {
				// Creating a New empty Tag object
				Tags newTag = new Tags();
				// Setting whatever is iterating through this method to the new empty tag object, otherwise its going to be an empty Object
				newTag.setSubject(s);
				this.tRepo.save(newTag);
				tagsForQuestions.add(this.getOneTag(s));
			}
		}
		System.out.println(tagsForQuestions);
		return tagsForQuestions;
	}
	
	// attaching an ArrayList<Tags> to Each Question object
	public Questions createQuestion(Questions question) {
		question.setqTags(this.splitTags(question.getTagFromFrontEnd()));
		return this.qRepo.save(question);
	}

	// Retrieve a Question
	public Questions findAQuestion(Long id) {
		return this.qRepo.findById(id).orElse(null);
	}
	
	// Retrieve all Questions
	public List<Questions> findAllQuestions() {
		return this.qRepo.findAll();
	}
	
	// Save a Answer
	public Answers createAnswer(Answers answer) {
		return this.aRepo.save(answer);
	}
	
	// Retrieve all Answers
	public List<Answers> findAllAnswers() {
		return this.aRepo.findAll();
	}
}
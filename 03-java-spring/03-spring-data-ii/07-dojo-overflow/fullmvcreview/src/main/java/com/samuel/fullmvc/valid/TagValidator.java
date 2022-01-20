package com.samuel.fullmvc.valid;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.samuel.fullmvc.models.Questions;

@Component
public class TagValidator {

	public boolean supports(Class<?> clazz) {
		return Questions.class.equals(clazz);
	}
	
	public void validate(Object target, Errors errors) {
		Questions question = (Questions) target;
		
		String[] tags = question.getTagFromFrontEnd().split(", ");
//		System.out.println("HERE");
//		System.out.println(tags[0]);
//		System.out.println(tags[1]);
//		System.out.println(tags.length);
		
		if(tags.length > 3 || tags.length == 1) {
			errors.rejectValue("tagFromFrontEnd", "Too Many", "Must have at least 1 to 3 tags");
		}
	}
	
}
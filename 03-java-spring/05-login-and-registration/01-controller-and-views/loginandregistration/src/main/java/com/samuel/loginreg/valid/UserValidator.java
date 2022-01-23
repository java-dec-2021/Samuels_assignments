package com.samuel.loginreg.valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.samuel.loginreg.models.User;
import com.samuel.loginreg.services.UserService;

// This is Validating the User model/table
@Component
public class UserValidator implements Validator{
	
	@Autowired
	private UserService uService;
	
	// This is asking which class you want to Validate
	// Have to Override these methods, so I am not forced to implement them
	@Override
	public boolean supports(Class<?> clazz) {
		// Assigning User to be Validated
		return User.class.equals(clazz);
	}
	
	// This is where I choose what to Validate 
	@Override
	public void validate(Object target, Errors errors) {
		// I pass in my results from my controller into UserValidator and then it passes in more Validations on top of the ones I already have and then becomes apart of the Model
		// So then I have to call this Validator from my Register User Controller in order to Validate the password/passwordConfirmation and Email or whatever I need to
		User validateUser = (User) target;
		// Now i'm checking for some Authentication / if Not equal
		if(!validateUser.getPasswordConfirmation().equals(validateUser.getPassword())) {
			// Want the Error to be attached to this passwordConfirmation field(it has to be one of the Member Variables), the key:value pairs are "noMatch" and "Passwords do not Match"
			errors.rejectValue("passwordConfirmation", "noMatch", "Passwords do not Match");
		}
		
		// Validating for the Email
		if(this.uService.findByEmail(validateUser.getEmail()) != null) {
			errors.rejectValue("email", "unique", "Email address already Taken");
		}
	}
	
}
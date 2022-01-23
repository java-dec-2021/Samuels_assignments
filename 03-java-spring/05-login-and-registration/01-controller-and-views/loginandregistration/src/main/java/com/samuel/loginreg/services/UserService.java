package com.samuel.loginreg.services;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samuel.loginreg.models.User;
import com.samuel.loginreg.repositories.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo uRepo;
	
	// Creating a User with their Password Hashed
	public User createUser(User user) {
		String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		user.setPassword(hashed);
		return uRepo.save(user);
	}
	
	// Find a User by Email
	public User findByEmail(String email) {
		return this.uRepo.findByEmail(email);
	}
	
	// Find a User by ID
	public User findUserById(Long id) {
		return this.uRepo.findById(id).orElse(null);
	}
	
	// Authenticate User
	public boolean authenticateUser(String email, String password) {
		// First find the user by email
		User user = this.uRepo.findByEmail(email);
		// If I can't find it by email, return false
		if(user == null) {
			return false;
		}
		else {
			// If the passwords match, return true, else, return false
			if(BCrypt.checkpw(password, user.getPassword())) {
				return true;
			}
			else {
				return false;
			}
		}
	}
}
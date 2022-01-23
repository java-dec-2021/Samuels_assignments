package com.samuel.loginreg.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.samuel.loginreg.models.User;
import com.samuel.loginreg.services.UserService;
import com.samuel.loginreg.valid.UserValidator;

@Controller
public class UserController {

	// Instantiating my Service class, to use its CRUD
	@Autowired
	private UserService uService;
	
	@Autowired
	private UserValidator userValidator;

	// Show form to register a User
	@GetMapping("/registration")
	public String registerForm(@ModelAttribute("user") User user) {
		return "index.jsp";
	}

	// Create That new User
	@RequestMapping(value = "/registration/newUser", method = RequestMethod.POST)
	public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
		// Validating my Model for extra Validations
		userValidator.validate(user, result);
		// if result has errors, return the registration page (don't worry about
		// validations just now)
		if (result.hasErrors()) {
			return "index.jsp";
		}
		// else, save the user in the database, save the user id in session, and
		// redirect them to the /home route
		User newUser = this.uService.createUser(user);
		session.setAttribute("userId", newUser.getId());
		return "redirect:/dashboard";
	}

	// Authenticating a User for Login
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password,
			RedirectAttributes redirectAttributes, HttpSession session) {
		// if the user is authenticated, save their user id in session
		if (this.uService.authenticateUser(email, password)) {
			User loginUser = this.uService.findByEmail(email);
			session.setAttribute("userId", loginUser.getId());
			return "redirect:/dashboard";
		}
		// else, add error messages and return the login page
		redirectAttributes.addFlashAttribute("errors", "Invalid Email/Password");
		return "redirect:/registration";
	}

	// Displaying the User in Session Email Address and Checking whether that User
	// is in Session
	@RequestMapping("/dashboard")
	public String home(HttpSession session, Model model) {
		// get user from session, save them in the model and return the home page
		if (session.getAttribute("userId") != null) {
			// Session stores everything to String, So I have to Type Cast
			User currentUser = this.uService.findUserById((Long) session.getAttribute("userId"));
			model.addAttribute("user", currentUser);
			return "dashboard.jsp";
		} else {
			return "redirect:/registration";
		}
	}

	// To Logout whichever Current User
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		// invalidate session
		session.invalidate();
		// redirect to login page
		return "redirect:/registration";
	}
}
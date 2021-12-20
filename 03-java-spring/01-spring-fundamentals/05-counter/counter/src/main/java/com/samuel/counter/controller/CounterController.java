package com.samuel.counter.controller;



// Always import My Dependences!
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.http.HttpSession;

// To Render Views With Data
@Controller
public class CounterController {
	
	// RequestMapping Allows For More Functionality (i.e. I Can Manually Make It A GET Or A POST Or etc), But Not Ideal
	// RequestMapping By Default Is Get Mapping
	// GetMapping Tells Me Specifically It Is A GET Request
	@GetMapping("/your_server")
	public String index(HttpSession session) {
		// If the count is not already in session
		if (session.getAttribute("count") == null) {
			// Use setAttribute to initialize the count in session
			session.setAttribute("count", 0);
			}
		else {
			// increment the count by 1 using getAttribute and setAttribute
			// Creating An Integer Object Variable To Hold My Session Count
			// Have To Cast The Value Back Into The Data Type, Because Whatever Data Gets Saved Into Session Turns Back Into That Data Type
			Integer tCount = (Integer) session.getAttribute("count");
			// Creating Another Integer Object Variable In Order To Increment My "count"
			Integer nCount = tCount+1;
			// I Am Using "setAttribute" To Increment My session Each Time Someone Visits The Page
			session.setAttribute("count", nCount);
			}
		return "index.jsp";
		}
	
	// Rendering The Page With The Session Count
	// I Have To Use Integer In Order To Use "null"
	@GetMapping("/your_server/counter")
	public String count(HttpSession session) {
		// Using A Variable Of The Same Type to Hold My Session Variable
		Integer getCount = (Integer) session.getAttribute("count");
		// Checking To See If Session Is null Or Has A Value
		if (getCount == null) {
			// If No Value Then Set The Default Value To Zero
			session.setAttribute("count", 0);
		}
		// Else Show Whatever That Value Is
		else {
			// Using A Variable Of The Same Type to Hold My Session Variable
			Integer currentCount = (Integer) session.getAttribute("count");
			// Showing The Value
			session.setAttribute("count", currentCount);
		}
		return "count.jsp";
	}
	
	// Clearing The Session And Returning A Redirect
	@GetMapping("/reset")
	public String Reset(HttpSession sessionReset) {
		sessionReset.invalidate();
		return "redirect:/your_server/counter";
	}
	
}
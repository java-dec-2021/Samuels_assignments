// Importing the java.util Date library, to be able to use and display the date
import java.util.Date;
// Defining Class with Noun name
public class AlfredQuotes {
    /*
    Inputs: None
    Return Type: String
    Description: Returns a generic greeting that Alfred will say to anyone.
    */
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    /* 
    Inputs: String name, String dayPeriod 
                            Assume "morning", "afternoon" or "evening".
    Return Type: String
    // Description: Returns a greeting that includes the person's name
    as well as the day period. For example:
                            "Good evening, Beth Kane. Lovely to see you."
    * Tip: Try using the String.format method for string interpolation in Java.
    */
    public String guestGreeting(String name, String dayPeriod) {
        // YOUR CODE HERE
        return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
    }
    /*
    * Inputs: None
    * Return Type: String
    * Description: Returns a polite announcement of the current date.
    */
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date();
        return "Good day! Today's Date is " + date;
    }
    /*********************************************
    Final Challenge!
    Alfred is listening. Write a method that accepts any string of conversation. 
    If "Alexis" appears in the conversation return a snarky response, such as:
    "Right away, sir. She certainly isn't sophisticated enough for that."

    If "Alfred" is in the conversation return an obliging response, for example: 
    "At your service. As you wish, naturally."

    If neither name is found, return an appropriate response, for instance:
    "Right. And with that I shall retire." 
    **********************************************/
    /*
    * Inputs: String (A conversation)
    * Return Type: String (Something Alfred would say in response)
    *
    * Tip: Use the indexOf String method
    */
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        // Using indexOf (plenty more I could use) to search the Parameter for a specific word
        if (conversation.indexOf("Alexis") > -1) {
            // Return Output String if the word is found
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        // Using indexOf to search the Parameter for a specific word
        else if (conversation.indexOf("Alfred") > -1) {
            // Return Output String if the word is found
            return "At your service, Sir.";
        }
        // If Neither of the words are found this will be the default response
        else {
            // Return Output String for the default response
            return "Right. And with that I shall retire.";
        }
    }
    // NINJA BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
    public String heyAlfredBot(String birthday) {
        if (birthday.contains("today")){
            return String.format("Your Birthday is today! %s", new Date());
        }
        else {
            return "Today is " + new Date();
        }
    }
}
// Defining my test file class with Verb name
public class AlfredTest {
    /*
    This main method will always be the launch point for a Java application
    For now, we are using the main to test all our 
    AlfredQuotes methods.
    */
    public static void main(String[] args) {
        // instantiating AlfredQuotes to make a instance of it and also access all of it's methods.
        AlfredQuotes alfredBot = new AlfredQuotes();
        // Test greetings, with required data
        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Beth Kane", "evening");
        String testDateAnnouncement = alfredBot.dateAnnouncement();
        String alexisTest = alfredBot.respondBeforeAlexis(
                                "Alexis! Play some low-fi beats."
                            );
        String alfredTest = alfredBot.respondBeforeAlexis(
                "I can't find my yo-yo. Maybe Alfred will know where it is.");
        String notRelevantTest = alfredBot.respondBeforeAlexis(
                "Maybe that's what Batman is about. Not winning. But failing.."
            );
        String birthdayTest = alfredBot.heyAlfredBot("What day is today?");
        String birthdayTest1 = alfredBot.heyAlfredBot("What day is it?");
        
        // Printing the test greetings to test the Instance Methods.
        System.out.println(testGreeting);
        // Uncomment these one at a time as you implement each method.
        System.out.println(testGuestGreeting);
        System.out.println(testDateAnnouncement);
        System.out.println(alexisTest);
        System.out.println(alfredTest);
        System.out.println(notRelevantTest);
        System.out.println(birthdayTest);
        System.out.println(birthdayTest1);
    }
}
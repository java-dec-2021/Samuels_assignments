// Adding the Imports I need
import java.util.HashMap;
import java.util.Set;
// Defining Class with Verb name
public class TrackList {
    // Defining Instance Methods or Functionality for the Class
    public void trackList(String args) {
        // Declaring a HashMap
        HashMap<String, String> userMap = new HashMap<String, String>();
        // Appending Key-Value Pairs to the HashMap
        userMap.put("Rapstar", "Do It Sound Like Im Playing");
        userMap.put("Sum To Prove", "I Got Something To Prove, I Got Something To Lose");
        userMap.put("Over The Top", "You Know October Get Hot");
        userMap.put("Finer Things", "Don't Pay Them Haters No Mind, You Can Be Whatever You Like");
        // Retrieving a Key-Value Pair utilizing indexOf Instance Method
        if (args.indexOf("Rapstar") > -1) {
        System.out.println(userMap.get("Rapstar"));
        }
        else if (args.indexOf("Sum To Prove") > -1) {
            System.out.println(userMap.get("Sum To Prove"));
        }
        else if (args.indexOf("Over The Top") > -1) {
            System.out.println(userMap.get("Over The Top"));
        }
        else if (args.indexOf("Finer Things") > -1) {
            System.out.println(userMap.get("Finer Things"));
        }
        else {
            System.out.println("Nothing Found");
        }
        // Utilizing Set to create a Set of keys to more efficiently count the "keys" from the HashMap 
        Set<String> keys = userMap.keySet();
        for (String key : keys) {
            System.out.println(String.format("Track: %s: Lyrics: %s", key, userMap.get(key)));
        }
    }
}
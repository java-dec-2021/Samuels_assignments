// Add My imports
import java.util.HashMap;
import java.util.Set;
// Defining My class
public class TrackList {
    // Defining My Methods/Functionality For My class
    public void trackList(String args) {
        // Creating A HashMap
        HashMap<String, String> userMap = new HashMap<String, String>();
        // Adding Key-Value Pairs To My HashMap
        userMap.put("Rapstar", "Do It Sound Like Im Playing");
        userMap.put("Sum To Prove", "I Got Something To Prove, I Got Something To Lose");
        userMap.put("Over The Top", "You Know October Get Hot");
        userMap.put("Finer Things", "Don't Pay Them Haters No Mind, You Can Be Whatever You Like");
        // Getting A Key-Value Pair
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
        Set<String> keys = userMap.keySet();
        for (String key : keys) {
            System.out.println(String.format("Track: %s: Lyrics: %s", key, userMap.get(key)));
        }
    }
}
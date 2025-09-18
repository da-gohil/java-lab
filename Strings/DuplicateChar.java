/*  Counting Duplicate Characters
    WAJP that counts duplicate characters from a given string array
*/

import java.util.HashMap;
import java.util.Map;

public class DuplicateChar {
    public static void main(String[] args) {

        String[] names = new String[] { "Danny", "Roha≠n", "Mohan" };
        for (String name : names) {
            // System.out.println(name);
            findDuplicateChar(name);
        }
    }

    public static void findDuplicateChar(String nameString) {
        Map<Character, Integer> count = new HashMap<>();

        // Map ==> key, value pair for faster insertion and retrieval O(1)
        nameString = nameString.toLowerCase();

        for (char c : nameString.toCharArray()) {
            //System.out.println(c);
            if (Character.isLetter(c)) {
                count.put(c, count.getOrDefault(c, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Character " + entry.getKey() + " occurred " + entry.getValue() + " times");
            }
        }
    }
}
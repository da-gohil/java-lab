/*  Counting Duplicate Characters
 WAJP that counts duplicate characters from a given string
*/

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class duplicateChars {
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        
        // Take input from user  
        System.out.println("Enter your string: ");
        String userInput = scan.nextLine();
        
        // HashMap to store character counts
        Map<Character, Integer> charCount = new HashMap<>();

        // Loop through each character in the input string
        for (char c : userInput.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                // Get current count or 0, then add 1
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }
        
        System.out.println("Duplicate characters Analyze started .....");
        boolean hasDuplicates = false;
        
        // Iterate through the map and print characters that appear more than once
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
                hasDuplicates = true;
            }
        }
        
        if (!hasDuplicates) {
            System.out.println("No duplicate characters found.");
        }
        
        scan.close();
        System.out.println("Duplicate characters Analyze Complete!");

    }
}

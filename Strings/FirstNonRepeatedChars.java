/*  
Find the first non-repeated character
Write a program that returns the first non-repeated character from a given string.
*/

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatedChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your string: ");
        String inputString = scan.nextLine();

        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for (char c : inputString.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non repeated characters is " + entry.getKey());
                scan.close();
                return;
            }
        }
        System.out.println("No non-repeated character found.");
        scan.close();
    }
}

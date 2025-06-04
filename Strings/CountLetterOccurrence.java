// WAJP to print occurrence of each letters in the CLI args string

import java.util.HashMap;
import java.util.Map;

public class CountLetterOccurrence{
    public static void main(String args[]){
        String inputString = args[0];
        
        Map<Character, Integer> count = new HashMap<>();
        for(char ch : inputString.toCharArray()){
            if (Character.isLetter(ch)){
                count.put(ch, count.getOrDefault(ch,0)+1);
            }
        }

        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            System.out.println("Character " + entry.getKey() + " occurred " + entry.getValue() + " times");
        }
    }
}
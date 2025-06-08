//WAJP to reverse the leters of the order not to reverse the individual characters
// Eg: "Porsche is a sportscar, sportscar a is Porsche"
import java.util.Scanner;
import java.util.Stack;

class ReverseWords{
    public String reverseWords(String input){
        String[] words = input.split("\\s+");

        Stack<String> stack = new Stack<>();
        for(String word: words){
            stack.push(word);
        }

        StringBuilder reversed = new StringBuilder();
        
        while(!stack.isEmpty()){
            reversed.append(stack.pop());
            if(!stack.isEmpty()){
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
}

public class ReverseWordsOfString{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
            System.out.println("Enter your String: ");
            String userInput = scan.nextLine();
            
            ReverseWords rev = new ReverseWords();
            String reversed = rev.reverseWords(userInput);

            System.out.println(reversed);
        scan.close();
    }
}

// Leetcode Problem: 151
class Solution {
    public String reverseWords(String s) {
    
        String [] words = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for(int i = words.length -1; i>=0; i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString();
    }
}
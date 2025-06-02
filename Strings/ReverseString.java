//WAJP to reverse the Letters and digits
// Just fix the blank spaces reversal thing, don't want to miss that now or in future case
// Try to practise with other variants of String manipulations and comparison

import java.util.Scanner;

class Reverse{
    String reverseIt(String s){
        System.out.println("The original String is: " + s);
        
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;

        while(left < right){
            if(!Character.isLetterOrDigit(chars[left])){
                left++;
            }else if(!Character.isLetterOrDigit(chars[right])){
                right--;
            }        
            else{
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }
}

class ReverseString{
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
            System.out.println("Enter your String: ");
            String userInput = scan.nextLine();

            Reverse reverseResult = new Reverse();
            String result = reverseResult.reverseIt(userInput);
            System.out.println("Reveresed processed String: " + result);
        scan.close();
    }
}
//WAJP to remove all the spaces from a given input string / paragraph

import java.util.Scanner;

public class RemoveGivenChars{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your String : ");
        String inputString = scan.nextLine();

        System.out.println("Enter your word to remove : ");
        char charToRemove = scan.nextLine().charAt(0);

        String result = inputString.replace(Character.toString(charToRemove),"");
        System.out.println(" Original String is|" + inputString + "| trimmed String is : " + result);
    }
}
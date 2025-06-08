//WAJP to remove all the spaces from a given input string / paragraph

import java.util.Scanner;

public class RemoveSpaces{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your String : ");
        String inputString = scan.nextLine();

        String result = inputString.replaceAll("\\s+", "");
        System.out.println(" Original String is|" + inputString + "| trimmed String is : " + result);

    }
}
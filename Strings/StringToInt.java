import java.util.Scanner;

public class StringToInt{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your String : ");
        String inputString = scan.nextLine();
        
        try{
            int res1 = Integer.parseInt(inputString);
            System.out.println("Integer of " + inputString + " is " + res1);
        }catch(Exception e){
            System.out.println("NFE " + e);
        }

        try{
            float res2 = Float.parseFloat(inputString);
            System.out.println("Float of " + inputString + " is " + res2);
        }catch(Exception e){
            System.out.println("NFE " + e);
        }

        try{
            double res3 = Double.parseDouble(inputString);
            System.out.println("Double of " + inputString + " is " + res3);
        }catch(Exception e){
            System.out.println("NFE " + e);
        }

        try{
            long res4 = Long.parseLong(inputString);
            System.out.println("Long of " + inputString + " is " + res4);
        }catch(Exception e){
            System.out.println("NFE " + e);
        }
        scan.close();
    }
}
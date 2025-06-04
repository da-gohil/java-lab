import java.util.Scanner;

public class VowelsandConsonants {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String inputString = scan.nextLine();

        int vowelCount = 0, consonantCount =0;

        for(int i = 0; i < inputString.length(); i++){
            char ch = inputString.charAt(i);
            char lc = Character.toLowerCase(ch);

            if(lc >='a' && lc <='z'){
                if(lc =='a' || lc =='e' || lc =='i' || lc =='o' || lc =='u'){
                    vowelCount++;
                }else{
                    consonantCount++;          
                }
            }
        }
        System.out.println("VC : " + vowelCount + " CC : " + consonantCount);
    }
}

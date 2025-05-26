/*  
WAJP to check whether the string contains only digits
*/
// Approach 02 --> Using Character.isDigit in loop
public class StringWithDigits1 {
    public static void main(String[] args) {
    
        String[] testStrings = new String[]{"Danny", "123456", "1Danny1"};
        for(String s: testStrings){
            boolean allDigits = true;  // Start assuming the string is all digits

            for(char c: s.toCharArray()){
                if(!Character.isDigit(c)){  // If any character is NOT a digit
                    allDigits = false;
                    break;
                }
                System.out.println( c + "" + allDigits);
            }

            System.out.println(s + (allDigits ? " -> Contains only digits" : " -> Does NOT contain only digits"));
        }
    }
}

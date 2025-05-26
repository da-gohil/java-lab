/*  
WAJP to check whether the string contains only digits
*/
//Approach 03 --> Using Wrapper class and Try Catch block Exception handling
public class StringWithDigits2 {
    public static void main(String[] args) {
    
        String[] testStrings = new String[]{"Danny", "123456", "1Danny1"};
        for(String s: testStrings){
            try{
                Integer.parseInt(s);
                System.out.println(s + " contain only contains digits ");
            }catch(NumberFormatException e){
                System.out.println(s + " does not contain only contains digits ");
            }
        }
    }
}

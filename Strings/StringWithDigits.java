/*  
WAJP to check whether the string contains only digits
*/
//Approach 01 --> Using Matches
public class StringWithDigits {
    public static void main(String[] args) {
        String[] names = new String[] { "", "1Rohan", "1234" };
        for (String name : names) {
            System.out.println("Checking: " + name);
            findStringWithDigits(name);
        }
    }
    public static void findStringWithDigits(String nameString) {
        if (nameString.matches("\\d+")) {
            System.out.println("-> Contains only digits.");
        } else {
            System.out.println("-> Does NOT contain digits.");
        }
    }
}

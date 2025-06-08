public class Palindrome {
    public static String checkPalindrome(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                return "Not Palindrome";
            }
            left++;
            right--;
        }
        return "Palindrome";
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome("madam"));  // Palindrome
        System.out.println(checkPalindrome("hello"));  // Not Palindrome
    }
}

//A phrase is a palindrome if,
// after converting all uppercase letters into lowercase letters and
// removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

class Palindrome {
    public static boolean isPalindrome(String s) {
       s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;
        
        while(left < right){
            if(arr[left] != arr [right]){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }

    public static void main(String[] args){
        String inputString = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(inputString));
    }
}
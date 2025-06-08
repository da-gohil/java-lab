import java.util.HashMap;
import java.util.Arrays;

public class Anagrams{

    public static boolean isAnagram(String s1, String s2){

        s1 = s1.toLowerCase().replaceAll("\\s+", "");
        s2 = s2.toLowerCase().replaceAll("\\s+", "");
        
        if(s1.length() != s2.length()){
            return false;
        }

        HashMap <Character, Integer> count1 = new HashMap<>();
        HashMap <Character, Integer> count2 = new HashMap<>();

         for (char ch1 : s1.toCharArray()) {
            count1.put(ch1, count1.getOrDefault(ch1, 0) + 1);
        }

        for (char ch2 : s2.toCharArray()) {
            count2.put(ch2, count2.getOrDefault(ch2, 0) + 1);
        }
        return count1.equals(count2);
    }

    public static void main(String[] args){
        System.out.println(isAnagram("listen", "silent"));     // true
        System.out.println(isAnagram("Hello", "Olelh"));       // true
        System.out.println(isAnagram("apple", "papel"));       // true
        System.out.println(isAnagram("rat", "tar"));   
    }
}

//Leetcode runtime effcient version 
class Anagrams1 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a,b);
    }
}
public class StringBasics {
    public static void main(String[] args) {
        String s = "Hello ";
        System.out.println("Original s: " + s);

        s = s + "World";
        System.out.println("After concatenation: " + s);

        System.out.println("Substring (0,5): " + s.substring(0, 5)); // "Hello"

        // Convert to char array and print characters one by one
        char[] sChars = s.toCharArray();
        System.out.print("Characters in s: ");
        for (char c : sChars) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Compare ignoring case
        String s1 = "Hello world";
        if (s.equalsIgnoreCase(s1)) {
            System.out.println("s equals s1 (case-insensitive): true");
        } else {
            System.out.println("s equals s1 (case-insensitive): false");
        }

        // Check length
        System.out.println("Length of s: " + s.length());

        // charAt example
        System.out.println("Character at index 1: " + s.charAt(1));

        // toUpperCase and toLowerCase
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + s.toLowerCase());

        // indexOf example
        System.out.println("Index of 'o': " + s.indexOf('o'));
        System.out.println("Index of 'World': " + s.indexOf("World"));

        // startsWith and endsWith
        System.out.println("Starts with 'Hello': " + s.startsWith("Hello"));
        System.out.println("Ends with 'World': " + s.endsWith("World"));

        // contains
        System.out.println("Contains 'lo Wo': " + s.contains("lo Wo"));

        // Trim example
        String spaced = "   Trim me!   ";
        System.out.println("Original with spaces: '" + spaced + "'");
        System.out.println("After trim: '" + spaced.trim() + "'");
    }
}

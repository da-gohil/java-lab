// WAJP to Sort the arrays, Here we used the built-in sort available with the JDK

import java.util.Arrays;

public class ArraySort1 {
    public static void main(String[] args) {
        int[] numbers = {1,10,2,3,55,65,15,-4,58,998};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}

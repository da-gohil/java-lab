import java.util.Arrays;

/**
 * A Java program demonstrating various utility methods from the `java.util.Arrays` class.
 * This includes sorting, searching, parallel sorting, and filling an array.
 */

public class LearnArraysClass {

    public static void main(String[] args) {

        // 1. Array Initialization
        // Declare and initialize an array of integers.
        int[] numbers = {1, 55, 40, 52, 12, 102, 58, 66, 5};

        // 2. Printing the Array
        // Printing the array reference directly will not show the elements.
        // It will print something like `[I@15db9742`, which is the object's hash code.
        System.out.println("Printing the array reference: " + numbers);

        // The correct way to print an array's contents is to use `Arrays.toString()`.
        System.out.println("Initial array elements: " + Arrays.toString(numbers));

        // a) Declaration and Initialization on separate lines
        // This is useful when you don't know the elements at the time of declaration.
        int[] numbers2;
        numbers2 = new int[5]; // Creates an array of size 5, initialized with default values (0 for int).
        numbers2[0] = 10;
        numbers2[1] = 20;
        numbers2[2] = 30;
        System.out.println("Alternative Declaration 1: " + Arrays.toString(numbers2));

        // b) Using the `new` keyword with values
        // This is a more explicit way to declare and initialize an array.
        int[] numbers3 = new int[] {100, 200, 300, 400};
        System.out.println("Alternative Declaration 2: " + Arrays.toString(numbers3));

        // 3. Sorting an Array Sequentially
        // The `Arrays.sort()` method sorts the entire array in ascending order.
        // It uses a Dual-Pivot Quicksort algorithm for primitive types.
        Arrays.sort(numbers);
        System.out.println("After sequential sorting (Arrays.sort()): " + Arrays.toString(numbers));

        // 4. Binary Search
        // The `Arrays.binarySearch()` method efficiently searches for a value
        // in a sorted array. It is crucial that the array is already sorted,
        // otherwise, the result is unpredictable. It returns the index of the found element.
        int index = Arrays.binarySearch(numbers, 5);
        System.out.println("Index of element 5 (after sorting): " + index);

        // 5. Parallel Sorting
        // Introduced in Java 8, `Arrays.parallelSort()` uses a "divide-and-conquer"
        // approach with multiple threads to sort the array. It's more efficient
        // for very large arrays on multi-core processors. For this small array,
        // the result is the same as sequential sort.
        Arrays.parallelSort(numbers);
        System.out.println("After parallel sorting (Arrays.parallelSort()): " + Arrays.toString(numbers));

        // 6. Filling an Array
        // The `Arrays.fill()` method assigns the same value to every element of the array.
        Arrays.fill(numbers, 12);

        // 7. Iterating and Printing with a For-Each Loop
        // A for-each loop is a simple way to iterate through all elements of an array.
        System.out.print("Array after being filled with the value 12: ");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println(); // Adds a newline for better formatting.

        // We can also use Arrays.toString() again to print the filled array.
        System.out.println("Final array contents (using Arrays.toString()): " + Arrays.toString(numbers));


    }
}

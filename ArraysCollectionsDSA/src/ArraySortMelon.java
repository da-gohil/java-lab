//Using Comparator

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortMelon {
    //Instance variables
    //They follow the principle of encapsulation, means they can only be accesssed by class's methods
    private String type;
    private double weight; // Use double for numerical weight

    //Constructor --> create a new object and initialize the fields with the values passed to it
    public ArraySortMelon(String type, double weight) {
        this.type = type;
        this.weight = weight;
    }
    //Getters provide controlled access to the private instance variables
    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    //To make the O/P readable and return the value of object instead of it's index / pointer(ArraySortMelon@27716f4)
    @Override
    public String toString() {
        return "Melon " +
                "type = '" + type + '\'' +
                ", weight = " + weight;
    }

    // Setters are optional for sorting but good for completeness
    public void setType(String type) {
        this.type = type;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static void main(String[] args) {
        // 1. Initialize an array of ArraySortMelon objects
        ArraySortMelon[] melons = new ArraySortMelon[]{
                new ArraySortMelon("Orange", 15),
                new ArraySortMelon("Cantaloupe", 12),
                new ArraySortMelon("Honeydew", 20),
                new ArraySortMelon("Watermelon", 55)
        };

        System.out.println("Unsorted melons:");
        for (ArraySortMelon melon : melons) {
            System.out.println(melon);
        }

        // 2. Sort the array using Arrays.sort() and a Comparator
        // The Comparator provides the logic for comparing two objects
        Arrays.sort(melons, new Comparator<ArraySortMelon>() {
            @Override
            public int compare(ArraySortMelon m1, ArraySortMelon m2) {
                // Compare based on the 'weight' field
                return Double.compare(m1.getWeight(), m2.getWeight());
            }
        });

        System.out.println("\nSorted melons (by weight):");
        for (ArraySortMelon melon : melons) {
            System.out.println(melon);
        }
    }
}
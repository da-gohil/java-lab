import java.util.Arrays;

// The Melon class implements Comparable to define its natural sorting order.
public class Melon implements Comparable<Melon> {

    private String name;
    private int weight;

    public Melon(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Melon [name=" + name + ", weight=" + weight + "]";
    }

    /**
     * Compares this Melon with another Melon based on weight.
     * This method defines the natural sorting order for Melon objects.
     */
    @Override
    public int compareTo(Melon other) {
        return Integer.compare(this.weight, other.weight);
    }

    public static void main(String[] args) {
        Melon[] melons = new Melon[] {
                new Melon("Maple", 16),
                new Melon("Apple", 10),
                new Melon("Mango", 5),
                new Melon("Banana", 50),
        };

        System.out.println("Unsorted Melons (by default):");
        for (Melon melon : melons) {
            System.out.println(melon);
        }

        // We can call Arrays.sort() directly because Melon implements Comparable.
        Arrays.sort(melons);

        System.out.println("\nSorted Melons (by natural order - weight):");
        for (Melon melon : melons) {
            System.out.println(melon);
        }
    }
}

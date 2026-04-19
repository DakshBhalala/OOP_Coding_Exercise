import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Practical29 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        
        System.out.println("Initial List: " + fruits);

        System.out.print("\nEnter a fruit to add at the beginning: ");
        String newFruit = scanner.nextLine();
        fruits.add(0, newFruit);
        System.out.println("After Insertion: " + fruits);

        System.out.print("\nEnter a fruit to remove: ");
        String removeFruit = scanner.nextLine();
        fruits.remove(removeFruit);
        System.out.println("After Deletion: " + fruits);

        Collections.sort(fruits);
        System.out.println("\nSorted List: " + fruits);

        System.out.println("\nIterating:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }
        
        scanner.close();
    }
}

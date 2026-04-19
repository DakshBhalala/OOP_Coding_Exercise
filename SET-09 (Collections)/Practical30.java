import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practical30 {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");
        
        System.out.print("Enter Roll No to search: ");
        int roll = scanner.nextInt();
        
        if (studentMap.containsKey(roll)) {
            System.out.println("Found: " + studentMap.get(roll));
        } else {
            System.out.println("Not Found.");
        }

        studentMap.put(103, "Charlie Davis");
        System.out.println("Updated Roll 103");

        studentMap.remove(101);
        System.out.println("Removed Roll 101");

        System.out.println("\nAll Records:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + " | Name: " + entry.getValue());
        }

        scanner.close();
    }
}

import java.io.*;
import java.util.Scanner;
public class Practical27 {
    public static void main(String[] args) {
        String fileName = "students.txt";
        System.out.println("--- Student Record Management ---");
        try (Scanner scanner = new Scanner(System.in);
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            System.out.println("Enter details for 3 students:");
            for (int i = 1; i <= 3; i++) {
                System.out.println("\n[Student " + i + "]");
                System.out.print("Roll No: ");
                int roll = getValidInt(scanner);
                scanner.nextLine(); 
                System.out.print("Name   : ");
                String name = scanner.nextLine().trim();
                if (name.isEmpty()) name = "Unknown";
                System.out.print("Marks  : ");
                int marks = getValidInt(scanner);
                writer.write(roll + "," + name + "," + marks);
                writer.newLine();
            }
            System.out.println("\nSuccessfully wrote to file: " + fileName);
        } catch (IOException e) {
            System.err.println("File Writing Error: " + e.getMessage());
        }
        readAndDisplay(fileName);
    }
    private static void readAndDisplay(String fileName) {
        System.out.println("\n--- Reading Database: " + fileName + " ---");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    System.out.printf("Roll: %-5s | Name: %-15s | Marks: %-5s%n", parts[0], parts[1], parts[2]);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Read Error: The file '" + fileName + "' was not found.");
        } catch (IOException e) {
            System.err.println("Read Error: Issue reading the file -> " + e.getMessage());
        }
    }
    private static int getValidInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Provide an integer: ");
            scanner.next(); 
        }
        return scanner.nextInt();
    }
}

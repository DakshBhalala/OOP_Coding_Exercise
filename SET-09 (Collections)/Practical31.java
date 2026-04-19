import java.util.HashSet;
import java.util.Scanner;

public class Practical31 {
    public static void main(String[] args) {
        HashSet<String> emailSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        
        emailSet.add("user1@example.com");
        emailSet.add("user2@example.com");

        System.out.println("Current emails: " + emailSet);

        System.out.print("Enter a new email: ");
        String newEmail = scanner.nextLine();

        if (emailSet.add(newEmail)) {
            System.out.println("Email added.");
        } else {
            System.out.println("Email already exists.");
        }

        System.out.print("Enter email to check: ");
        String checkEmail = scanner.nextLine();
        
        if (emailSet.contains(checkEmail)) {
            System.out.println("Email exists.");
        } else {
            System.out.println("Email not found.");
        }

        System.out.println("\nAll Emails: " + emailSet);
        
        scanner.close();
    }
}

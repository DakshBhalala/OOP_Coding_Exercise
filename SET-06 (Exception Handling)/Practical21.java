import java.util.Scanner;

public class Practical21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VotingApp app = new VotingApp();

        System.out.print("Enter your age: ");
        try {
            int age = scanner.nextInt();
            app.checkEligibility(age);
            System.out.println("You are eligible to vote.");
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid Input.");
        } finally {
            System.out.println("Validation process completed");
            scanner.close();
        }
    }
}

class VotingApp {
    void checkEligibility(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        }
    }
}

import exam.Result;
import java.util.Scanner;

public class Practical19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int r = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name: ");
        String n = scanner.nextLine();
        System.out.print("Enter Marks 1: ");
        int m1 = scanner.nextInt();
        System.out.print("Enter Marks 2: ");
        int m2 = scanner.nextInt();
        System.out.print("Enter Marks 3: ");
        int m3 = scanner.nextInt();

        Result res = new Result(r, n, m1, m2, m3);
        System.out.println("\n--- Mark Sheet ---");
        res.displayResult();

        scanner.close();
    }
}

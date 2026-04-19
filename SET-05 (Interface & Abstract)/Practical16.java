import java.util.Scanner;

public class Practical16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter percentage: ");
        double avg = scanner.nextDouble();

        Result16 r = new Result16();
        System.out.println("Division: " + r.getDivision(avg));

        scanner.close();
    }
}

interface Classify16 {
    String getDivision(double average);
}

class Result16 implements Classify16 {
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else if (average >= 50) {
            return "Second Division";
        } else if (average >= 35) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
}

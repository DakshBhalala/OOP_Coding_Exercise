import java.util.Scanner;

public class Practical11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter College Name: ");
        String collegeName = scanner.nextLine();

        College college = new College(collegeName);
        College.Admission admission = college.new Admission();

        admission.inputStudentDetails(scanner);
        admission.displayAdmissionDetails();
        scanner.close();
    }
}

class College {
    private String collegeName;

    public College(String collegeName) {
        this.collegeName = collegeName;
    }

    class Admission {
        private String studentName;
        private String course;

        public void inputStudentDetails(Scanner scanner) {
            System.out.print("Enter Student Name: ");
            studentName = scanner.nextLine();
            System.out.print("Enter Course: ");
            course = scanner.nextLine();
        }

        public void displayAdmissionDetails() {
            System.out.println("\n--- Admission Details ---");
            System.out.println("College: " + collegeName);
            System.out.println("Student: " + studentName);
            System.out.println("Course: " + course);
        }
    }
}

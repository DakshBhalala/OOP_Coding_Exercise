import java.util.Scanner;

public class Practical06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Rectangle 1 (Default):");
        Rectangle06 r1 = new Rectangle06();
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        System.out.println("\nEnter dimensions for Rectangle 2:");
        System.out.print("Width: ");
        double w = scanner.nextDouble();
        System.out.print("Height: ");
        double h = scanner.nextDouble();

        Rectangle06 r2 = new Rectangle06(w, h);
        System.out.println("Rectangle 2:");
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());

        scanner.close();
    }
}

class Rectangle06 {
    double width;
    double height;

    Rectangle06() {
        this.width = 1;
        this.height = 1;
    }

    Rectangle06(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }
}

import java.util.Scanner;

public class Practical13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Result for Triangle:");
        Triangle t = new Triangle();
        System.out.print("Enter base: ");
        double b = scanner.nextDouble();
        System.out.print("Enter height: ");
        double h = scanner.nextDouble();
        t.getData(b, h);
        System.out.println("Area of Triangle: " + t.area());

        System.out.println("\nResult for Rectangle:");
        Rectangle r = new Rectangle();
        System.out.print("Enter width: ");
        double w = scanner.nextDouble();
        System.out.print("Enter length: ");
        double l = scanner.nextDouble();
        r.getData(w, l);
        System.out.println("Area of Rectangle: " + r.area());

        scanner.close();
    }
}

class Shape {
    double d1;
    double d2;

    void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}

class Triangle extends Shape {
    double area() {
        return 0.5 * d1 * d2;
    }
}

class Rectangle extends Shape {
    double area() {
        return d1 * d2;
    }
}

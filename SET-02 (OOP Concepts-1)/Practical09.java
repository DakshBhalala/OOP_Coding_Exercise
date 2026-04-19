
public class Practical09 {
    public static void main(String[] args) {
        Rectangle09 r1 = new Rectangle09(4, 40);
        Rectangle09 r2 = new Rectangle09(3.5, 35.9);

        r1.display();
        System.out.println();
        r2.display();

        System.out.println("\nComparison:");
        if (r1.getArea() > r2.getArea()) {
            System.out.println("Rectangle 1 has a larger area.");
        } else if (r2.getArea() > r1.getArea()) {
            System.out.println("Rectangle 2 has a larger area.");
        } else {
            System.out.println("Both rectangles have the same area.");
        }
    }
}

class Rectangle09 {
    double width;
    double height;

    Rectangle09(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

    void display() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.printf("Area: %.2f\n", getArea());
        System.out.printf("Perimeter: %.2f\n", getPerimeter());
    }
}

import java.util.Scanner;

public class Practical12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VolumeCalculator calc = new VolumeCalculator();

        System.out.print("Enter side of Cube: ");
        double cubeSide = scanner.nextDouble();
        System.out.println("Volume of Cube: " + calc.calculateVolume(cubeSide));

        System.out.println("\nEnter dimensions for Rectangular Cube:");
        System.out.print("Length: ");
        double l = scanner.nextDouble();
        System.out.print("Width: ");
        double w = scanner.nextDouble();
        System.out.print("Height: ");
        double h = scanner.nextDouble();
        System.out.println("Volume of Rectangular Cube: " + calc.calculateVolume(l, w, h));

        System.out.print("\nEnter radius of Sphere: ");
        float r = scanner.nextFloat();
        System.out.println("Volume of Sphere: " + calc.calculateVolume(r));

        scanner.close();
    }
}

class VolumeCalculator {
    public double calculateVolume(double side) {
        return side * side * side;
    }

    public double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    public double calculateVolume(float radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

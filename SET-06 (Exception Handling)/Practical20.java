public class Practical20 {
    public static void main(String[] args) {
        try {
            if (args.length < 2) {
                System.out.println("Please provide two numbers (Numerator and Denominator) as command-line arguments.");
                return;
            }

            int num = Integer.parseInt(args[0]);
            int den = Integer.parseInt(args[1]);

            int result = num / den;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

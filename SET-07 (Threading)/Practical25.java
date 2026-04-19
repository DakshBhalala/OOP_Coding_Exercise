import java.util.Scanner;
public class Practical25 {
    public static void main(String[] args) {
        System.out.println("--- Synchronized Multiplication Tables ---");
        Scanner scanner = new Scanner(System.in);
        Table25 table = new Table25();
        System.out.print("Enter first number for table: ");
        int num1 = getValidInt(scanner);
        System.out.print("Enter second number for table: ");
        int num2 = getValidInt(scanner);
        MyThread25 t1 = new MyThread25(table, num1);
        MyThread25 t2 = new MyThread25(table, num2);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.err.println("Main thread interrupted.");
            Thread.currentThread().interrupt();
        } finally {
            scanner.close(); 
        }
    }
    private static int getValidInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter an integer: ");
            scanner.next(); 
        }
        return scanner.nextInt();
    }
}
class Table25 {
    public synchronized void printTable(int n) {
        System.out.println("\n--- Table of " + n + " ---");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %02d = %d%n", n, i, (n * i));
            try {
                Thread.sleep(200); 
            } catch (InterruptedException e) {
                System.err.println("Table thread interrupted.");
                Thread.currentThread().interrupt();
            }
        }
    }
}
class MyThread25 extends Thread {
    private final Table25 sharedTable;
    private final int number;
    public MyThread25(Table25 sharedTable, int number) {
        this.sharedTable = sharedTable;
        this.number = number;
    }
    @Override
    public void run() {
        sharedTable.printTable(number);
    }
}

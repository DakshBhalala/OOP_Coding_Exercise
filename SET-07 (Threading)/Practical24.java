public class Practical24 {
    public static void main(String[] args) {
        System.out.println("--- Sequential Thread Execution ---");
        Thread t1 = new Thread(() -> printNumbers(1, 100, "Thread-1"));
        Thread t2 = new Thread(() -> printNumbers(101, 200, "Thread-2"));
        Thread t3 = new Thread(() -> printNumbers(201, 300, "Thread-3"));
        try {
            t1.start();
            t1.join(); 
            t2.start();
            t2.join(); 
            t3.start();
            t3.join(); 
            System.out.println("\nAll threads have completed successfully.");
        } catch (InterruptedException e) {
            System.err.println("\nMain thread was interrupted: " + e.getMessage());
            Thread.currentThread().interrupt();
        }
    }
    private static void printNumbers(int start, int end, String threadName) {
        System.out.println("\n[" + threadName + "] Starting execution...");
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
            if ((i - start + 1) % 20 == 0) {
                System.out.println();
            }
        }
        if ((end - start + 1) % 20 != 0) {
            System.out.println();
        }
        System.out.println("[" + threadName + "] Finished execution.");
    }
}

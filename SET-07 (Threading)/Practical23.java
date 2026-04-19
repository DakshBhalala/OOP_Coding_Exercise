public class Practical23 {
    public static void main(String[] args) {
        System.out.println("--- Starting Concurrent Threads ---");
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 1; i <= 10; i++) {
                        System.out.println("[Thread-1] Number: " + i);
                        Thread.sleep(1000); 
                    }
                } catch (InterruptedException e) {
                    System.err.println("[Thread-1] Interrupted: " + e.getMessage());
                    Thread.currentThread().interrupt(); 
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 11; i <= 20; i++) {
                        System.out.println("[Thread-2] Number: " + i);
                        Thread.sleep(500); 
                    }
                } catch (InterruptedException e) {
                    System.err.println("[Thread-2] Interrupted: " + e.getMessage());
                    Thread.currentThread().interrupt(); 
                }
            }
        });
        t1.start();
        t2.start();
    }
}

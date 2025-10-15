public class BackgroundJobExecution {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Background task running... Step " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("Background task completed!");
        };

        Thread backgroundThread = new Thread(task);
        backgroundThread.start();

        System.out.println("Main thread is free to do other work...");
    }
}

public class BackgroundJobExecution {
    public static void main(String[] args) {
        Runnable job = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Executing background task " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Background job completed.");
        };

        Thread backgroundThread = new Thread(job);
        backgroundThread.start();

        System.out.println("Main thread continues working...");
    }
}

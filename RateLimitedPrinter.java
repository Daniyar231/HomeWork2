public class RateLimitedPrinter {
    private final int interval;
    private long lastPrintTime;

    public RateLimitedPrinter(int interval) {
        this.interval = interval;
        this.lastPrintTime = 0;
    }

    public synchronized void print(String message) {
        long currentTime = System.currentTimeMillis();
        if (currentTime - lastPrintTime >= interval) {
            System.out.println(message);
            lastPrintTime = currentTime;
        }
    }
}
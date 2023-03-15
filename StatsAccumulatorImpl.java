public class StatsAccumulatorImpl implements StatsAccumulator {
    private int count = 0;
    private int min = Integer.MAX_VALUE;
    private int max = Integer.MIN_VALUE;
    private double sum = 0.0;

    public void add(int value) {
        count++;
        min = Math.min(min, value);
        max = Math.max(max, value);
        sum += value;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getCount() {
        return count;
    }

    public Double getAvg() {
        return count > 0 ? sum / count : 0;
    }
}
public class StatsAccumulatorTest {
    public static void main(String[] args) {
        StatsAccumulator s = new StatsAccumulatorImpl();

        s.add(1);
        s.add(2);
        s.add(15);
        s.add(0);
        System.out.println(s.getAvg());
        System.out.println(s.getMax());
        System.out.println(s.getMin());
        System.out.println(s.getCount());
    }

}

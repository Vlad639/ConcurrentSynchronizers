import java.util.concurrent.CyclicBarrier;

public class Group {
    private static final int groupSize = 10;
    public static CyclicBarrier cyclicBarrier = new CyclicBarrier(groupSize, () -> Museum.addVisitors(groupSize));

}

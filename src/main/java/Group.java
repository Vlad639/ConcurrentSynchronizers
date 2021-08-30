import java.util.concurrent.Semaphore;

public class Group {
    private final static int groupSize = 10;
    public static Semaphore group = new Semaphore(groupSize);
    public static int currGroupSize = 0;

    public static synchronized void addTourist(){
        currGroupSize++;
        if (currGroupSize == groupSize){
                currGroupSize = 0;
                Museum.addVisitors(groupSize);
                group.release(groupSize);
        }

    }

}

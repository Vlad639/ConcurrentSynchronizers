public class Museum {
    private static int  visitors = 0;

    public static void addVisitors(int count){
        visitors += count;
    }

    public static int getVisitors(){
        return visitors;
    }

}

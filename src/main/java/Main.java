public class Main {
    public static int testTime = 5000;

    public static void main(String[] args) throws InterruptedException {

        TouristGenerator touristGenerator = new TouristGenerator();
        touristGenerator.setDaemon(true);
        touristGenerator.start();

        Thread.sleep(testTime);

        System.out.println("Музей посетило: "+Museum.getVisitors());

    }
}

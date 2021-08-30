public class TouristGenerator extends Thread{

    public void run() {
        try{
            while (true){
                Tourist tourist = new Tourist();
                tourist.setDaemon(true);
                tourist.waitGroup(true);
                tourist.start();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

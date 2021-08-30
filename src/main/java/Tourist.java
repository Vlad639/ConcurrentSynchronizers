public class Tourist extends Thread{
    private boolean waitGroupSet = true;

    long randTime(){
        int min = 1;
        int max = Main.testTime;
        return (long)(min + Math.random() * max);
    }

    public void waitGroup(boolean wait){
        waitGroupSet = wait;
    }

    public void run() {
        try {
            Thread.sleep(randTime());
            while (true) {
                if (waitGroupSet) {
                    Group.group.acquire();
                    Group.addTourist();
                    break;
                }
                else {
                    Museum.addVisitors(1);
                    break;
                }
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

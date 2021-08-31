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
                if (waitGroupSet)
                    Group.cyclicBarrier.await();
                else
                    Museum.addVisitors(1);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

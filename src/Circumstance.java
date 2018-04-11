public class Circumstance extends Thread{

    private long timeStamp;

    public Circumstance(long time){
        this.timeStamp = time;
    }

    @Override
    public void run() {
        while (true){
            while(timeStamp - System.currentTimeMillis() < 180000){


            }
            this.timeStamp = System.currentTimeMillis();
        }
    }
}

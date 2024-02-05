public class ThreadInterruption {
    public static void main(String[] args) {
        System.out.println("1");
        Thread t = new Thread(new ThreadInterruptionWorker());
        System.out.println("2");
       //x t.setDaemon(true);

        t.start();
        System.out.println("3 - ends");

    }


}

class ThreadInterruptionWorker implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(1999999990);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

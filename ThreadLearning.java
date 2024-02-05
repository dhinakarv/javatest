public class ThreadLearning {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                for(int i = 0; i <=100; i++)
                    System.out.println("Worker Thread Execution:"+Thread.currentThread().getName()+i);
            }
        });
        Thread t2  = new Thread(()->{
                for(int i = 0; i <=100; i++)
                    System.out.println("Worker Thread Execution:"+Thread.currentThread().getName()+i);
        });


        System.out.println("Before t1 Thread Starts");
        t1.setName("T1:");
        t1.start();
        System.out.println("After t1 Thread Starts");
        t2.setName("T2:");

        System.out.println("Before t2 Thread Starts");
        t2.start();
        System.out.println("After t2 Thread Starts");

    }

}

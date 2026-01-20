package MultiThreading;

public class PriorityNamingOfThreads
{
    public static void main(String[] args)
    {
        Thread t1 = new Thread(()->
        {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hii"+Thread.currentThread().getPriority());
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        });
        Thread t2 = new Thread(()->
        {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                try {Thread.sleep(1000);} catch (Exception e) {}
            }
        });

        //default value would be like thread-0,thread-1
        System.out.println(t1.getName());
        System.out.println(t2.getName());

        //Naming a thread  using setName
        //We can also name  a thread while creating a thread obj
        t1.setName("Hii thread");
        t2.setName("Hello thread");

        System.out.println(t1.getName());
        System.out.println(t2.getName());

        //setting priority
        t1.setPriority(1);//use MIN_PRIORITY,MAX_PRIORITY also
        t2.setPriority(10);


        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());


        t1.start();
        try{Thread.sleep(1000);}catch(Exception e){}
        t2.start();

        try{
            t1.join();
            t2.join();}catch(Exception e){}

        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());
        System.out.println("PROCESS COMPLETED");
    }
}

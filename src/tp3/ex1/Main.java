package tp3.ex1;



public class Main  {


    // create a class that extends thread and another one that implements runnable
    // they should print 'my thread is running' when running
    // when both terminated, print 'it s over !!'

    public static void main(String[] args) throws InterruptedException {

        MyFirstThread t1 = new MyFirstThread();
        t1.start();
        MySecondThread t2 = new MySecondThread();
        Thread t3 = new Thread(t2);
        t3.start();
        t1.join();
        t3.join();
        //System.out.println(t1.isAlive());
        //System.out.println(t3.isAlive());
        System.out.println("It's over");

        //output:
        //my thread is running
        //my thread is running
        //it s over !!
    }
}

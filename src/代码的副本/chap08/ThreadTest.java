package 代码的副本.chap08;

public class ThreadTest extends Thread {
    private static int ticket = 100;
    @Override
    public void run() {
        while(ticket>0){
            ticket--;
            System.out.println(getName()+":剩余"+ticket+"张");
        }
    }
    public static void main(String[] args) {
        ThreadTest t1 = new ThreadTest();
        ThreadTest t2 = new ThreadTest();
//        t1.run();
//        t2.run();
        t1.start();
//        System.out.println(Thread.currentThread().getName());
        t2.start();
    }
}

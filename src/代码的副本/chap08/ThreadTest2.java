package 代码的副本.chap08;

public class ThreadTest2 implements Runnable {
    private int ticket = 100;
    @Override
    public void run() {
        while(ticket>0) {
            ticket--;
            System.out.println(
                    Thread.currentThread().getName()
                            +":剩余"+ticket+"张"
                            +",id:"+Thread.currentThread().getId()
                            +",pro:"+Thread.currentThread().getPriority()
                            +",state:"+Thread.currentThread().getState()
                            +",max:"+Thread.currentThread().MAX_PRIORITY
                            +",min:"+Thread.currentThread().MIN_PRIORITY);
        }
    }
    public static void main(String[] args) {
        ThreadTest2 tt = new ThreadTest2();
        Thread t = new Thread(tt,"first");
        Thread t2 = new Thread(tt,"second");
//        t.setName("first");
//        t2.setName("second");
        t.setPriority(10);
        t2.setPriority(1);
        t.start();
        t2.start();
    }
}

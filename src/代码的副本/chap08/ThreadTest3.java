package 代码的副本.chap08;

public class ThreadTest3 implements  Runnable{
    @Override
    public void run() {
        /*
        int num = 0;
        try {
            System.out.println(Thread.currentThread().getName()
                    +":interrupted-"+Thread.currentThread().isInterrupted());
            for(int i=0;i<10;i++) {
                num+=i;
            }
            Thread.currentThread().sleep(5000);
            System.out.println(Thread.currentThread().getName()
                    +"休眠正常结束");
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()
                    +"休眠异常");
        }
        System.out.println(Thread.currentThread().getName()
                +"run方法执行完毕"+num);
         */
        int num = 0;
        System.out.println(Thread.currentThread().getName()
                +":interrupted-"+Thread.currentThread().isInterrupted());
        for(int i=0;i<10;i++) {
            num+=i;
        }
        System.out.println(Thread.currentThread().getName()
                +"run方法执行完毕"+num);
    }
    public static void main(String[] args) {
        ThreadTest3 tt = new ThreadTest3();
        Thread t = new Thread(tt);
        Thread t2 = new Thread(tt);
        t.start();
        //t.interrupt();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}

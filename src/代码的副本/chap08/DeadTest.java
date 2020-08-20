package 代码的副本.chap08;

public class DeadTest implements  Runnable{
    private int flag;//模拟用户 0表示第一个用户 1表示第二个用户
    public static Object o1 = new Object();//筷子
    public static Object o2 = new Object();//碗

    public static void main(String[] args) {
        DeadTest dt = new DeadTest();
        DeadTest dt2 = new DeadTest();
        dt.flag = 0;
        dt2.flag = 1;
        Thread t = new Thread(dt);
        Thread t2 = new Thread(dt2);
        t.start();
        t2.start();
    }
    @Override
    public void run() {
        if(flag == 0) {
            synchronized (o1) {
                try {
                    Thread.currentThread().sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o2) {
                    System.out.println("1号用户吃上饭了");
                }
            }
        }else if(flag == 1) {
            synchronized (o1) {
                try {
                    Thread.currentThread().sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o2) {
                    System.out.println("2号用户吃上饭了");
                }
            }
        }
    }
}

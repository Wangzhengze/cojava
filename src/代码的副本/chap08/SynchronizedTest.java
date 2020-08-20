package 代码的副本.chap08;

public class SynchronizedTest {
    public static void main(String[] args) {
        /*
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
        */
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
        t1.start();
        t2.start();
        t3.start();
    }
}

class Test extends  Thread {
    @Override
    public void run() {
        for(int i=0;i<5;i++) {
            Singleton s = Singleton.getInstance();
            s.getName();
        }
    }
}

/*
懒汉模式:在类加载的时候不被初始化
饿汉模式:在类加载的时候完成初始化,但是加载时间比较慢,获取对象比较快
 */
class Singleton {
    //懒汉模式 线程不安全
    private static Singleton instance;
    private Singleton(){
        System.out.println("产生一个学习委员");
    }
    public static Singleton getInstance() {
        synchronized (Singleton.class) {
            if (instance == null) {
                try {
                    Thread.currentThread().sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                instance = new Singleton();
            } else {
                System.out.println
                        ("已经有一个学习委员,不能再产生新学习委员");
            }
        }

        return instance;
    }
    public void getName() {
        System.out.println("我是学习委员张三");
    }
}
/*
class Singleton {
    //饿汉模式 线程安全
//    private static Singleton instance = new Singleton();
    private static Singleton instance;

    static  {
        instance = new Singleton();
    }
    private Singleton(){
        System.out.println("产生一个学习委员");
    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        } else {
            System.out.println
                    ("已经有一个学习委员,不能再产生新学习委员");
        }
        return instance;
    }
    public void getName() {
        System.out.println("我是学习委员张三");
    }
}
*/
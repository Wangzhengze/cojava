package day6;

public class Sample {
    static int i = 5;
    static {//第一个静态代码块
        System.out.println("First Static code i="+i++);
    }
    static {//第二个静态代码块
        System.out.println("Second Static code i="+i++);
    }
    public static void main(String[] args) {
        Sample s1 = new Sample();
        Sample s2 = new Sample();
        System.out.println("At last, i= "+i);
    }
}

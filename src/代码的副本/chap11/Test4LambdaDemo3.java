package 代码的副本.chap11;

import java.util.*;

public class Test4LambdaDemo3 {
    public static void main(String[] args) {
        Test4LambdaDemo3 test = new Test4LambdaDemo3();
        test.method_jdk7();
        test.method_jdk8();
        Map<String,String> map = new HashMap<>();
//        map.put(1.1);
        map.put("key","value");
    }
    //使用jdk1.7方式
    public void method_jdk7() {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("jdk1.7 run");
            }
        };
        new Thread(r1).start();
        List<String> names = Arrays.asList
                ("yewenjie","liucixin","yuntianming","luoji","chenxin");
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
                return o1.length()-o2.length();
            }
        });
        for(String name:names) {
            System.out.print(name+"\t");
        }
        System.out.println("-----------jdk1.7");
    }
    //使用jdk8方式
    public void method_jdk8() {
        Runnable r2 = ()-> System.out.println("jdk8 run");
        new Thread(r2).start();
        List<String> names = Arrays.asList
                ("yewenjie","liucixin","yuntianming","luoji","chenxin");
        Collections.sort(names,(x,y)->y.length()-x.length());
//        names.forEach(x-> System.out.print(x+"\t"));
        names.forEach(System.out::println);
        //jdk1.7
        MathOperation mathOperation = new MathOperation() {
            @Override
            public int operate(int x, int y) {
                return Math.max(x,y);
            }
        };
        //jdk1.8
        MathOperation mathOperation2 =
                (x,y)->{return (x >= y) ? x : y;};
        MathOperation mathOperation3 = Math::addExact;
        System.out.println(mathOperation3.operate(30,20));
        System.out.println("-------------jdk8");
    }
}

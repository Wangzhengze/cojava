package 代码的副本.chap11;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Jdk8Test {
    public static void main(String[] args) {
        //认识java8的编程
        List<String> list = Arrays.asList
                ("tom","jack","helloworld","rose");
        List<String> list2 = Arrays.asList
                ("tom","jack","helloworld","rose");
        //使用java7的方式进行排序输出
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        for(String s:list) {
            System.out.print(s+"\t");
        }
        System.out.println("----------jdk1.7");
        //使用java8的方式进行排序输出
        list2.sort((t1,t2)->t1.compareTo(t2));
        list2.forEach(t-> System.out.print(t+"\t"));
        list2.forEach(System.out::println);

//        list2.forEach(System.out::print);
        System.out.println("----------jdk1.8");
    }
}

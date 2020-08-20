package 代码的副本.chap12;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList
                ("yewenjie","liucixin","yuntianming","luoji","chenxin");
        filter(list,name->true);
        filter(list,name->false);
        filter(list,name->name.startsWith("y"));
        filter(list,name->name.length()>5);
        filter(list,name->name.endsWith("n"));
        Predicate<String> p1 = name->name.startsWith("y");
        Predicate<String> p2 = name->name.length()>8;
        filter(list,p1.and(p2));
        filter(list,p1.or(p2));
        filter(list,p1.and(p2).or(p2));
        filter(list,p1.negate());
    }
    public static void filter(List<String> list,
                              Predicate<String> cond) {
        for(String msg:list) {
            if(cond.test(msg)) {
                System.out.print(msg+"\t");
            }
        }
        System.out.println();
        System.out.println("-----------------");
    }
}

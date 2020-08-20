package 代码的副本.chap12;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test6Predicate {
    public static void filter(List<String> list, Predicate<String> condition) {
        for(String name: list) {
            if(condition.test(name)) {
                System.out.println(name + " ");
            }
        }
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("yewenjie","liucixin","yuntianming","luoji","chenxin");

        //全都显示
        filter(list, name->true);
        //全都不显示
        filter(list, name->false);

        //开头是y的语言
        filter(list,name->name.startsWith("y"));
        //5结尾的
        filter(list,name->name.endsWith("5"));

        //显示名字长度大于4
        filter(list,name->name.length()>4);

        System.out.println("-----------------------");
        //名字以y开头并且长度大于4的
        Predicate<String> c1 = name->name.startsWith("y");
        Predicate<String> c2 = name->name.length()>4;
        filter(list,c1.and(c2));

        //名字不是以y开头
        Predicate<String> c3 = (name)->name.startsWith("y");
        filter(list,c3.negate());

        //名字以y开头或者长度小于4的
        Predicate<String> c4 = name->name.startsWith("y");
        Predicate<String> c5 = name->name.length()<4;
        filter(list,c4.or(c5));


        //也可以直接使用Predicate接口中的静态方法
        //名字为Java的
        filter(list,Predicate.isEqual("luoji"));

        //判断俩个字符串是否相等
        boolean test = Predicate.isEqual("hello").test("world");
        System.out.println(test);
    }
}
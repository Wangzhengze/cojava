package 代码的副本.chap12;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> op1 = Optional.of("hello");
        Optional<String> op2 = Optional.ofNullable(null);
        if(op1.isPresent()) {
            System.out.println("op1:"+op1.get());
        }
        if(op2.isPresent()) {
            System.out.println("op2:"+op2.get());
        }
        System.out.println("---------------");
        op1.ifPresent(str-> System.out.println(str));
        op2.ifPresent(System.out::println);
        System.out.println("--------------");
        System.out.println(op1.orElse("如果op1中的值为null则返回这句话"));
        System.out.println(op2.orElse("如果op2中的值为null则返回这句话"));
        System.out.println("--------------");
        System.out.println(op1.orElseGet(()->"自己定义的返回值"));
        System.out.println(op2.orElseGet(()->"自己定义的返回值"));
        System.out.println("--------------");
        try {
            System.out.println(op1.orElseThrow
                    (Exception::new));
            System.out.println(op2.orElseThrow
                    (()->new NullPointerException()));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("--------------");
        Optional<Integer> map1 = op1.map(str->1);
        System.out.println("op1:"+map1.orElse(0));
        Optional<Double> map2 = op2.map(str->1.1);
        System.out.println("op2:"+map2.orElse(0d));
        System.out.println("--------------");
        Optional<String> flatMap = op1.flatMap(str->Optional.of(str+"_briup"));
        System.out.println(flatMap.get());//hello_briup
//        Optional<String> flatMap2 = op2.flatMap(str->Optional.of(str+"_briup"));
//        System.out.println(flatMap2.get());//hello_briup
        System.out.println("---------------");
        op1 = op1.filter(str->str.length()<10);
        System.out.println(op1.orElse("值为null"));//hello
        op1 = op1.filter(str->str.length()>10);
        System.out.println(op1.orElse("值为null"));//值为null

    }
}

package chap13;

import java.util.stream.Stream;

public class createStream {
    public static void main(String[] args) {
        Stream<String> stream11 = Stream.of("hello");
        stream11.forEach(System.out::println);

        Stream<Object> stream12 = Stream.of("hello","world",123);
        stream12.forEach(System.out::println);
        //1.2 generator方法：生成一个无限长度的Stream，其元素的生成是通过给定的Supplier（这个接口可以看成一个对象的工厂，每次调用返回一个给定类型的对象）
    }
}

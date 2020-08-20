package 代码的副本.chap11;

import java.util.Arrays;
import java.util.List;

public class Test5LambdaDemo4 {
    public static void main(String[] args) {
        MethodTest t1 = MethodTest.create(()->new MethodTest());
        MethodTest t2 = MethodTest.create(MethodTest::new);
        MethodTest t3 = MethodTest.create(
                (x,y)->new MethodTest(x,y),"tom",20);
        MethodTest t4 = MethodTest.create(
                MethodTest::new,"jack",21);
        List<MethodTest> list = Arrays.asList(t1);
        //静态方法引用
        list.forEach(MethodTest::method3);
        //实例方法引用
        list.forEach(t1::method4);
        //无参数方法引用  x->method(x)   x->x.method() 形参和引用相同
        list.forEach(MethodTest::method5);
    }
}
@FunctionalInterface
interface Supplier<T> {
    T get();
}
@FunctionalInterface
interface Supplier2<T,R,V> {
    T get(R r,V v);
}
class MethodTest {
    private String name;
    private int age;
    public MethodTest() {
        System.out.println("无参数执行");
    }
    public MethodTest(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("有参数执行:"+name+","+age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //测试构造方法1
    public static MethodTest create(Supplier<MethodTest> s) {
        return s.get();
    }
    //测试构造方法2
    public static MethodTest create(
            Supplier2<MethodTest,String,Integer> s,
                        String name,int age) {
        return s.get(name,age);
    }
    //测试静态方法引用
    public static void method3(MethodTest t) {
        System.out.println("静态方法method3:"+t);
    }
    //测试实例方法引用
    public void method4(MethodTest t) {
        System.out.println("实例方法method4:"+t);
    }
    //无参数方法引用
    public void method5(){
        System.out.println("无参数方法引用");
    }
}
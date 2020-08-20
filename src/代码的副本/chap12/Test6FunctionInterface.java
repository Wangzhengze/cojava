package 代码的副本.chap12;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Test6FunctionInterface {
    private String name;
    private int age;

    public static void main(String[] args) {
        Test6FunctionInterface t1 = Test6FunctionInterface.create(Test6FunctionInterface::new);
        Test6FunctionInterface t2 = Test6FunctionInterface.create2(Test6FunctionInterface::new,"zs",18);
        List<Test6FunctionInterface> list = Arrays.asList(t1);
        //静态方法引用
        list.forEach(Test6FunctionInterface::method3);
        //实例对象方法的实现
        list.forEach(t1::method4);

        //不需要创建对象，也能调用的，相当于将参数作为调用者
        list.forEach(Test6FunctionInterface::method5);
        list.forEach((i)->{i.method5();});
        list.forEach(System.out::println);
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

    public Test6FunctionInterface() {
        System.out.println("无参执行");
    }

    public Test6FunctionInterface(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("有参执行:"+name+","+age);
    }

    public static Test6FunctionInterface create(Supplier<Test6FunctionInterface> s){
        return s.get();//使用的哪种构造器看这里，lambda表达式执行的时候的传参是无参
    }

    public static Test6FunctionInterface create2(Supplier2<Test6FunctionInterface,String,Integer> s,String name,int age){
        return s.get(name,age);//使用的哪种构造器看这里，lambda表达式执行的时候的传参是两参
    }
    //测试静态方法引用
    @Test
    public static void method3(Test6FunctionInterface t5){
        System.out.println("method3:"+t5);
    }
    //测试有参实例方法引用
    public void method4(Test6FunctionInterface t5){
        System.out.println("method4:"+t5);
    }
    //测试无参实例方法引用
    public void method5(){
        System.out.println("method5:"+this);
    }
}

@FunctionalInterface
interface Supplier<T>{
    T get();
}

@FunctionalInterface
interface Supplier2<T,R,V>{
    T get(R r,V v);
}
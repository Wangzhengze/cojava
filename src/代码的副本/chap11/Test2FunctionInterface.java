package 代码的副本.chap11;

@FunctionalInterface
public interface Test2FunctionInterface {
    void method1();
//    void method2();
    //不能有被实现的方法
//    public void method3() {System.out.println("method3");}
    //可以用多个default，static实现的方法以及object继承的方法
    default void method4() {
        System.out.println("method4");
    }
    public default void method5() {
        System.out.println("method5");
    }
    static void method6() {
        System.out.println("method6");
    }
    boolean equals(Object o);
}

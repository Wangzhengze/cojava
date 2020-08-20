package 代码的副本.chap06;

public class MethodInner {
    public static void main(String[] args) {
        A3 a3 = new A3();
        a3.method();
        Person p = new Person() {
            @Override
            public void eat() {
                System.out.println("eat good");
            }
        };
        p.eat();
        Person p2 = new Person() {
            @Override
            public void eat() {
                System.out.println("eat full");
            }
        };
        p2.eat();
    }
}

interface  Person {
    void eat();
}

class A3 {
    private int a1 = 10;
    private static int a2 = 20;
//    B3 b3 = new B3();
    public void method() {
//        B3 b3 = new B3();
        class B3{
//            static int a = 10;
//            static void test(){}
//            static class C3{}
            int b1 = a1;
            int b2 = a2;
            public void test() {
                System.out.println("this is test");
            }
            class C3{}
        }
        B3 b3 = new B3();
        B3.C3 bc = b3.new C3();
        System.out.println("b1:"+b3.b1);
        System.out.println("b2"+b3.b2);
        b3.test();
    }
}

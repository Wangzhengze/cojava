package 代码的副本.chap06;

public class StaticInner {
    public static void main(String[] args) {
        A.B ab = new A.B();
        System.out.println("b:"+ab.b);
        System.out.println("b2:"+ab.b2);
        System.out.println("b2:"+ A.B.b2);
        ab.test();
        A.B.test2();
        A.B.C abc = new A.B.C();
        System.out.println("c:"+abc.c);
        System.out.println("c2:"+ A.B.C.c2);
    }
}

class A {
    private int a = 10;
    private static int a2 = 20;
    public static class B {
        int b = new A().a;
        static int b2 = a2;
        //int b3 = a;
        int b3 = new A().a2;
        int b4 = a2;
        public void test(){
            System.out.println("this is test");
        }
        public static void test2(){
            System.out.println("this is test2");
        }
        public static class C {
            int c = 30;
            static int c2 = b2;
        }
    }
}

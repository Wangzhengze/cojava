package 代码的副本.chap06;

public class InstanceInner {
    public static void main(String[] args) {
        A2.B2 ab = new A2().new B2();
        System.out.println("b1:"+ab.b1);
        A2 a = new A2();
        A2.B2 ab2 = a.new B2();
        System.out.println("b2:"+ab2.b2);
        System.out.println("b3:"+ab2.b3);
        System.out.println("b4:"+ab2.b4);
        System.out.println("b5:"+ab2.b5);
        ab2.test();
    }
}

class A2 {
    private int a1 = 10;
    public int a2 = 20;
    static int a3 = 30;
    public A2(){}
    public A2(int a1,int a2) {
        this.a1 = a1;
        this.a2 = a2;
    }
    public int method() {
        return a1*a2;
    }
    public class B2 {
//        static int b1 = 0;
//        static int test(){}
//        static class C2{}
        int a1 = 1000;
        int b1 = a1;
        int b2 = a2;
        int b3 = a3;
        int b4 = new A2(100,200).a1;
        int b5 = method();
        public void test() {
            System.out.println("this is test:"+ A2.this.a1);
        }
        class C2{}
    }
}

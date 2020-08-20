package 代码的副本.chap11;

public class Test2LambdaDemo1 {
    MathOperation m1Add;
    MathOperation m2Minu;
    public static void main(String[] args) {
        Test2LambdaDemo1 test = new Test2LambdaDemo1();
        test.method_jdk8();
        System.out.println("jdk8 add:"
                +test.mathTest(10,20,test.m1Add));
        System.out.println("jdk8 min:"
                +test.mathTest(10,20,test.m2Minu));
        /*
        test.method_jdk7();
        System.out.println("jdk1.7 add:"
                +test.mathTest(10,20,test.m1Add));
        System.out.println("jdk1.7 min:"
                +test.mathTest(10,20,test.m2Minu));
         */
    }
    public int mathTest(int a,int b,MathOperation operation) {
        return operation.operate(a,b);
    }
    public void method_jdk7() {
        //1.测试jdk1.7 匿名内部类实现
        Action1 a1 = new Action1() {
            @Override
            public void run() {
                System.out.println("jdk1.7 run");
            }
        };
        a1.run();
        SayService a2 = new SayService() {
            @Override
            public void sayMessage(String message) {
                System.out.println("jdk1.7 sayMessage:"+message);
            }
        };
        a2.sayMessage("helloworld");
        m1Add = new MathOperation() {
            @Override
            public int operate(int x, int y) {
                return x+y;
            }
        };
        m2Minu = new MathOperation() {
            @Override
            public int operate(int x, int y) {
                return x-y;
            }
        };
    }
    public void method_jdk8() {
        Action1 a1 = ()-> System.out.println("jdk8 run");
        a1.run();
        Action2<String> a2 = ()->"return helloworld";
        System.out.println("jdk8 run:"+a2.run());
        SayService s1 = (String msg)->{
                System.out.println("jdk8 sayService:"+msg);};
        SayService s2 = (msg)->
                System.out.println("jdk8 sayService:"+msg);
        SayService s3 = msg-> System.out.println
                ("jdk8 sayService:"+msg);
        SayService s4 = msg->{int a=10;
        System.out.println("jdk8 sayService:"+msg);};
        s1.sayMessage("参数类型");
        s2.sayMessage("不需要参数类型");
        s3.sayMessage("不需要括号");
        s4.sayMessage("需要大括号");
        //使用类型，大括号中的返回语句
        m1Add = (int a,int b)->{
            a+=b;
            return a;
        };
        //不实用类型，不实用大括号
        m2Minu = (a,b)->a-b;
        System.out.println("jdk8 math:"+
                m1Add.operate(10,20));
        System.out.println("jdk8 math:"+
                m2Minu.operate(10,20));
    }
}
@FunctionalInterface
interface Action1 {
    void run();
}
@FunctionalInterface
interface Action2<T> {
    T run();
}
@FunctionalInterface
interface SayService {
    void sayMessage(String message);
}
@FunctionalInterface
interface  MathOperation {
    int operate(int x,int y);
}
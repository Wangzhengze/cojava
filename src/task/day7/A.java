package task.day7;

public class A {
    static {
        System.out.println("A 静态代码块");
    }

    private static String staticStr = getStaticStr();
    private String str = getStr();

    {
        System.out.println("A 代码块");
    }

    public A() {
        System.out.println("A 构造方法");
    }

    private static String getStaticStr() {
        System.out.println("A 静态方法");
        return null;
    }

    private String getStr() {
        System.out.println("A 实例属性初始化");
        return null;
    }

    public static class B extends A {
        private static String staticStr = getStaticStr();
        static {
            System.out.println("B 静态代码块");
        }

        public B() {
            System.out.println("B 构造方法");
        }

        {
            System.out.println("B 构造块");
        }

        private String str = getStr();

        private static String getStaticStr() {
            System.out.println("B 静态方法");
            return null;
        }
        private String getStr() {
            System.out.println("B 方法");
            return null;
        }
    }

    public static void main(String[] args) {

        new B();
    }}

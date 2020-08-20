package 代码的副本.chap11;
import org.junit.Test;
public class Test3LambdaDemo2 {
    public static String name1 = "tom1";
    public String name2 = "tom2";
    @Test
    public void test1() {
        name1 = "n1";
        SayService s1 = m-> System.out.println(m+name1);
        s1.sayMessage("helloworld-");
        name2 = "n2";
        SayService s2 = m-> System.out.println(m+name2);
        s2.sayMessage("helloworld-");
//        String name3 = "tom3";
//        String m = "test";
//        String m2 = "test";

        SayService s3 = m-> {
            String name3 = "n3";
            name3="aaa";
            name1 = "test2";
            name2 = "test2";

            System.out.println(m+name1+name3);
        };
        s3.sayMessage("helloworld-");

    }
    public static void main(String[] args) {
        Test3LambdaDemo2 test = new Test3LambdaDemo2();
        test.test1();
    }
}

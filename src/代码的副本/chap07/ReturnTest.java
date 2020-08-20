package 代码的副本.chap07;

public class ReturnTest {
    public static void main(String[] args) {
        System.out.println("success:"+getReturn());
    }
    public static String getReturn() {
        try{
            System.out.println("try");
            int num = Integer.parseInt("tom");
            return "try";
        }catch (Exception e) {
            System.out.println("catch");
            return "catch";
        }finally {
            System.out.println("finally");
            return "finally";
        }
//        System.out.println("end");
//        return "end";
    }
}

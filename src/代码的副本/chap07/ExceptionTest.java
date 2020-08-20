package 代码的副本.chap07;

public class ExceptionTest {
    public void test() {
        System.out.println("this is test");
    }
    public static void main(String[] args) {
        try {
//            Class.forName("com.briup.bd2008.chap06.Student");
//            File file = new File("/test.txt");
//            new FileInputStream(file);
            int a = 10;
            int b = 10;
            int c = a/b;
            System.out.println("c:"+c);
            int[] iarray = new int[3];
            iarray[2] = 10;
            System.out.println(iarray.length);
            ExceptionTest test = new ExceptionTest();
            test.test();
            String str = "123";
            int i = Integer.parseInt(str);
            System.out.println("i:"+i);
        }catch (ArithmeticException e) {
//            e.printStackTrace();
            System.out.println("first:"+e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }catch (NumberFormatException e) {
            e.printStackTrace();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("end");
    }
}

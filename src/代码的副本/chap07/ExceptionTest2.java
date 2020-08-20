package 代码的副本.chap07;

public class ExceptionTest2 {
    public static void main(String[] args) {
        ExceptionTest2 test = new ExceptionTest2();
        test.divide(10,1,"china");
    }
    public void divide(int a,int b,String str){
       try{
            if(b==0)throw new ArithmeticException("分母不能为零");
            if(b<0) throw new ArithmeticException("分母不能为负数");
            if(str == null)throw new NullPointerException("空指针异常");
            System.out.println(str.length());
            int c = a/b;
            System.out.println("c:"+c);
            int i = Integer.parseInt("china");
           System.out.println("i"+i);
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
       System.out.println("程序运行结束");
    }
}

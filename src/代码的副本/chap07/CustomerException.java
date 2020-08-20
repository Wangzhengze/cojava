package 代码的副本.chap07;

public class CustomerException {
    public static void main(String[] args) {
        Test test = new Test();
        try {
            test.divide(10,-1);
        } catch (ZeroException e) {
            e.printStackTrace();
        } catch (NavException e) {
            e.printStackTrace();
        }
    }
}

class Test {
    public void divide(int a,int b) throws ZeroException, NavException {
        if(b==0){
                ZeroException zero = new ZeroException();
                throw zero;
        }
        if(b<0) {
                throw new NavException("分母不能为负数");
        }
        int c = a/b;
        System.out.println("c:"+c);
    }
}

class ZeroException extends  Exception {
    public ZeroException() {
        this("分母不能为零");
    }
    public ZeroException(String msg) {
        super(msg);
        System.out.println("请重新输入");
    }
}

class NavException extends  Exception {
    public NavException(String msg) {
        super(msg);
        System.out.println("请重新输入");
    }
}
package chap07;

class ExceptionTest {
    public static void divide(int a, int b) {
        try {
        int result = a / b;
        System.out.println(a + "/" + b + "=" + result);
        } catch(ArithmeticException e) {
        	System.out.println("Sorry, error in divide");
        }
    }

    public static void main(String[] args) {
        divide(1,2);
        divide(10,2);
        divide(10,0);
        divide(10,5);
    }
}
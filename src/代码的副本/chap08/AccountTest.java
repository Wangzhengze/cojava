package 代码的副本.chap08;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1000);
        Gril gril = new Gril(account);
        Boy boy = new Boy(account);
        Thread t1 = new Thread(boy,"tom");
        Thread t2 = new Thread(gril,"rose");
        Thread t3 = new Thread(gril,"lily");
        t1.start();
        t2.start();
        t3.start();
    }
}

package 代码的副本.chap08;

public class Gril implements Runnable{
    private Account account;
    public Gril() {
    }
    public Gril(Account account) {
        this.account = account;
    }
    @Override
    public void run() {
        while(true) {
            int am = (int)(Math.random()*1000);
            account.withdraw(am);
            try {
                Thread.currentThread().sleep(am);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

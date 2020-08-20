package 代码的副本.chap08;

public class Account {
    private int balance;
    public Account() {
    }
    public Account(int balance) {
        this.balance = balance;
    }
    //消费
    public synchronized void withdraw(int money) {
        if(money > balance) {
            System.out.println(Thread.currentThread().getName()
                    + "，消费:" + money + "，余额不足");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            balance-=money;
            System.out.println(Thread.currentThread().getName()
                    +",消费:"+money+",余额:"+balance);
        }
    }
    //存钱
    public synchronized void deposite(int money) {
        balance+=money;
        System.out.println(Thread.currentThread().getName()
                +",存钱:"+money+",余额:"+balance);
        notifyAll();
    }
}

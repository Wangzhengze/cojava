package 代码的副本.chap09;

import java.io.*;

public class PipTest {
    public static void main(String[] args) throws IOException {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream(pis);
        //创建发送方和接收方
        Sender sender = new Sender(pos);
        Fecher fecher = new Fecher(pis);
        sender.setName("发送方");
        fecher.setName("接收方");
        sender.start();
        fecher.start();
    }
}

//发送方
class Sender extends Thread {
    //拥有管道输出流
    PipedOutputStream pos;
    public Sender() {}
    public Sender(PipedOutputStream pos) {
        this.pos = pos;
    }
    @Override
    public void run() {
        DataOutputStream dos = new DataOutputStream(pos);
        try {
            dos.writeUTF("helloworld");
            System.out.println(getName()+"发送成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//接收方
class Fecher extends Thread {
    //构建管道输入流
    PipedInputStream pis;
    public Fecher() {}
    public Fecher(PipedInputStream pis) {
        this.pis = pis;
    }
    @Override
    public void run() {
        DataInputStream dis = new DataInputStream(pis);
        try {
            String s = dis.readUTF();
            System.out.println(getName()+"接受完毕,信息:"+s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




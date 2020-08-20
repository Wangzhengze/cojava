package 代码的副本.chap10;

import java.io.*;
import java.net.Socket;

public class PickClient {
    public static void main(String[] args) throws Exception {
        /*
        客户端读取图片,发送图片，接受服务器响应信息
         */
        System.out.println("这是客户端...");
        Socket socket = new Socket("127.0.0.1",10000);
        File file = new File("src/a.png");
        if(!file.exists()) {
            file.createNewFile();
        }
        //发送给服务器当前上传的时间
        DataOutputStream dos = new DataOutputStream
                (socket.getOutputStream());
        dos.writeLong(System.currentTimeMillis());
        //读取本地图片，发送给服务器
        DataOutputStream dos2 = new DataOutputStream
                (socket.getOutputStream());
        InputStream is = new FileInputStream(file);
        byte[] b = new byte[1024];
        int count = 0;
        while((count = is.read(b))!=-1) {
            dos.write(b);
        }
        socket.shutdownOutput();
        //接受服务器返回的响应信息
        InputStream is2 = socket.getInputStream();
        DataInputStream dis2 = new DataInputStream(is2);
        String msg = dis2.readUTF();
        System.out.println("客户端接受数据:"+msg);
        is2.close();
        socket.close();
    }
}

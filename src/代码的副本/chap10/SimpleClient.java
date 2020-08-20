package 代码的副本.chap10;

import java.io.*;
import java.net.Socket;

public class SimpleClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1",10000);
        InputStream is = socket.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        //客户端读取终端输入的内容发送给服务器端
        OutputStream os = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        InputStreamReader reader =
                new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        while(true) {
            //获取终端输入的内容
            String str = br.readLine();
            System.out.println("客户端说:"+str);
            //将数据发送给服务器端
            dos.writeUTF(str);
            dos.flush();
            //接受服务器传过来的数据
            String msg = dis.readUTF();
            System.out.println("服务器说:"+msg);
        }
    }
}




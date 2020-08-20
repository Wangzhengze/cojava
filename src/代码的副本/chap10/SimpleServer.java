package 代码的副本.chap10;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(10000);
        //监听客户端连接
        Socket socket = ss.accept();
        OutputStream os = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        InputStream is = socket.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        BufferedReader br = new BufferedReader
                (new InputStreamReader(System.in));
        while(true) {
            //接受客户端数据
            String msg = dis.readUTF();
            System.out.println("客户端说:"+msg);
            //获取终端输入的内容
            String str = br.readLine();
            System.out.println("服务器说:"+str);
            dos.writeUTF(str);
            dos.flush();
        }
    }
}

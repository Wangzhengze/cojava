package chap10;

import javax.crypto.spec.PSource;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10000);
        while(true){
        Socket accept = ss.accept();
        System.out.println("接收到socket");
        OutputStream os=accept.getOutputStream();
        DataOutputStream dos=new DataOutputStream(os);

        InputStream is=accept.getInputStream();
        DataInputStream dis=new DataInputStream(is);

        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);

        while(true){
//接受客户端数据  //需要再写一个超时断开连接
            String msg=dis.readUTF();
            System.out.println("客户端说"+msg);
            String str=br.readLine();
            dos.writeUTF(str);
            dos.flush();
        }

    }}
}

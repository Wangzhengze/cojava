package chap10;

import java.io.*;
import java.net.Socket;

public class PickClient {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",10000);
        InputStream is=socket.getInputStream();
        DataInputStream dis=new DataInputStream(is);

        OutputStream os=socket.getOutputStream();
        DataOutputStream dos=new DataOutputStream(os);

        String str="/Users/wangzhengze/Desktop/民事诉讼状.docx";
        FileInputStream fi=new FileInputStream(str);
        byte[] b=new byte[1024];
        while(fi.read(b)!=-1){
            dos.write(b);
        }
        System.out.println("传输完毕");
    }
}

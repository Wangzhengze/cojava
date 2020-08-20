package chap10;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class PickServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10000);

        Socket accept = ss.accept();
        OutputStream os=accept.getOutputStream();
        DataOutputStream dos=new DataOutputStream(os);

        InputStream is=accept.getInputStream();
        DataInputStream dis=new DataInputStream(is);

        File f=new File("./a.docx");
        FileOutputStream fos=new FileOutputStream(f);
        byte b[]=new byte[1024];
        while(true){
            if(dis.read(b)==-1){
                break;
            }

            fos.write(b);
        }

    }
}

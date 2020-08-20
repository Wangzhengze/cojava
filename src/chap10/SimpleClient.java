package chap10;

import java.io.*;
import java.net.Socket;

public class SimpleClient {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",10000);
        InputStream is=socket.getInputStream();
        DataInputStream dis=new DataInputStream(is);

        OutputStream os=socket.getOutputStream();
        DataOutputStream dos=new DataOutputStream(os);
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(reader);
        while(true){
            String str=br.readLine();
            System.out.println("客户端说"+str);
            dos.writeUTF(str);
            dos.flush();
            String msg=dis.readUTF();
            System.out.println("服务器说"+msg);
        }

    }
}

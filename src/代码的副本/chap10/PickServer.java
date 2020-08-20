package 代码的副本.chap10;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class PickServer {
    public static void main(String[] args) throws Exception {
        System.out.println("这是服务器...");
        ServerSocket ss = new ServerSocket(10000);
        while (true) {
            Socket socket = ss.accept();
            //获取客户端上传的ip
            String host = socket.getInetAddress().getHostAddress();
            System.out.println("hostAddress:"+host+"... connecting");
            //接受客户端上传图片的时间
            DataInputStream dis = new DataInputStream
                    (socket.getInputStream());
            long curr_time = dis.readLong();
            //接受客户端上传的图片,写入到本地
            DataInputStream dis2 = new DataInputStream
                    (socket.getInputStream());
            OutputStream os = new FileOutputStream
                    ("src/"+curr_time+".png");
            byte[] b = new byte[1024];
            int len = 0;
            while((len = dis.read(b))!=-1) {
                os.write(b);
            }
            os.flush();
            //给客户端响应信息
            OutputStream os2 = socket.getOutputStream();
            DataOutputStream dos2 = new DataOutputStream(os2);
            dos2.writeUTF(host+"上传成功");
            dos2.flush();
            dos2.close();
            socket.close();
        }
    }
}

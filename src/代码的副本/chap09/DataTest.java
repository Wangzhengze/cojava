package 代码的副本.chap09;

import java.io.*;

public class DataTest {
    public static void main(String[] args) {
        DataTest dt = new DataTest();
        try {
            dt.print();
            dt.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void show() throws Exception {
        InputStream is = new FileInputStream
                ("src/test2.txt");
        DataInputStream dis = new DataInputStream(is);
        System.out.println("boolean:"+dis.readBoolean());
        System.out.println("int:"+dis.readInt());
        System.out.println("double:"+dis.readDouble());
        System.out.println("float:"+dis.readFloat());
        System.out.println("string:"+dis.readUTF());
    }
    public void print() throws Exception {
        OutputStream os = new FileOutputStream
                ("src/test2.txt");
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeBoolean(false);//1个字节
        dos.writeInt(10);//4个字节
        dos.writeDouble(10.0);//8个字节
        dos.writeFloat(10f);
        dos.writeUTF("hello");
        dos.flush();
    }
}

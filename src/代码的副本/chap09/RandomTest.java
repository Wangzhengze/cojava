package 代码的副本.chap09;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomTest {
    public static void main(String[] args) throws Exception {
        File file = new File("src/test3.txt");
        //rw 支持读取和写入   r 支持读取
        RandomAccessFile raf = new RandomAccessFile(file,"rw");
        RandomTest test = new RandomTest();
        test.print(raf);
        test.show(raf);
    }
    public void show(RandomAccessFile raf) throws Exception {
        //read方法读取，类似于Data流使用方式
        //seek指针偏移量，0表示最开始位置
        raf.seek(0);
        System.out.println("int:"+raf.readInt());
        //System.out.println("boolean:"+raf.readBoolean());
        raf.skipBytes(9);
       //System.out.println("double:"+raf.readDouble());
//        System.out.println("count:"+raf.readShort());
//        System.out.println("string:"+raf.readUTF());
        //readShort获取字符串的长度，实现跳过功能
        raf.skipBytes(raf.readShort());
        System.out.println("float:"+raf.readFloat());
    }
    public void print(RandomAccessFile raf) throws Exception {
        //write方法写入,类似于Data流使用方式
        raf.writeInt(10);//4个字节
        raf.writeBoolean(true);//1个字节
        raf.writeDouble(10.0);//8个字节
        raf.writeUTF("helloworld");
        raf.writeFloat(10.0f);//4个字节
    }
}

package 代码的副本.chap09;

import java.io.*;

public class PrintTest {
    public static void main(String[] args) throws Exception {
        /*
        构建输出流，需要调用flush进行刷新操作
         */
        File file = new File("src/test3.txt");
        OutputStream os = new FileOutputStream(file);
        OutputStreamWriter osw = new OutputStreamWriter(os);
        //PrintWriter writer = new PrintWriter(file);
        //PrintWriter writer = new PrintWriter(os,true);
        PrintWriter writer = new PrintWriter(osw,true);
        writer.println(true);
        writer.println("你好");
        writer.println(10);
        writer.println(10.0);
//        writer.flush();
    }
}

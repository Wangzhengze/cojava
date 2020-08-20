package 代码的副本.chap09;

import java.io.*;

public class FileReaderTest {
    public static void main(String[] args) throws Exception {
        String path = "src/test3.txt";
        String path2 = "src/test2.txt";
        /*
        fileReader可以直接操作文件，不需要先构建字节输入流
        再进行字符流和字节流转换，但是不能指定编码格式
         */
        FileReader reader = new FileReader(path);
        FileWriter writer = new FileWriter(path2,true);
        BufferedReader br = new BufferedReader(reader);
        BufferedWriter bw = new BufferedWriter(writer);
        String str = null;
        while((str = br.readLine())!=null) {
            System.out.println(str);
            bw.write(str+'\n');
        }
        bw.flush();
    }
}

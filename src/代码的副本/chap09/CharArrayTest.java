package 代码的副本.chap09;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayTest {
    public static void main(String[] args) throws Exception {
        //主要用来实现以字符数组作为目标的流
        String str = "abcde";
        //toCharArray：将字符串转换成字符数组
        char[] chars = str.toCharArray();
        char[] chars2 = {'1','2','3'};
        System.out.println("--------------------");
        CharArrayWriter writer = new CharArrayWriter();
        writer.write(chars);
        writer.write(chars2);
        writer.append('4').append('5').append('6');
        System.out.println(writer.toString());
        char[] chars3 = writer.toCharArray();
        for(char c:chars3) {
            System.out.println(c);
        }
        System.out.println("*************");
        CharArrayReader reader =
                new CharArrayReader(chars3);
        CharArrayReader reader2 =
                new CharArrayReader(chars3,1,3);
        int count = 0;
        while((count = reader2.read())!=-1) {
            System.out.println((char)count);
        }

    }
}

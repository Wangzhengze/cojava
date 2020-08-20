package 代码的副本.chap09;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringTest {
    public static void main(String[] args) throws Exception {
        String str="从今天起，要做一个有理想，有抱负，幸福的人。" +
                "要好好学习，天天向上";
        char[] chars = new char[1024];
        int count = 0;
        String s = null;
        StringReader reader = new StringReader(str);
        StringWriter writer = new StringWriter();
        while((count = reader.read(chars))!=-1) {
            s = new String(chars);
            System.out.println(s);
        }
        writer.write(s);
        System.out.println(writer.toString());
    }
}

package 代码的副本.chap09;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class CharTest {
    public static void main(String[] args) throws Exception {
        String path = "src/test.txt";
        String path2 = "src/test2.txt";
        InputStream is = new FileInputStream(path2);
        OutputStream os = new FileOutputStream(path);
        InputStreamReader reader = new InputStreamReader(is,"gbk");
        OutputStreamWriter writer = new OutputStreamWriter(os,"gbk");
        BufferedReader br = new BufferedReader(reader);
        BufferedWriter bw = new BufferedWriter(writer);
        //String str = br.readLine();
        //str = br.readLine();
        String str = null;
        while((str = br.readLine())!=null) {
            System.out.println("str:"+str);
            bw.write(str);
            bw.newLine();
        }
        bw.flush();
    }
}

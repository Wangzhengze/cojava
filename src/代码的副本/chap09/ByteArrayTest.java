package 代码的副本.chap09;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;

public class ByteArrayTest {
    public static void main(String[] args) throws Exception {
        byte[] b = {1,2,3,4};
        ByteArrayInputStream bis =
                new ByteArrayInputStream(b);
        BufferedInputStream bs =
                new BufferedInputStream(bis,1);
       // bis.skip(2);
       // System.out.println("skip:"+bis.read());
        System.out.println("mark:"+bs.markSupported());
        bs.mark(2);
        System.out.println("first:"+bs.read());
        System.out.println("first:"+bs.read());
        System.out.println("reset");
        bs.reset();
        System.out.println("second:"+bs.read());
        System.out.println("second:"+bs.read());
    }
}

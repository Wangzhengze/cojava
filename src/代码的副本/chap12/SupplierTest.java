package 代码的副本.chap12;

import org.junit.Test;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierTest {
    //生成一个八位的随机数
    Supplier<String> s = ()->{
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<8;i++) {
            int num = random.nextInt(base.length());
            sb.append(base.charAt(num));
        }
        return sb.toString();
    };
    @Test
    public void test() {
        System.out.println(s.get());
    }
}

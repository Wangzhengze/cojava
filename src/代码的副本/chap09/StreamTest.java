package 代码的副本.chap09;

import java.io.*;

public class StreamTest {
    public static void main(String[] args) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        /*
        相对路径:不以"/"开头，从当前路径src开始
        绝对路径:以"/"开头,从根目录开始 unix:/  windows:盘符
         */
        String path = "src/test.txt";
        String path2 = "/Users/a1/IdeaProjects/untitled/maven/bigdata/src/test2.txt";
        try {
            is = new FileInputStream(path);
            os = new FileOutputStream(path2);
            int available = is.available();
            System.out.println("length:"+available);
            /*
            int count = is.read();
            count = is.read();
            System.out.println("count:"+(char)count);
            int num = 0;
            //int  !=-1等价于>=0 表示有数据，=-1表示文件结尾
            //read() 会增加流和文件交互的次数
            while((num = is.read())!=-1) {
                System.out.print((char)num);
            }
             */
//            int num = is.read(b);
//            num = is.read(b);
//            System.out.println("num:"+num);
//            for(byte b2:b) {
//                System.out.println((char)b2);
//            }
            byte[] b = new byte[1024];
            int num = 0;
            while((num = is.read(b))!=-1) {
                os.write(b);
            }
            os.flush();
            /*
            第一个参数:表示将来保留数据的字节数组
            第二个参数:保存到数组中的开始位置
            第三个参数:有效保存的个数
            byte[] b = new byte[7];
            int num = is.read(b,3,5);
            is.read(b,1,5);
            System.out.println("num:"+num);
            String str = new String(b);
            System.out.println(str);
             */
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(os!=null)os.close();
            if(is!=null)is.close();
        }
    }
}

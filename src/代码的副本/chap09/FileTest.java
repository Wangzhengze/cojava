package 代码的副本.chap09;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        File file = new File
                ("src/test.txt");//存在文件
        File file2 = new File
                ("/Users/a1/IdeaProjects/untitled/maven/bigdata/src/test2.txt");//不存在文件
        File file3 = new File
                ("src/com/briup/bd2008/chap08");//存在目录
        File file4 = new File
                ("src/com/briup/bd2008/chap10");//不存在目录
        System.out.println("exist:"+file.exists()+",name:"+file.getName()
                +",read:"+file.canRead()+",write:"+file.canWrite()
                +",execute:"+file.canExecute()+",file:"+file.isFile());
        /*
        路径
        parent:可以获取当前文件父目录路径，包括相对路径和绝对路径
        absolute:获取绝对路径
        path:当前路径,包括相对路径和绝对路径
         */
        System.out.println("parent:"+file.getParent());
        System.out.println("parent:"+file2.getParent());
        System.out.println("absolute:"+file3.getAbsolutePath());
        System.out.println("path:"+file4.getPath());
        if(!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(!file4.exists()) {
            //mkdir:只能创建子目录，如果父目录不存在创建失败
            //mkdirs://创建子目录同时，如果父目录不存在一起创建
            file4.mkdir();
        }
        String[] names = file3.list();
        for(String name:names) {
            System.out.println(name);
//          new File(file4,name).createNewFile();
            new File(file4,name).delete();
        }
        file4.delete();
    }
}

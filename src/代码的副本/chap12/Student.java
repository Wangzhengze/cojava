package 代码的副本.chap12;

import java.util.function.Consumer;

public class Student {
    String name;
    public static void main(String[] args) {
        Student s=new Student();
        s.name="小王";
        Consumer<Student> ss=(stu)->{
            System.out.println("名字"+stu.name);
        };
        Consumer<Student> sss=(stu)->{
            System.out.println("再次执行");
        };
        ss.andThen(sss).accept(s);
    }
}

package 代码的副本.chap12;

import java.util.function.Function;

public class FunctionTest {
    public static class Student {
        private String name;

        public Student(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
    public static void main(String[] args) {
        String name = "tom";
//        Function<String,Student> f1 = x->new Student(x);
        Function<String,Student> f1 = Student::new;
        Student s = f1.apply(name);
        System.out.println(s.getName());
        //改变用户的输入名字
        Function<String,String> before = x->"briup_"+x;
        //利用f1调用之前先执行before对象的方法，把before对象方法
        //结果传给f1调用的内容
        Student s2 = f1.compose(before).apply(name);
        System.out.println(s2.getName());
        /*获得创建好的对象中的名字的长度*/
        Function<Student,Integer> after =
                stu->stu.getName().length();
        int len = f1.compose(before).andThen(after).apply(name);
        System.out.println(len);
    }
}


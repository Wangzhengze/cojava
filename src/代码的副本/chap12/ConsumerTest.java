package 代码的副本.chap12;

import java.util.function.Consumer;

public class ConsumerTest {
    public static class Student {
        private String name;
        public Student(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student s = new Student("tom");
        Consumer<Student> c1 = stu->{
            System.out.println("我是第一个执行,我把名字改了");
            stu.setName("李四");
        };
        Consumer<Student> c2 = stu->{
            System.out.println(
                    "我是第二个执行，name是"+stu.getName());
        };
        c1.andThen(c2).accept(s);
    }
}

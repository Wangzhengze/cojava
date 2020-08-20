package 代码的副本.chap09;

import java.io.*;

public class ObjectTest {
    public static void main(String[] args) {
        try {
            insert();
            select();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void insert() throws Exception {
        Student student = new Student("jack",20);
        File file = new File("src/test3.txt");
        OutputStream os = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(student);
        oos.flush();
    }
    public static void select() throws Exception {
        File file = new File("src/test3.txt");
        InputStream is = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(is);
        Student s = (Student) ois.readObject();
        System.out.println(s);
    }
}
class Student implements Serializable {
    private String name;
    private int age;
    public Student() {}
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
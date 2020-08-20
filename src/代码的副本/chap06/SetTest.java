package 代码的副本.chap06;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Student s = new Student("tom",123);
        Student s2 = new Student("tom",123);
        Set<Student> set = new HashSet<>();
        set.add(s);
        set.add(s2);
        System.out.println(set.size());
    }
}

class Student {
    public String name;
    public int password;
    public Student() {}
    public Student(String name, int password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o instanceof Student) {
            Student student = (Student) o;
            return name.equals(student.name)
                    && password == student.password;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", password=" + password +
                '}';
    }
}

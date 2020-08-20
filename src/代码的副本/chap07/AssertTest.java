package 代码的副本.chap07;

public class AssertTest {
    public static void main(String[] args) {
        Student s = new Student(1,"tom");
        String name = s.getName();
        assert name!=null:"name不能为空";
        System.out.println("name:"+name);
        boolean flag = 1>2;
        assert flag:"flag为flase";
        System.out.println("flag:"+flag);
    }
}

class Student {
    private int id;
    private String name;

    public Student() {
    }
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

package day9_task;

public class Student {
    private String name;
    private String cls;
    private int grade;

    public Student() {
    }

    public Student(String name, String cls, int grade) {
        this.name = name;
        this.cls = cls;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCls() {
        return cls;
    }

    public void setCls(String cls) {
        this.cls = cls;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}

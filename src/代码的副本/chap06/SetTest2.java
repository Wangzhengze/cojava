package 代码的副本.chap06;

import java.util.Comparator;
import java.util.TreeSet;

public class SetTest2 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("tom",1000);
        Teacher t2 = new Teacher("jack",2000);
        Teacher t3 = new Teacher("rose",1500);
        Teacher t4 = new Teacher("mark",1500);
       // Set<Teacher> set = new TreeSet<>();
        TreeSet<Teacher> set = new TreeSet<>(
                new TeacherComparator());
        set.add(t1);
        set.add(t2);
        set.add(t3);
        set.add(t4);
        for(Teacher t:set) {
            System.out.println(t);
        }
    }
}

class TeacherComparator implements Comparator<Teacher> {
    @Override
    public int compare(Teacher o1, Teacher o2) {
        if(o1.getSalary()>o2.getSalary()) {
            return 1;
        }else if(o1.getSalary()<o2.getSalary()) {
            return -1;
        }else {
            if(o1.getName().compareTo(o2.getName())>0) {
                return 1;
            }else {
                return -1;
            }
        }
    }
}

class Teacher {
    private String name;
    private int salary;
    public Teacher() {
    }
    public Teacher(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
/*
class Teacher implements  Comparable<Teacher> {
    private String name;
    private int salary;
    public Teacher() {
    }
    public Teacher(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        if(salary != o.salary) {
            return salary - o.salary;
        }else {
            return name.compareTo(o.name);
        }
    }
}
 */

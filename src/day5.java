import java.util.Arrays;
import java.util.Scanner;

public class day5 {
    public static void main(String[] args) {
        task2();

    }
    public static void task1(){
        int arr[]=new int[9];
        Arrays.fill(arr,6);
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        arr[i-1]=i;
        print(arr);
    }
    public static void task2(){
        Student s[]=new Student[5];
        String name[]={"tom","jack","lily","Bob","alex"};
        int grade[]={79,87,90,88,90};
        Stuinit(s,name,grade);
        Student blow[]=new Student[5];
        int mean=0;
        for(int i=0;i<5;i++){
            mean+=s[i].getGrade();
        }
        mean/=name.length;
        int j=0;
        for(int i=0;i<s.length;i++){
            blow[j]=s[i];
            j++;
        }
        for(int i=0;i<blow.length;i++){
            System.out.println(blow[i]);
        }

    }
    public static void Stuinit(Student s[],String name[],int grade[]){
        for(int i=0;i<s.length;i++){
            s[i].setName(name[i]);
            s[i].setGrade(grade[i]);
        }
    }
    public static void print(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

class Student{
    private int id;
    private String name;
    private int grade;

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

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
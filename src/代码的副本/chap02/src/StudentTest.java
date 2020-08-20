package 代码的副本.chap02.src;

public class StudentTest {
	public static void main(String args[]) {
		Student s = new Student(1,"tom",20);
		Student s2 = new Student();
		s2.setId(2);
		s2.setName("jack");
		s2.setAge(30);
		s2.addBirthday();
		System.out.println(s.toString());
		System.out.println(s2);
	}
}
class Student {
	private int id;
	private String name;
	private int age;
	public Student(){}
	public Student(int id,String name,int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void addBirthday() {
		age++;
	}
	public String toString() {
		return "id:"+id+",name:"+name+",age:"+age;
	}
}

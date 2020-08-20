package ooad的副本.prototype;

import java.io.Serializable;

/**
 * 教师类<br>
 * 是一个原型类<br>
 * 可以通过这个类对象为原型，复制得到新的对象<Br>
 * 
 * */
public class TeacherPrototype {
	private int id;
	private String name;
	private Stu stu;
	
	public TeacherPrototype(int id, String name, Stu stu) {
		super();
		this.id = id;
		this.name = name;
		this.stu = stu;
	}

	public TeacherPrototype myclone(){
		return new TeacherPrototype(id,name,stu);
	}

	public String toString() {
		return "TeacherPrototype [id=" + id + ", name=" + name + ", stu=" + stu + "]";
	}
	
}
class Stu implements Serializable{
	
}
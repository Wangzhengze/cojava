package ooad的副本.prototype;
/**
 * 原型1测试
 * */
public class TeacherPrototypeTest {
	public static void main(String[] args) throws Exception {
		Stu stu = new Stu();
		//得到原型  t1
		TeacherPrototype t1 = new TeacherPrototype(21, "tom", stu);
		
		//使用原型创建其他对象
		TeacherPrototype t2 = t1.myclone();
		TeacherPrototype t3 = t1.myclone();
		TeacherPrototype t4 = t1.myclone();
		TeacherPrototype t5 = t1.myclone();
		System.out.println("--------"+t1);
		System.out.println("============"+t2);
		System.out.println("============"+t3);
		System.out.println("============"+t4);
		System.out.println("============"+t5);
		
	}
}

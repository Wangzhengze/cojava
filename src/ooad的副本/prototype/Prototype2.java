package ooad的副本.prototype;
/**
 * 原型类<Br>
 * 实现了Cloneable接口，就表示这个类对象可以调用Object类中的clone方法
 * */
public class Prototype2 implements Cloneable{
	private int id = 10;
	private String name = "tom";
	private Stu stu = new Stu();
	
	
	@Override
	public String toString() {
		return "Prototype2 [id=" + id + ", name=" + name + ", stu=" + stu + "]";
	}


	public static void main(String[] args) throws Exception {
		//因为Object没有实现Cloneable接口，所以不是Cloneable接口的实例对象
		//所以Object不能调用自己内部的Clone方法
		Object obj = new Object();
		
		System.out.println(obj instanceof Cloneable);
		
		Prototype2 p = new Prototype2();
		System.out.println(p instanceof Cloneable);
		//因为Prototype2实现了Cloneable接口，所以可以调用Object类中的clone方法
		
		Object clone = p.clone();
		System.out.println("原型:"+p);
		System.out.println("可log : "+clone);
	}
}

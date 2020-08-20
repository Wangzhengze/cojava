package ooad的副本.prototype;
/**
 * 浅复制
 * */
public class Prototype3 implements Cloneable{
	private int id = 10;
	private String name = "tom";
	private Stu stu = new Stu();
	/**
	 * 提供一个方法，方法名不重要，这个方法可以产生当前类对象<Br>
	 * */
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	
	
	
	//---测试代码---
	public static void main(String[] args) throws Exception {
		Prototype3 p = new Prototype3();
		Prototype3 p2 = (Prototype3) p.clone();
		System.out.println(p);
		System.out.println(p2);
	}
	@Override
	public String toString() {
		return "Prototype3 [id=" + id + ", name=" + name + ", stu=" + stu + "]";
	}
	
	
}

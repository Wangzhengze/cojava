package ooad的副本.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 深复制
 * */
public class Prototype4 implements Cloneable,Serializable{
	private int id = 10;
	private String name = "tom";
	private Stu stu = new Stu();
	/**
	 * 提供一个方法，方法名不重要，这个方法可以产生当前类对象<Br>
	 * */
	public Object clone() throws CloneNotSupportedException{
		
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(this);
			oos.flush();
			oos.close();
			byte[] buf = baos.toByteArray();
			baos.close();
			
			ByteArrayInputStream bais = new ByteArrayInputStream(buf);
			ObjectInputStream ois = new ObjectInputStream(bais);
			Object readObject = ois.readObject();
			return readObject;
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) throws Exception {
		Prototype4 p = new Prototype4();
		Object clone = p.clone();
		System.out.println(p);
		System.out.println(clone);
		
		
		
	}
	

	@Override
	public String toString() {
		return "Prototype3 [id=" + id + ", name=" + name + ", stu=" + stu + "]";
	}
	
	
}

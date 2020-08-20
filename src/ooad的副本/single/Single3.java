package ooad的副本.single;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

/**
 * 测试序列化 和 反序列化获得对象
 * */
public class Single3{
	public static void main(String[] args) throws Exception {
		SerObj o = new SerObj();
		
		//字节数组输出流<br>
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		//使用oos写出去的对象是写道了 baos中 也就是写道了字节数组中
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		
		oos.writeObject(o);
		oos.flush();
		oos.close();
		byte[] buf = baos.toByteArray();
		System.out.println("-------对象写出完成-------"+Arrays.toString(buf));
		
		ByteArrayInputStream bais = new ByteArrayInputStream(buf);
		ObjectInputStream ois  = new ObjectInputStream(bais);
		Object obj = ois.readObject();
		System.out.println("-----读取对象完成-----");
		System.out.println(o);
		System.out.println(obj);
		ois.close();
		bais.close();
		
		
		
		
		
		
		
		
		
		
		
	}
}
//用于序列化的对象
class SerObj implements Serializable{

	private static final long serialVersionUID = 5196490391678546413L;
	
}

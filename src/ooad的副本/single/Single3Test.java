package ooad的副本.single;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

/**
 * 解决序列化 和 反序列化产生的问题<Br>
 * */
public class Single3Test {
	public static void main(String[] args) throws Exception {
		SerObj2 o1 = SerObj2.getObj();
		
		//字节数组输出流<br>
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		//使用oos写出去的对象是写道了 baos中 也就是写道了字节数组中
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		
		oos.writeObject(o1);
		oos.flush();
		oos.close();
		byte[] buf = baos.toByteArray();
		System.out.println("-------对象写出完成-------"+Arrays.toString(buf));
		
		ByteArrayInputStream bais = new ByteArrayInputStream(buf);
		ObjectInputStream ois  = new ObjectInputStream(bais);
		Object obj = ois.readObject();
		System.out.println("-----读取对象完成-----");
		System.out.println(o1);
		System.out.println(obj);
		ois.close();
		bais.close();
	}
}
//该类对象 单例
class SerObj2 implements Serializable{
	private SerObj2(){}
	private static SerObj2 obj = new SerObj2();
	public static SerObj2 getObj(){
		return obj;
	}
	//反序列化的时候 ，获取的也是 上面声明的obj方法
	public Object readResolve() {
		return getObj();
	}
}

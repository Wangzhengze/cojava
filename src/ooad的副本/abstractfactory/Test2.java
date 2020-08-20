package ooad的副本.abstractfactory;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * 抽象工厂测试<Br>
 * */
public class Test2 {
	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		p.load(new FileInputStream("src/com/briup/ch2/create/abstractfactory/conf.properties"));
		String facotryClass = p.getProperty("factory");
		//工厂接口
		Product pro =(Product) Class.forName(facotryClass).newInstance();
		//使用者
		Student stu = new Student();
		stu.setSend(pro.produce());
		stu.show();
		
		
	}
}

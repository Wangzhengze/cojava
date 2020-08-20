package ooad的副本.single;

import java.lang.reflect.Constructor;

//测试类
public class Single1Test {
	public static void main(String[] args) throws Exception {
		//最原始情况
//		Single1 s1 = new Single1();
//		Single1 s2 = new Single1();
//		Single1 s3 = new Single1();
//		Single1 s4 = new Single1();
		//微调 Single1代码 
		//私有化构造器,上面代码都报错
		System.out.println(Single1.getObj());
		System.out.println(Single1.getObj());
		System.out.println(Single1.getObj());
		System.out.println(Single1.getObj());
		
		//---------------使用反射能调用到私有构造器 创建对象-----------
		Class<?> forName = Class.forName("com.briup.ch2.create.single.Single22");
		Constructor<?> constructor = forName.getDeclaredConstructor();
		constructor.setAccessible(true);
		System.out.println(constructor.newInstance().toString());
		System.out.println(constructor.newInstance().toString());
		System.out.println(constructor.newInstance().toString());
		System.out.println(constructor.newInstance().toString());
		
	}
}

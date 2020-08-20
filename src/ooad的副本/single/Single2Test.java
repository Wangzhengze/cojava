package ooad的副本.single;
//测试类
public class Single2Test {
	public static void main(String[] args) throws Exception {
		//最原始情况
//		Single1 s1 = new Single1();
//		Single1 s2 = new Single1();
//		Single1 s3 = new Single1();
//		Single1 s4 = new Single1();
		//微调 Single1代码 
		//私有化构造器,上面代码都报错
		System.out.println(Single2.getObj());
		System.out.println(Single2.getObj());
		System.out.println(Single2.getObj());
		System.out.println(Single2.getObj());
		
	}
}

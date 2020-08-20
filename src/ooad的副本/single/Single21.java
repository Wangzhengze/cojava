package ooad的副本.single;
/**
 * 单例<Br>
 * 感受 饿汉式<br>
 * 微调 饿汉式<br>
 * new 对象 不是一个原子操作<br>
 * */
public class Single21 {
	
	private Single21(){}
	/**
	 * 使用静态内部类<br>
	 * 把new对象的非原子操作<Br>
	 * 整理到 类加载的单线程操作中<br>
	 * */
	public static class SL{
		static Single21 sin = new Single21();
	}
	
	public static Single21 getObj(){
		return SL.sin;
	}
}

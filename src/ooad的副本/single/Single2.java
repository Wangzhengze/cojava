package ooad的副本.single;
/**
 * 单例<Br>
 * 感受 饿汉式
 * */
public class Single2 {
	
	private Single2(){}
	
	static Single2 sin = new Single2();
	
	public static Single2 getObj(){
		return sin;
	}
}

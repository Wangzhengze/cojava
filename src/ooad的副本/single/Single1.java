package ooad的副本.single;
/**
 * 单例<Br>
 * 感受 懒汉式
 * */
public class Single1 {
	
	private Single1(){}
	
	static Single1 sin;
	
	public static Single1 getObj(){
		if(sin==null){
			sin = new Single1();
		}
		return sin;
		
	}
}

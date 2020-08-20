package ooad的副本.single;
/**
 * 微调懒汉式<Br>
 * 多线程可使用
 * */
public class Single11 {
	
	public static Single11 sin;
	
	public static synchronized Single11 getObj(){
		if(sin==null){
			sin = new Single11();
		}
		return sin;
	}
}

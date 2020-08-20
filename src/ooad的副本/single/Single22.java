package ooad的副本.single;
/**
 * 反射获得对象 处理<br>
 * */
public class Single22 {
	
	private Single22(){
		if(sin!=null){
			throw new NullPointerException("....null....");
		}
	}
	
	static Single22 sin = new Single22();
	
	public static Single22 getObj(){
		return sin;
	}
}

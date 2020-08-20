package ooad的副本.single;
/**
 * 微调懒汉式<Br>
 * 多线程可使用<br>
 * 微调锁的代码<Br>
 * */
public class Single12 {
	
	public static Single12 sin ;
	
	public static Single12 getObj(){
		if(sin==null){
			synchronized (Single12.class) {
				if(sin==null){
					sin = new Single12();
				}
			}
		}
		return sin;
	}
}

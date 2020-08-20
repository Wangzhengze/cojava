package ooad的副本.factory;
/**
 * 静态工厂<br>
 * */
public class Factory4 {
	public static Send getObj(){
		return new SmsSend();
	}
}

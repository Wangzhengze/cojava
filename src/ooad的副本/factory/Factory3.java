package ooad的副本.factory;
/**
 * 工厂继续微调<Br>
 * 解决 一个工厂要返回多个Send实例对象的问题<br>
 * 解决 用户传入参数错误的问题<br>
 * 	<li>无参
 *  <li>枚举
 * 
 * */
public class Factory3 {
	//有参数，为枚举类型，解决以上问题
	public Send getObj1(Me m){
		switch (m) {
		case EMAIL:
			return new EMainSend();
		case SMS:
			return new SmsSend();
		case T:
			return new TTTSend();
		default:
			return null;
		}
	}
	//-----------------------------
	//使用无参方法 解决以上问题
	public Send getSMS(){
		return new SmsSend();
	}
	public Send getEMail(){
		return new EMainSend();
	}
	public Send getTTT(){
		return new TTTSend();
	}
	
	
	
}
enum Me{
	EMAIL,SMS,T;
	
}

package ooad的副本.factory;
/**
 * 对工厂微调<br>
 * 增强
 * */
public class Factory2 {
	
	public Send getObj(int n){
		switch (n) {
		case 1:
			return new EMainSend();
		case 2:
			return new SmsSend();
		case 3:
			return new TTTSend();
		default:
			System.err.println("没有这个选项,默认返回EMainSend");
			return new EMainSend();
		}
	}
}

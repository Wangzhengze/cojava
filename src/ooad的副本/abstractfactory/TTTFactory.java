package ooad的副本.abstractfactory;
/**
 * 新加一个工厂
 * */
public class TTTFactory implements Product{
	@Override
	public Send produce() {
		return new TTTSend();
	}
}

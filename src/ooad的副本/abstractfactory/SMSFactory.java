package ooad的副本.abstractfactory;
/**
 * 发短信的工厂
 * */
public class SMSFactory implements Product{

	@Override
	public Send produce() {
		return new SmsSend();
	}
	

}

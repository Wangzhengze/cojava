package ooad的副本.abstractfactory;
/**
 * 发邮件工厂类<Br>
 * */
public class EMailFactory implements Product{

	@Override
	public Send produce() {
		return new EMainSend();
	}
	
	
}

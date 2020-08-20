package ooad的副本.factory;
/**
 * 短信发送
 * */
public class SmsSend implements Send{

	@Override
	public void send() {
		System.out.println("发送短信");
		
	}
}

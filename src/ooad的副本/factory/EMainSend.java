package ooad的副本.factory;
/**
 * 发送邮件
 * */
public class EMainSend implements Send{
	@Override
	public void send() {
		System.out.println("邮件发送成功");
	}
}

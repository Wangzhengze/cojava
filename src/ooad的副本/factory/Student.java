package ooad的副本.factory;
/**
 * 学生
 * */
public class Student {
	private Send send;
	
	public void show(){
		System.out.println("----开始表演 ----");
		send.send();
	}
	
	public void setSend(Send  s){
		send = s;
	}
	//------------------------
	
	/*public EMainSend  es;
	public void sss(){
		System.out.println("----开始表演 ----");
		es.send();
	}*/
}

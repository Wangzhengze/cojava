package ooad的副本.factory;
/**
 * 测试工厂模式<br>
 * */
public class Test1 {
	public static void main(String[] args) throws Exception {
		//原始
		
		Send s = new EMainSend();
		Student stu = new Student();
		stu.setSend(s);
		
		stu.show();
		//新
		
		Factory f = new Factory();
		Send s2 =  f.getObj();
		Student stu2 = new Student();
		stu2.setSend(s2);
		
		stu2.show();
		
		//--------------工厂微调---------------
		System.out.println("增强了功能，一个工厂对象可以获得多个Send的实例对象");
		//这样增强以后，也有问题，用户在传入参数的时候，会手抖。写错。
		Factory2 f22 = new Factory2();
		Send s22 = f22.getObj(10);
		Send s23 = f22.getObj(1);
		Send s24 = f22.getObj(22);
		Send s25 = f22.getObj(2);
		Send s26 = f22.getObj(21);
		s22.send();
		s23.send();
		s24.send();
		s25.send();
		s26.send();
		
		System.out.println("-----------=====----------------");
		//-----------------工厂继续微调--------------
		Factory3 f3 = new Factory3();
		//本次 微调 解决方案一测试
		Send obj1 = f3.getObj1(Me.EMAIL);
		Send obj12 = f3.getObj1(Me.SMS);
		Send obj13 = f3.getObj1(Me.T);
		
		obj1.send();
		obj12.send();
		obj13.send();
		
		//本次微调 解决方案二测试
		Send eMail = f3.getEMail();
		Send sms = f3.getSMS();
		Send ttt = f3.getTTT();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}

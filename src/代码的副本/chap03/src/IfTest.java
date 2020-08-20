package 代码的副本.chap03.src;

public class IfTest {
	public static void main(String args[]) {
		/*
		int a =10,b=20,c=30;
		if(a<b) 
			//System.out.println("a<b");
			 * IfTest test;
			 * test = new IfTest();
			IfTest test = new IfTest();
		}else if(a<c) 
			System.out.println("a<c");
		else if(b<c) 
			System.out.println("b<c");
		else 
			System.out.println("else");
		*/
		int time = Integer.parseInt(args[0]);
		int year = Integer.parseInt(args[1]);
		IfTest test = new IfTest();
		String msg = test.sayHello(time);
		String msg2 = test.isLeapYear(year);
		System.out.println("msg:"+msg);
		System.out.println("year:"+msg2);
	}
	public String sayHello(int hour) {
		String msg;
		if(hour >= 0 && hour < 12) {
			return	"good morning";		
		}else if(hour >= 12 && hour < 14) {
			return "good noon";
		}else if(hour >= 14 && hour < 18) {
			return "good afternoon";
		}else {
			return "good evening";
		}
	}
	public String isLeapYear(int year) {
		if((year%4==0 && year%100!=0) || (year%400==0)){
			return "leapYear";		
		}else {
			return "year";
		}
	}
}











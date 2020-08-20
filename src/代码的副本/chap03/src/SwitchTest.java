package 代码的副本.chap03.src;

public class SwitchTest {
	public static void main(String args[]) {
		//int num = 0;
		//byte num = 0;
		//short num = 0;
		//char num = 0;
		//float num = 0;
		//double num = 0;
		//long num = 0;
		//boolean num = true;
		/*
		String num = "0";
		switch(num) {
			case "0": {
				System.out.println("0");
				break;
			}
			case "1": {
				System.out.println("1");
				break;
			}
			default: {
				System.out.println("default");
				break;
			}
		}
		*/
		SwitchTest test = new SwitchTest();
		int day = Integer.parseInt(args[0]);
		String msg = test.getWeek(day);
		System.out.println("msg:"+msg);
	}
	public String getWeek(int day) {
		String msg = "";
		switch(day) {
			case 0: {
				msg = "Sunday";
				break;
			}
			case 1: {
				msg = "Monday";
				break;
			}
			case 2: {
				msg = "Tuesday";
				break;
			}
			case 3: {
				msg = "Wednesday";
				break;
			}
			case 4: {
				msg = "Thursday";
				break;
			}
			case 5: {
				msg = "Friday";
				break;
			}
			case 6: {
				msg = "Saturday";
				break;
			}
			default: {
				msg = "error";
				break;
			}
		}
		return msg;
	}
}









package 代码的副本.chap03.src;

public class LoopTest {
	public static void main(String args[]) {
		int sum = 0;
		int i = 100;
		/*
		for(;i<100;i++) {
			sum+=i;
		}
		*/
		/*
		while(i<100) {
			//i++;//1+....+100
			sum+=i;
			i++;//0+....+99
		}
		*/
		/*
		do {
			i++;
			sum+=i;
		}while(i<100);
		System.out.println("sum:"+sum);
		*/
		LoopTest test = new LoopTest();
		test.get99();
	}
	public void get99() {
		int tmp;
		for(int j=1;j<10;j++) {
			for(int i=1;i<=j;i++) {
				tmp = i * j;
				System.out.print(i+"*"+j);
				if(tmp >= 10) {
					System.out.print("="+tmp+" ");
				}else {
					System.out.print("= "+tmp+" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}
}












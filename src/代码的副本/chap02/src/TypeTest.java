package 代码的副本.chap02.src;

public class TypeTest {
	final static int A = 10;//interface
	public static void main(String args[]) {
		//final static int A = 10;
		//A = 20;
		System.out.println("A:"+A);
		String s = "china";
		String s2 = "china";
		String ss = new String("china");
		String ss2 = new String("china");
		String ss3 = ss;
		System.out.println(s == s2);
		System.out.println(ss == ss2);
		System.out.println(ss3 == ss);
		/*
		float f = (float)10.0;
		float f2 = 10.0f;
		float f3 = (float)(0.0/0.0);
		float f4 = (float)(1.0/0.0);
		float f5 = (float)(-1.0/0.0);
		double d = 10.0;
		double d2 = 10.0d;
		double d3 = 10E+3;
		double d4 = 10E-4;
		System.out.println("f:"+f);
		System.out.println("f2:"+f2);
		System.out.println("f3:"+f3);
		System.out.println("f4:"+f4);
		System.out.println("f5:"+f5);
		System.out.println("d:"+d);
		System.out.println("d2:"+d2);
		System.out.println("d3:"+d3);
		System.out.println("d4:"+d4);
		String s = "123";
		//String s2 = "tom";
		int a = Integer.parseInt(s);
		//int b = Integer.parseInt(s2);
		System.out.println("a:"+a);
		byte b = (byte)130;
		System.out.println("b:"+b);
		int a1 = 10;
		int a2 = 010;
		int a3 = 0x10;
		long l = 100l;
		long l2 = 100L;
		System.out.println("a1:"+a1);
		System.out.println("a2:"+a2);
		System.out.println("a3:"+a3);
		System.out.println("l:"+l);
		System.out.println("l2:"+l2);
		String s1 = Integer.toHexString(10);
		String s2 = Integer.toBinaryString(10);
		String s3 = Integer.toOctalString(10);
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		System.out.println("s3:"+s3);
		int a4 = Integer.valueOf("0101",2);
		int a5 = Integer.valueOf("ff",16);
		int a6 = Integer.valueOf("10",8);
		System.out.println("a4:"+a4);
		System.out.println("a5:"+a5);
		System.out.println("a6:"+a6);
		boolean flag = true;
		System.out.println("flag:"+flag);
		char a = 'a';
		char a2 = '\u0061';
		char a3 = 0x0061;
		char a4 = 97;
		System.out.println("a:"+a);
		System.out.println("a2:"+a2);
		System.out.println("a3:"+a3);
		System.out.println("a4:"+a4);
		char a5 = '\'';
		char a6 = '\\';
		System.out.println("a5:"+a5);
		System.out.println("a6:"+a6);
		char a7 = '\n';
		char a8 = '\t';
		System.out.print("a7:"+a7);
		System.out.println(a8+"a8:");
		*/
	}
}

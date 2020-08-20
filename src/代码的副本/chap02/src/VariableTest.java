package 代码的副本.chap02.src;

public class VariableTest {
	boolean flag;
	int a;
	byte b;
	char c;
	short s;
	float f;
	long l;
	double d;
	String str;
	public static void main(String args[]) {
		VariableTest vt = new VariableTest();
		System.out.println("boolean:"+vt.flag);
		System.out.println("int:"+vt.a);
		System.out.println("byte:"+vt.b);
		System.out.println("char:"+vt.c);
		System.out.println("short:"+vt.s);
		System.out.println("float:"+vt.f);
		System.out.println("long:"+vt.l);
		System.out.println("double:"+vt.d);
		System.out.println("String:"+vt.str);
		vt.test(10);
		System.out.println(args[0]);
	}
	public void test(int args) {
		a = 10;
		boolean flag2 = false;
		System.out.println("test a:"+a);
		System.out.println("test flag2:"+flag2);
		{
			flag2 = true;
			String str2 = "china";
			System.out.println("block flag2:"+flag2);
		}
		//System.out.println("out block str2:"+str2);
		System.out.println("test args:"+args);
	}
}

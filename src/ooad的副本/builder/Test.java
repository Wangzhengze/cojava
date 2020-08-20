package ooad的副本.builder;

public class Test {
	public static void main(String[] args) {
		
		
		//创建联想电脑
		ComputerBuilder cb = new LenoveComputerBuilder();
		cb.buildCPU();
		cb.buildMainboard();
		cb.buildMemory();
		Computer computer = cb.getComputer();
		System.out.println(computer);
		//--------------------------------------
		//微调
		Director d = new Director(cb);
		d.construct();
		Computer computer2 = cb.getComputer();
		System.out.println(computer2);
	}
}	

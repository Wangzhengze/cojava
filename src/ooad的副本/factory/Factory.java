package ooad的副本.factory;
/**
 * 工厂:用来产生对象 
 * */
public class Factory {
	public Send getObj(){
		return new TTTSend();
	}
}

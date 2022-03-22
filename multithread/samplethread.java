package multithread;

public class samplethread {
	public static void main(String[] args) {
		System.out.println("main starts");
		MyCharThread CharThread=new MyCharThread();
		MyIntThread IntegerThread=new MyIntThread();
		CharThread.start();
		IntegerThread.start();
		System.out.println("main ends");
		
	}

}

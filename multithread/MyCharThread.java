package multithread;

public class MyCharThread extends Thread {

	@Override
	public void run() {
		for(char i='a';i<'z';i++) {
			System.out.println(i);
		}
	}

}

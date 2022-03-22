package multithread1;

public class ReadThread implements Runnable{

	@Override
	public void run() {
		for(char i='a';i<'z';i++) {
			System.out.println(i);
		}
		
	}
	

}

package Interface;

public class Exception {
	public static void m1() {
		int a=10/0;
	}
	public static void m2() {
		m1();
	}
	public static void m3()
	{
		m2();
	}
	public static void m4() {
		m3();
	}

	public static void main(String[] args) {
		try {
			m4();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		}
	}


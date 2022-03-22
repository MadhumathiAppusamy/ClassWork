package Pridicate;

import java.util.function.Function;

public class Application3 {

	public static void main(String[] args) {
		Function<Integer,Integer> function=i->i*i;{
			System.out.println("function is:"+function.apply(10));
		}

	}

}

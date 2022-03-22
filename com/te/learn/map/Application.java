package com.te.learn.map;

import java.util.function.Predicate;

public class Application {

	public static void main(String[] args) {
	Predicate<Integer> predict= i->{
		if(i%2==0) 
			return true;
		    return false;
	};
    Predicate<Integer> predicate2=new Predicate<Integer>() {

		@Override
		public boolean test(Integer t) {
			if(t%5==0) 
				return true;
			return false;
		}
	
		
	};   
int num=2;
	System.out.println("is even?"+predict.test(num));

}
}
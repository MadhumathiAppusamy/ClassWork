package linkedlist;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet();
		set.add(2);
		set.add(5);
		set.add(8);
		set.add(5);
		for(int in :set)
		{
			System.out.println( in);
		}

	}

}

package com.te.learn;

public class Buffer {

	public static void main(String[] args) {
		StringBuffer a= new StringBuffer ("MADHU");
		a.append("MATHI");
		System.out.println(a);
		a.insert(5,"hello");
		System.out.println(a);
        a.replace(1,8,"hi");
        System.out.println(a);
	}

}

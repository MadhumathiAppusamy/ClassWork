package com.te.learn;

public abstract class Java10 {
	int a=10;
	int b=10;
	Java10(){}
		System.out.println("static multiline initialiser!");
	}
	{
	
		System.out.println("non static multiline initialiser!");

	}


public static void main(String[] args) {
	Java10 a=new Java10();
	a.name();	
}}

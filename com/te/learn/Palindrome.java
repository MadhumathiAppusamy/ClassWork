package com.te.learn;
import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		int rev=0,rem,value,num;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number:");
		value=sc.nextInt();
		num=value;
		while(value!=0)
		{
			rem = value % 10 ;
			rev = rev * 10 + rem;
			value = value / 10;
			
		}
		if(num == rev) {
			System.out.println(+num+"is a palindrome");
		}
		else {
				System.out.println(+num+"is not a palindrome");
		}
	}

}

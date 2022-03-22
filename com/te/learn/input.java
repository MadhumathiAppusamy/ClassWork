package com.te.learn;
import java.util.Scanner;
public class input {

	public static void main(String[] args) {
		boolean exit=false;
		Scanner scanner=new Scanner(System.in);
		do {
			System.out.println("===calculator===");
			System.out.println("select the option to calculate");
			System.out.println("1.Add");
			System.out.println("2.substract");
			System.out.println("3.Mul");
			System.out.println("4.div");
			System.out.println("5.Exit");
			System.out.println("Enter the option number:");
			int option=scanner.nextInt();
			switch(option)
			{
			case1:calculator.add(int a,b);
			break;
			case2:calculator.sub(int a,b);
			break;
			case3:calculator.mul(int a,b);
			break;
			case4:calculator.div(int a,b);
			break;
			case5:exit
			}
		}
		
		

	}

}

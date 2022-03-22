package com.te.learn;
import java.util.Scanner;


public class Calci {

	public static void main(String[] args) {
		boolean exit=false;
		Scanner sc= new Scanner (System.in);
		
		do {
			 System.out.println("====calculator=====");
			 System.out.println("enter the option to calculate");
			 System.out.println("1.Add");
			 System.out.println("2.Substract");
			 System.out.println("3.Multiplication");
			 System.out.println("4.divide");
			 System.out.println("5. Exit");
			
			 int option=sc.nextInt();
		
		 switch(option) {
			 
			 case 1:
			 {
				 System.out.println("enter the first num");
				 int a=sc.nextInt();
				 System.out.println("enter the second num");
				 int b=sc.nextInt();
				int sum=Calculator.add(a, b);
				 System.out.println("res"+ sum);
				 break;
			 }
			 
			 case 2:
			 {
				 System.out.println("enter the first num");
				 int a=sc.nextInt();
				 System.out.println("enter the second num");
				 int b=sc.nextInt();
				 int sub=Calculator.sub(a, b);
				 System.out.println("res"+ sub);
				 break;
			 }
			 
			 case 3:
			 {
				 System.out.println("enter the first num");
				 int a=sc.nextInt();
				 System.out.println("enter the second num");
				 int b=sc.nextInt();
				int mul=Calculator.mul(a, b);
				 System.out.println("res"+ mul);
				 break;
			 }
			 
			 case 4:
			 {
				 System.out.println("enter the first num");
			 int a=sc.nextInt();
			 System.out.println("enter the second num");
			 int b=sc.nextInt();
			 int div=Calculator.div(a, b);
			 System.out.println("res"+ div);
			 break;
			 
			 }
			 case 5:{
				 System.out.println("System exited");
				 System.exit(0);
				 
			 }
			 
			 default:
			 {
				 System.out.println("option invalid");
			 }
				 
			 }
		} 
			 
			 
			 while(exit);
			 
			 
			 }
		

}

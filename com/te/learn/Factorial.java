package com.te.learn;
import java.util.*;
public class Factorial {
	
	     public static void main(String []args)
	     {
	      
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the number: ");
	        int num=sc.nextInt();
	        int i,fact=1;
	        for(i=1;i<=num;i++)
	        {
	            fact=fact*i;
	        }
	        System.out.println("Factorial of the number: "+fact);  
	     }   
	}
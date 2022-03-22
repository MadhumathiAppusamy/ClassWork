package com.te.learn;

public class Jav8a {
	public static void main(String[] args) {

int a=10;
int b=11;
int c=12;
int d=13;
int e=14;
int res=((a>b&&a>c&&a>d&&a>e)?a:(b>c&&b>d&&b>e)?b:(c>d&&c>e)?c:(d>e)?d:e);
System.out.println("result:"+res);

	}

}
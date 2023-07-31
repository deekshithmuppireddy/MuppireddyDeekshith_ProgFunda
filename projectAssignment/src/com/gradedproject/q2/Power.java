package com.gradedproject.q2;

import java.util.Scanner;
public class Power {
	int result;
	int method(int x,int n) {
		if(n==0)
			return 1;
		else
			result = x*method(x,n-1);
			return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Power obj = new Power();
		
		System.out.println("Enter the base number X: ");
		int x = sc.nextInt();
		System.out.println("Enter the power N : ");
		int n = sc.nextInt();
	
		System.out.println("x power N is : "+ obj.method(x,n));
	}
}

package com.gurkul.day1;

import java.util.Scanner;

public class ReverseSum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any three digit no: ");
		int num = sc.nextInt();
		
		int digit1, digit2, digit3, reverse, sum, sd;
		digit1 = num%10;
		digit2 = (num/10)%10;
		digit3 = num/100;
		
		reverse = digit1*100 + digit2*10 + digit3;
		sd = digit1 + digit2 + digit3;
		sum = reverse + num;
		
		System.out.println("After Revrsing digit is:  " + reverse);
		System.out.println("Sum of digit is:  " + sd);
		System.out.println("Sum of revrse and digit is:  " + sum);
		
		
	}
	
}

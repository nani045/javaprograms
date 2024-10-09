package com.dest.collectionframework.arraylist;

import java.util.Scanner;

public class palindromeCode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the string: ");
		String s1 = sc.next();
		String s2 = "";
		for (int i=s1.length()-1;i>=0;i--) {
			s2 = s2 + s1.charAt(i);
		}
		if(s1.equals(s2)==true) {
			System.out.println("The given string is palindrome");

		}
		else {
			System.out.println("The given string is not palindrome");
		}
	}
}
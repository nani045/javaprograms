package com.dest.collectionframework.arraylist;

public class stringCode3 {
	public static void main(String[] args) {
		String s1 = new String("rama");
		System.out.println(s1);
		String s2 = new String("rama");
		System.out.println(s2);
		if(s1.equals(s2)==true) {
			System.out.println("Strings are equal");

		}
		else {
			System.out.println("Strings are not equal");
		}
		if(s1==s2) {
			System.out.println("Address are equal");
		}
		else {
			System.out.println("Address are not equal");
		}
	}
}

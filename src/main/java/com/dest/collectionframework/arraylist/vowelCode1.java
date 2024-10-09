package com.dest.collectionframework.arraylist;

import java.util.Scanner;

class countVowelConsonant {
	Scanner sc = new Scanner(System.in);
	void countvowelcon(String s) {
		int vowel_count = 0;
		int consonant_count = 0;
System.out.println("Calculating the vowels and consonants :");		
		for(int i =0 ; i<s.length(); i ++) {
			if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u' ||
					s.charAt(i)=='A' ||s.charAt(i)=='E' ||s.charAt(i)=='I' ||s.charAt(i)=='O' ||s.charAt(i)=='U') {
				vowel_count++;
			}
			else {
				consonant_count++;
			}
		}
		System.out.println("The vowel count is "+vowel_count);
		System.out.println("The consonant count is "+consonant_count);
	}
	
}
public class vowelCode1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string value :");
		String s = sc.nextLine();
		countVowelConsonant cv = new countVowelConsonant();
		cv.countvowelcon(s);	
	}
}

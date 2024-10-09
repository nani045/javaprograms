package com.dest.StringsOperatoins;

import java.util.Scanner;
                                      
public class reverseStringWordWise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		//count the words
		int spc=0;
		for (int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ' ' && str.charAt(i+1) != ' ') {
				spc++;
			}
		}
		int word_count = spc+1;
		//create an array that matches the count of words
		String arr[] = new String[word_count];
		//create a variable that stores the last position of the array
		int temp = arr.length-1;
		//To store the result, create a empty string
		String temp_string = "";
		//loop the string in reverse direction
		for (int i=str.length()-1; i>=0; i--) {
			if(str.charAt(i) != ' ') {//if it is a word
				temp_string = temp_string + str.charAt(i);
			}else {//if space occur then store the result in the array last position
				arr[temp] = temp_string;
				temp--;
				temp_string = "";
			}
		}
		//To store the last loop result
		arr[temp] = temp_string;
		//printing the reversed string array
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}
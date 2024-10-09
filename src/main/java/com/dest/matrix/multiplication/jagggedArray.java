
package com.dest.matrix.multiplication;

import java.util.Scanner;

class Array2dops1 {
	String arr[][];
	int cls ;
	int stu;
	Scanner sc = new Scanner(System.in);
	void creatArray() {
		System.out.println("Array creation is started...");
		System.out.println("Enter the class count : ");
		cls = sc.nextInt();
		System.out.println("Enter the student count");
		stu = sc.nextInt();		
		arr = new String[cls][stu];
		System.out.println("Array is created ");
	}
	void collectingData() {
		System.out.println("Colleting the Student Data");
		for ( int i = 0; i <arr.length; i++) {
			System.out.println("Enter the student count inside the class no :" +(i+1));
			stu = sc.nextInt();
			arr[i] = new String[stu];
			for( int j =0 ; j<arr[i].length; j++) {
				System.out.println("Enter the name of the student " + (j+1));
				arr[i][j]= sc.next();
			}
		}
		System.out.println("Array data is collected...");
	}
	void displayData() {
		System.out.println("Displaying the Student Data");
		for ( int i = 0; i <arr.length; i++) {
			System.out.println("The student count inside the class no :" +(i+1));
			stu = sc.nextInt();
			arr[i] = new String[stu];
			for( int j =0 ; j<arr[i].length; j++) {
				System.out.println("The name of the student " + (j+1) +"is = " +arr[i][j]);
			}
		}
		System.out.println();
	}
}
public class jagggedArray {
public static void main(String[] args) {
	Array2dops1 ao = new Array2dops1 ();
	ao.creatArray();
	ao.collectingData();
	ao.displayData();
}
}

package com.dest.matrix.multiplication;

import java.util.Scanner;

class Array2dops {
	String arr[][];
	int size;
	Scanner sc = new Scanner(System.in);
	private int stu;
	private int cls;
	public void creatArray() {
		System.out.println("Array created ");
		System.out.println("Enter the class count ");
		cls = sc.nextInt();
		System.out.println("Enter the student count");
		stu = sc.nextInt();
		arr = new String[cls][stu];
		System.out.println("Array is created ");
		System.out.println("========");
		}
	public void collectData() {
		System.out.println("Collection the student Data ");
		for(int i = 0 ; i <arr.length; i++) {
			System.out.println("INside the class no :" +(i+1));
			for ( int j= 0 ; j<arr[i].length;j++) {
				System.out.println("Enter the name of student "+(j+1));
				arr[i][j] = sc.next();
				
			}
		}
		System.out.println("Arraay data is collected...");
		System.out.println("=========]");
	}
	public void displayData() {
		System.out.println("Displaying the student data");
		for(int i = 0 ; i <arr.length; i++) {
			System.out.println("INside the class no :" +(i+1));
			for ( int j= 0 ; j<arr[i].length;j++) {
				System.out.println("Enter the name of student no "+(j+1)+ "is = "+arr[i][j]);
			}
		}
		System.out.println("========");
	}
}
public class Array2d {
	public static void main(String[] args) {
		Array2dops a = new Array2dops();
		a.creatArray();
		a.collectData();
		a.displayData();
	}

}

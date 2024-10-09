package com.dest.matrix.multiplication;

import java.util.Scanner;
class Array3dops{
	String arr[][][];
	int size;
	Scanner sc = new Scanner(System.in);
	int clg;
	int cls;
	int stu;
	
 void creatArray() {
		System.out.println("Array created ");
		System.out.println("Enter the college count ");
		clg = sc.nextInt();
		System.out.println("Enter the class count");
		cls = sc.nextInt();
		System.out.println("Enter the student count");
		stu = sc.nextInt();
		arr = new String [clg][cls][stu];
		System.out.println("Array is created ");
		System.out.println("========");
	}
	public void collectData() {
		System.out.println("Collection the student Data ");
		for(int i = 0 ; i <arr.length; i++) {
			System.out.println("Inside the college no :" +(i+1));
			for(int j = 0 ; j <arr[i].length; j++) {
				System.out.println("Inside the class no :" +(j+1));
				for ( int k= 0 ; k<arr[i][j].length;k++) {
					System.out.println("Enter the marks of student "+(k+1));
					arr[i][j][k]= sc.next();
				}
			}
		}
		System.out.println("Arraay data is collected...");
		System.out.println("=========]");
	}
	public	void displayData() {
		System.out.println("Displaying the student data");
		for(int i = 0 ; i <arr.length; i++) {
			System.out.println("Inside the college no :" +(i+1));
			for(int j = 0 ; j <arr[i].length; j++) {
				System.out.println("Inside the class no :" +(j+1));
				for ( int k= 0 ; k<arr[i][j].length;k++) {
					System.out.println("The Marks of student "+(k+1) + "is = "+arr[i][j][k]);
				}
			}
		}

	}

}
public class Array3d{
	public static void main(String[] args) {
		Array3dops a = new Array3dops();
		a.creatArray();
		a.collectData();
		a.displayData();
	}
}
package com.dest.matrix.multiplication;

import java.util.Scanner;

class ArrayOperation{
	int arr[];
	int size;
	Scanner sc = new Scanner(System.in);
	void createArray() {
		System.out.println("Array creation is started");
		System.out.println("Enter the array size to collect the student marks");
		size = sc.nextInt();
		arr = new int[size];
		System.out.println("Array is created");
		System.out.println("=========");
	}

	void addData() {
		System.out.println("Collection of student marks");
		for(int i=0;i<size;i++) {
			System.out.println("Enter the marks of student number:" +(i+1));
			arr[i] = sc.nextInt();
		}
		System.out.println("The student data is collected");
		System.out.println("========");
	}
	void displayData() {
		System.out.println("Displaying the marks of student:");
		for(int i=0;i<size;i++) {
			System.out.println("The marks of student is ="+arr[i]);
		}
		System.out.println("======");
	}
}
public class Array1d {
	public static void main(String[] args) {
		ArrayOperation ao1 = new ArrayOperation();
		ao1.createArray();
		ao1.addData();
		ao1.displayData();
	}
}

package com.dest.matrix.multiplication;
import java.util.Scanner;

class MatrixOps {
	int mat1[][];
	int mat2[][];
	int res[][];
	int size;
	Scanner sc = new Scanner(System.in);

	void createMatrix() {
		System.out.println("Creating the matrix...");
		System.out.println("Enter the size of matrix: ");
		size = sc.nextInt();
		mat1 = new int[size][size];
		mat2 = new int[size][size];
		res = new int[size][size];
		System.out.println("Matrix - 1 and Matrix - 2 have been created.");
		System.out.println("===========");
	}

	void collectDataForFirstMatrix() {
		System.out.println("Collecting the data for the first matrix: ");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.println("Enter value for First matrix");
				mat1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix - 1 data is collected.");
		System.out.println("===========");
	}

	void collectDataForSecondMatrix() {
		System.out.println("Collecting the data for the second matrix: ");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.println("Enter value for Second matrix ");
				mat2[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix - 2 data is collected.");
		System.out.println("===========");
	}

	void multiplication() {
		System.out.println("Performing matrix multiplication...");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				res[i][j] = 0;
				for (int k = 0; k < size; k++) {
					res[i][j] += mat1[i][k] * mat2[k][j]; 
				}
			}
		}
		System.out.println("Matrix multiplication is completed.");
		System.out.println("===========");
	}

	void display() {
		System.out.println("Resultant matrix after multiplication:");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
	}
}


public class multiplication {
	public static void main(String[] args) {
		MatrixOps mo = new MatrixOps();
		mo.createMatrix();
		mo.collectDataForFirstMatrix();
		mo.collectDataForSecondMatrix();
		mo.multiplication();
		mo.display();
	}

}

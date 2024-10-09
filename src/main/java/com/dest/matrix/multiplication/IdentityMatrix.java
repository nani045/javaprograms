package com.dest.matrix.multiplication;
import java.util.Scanner;

class MatrixOps1 {
	int mat1[][];
	int size;
	Scanner sc = new Scanner(System.in);

	void createMatrix() {
		System.out.println("Enter the size of matrix: ");
		size = sc.nextInt();
		mat1 = new int[size][size];
	}

	void collecttMatrixData() {
		System.out.println("Collecting the data for the first matrix: ");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print("Enter value for First matrix");
				mat1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix - 1 data is collected.");
		System.out.println("===========");
	}
	void checkingForIdentityMatrix() {
		System.out.println("CHecking The Given Data is Identity Matrix or not ");
		for (int i=0;i<size;i++) {
			for (int j=0;j<size;j++) {
				if (i==j) {
					if(mat1[i][j]!=1) {
						System.out.println("The given Matrix is Identity ");
						System.exit(0);
					}
				}
				else {
					if(mat1[i][j]!=0) {
						System.out.println("the given matrix is not identity matrix");
						System.exit(0);
					}
				}
			}
		}
		System.out.println("the given matrix is an identity matrix");
		System.exit(0);
	}
}
public class IdentityMatrix {
	public static void main(String[] args) {
		MatrixOps1 mo = new MatrixOps1();
		mo.createMatrix();
		mo.collecttMatrixData();
		mo.checkingForIdentityMatrix();
	}

}

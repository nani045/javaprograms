package com.dest.alphabets;
class Calculator{
	int add(int a, int b) {
		return a+b;
	}
	int add(int a, int b, int c) {
		return a+b+c;
	}
	float add(float a, float b) {
		return a+b;
	}
	float add(float a, float b, float c) {
		return a+b+c;
	}
	double add(double a ,double b) {
		return a+b;
	}
	double add(double a ,double b, double c) {
		return a+b+c;
	}
	float add(int a, float b) {
		return a+b;
	}
	float add(float a, int b) {
		return a+b;
	}
	double add(int a, float b, double c) {
		return a+b+c;
	}
}
public class methodOverloading {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.add(3,6));
		System.out.println(c.add( 9, 8, 7));
		System.out.println(c.add(10.5f, 9.21f));
		System.out.println(c.add(10.5, 21.6, 31.10));
		System.out.println(c.add(2543.6678, 4567.4321));
		System.out.println(c.add(123.456, 456.789, 789.123));
		System.out.println(c.add(7, 10.3f));
		System.out.println(c.add(10.7f, 7));
		System.out.println(c.add(7, 10.5f, 432.123));		
	}

}

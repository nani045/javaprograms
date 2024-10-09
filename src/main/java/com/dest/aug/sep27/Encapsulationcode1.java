package com.dest.aug.sep27;

class Dog{
	private String name ;
	private int age;
	private String color;
	private int cost;
	private String breed;
	
	//generic setter
	void setData(String a, int b , String c , int d, String e) {
		name = a;
		age =b;
		color = c;
		cost = d;
		breed = e;
	}
	
	//generic getter
	void getData() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(breed);
	}
}
public class Encapsulationcode1 {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.setData("Luna", 2, "Black", 10000, "Husky");
		d1.getClass();
	}

}

package com.dest.aug.sep27;

class Dog1{
	private String name ;
	private int age;
	private String color;
	private int cost;
	private String breed;


	//specific setters
	void setname(String a) {
		name = a;
	}
	void setage(int b ) {
		age = b;
	}
	void setcolor(String c) {
		color = c;
	}
	void setcost(int d) {
		cost = d;
	}
	void setbreed(String e) {
		breed = e;
	}

	//specific getters
	String getname() {
		return name;
	}
	int getage() {
		return age;
	}
	String getcolor() {
		return color;
	}
	int getcost() {
		return cost;
	}
	String getbreed() {
		return breed;
	}
}
	public class Encapsulationcode2 {
		public static void main(String[] args) {
			Dog1 d1 = new Dog1();
			d1.setname("Rocky");
			d1.setage(3);
			d1.setcolor("Brown");
			d1.setcost(25000);
			d1.setbreed("PetBull");
			
			System.out.println(d1.getname());
			System.out.println(d1.getage());
			System.out.println(d1.getcolor());
			System.out.println(d1.getcost());
			System.out.println(d1.getbreed());
				
		}
	}

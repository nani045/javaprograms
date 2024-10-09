package com.dest.aug.sep27;
class Dog3{

	private String name ;
	private int age;
	private String color;
	private int cost;
	private String breed;

	//generic setter
	void setData(String name, int age , String color , int cost, String breed) {
		this.name = name;
		this.age = age;
		this.color = color;
		this.cost = cost;
		this.breed = breed;
	}
	//specific setters
	void setname(String name) {
		this.name = name;
	}
	void setage(int age) {
		this.age = age;
	}
	void setcolor(String color) {
		this.color = color;
	}
	void setcost(int cost) {
		this.cost = cost;
	}
	void setbreed(String breed) {
		this.breed = breed;
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

	//generic getter
	void getData() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(breed);
	}
}
public class lanch2{
	public static void main(String[] args) {
		Dog3 d = new Dog3();
		d.setData("Tommmy", 4, "Brown", 7000, "GR");
		d.getData();
		Dog3 d1 = new Dog3();
		d1.setname("Rocky");
		d1.setage(5);
		d1.setcolor("Yellow");
		d1.setcost(9000);
		d1.setbreed("Pub");
		System.out.println("============");
		System.out.println(d1.getname());
		System.out.println(d1.getage());
		System.out.println(d1.getcolor());
		System.out.println(d1.getcost());
		System.out.println(d1.getbreed());

	}
}

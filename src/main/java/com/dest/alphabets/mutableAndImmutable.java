package com.dest.alphabets;

public class mutableAndImmutable {
public static void main(String[] args) {
	String s1 = new String("Luufy");
	String s2 = new String("Zoro");
	s1.concat(s2);
	s1 = s1.concat(s2);
	System.out.println(s1);
	
	StringBuffer s3 = new StringBuffer("Nami");
	StringBuffer s4 = new StringBuffer("sanji");
	s3.append(s4);
	System.out.println(s3);
	
	StringBuilder s5 = new StringBuilder("Chopper");
	StringBuilder s6 = new StringBuilder("Ussop");
	s5.append(s6);
	System.out.println(s5);
	
}
}

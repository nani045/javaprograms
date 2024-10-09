package com.dest.StringsOperatoins;

public class Stringops1 {
	public static void main(String[] args) {
		String s1 = "AlokIsTheBestCharacter";
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.startsWith("Alok"));
		
		System.out.println(s1.endsWith("ter"));
		
		System.out.println(s1.contains("AlokIsTheBestCharacter"));
		
		System.out.println(s1.charAt(7));
		
		System.out.println(s1.getClass());
		
		System.out.println(s1.concat(s1));
		
		
		String s2 =" ";
		System.out.println(s2.isBlank());
		
		System.out.println(s2.isEmpty());
		
		System.out.println(s1.indexOf("I   "));
		
		System.out.println(s1.lastIndexOf("Character"));
		
	}

}

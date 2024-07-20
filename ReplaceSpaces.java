package com.hello;
import java.util.*;
public class ReplaceSpaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Sentence");
		String input = sc.nextLine();
		
		String replaced = replaceSpaces(input);
		
		System.out.println("Orignal - " + input);
		System.out.println("Replace - " + replaced);
		
		

	}
	
	public static String replaceSpaces(String input) {
		String replaced = input.replaceAll("\\s+", "#");
		return replaced;
	}

}

package com.Example.String;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter any word");
		String word = scn.next();
		System.out.println("the original string is: " +word);
		System.out.println("the reversed string is: " +reverse(word));

	}

	public static String reverse(String str) {
		String rev = "";
		String reverse = Stream.of(str).map(e -> new StringBuilder(e).reverse()).collect(Collectors.joining(rev));

		return reverse;

	}
}

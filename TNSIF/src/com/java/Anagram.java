package com.java;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first String");
		String x=scan.nextLine();
		System.out.println("Enter the second String");
		String y=scan.nextLine();
		char x1[]=x.toCharArray();
		char y1[]=y.toCharArray();
		if(x1.length!=y1.length) {
			System.out.println("The given strings are not an Anagram");
			System.exit(0);
		}
		Arrays.sort(x1);
		Arrays.sort(y1);
		for(int i=0;i<x1.length;i++) {
			if(x1[i]!=y1[i]) {
				System.out.println("The given strings are not an Anagram");
				System.exit(0);
			}
		}
		System.out.println("The given strings are Anagram");

	}

}

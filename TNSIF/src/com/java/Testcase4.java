package com.java;

import java.util.Scanner;

public class Testcase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter N");
		int N = scan.nextInt();
		System.out.println("Enter M");
		int M = scan.nextInt();
		System.out.println("Enter k");
		int K = scan.nextInt();
		System.out.println("The outputs are");
		int i,sum=0,a=0,temp=0;
		for(i=N;i<=M;i++) {
			temp = i%10;
			a=i/10;
			sum=a+temp;
			if(sum==K) {
				System.out.print(i+" ");
			}
		}
	}

}

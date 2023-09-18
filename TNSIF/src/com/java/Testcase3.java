package com.java;

import java.util.Scanner;

public class Testcase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		int k=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1) {
					System.out.print(j);
				}
				else if(j==1) {
					System.out.print(i);
				}
				else if(i==5) {
					System.out.print(i-j+k);
				}
				else if(j==5) {
					System.out.print(j-i+k);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}

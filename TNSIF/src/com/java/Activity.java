package com.java;

public class Activity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=5;i++) {
			for (int j=5;j>=5-i;j--) {
				System.out.print(" ");
			}
			for (int k=5;k>=i;k--) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

}

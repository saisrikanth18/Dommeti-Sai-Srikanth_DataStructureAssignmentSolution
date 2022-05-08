package com.gl.fsd.skyscraper;

import java.util.Scanner;


public class SkyScraper {

		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the total number floors in the building : ");
			int t = sc.nextInt();
			int x[] = new int[t + 1];
			for (int i = 1; i < t + 1; i++) {
				System.out.println("Enter the floor size given on day : " + i);
				int m = sc.nextInt();
				x[m] = i;
			}
			int j = t;
			boolean flag;
			System.out.println("The order of construction is as follows ");
			for (int i = 1; i <= t; i++) {
				flag = false;
				System.out.println("Day " + i + " :");
				while (j >= 1 && x[j] <= i) {
					flag = true;
					System.out.print(j + " ");
					j--;
				}
				if (flag == true) {
					System.out.println();
				}
			}
		}
	}

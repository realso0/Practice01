package com.javaex.practice;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int a=sc.nextInt();
		
		for (int i=1;i<=a;i++) {
			System.out.print(i);
			if (i==1) {
				System.out.println();
			}
			for (int j=1;j<i;j++) {
				System.out.print(i);
				if (j==(i-1)) {
					System.out.println();
				}

			}
		}
		
		

	}

}

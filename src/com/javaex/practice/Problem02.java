package com.javaex.practice;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int a=sc.nextInt();
		
		for (int i=1;i<=a;i++) {
			for (int j=0;j<i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		

	}

}

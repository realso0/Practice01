package com.javaex.practice;

import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int bb=0;
		
		System.out.println("숫자를 입력하세요");
		
		for (int i=0;i<5;i++) {
			System.out.print("숫자:  ");
			int aa=sc.nextInt();
			
			if (aa>bb) {
				bb=aa;
			}
		}
		System.out.println("최대값은 "+bb+"입니다.");

	}

}

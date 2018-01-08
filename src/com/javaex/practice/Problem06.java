package com.javaex.practice;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		int a;
		int sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int bb=sc.nextInt();
		
		if (bb%2==0) {
			for (int i=1;2*i<=bb;i++) {
				sum+=2*i;
			}
		} else {
			for (int i=0;2*i+1<=bb;i++) {
				sum+=2*i+1;
			}
		}
		System.out.println("결과값: "+sum);
	}}

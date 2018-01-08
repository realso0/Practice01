package com.javaex.practice;

import java.util.Scanner;

public class Problem07 {
	static int a=(int)(Math.random()*99)+1;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int bb;
		
		System.out.println("----------------------");
		System.out.println("   [숫자맞추기게임 시작]   ");
		System.out.println("----------------------");
		
		while(true) {
			bb=sc.nextInt();
			
			if (bb>a) {
				System.out.println("더 낮게");
			} else if (bb<a){
				System.out.println("더 높게");
			} else {
				break;
			}
		}
		System.out.println("맞았습니다.");
		
		System.out.print("게임을 종료하시겠습니까?(y/n) >>");
		String cc=sc.next();
		
		if(cc.equals("y")) {
			System.out.println("----------------------");
			System.out.println("   [숫자맞추기게임 종료]"   );
			System.out.println("----------------------");
		}
		
	}

}

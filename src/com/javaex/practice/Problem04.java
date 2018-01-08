package com.javaex.practice;

public class Problem04 {

	public static void main(String[] args) {
		int i,j;

		for (i=1;i<=10;i++) {
			for (j=i;j<10+i;j++) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
		
	}

}

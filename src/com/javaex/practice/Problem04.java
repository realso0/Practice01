package com.javaex.practice;

public class Problem04 {

	public static void main(String[] args) {
		int i,j;
		int count;
		
		for (i=0;i<10;i++) {
			count=1+i;
			for (j=0;j<10;j++) {
				System.out.print(count+"\t");
				count++;
			}
			System.out.println();
		}
		
	}

}
